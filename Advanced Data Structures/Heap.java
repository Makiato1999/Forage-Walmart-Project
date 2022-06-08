/**
 * Heap
 */
public class Heap {
    private double x = 0;
    private double numOfChildren = 0;

    public Heap(double x) {
        this.x = x;
        this.numOfChildren = Math.pow(2, this.x);
    }

    // root is index 0
    private double getLeftChildIndex(int parentIndex) {
        return parentIndex * numOfChildren + 1;
    }
    private double getParentIndex(double childIndex) {
        return (childIndex - 1) / numOfChildren;
    }
}