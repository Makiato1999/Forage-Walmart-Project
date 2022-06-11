import java.util.ArrayList;
import java.util.Collections;

/**
 * Heap class
 */
public class Heap {
    /**
     * Node class
     */
    private class Node {
        private int value;

        public Node(int value) {
            this.value = value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public int getValue() {
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
    private int getLeftChildIndex(int parentIndex, int offset) {
        return parentIndex * numChildren + 1 + offset;
    }

    private int getParentIndex(int childIndex) {
        return (childIndex - 1) / numChildren;
    }

    private int getLeftChildValue(int index, int offset) {
        return heapArr.get(getLeftChildIndex(index, offset)).getValue();
    }

    private int getParentValue(int index) {
        return heapArr.get(getParentIndex(index)).getValue();
    }

    private boolean hasLeftChild(int index, int offset) {
        boolean result = false;
        if (getLeftChildIndex(index, offset) < this.heapArr.size()) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }

    private boolean hasParent(int index) {
        boolean result = false;
        if (getParentIndex(index) >= 0) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }

    public int rootValue() {
        if (heapArr.isEmpty()) {
            throw new IllegalStateException();
        }
        return heapArr.get(0).getValue();
    }

    public int popMaxValue() {
        if (heapArr.isEmpty()) {
            throw new IllegalStateException();
        }
        Node maxNode = this.heapArr.get(0);
        Collections.swap(this.heapArr, 0, this.heapArr.size() - 1);
        this.heapArr.remove(this.heapArr.size() - 1);
        heapIfDown();
        return maxNode.getValue();
    }

    public void heapIfDown() {
        int index = 0;
        while (hasLeftChild(index, 0)) {
            int biggerChildIndex = getLeftChildIndex(index, 0);
            for (int i = 1; i < this.numChildren; i++) {
                if (hasLeftChild(index, i)
                        && getLeftChildValue(index, i) > this.heapArr.get(biggerChildIndex).getValue()) {
                    biggerChildIndex = getLeftChildIndex(index, i);
                }
            }
            if (this.heapArr.get(index).getValue() > this.heapArr.get(biggerChildIndex).getValue()) {
                break;
            } else {
                Collections.swap(this.heapArr, index, biggerChildIndex);
            }
            index = biggerChildIndex;
        }
    }

    public void insert(int value) {
        Node newNode = new Node(value);
        this.heapArr.add(newNode);
        heapIfUp();
    }

    public void heapIfUp() {
        int index = this.heapArr.size() - 1;
        while (hasParent(index) && getParentValue(index) < this.heapArr.get(index).getValue()) {
            Collections.swap(this.heapArr, index, getParentIndex(index));
            index = getParentIndex(index);
        }
    }

    public void print() {
        for (int i = 0; i < this.heapArr.size(); i++) {
            System.out.print("{index: "+i+", value: "+this.heapArr.get(i).getValue()+"}\n");
        }
    }
}
