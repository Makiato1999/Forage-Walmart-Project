import java.util.ArrayList;
import java.util.Collections;

/**
 * Heap class
 */
public class Heap {
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
        return heapArr.get(getLeftChildIndex(index)).getValue();
    }

    private int getParentValue(int index) {
        return heapArr.get(getParentIndex(index)).getValue();
    }

    private void swapNode(int currIndex, int newIndex) {
        Collections.swap(this.heapArr, currIndex, newIndex);
    }

    public int rootValue() {
        if (heapArr.isEmpty()) {
            throw new IllegalStateException();
        }
        return heapArr.get(0).getValue();
    }
}