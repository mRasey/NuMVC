package numvc.ds;

public class NuMVC {
	public static void main(String[] args) {
		int ip[][] = { { 2, 4 }, { 1, 3, 4 }, { 2, 4 }, { 1, 2, 3 } };
		Graph graph = new Graph(ip);
//		graph.computeGreedyVC();
//		graph.computeNuMVC();
		graph.addToC(1);
		graph.addToC(2);
		//graph.removeFromC(2);
		graph.updateDScores();
		System.out.println(graph);
	}
}