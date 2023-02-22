package org.skiplist;

import example.skiplist.SkipList;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class SkipListTest {

    @Test
    public void sizeTest() {
        SkipList<Integer> sl = new SkipList<>();
        int[] data = {4,2,7,0,9,1,3,7,3,4,5,6,0,2,8};
        for (int i : data) {
            sl.insert(i);
        }

        sl.search(4);
        sl.delete(4);
        sl.insert(10);
        sl.search(10);

        assertEquals(sl.size(), data.length);
    }
}
