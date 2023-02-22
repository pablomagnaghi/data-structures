package example;

import example.skiplist.SkipList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        SkipList<Integer> sl = new SkipList<>();
        int[] data = {4,2,7,0,9,1,3,7,3,4,5,6,0,2,8};
        for (int i : data) {
            sl.insert(i);
        }

        sl.print();
        sl.search(4);

        sl.delete(4);

        System.out.println("Inserting 10");
        sl.insert(10);
        sl.print();
        sl.search(10);
    }
}