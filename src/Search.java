import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Search {

	private SearchProblem searchProblem;
	private SearchStrategy  searchStrategy;

	public Search(SearchProblem searchProblem, SearchStrategy searchStrategy)
	{
		this.searchProblem = searchProblem;
		this.searchStrategy = searchStrategy;
	}
	
	public Node solve()
	{
		
		State initialState = searchProblem.getInitialState();
		Node rootNode = new Node(initialState,null,0,0.0,"Start");
		
		Map<String, Node> duplicateMap = new HashMap<String, Node>();
		
		duplicateMap.put(rootNode.toString(), rootNode);
		
		searchStrategy.addNode(rootNode);
		
		while(!searchStrategy.isEmpty())
		{
			Node currentNode = searchStrategy.removeNode();
			
			if(searchProblem.isGoal(currentNode.getState()))
			{
				return currentNode;
			}						
			
			//Generate successors
			
			List<State> successorList = searchProblem.generateSuccessors(currentNode.getState());
			
			successorList.forEach(state->{
				if(!duplicateMap.containsKey(state.toString()))
				{
					Node nextNode = new Node(state,currentNode,currentNode.getDepth() + 1, (currentNode.getCost() + state.getActionCost()),state.getAction());
					searchStrategy.addNode(nextNode);
					duplicateMap.put(nextNode.toString(), nextNode);
				}
			});
		}
		
		return null;
	}
	
}
