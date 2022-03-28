package lecture7_graph;

class Graph {

    /**
     * create array 2-dimensional
     */
    int[][] arr;
    int n;

    /**
     * Constructor
     */
    Graph() {
	arr = null;
	n = 0;
    }

    /**
     * reset array to 0 && n to 0
     */
    void clear() {
	arr = null;
	n = 0;
    }

    /**
     * set data for array
     *
     * @param array 2d
     */
    void setData(int[][] b) {
	n = b.length;
	arr = new int[n][n];

	for (int i = 0; i < n; i++) {
	    for (int j = 0; j < n; j++) {
		arr[i][j] = b[i][j];
	    }
	}
    }

    /**
     * show adjacency matrix
     */
    void dispAdj() {
	System.out.println("The adjacency matrix: ");

	for (int i = 0; i < n; i++) {
	    System.out.println();

	    for (int j = 0; j < n; j++) {
		System.out.printf("%5d", arr[i][j]);
	    }
	}
    }

    /**
     * visit
     *
     * @param integer
     */
    void visit(int i) {
	System.out.print(i + " ");
    }

    /**
     * Breadth first search
     * start with vertex k use queue
     * After dequeue 1 vertex of queue, use visit this vertex
     *
     * @param integer
     */
    void breadth(int k) {
	Queue queue = new Queue();
	//........................

    }

    /**
     * check connect components
     *
     * @return boolean
     */
    boolean isConnected() {
	//.....................
    }

    /**
     * Calculator level of this vertex
     *
     * @param integer vertex
     * @return integer
     */
    int degree(int k) {
	//...................
    }
}
