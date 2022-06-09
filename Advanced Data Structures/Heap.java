import java.util.ArrayList;

/**
 * Heap class
 */
public class Heap {
    /**
     * node class
     */
    private class Node {
        private int value;

        public Node(int value) {
            this.value = value;
        }

        public void set(int value) {
            this.value = value;
        }

        public int get() {
            return this.value;
        }
    }

    private ArrayList<Node> heapArr;
    private int exponent = 0;
    private int numChildren = 0;// children number of each node

    public Heap(int exponent) {
        heapArr = new ArrayList<>();
        this.exponent = exponent;
        this.numChildren = (int) Math.pow(2, this.exponent);
    }

    // root is index 0
    private int getLeftChildIndex(int parentIndex) {
        return parentIndex * numChildren + 1;
    }

    private int getParentIndex(int childIndex) {
        return (childIndex - 1) / numChildren;
    }

    private int getLeftChildValue(int index) {
        return heapArr.get(getLeftChildIndex(index)).get();
    }

    private int getParentValue(int index) {
        return heapArr.get(getParentIndex(index)).get();
    }
}