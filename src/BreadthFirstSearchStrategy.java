import java.util.ArrayList;
import java.util.List;

public class BreadthFirstSearchStrategy implements SearchStrategy {

	private List<Node> queue = new ArrayList<Node>();
	
	@Override
	public void addNode(Node node) {
		queue.add(node);
	}

	@Override
	public Node removeNode() {
		return queue.remove(0);
	}

	@Override
	public Boolean isEmpty() {
		return queue.isEmpty();
	}

}
