package lecture7_graph;

public class Main {

    /**
     * input array from keyboard
     */

    static void input(int[][] b, int n) {
	//....................
    }


    public static void main(String[] args) {
	Graph graph = new Graph();

	int n = 6;
	int[][] b = new int[n][n];

	input(b, n);

	graph.setData(b);

	graph.dispAdj();

	graph.breadth(1);

	System.out.println("Is G is connectd?" + graph.isConnected());

	System.out.println("Degree of the vertex A in G is " + graph.degree(0));

	System.out.println();
    }
}
