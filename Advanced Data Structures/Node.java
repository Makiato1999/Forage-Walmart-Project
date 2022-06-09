/**
 * Node class
 */
public class Node {
    private int index;
    private int value;

    public Node(int index, int value) {
        this.index = index;
        this.value = value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getIndex() {
        return this.index;
    }

    public int getValue() {
        return this.value;
    }
}
