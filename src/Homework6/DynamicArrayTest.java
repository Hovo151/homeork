package Homework6;

public class DynamicArrayTest {
    public static void main(String[] args) {
        DynamicArray dy = new DynamicArray();

        dy.add(8);
        dy.add(2);
        dy.add(12);
        dy.add(2);
        dy.add(2);
        dy.add(46);
        dy.add(87);
        dy.add(36);


        dy.getByIndex(3);
        dy.max();
        System.out.println(dy.max());
        dy.min();
        System.out.println(dy.min());
        dy.deleteByIndex(3);
        dy.print();
        System.out.println();
        dy.deleteByValueFirst(0);
        dy.print();
        System.out.println();
        int[] subArray = dy.subArray(3, 6);
        for (int i : subArray) {
            System.out.print(i + " ");
        }
        int[] subArray1 = dy.subArray(6);
        for (int i : subArray1) {
            System.out.print(i + " ");


        }


    }
}



