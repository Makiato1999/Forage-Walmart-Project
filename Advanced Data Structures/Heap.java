/**
 * Heap
 */
public class Heap {
    private int x = 0;
    private double numOfChildren = 0;

    public Heap(int x) {
        this.x = x;
        this.numOfChildren = Math.pow(2, this.x);
    }

    private double getLeftChildIndex(int parentIndex) {
        return numOfChildren*parentIndex + 1;
    }
}