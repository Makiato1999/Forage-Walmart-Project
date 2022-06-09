import java.util.ArrayList;

/**
 * Heap class
 */
public class Heap {
    /**
     * node class
     */
    private class Node {
        private double value;

        public Node(double value) {
            this.value = value;
        }

        public void set(double value) {
            this.value = value;
        }

        public double get() {
            return this.value;
        }
    }

    private ArrayList<Double> heapArr;
    private double exponent = 0;
    private double numChildren = 0;// children number of each node

    public Heap(double exponent) {
        heapArr = new ArrayList<>();
        this.exponent = exponent;
        this.numChildren = Math.pow(2, this.exponent);
    }

    // root is index 0
    private boolean isEmpty() {
        if (heapArr.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    private double getLeftChildIndex(double parentIndex) {
        return parentIndex * numChildren + 1;
    }

    private double getParentIndex(double childIndex) {
        return (childIndex - 1) / numChildren;
    }
}