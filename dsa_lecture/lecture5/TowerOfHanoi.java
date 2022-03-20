package lecture5;

public class TowerOfHanoi {

    void move(int numOfDisc, char source, char destination, char auxiliary) {
	if (numOfDisc == 1) {
	    System.out.println("Moving disc 1" + ": " + source + " to " + destination);
	    return;
	} else {
	    // move (n - 1) from source to auxiliary
	    // use source to source-sub
	    move(numOfDisc-1, source, auxiliary, destination);

	    // move remainder (n - 2).v.v.1
	    // from source to destination
	    System.out.println("Moving disc " + numOfDisc + ": " + source + " to " + destination);

	    // move (n - 1) from auxiliary --> destination
	    move(numOfDisc-1, auxiliary, destination, source);

	}
    }


    public static void main(String []args) {
	TowerOfHanoi tower = new TowerOfHanoi();
	tower.move(3, 'A', 'C', 'B');
    }

}