import java.util.Stack;

public class DepthFirstSearchStrategy implements SearchStrategy {

	private Stack<Node> queue = new Stack<>();
	
	@Override
	public void addNode(Node node) {
		queue.push(node);
	}

	@Override
	public Node removeNode() {
		return queue.pop();
	}

	@Override
	public Boolean isEmpty() {
		return queue.isEmpty();
	}

}
