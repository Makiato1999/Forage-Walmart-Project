/**
 * Test
 */
public class Test {

    public static void main(String[] args) {
        //test1(0);
        //test2(1);
        //test3(2);
    }
    public static void test1(int exponent) {
        Heap heap = new Heap(exponent);
        heap.insert(19);
        heap.insert(17);
        heap.insert(15);
        heap.insert(12);
        heap.insert(11);
        heap.insert(9);
        heap.insert(8);
        heap.insert(7);
        heap.insert(6);
        heap.insert(4);
        heap.insert(1);
        System.out.print("\nInitialize the heap\n");
        heap.print();
        int maxValue = heap.popMaxValue();
        System.out.print("\nPop node is {value: "+maxValue+"}, after poping\n");
        heap.print();
        heap.insert(23);
        System.out.print("\nAfter inserting\n");
        heap.print();
    }
    public static void test2(int exponent) {
        Heap heap = new Heap(exponent);
        heap.insert(19);
        heap.insert(17);
        heap.insert(18);
        heap.insert(12);
        heap.insert(14);
        heap.insert(16);
        heap.insert(17);
        heap.insert(6);
        heap.insert(7);
        heap.insert(9);
        heap.insert(10);
        System.out.print("\nInitialize the heap\n");
        heap.print();
        int maxValue = heap.popMaxValue();
        System.out.print("\nPop node is {value: "+maxValue+"}, after poping\n");
        heap.print();
        heap.insert(23);
        System.out.print("\nAfter inserting\n");
        heap.print();
    }
    public static void test3(int exponent) {
        Heap heap = new Heap(exponent);
        heap.insert(19);
        heap.insert(15);
        heap.insert(16);
        heap.insert(17);
        heap.insert(18);
        heap.insert(3);
        heap.insert(6);
        heap.insert(7);
        heap.insert(14);
        heap.insert(15);
        heap.insert(16);
        heap.insert(13);
        heap.insert(10);
        System.out.print("\nInitialize the heap\n");
        heap.print();
        int maxValue = heap.popMaxValue();
        System.out.print("\nPop node is {value: "+maxValue+"}, after poping\n");
        heap.print();
        heap.insert(23);
        System.out.print("\nAfter inserting\n");
        heap.print();
    }
}
