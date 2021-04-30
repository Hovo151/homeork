package Homework6;

public class DynamicArrayTest {
    public static void main(String[] args) {
        DynamicArray dy = new DynamicArray();
        for (int i = 0; i < 40; i++) {

        }
        dy.add(8);
        dy.add(51);
        dy.add(12);
        dy.add(2);
        dy.add(36);
        dy.add(155);
        dy.add(46);
        dy.add(15);
        dy.add(87);
        dy.add(36);
        dy.getByIndex(3);
        dy.max();
        System.out.println(dy.max());
        dy.min();
        System.out.println(dy.min());
        dy.deleteByIndex(3);
        dy.print();


    }
}
