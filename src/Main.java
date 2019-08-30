public class Main {
	
	public static void main(String[] args)
	{
		Search search = new Search(new PancakeProblem(),new BreadthFirstSearchStrategy());
		Node solution = search.solve();
		System.out.println(solution.toString()+" cost "+solution.getCost());
	}

}
