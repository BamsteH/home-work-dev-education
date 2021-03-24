package com.bitbucket.lists;


import com.bitbucket.lists.exceptions.ListEmptyExceptions;
import org.junit.Test;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class ArrayListZeroCapacityTest {

    private final IList list = new LinkedListOnlyNext();



    //=================================================
    //=================== Clean ========================
    //=================================================

    @Test
    public void clearMany() {
        int[] array = new int[]{1, 232, 43432, 123, 543, 4343, 123, 5644, 34, 12};
        this.list.init(array);
        this.list.clear();
        int[] exp = {};
        int[] act = this.list.toArray();
        assertArrayEquals(exp, act);
    }

    @Test
    public void clearTwo() {
        int[] array = new int[]{1, 232};
        this.list.init(array);
        this.list.clear();
        int[] exp = {};
        int[] act = this.list.toArray();
        assertArrayEquals(exp, act);
    }

    @Test
    public void clearOne() {
        int[] array = new int[]{1};
        this.list.init(array);
        this.list.clear();
        int[] exp = {};
        int[] act = this.list.toArray();
        assertArrayEquals(exp, act);
    }

    @Test
    public void clearZero() {
        int[] array = {};
        this.list.init(array);
        this.list.clear();
        int[] exp = {};
        int[] act = this.list.toArray();
        assertArrayEquals(exp, act);
    }

    @Test
    public void clearNull() {
        this.list.init(null);
        this.list.clear();
        int[] exp = {};
        int[] act = this.list.toArray();
        assertArrayEquals(exp, act);
    }

    //=================================================
    //=================== Size ========================
    //=================================================

    @Test
    public void sizeMany() {
        int[] array = new int[]{1, 232, 43432, 123, 543, 4343, 123, 5644, 34, 12};
        this.list.init(array);
        int exp = 10;
        int act = this.list.size();
        assertEquals(exp, act);
    }

    @Test
    public void sizeTwo() {
        int[] array = new int[]{1, 232};
        this.list.init(array);
        int exp = 2;
        int act = this.list.size();
        assertEquals(exp, act);
    }

    @Test
    public void sizeOne() {
        int[] array = new int[]{1};
        this.list.init(array);
        int exp = 1;
        int act = this.list.size();
        assertEquals(exp, act);
    }

    @Test
    public void sizeZero() {
        int[] array = new int[]{};
        this.list.init(array);
        int exp = 0;
        int act = this.list.size();
        assertEquals(exp, act);
    }

    @Test
    public void sizeNull() {
        this.list.init(null);
        int exp = 0;
        int act = this.list.size();
        assertEquals(exp, act);
    }

    //=================================================
    //=================== Add Start ===================
    //=================================================

    @Test
    public void addToStartMany() {
        int[] array = new int[]{1, 232, 43432, 123, 543, 4343, 123, 5644, 34, 12};
        this.list.init(array);
        this.list.addStart(1);
        int[] exp = new int[]{1, 1, 232, 43432, 123, 543, 4343, 123, 5644, 34, 12};
        int[] act = this.list.toArray();
        assertArrayEquals(exp, act);
    }

    @Test
    public void addToStartTwo() {
        int[] array = new int[]{1, 232};
        this.list.init(array);
        int[] what = this.list.toArray();
        this.list.addStart(1);
        int[] exp = new int[]{1, 1, 232};
        int[] act = this.list.toArray();
        assertArrayEquals(exp, act);
    }

    @Test
    public void addToStartOne() {
        int[] array = new int[]{1};
        this.list.init(array);
        this.list.addStart(1);
        int[] exp = new int[]{1, 1};
        int[] act = this.list.toArray();
        assertArrayEquals(exp, act);
    }

    @Test
    public void addToStartZero() {
        int[] array = new int[]{};
        this.list.init(array);
        this.list.addStart(1);
        int[] exp = new int[]{1};
        int[] act = this.list.toArray();
        assertArrayEquals(exp, act);
    }

    @Test
    public void addToStartNull() {
        int[] array = null;
        this.list.init(array);
        this.list.addStart(1);
        int[] exp = new int[]{1};
        int[] act = this.list.toArray();
        assertArrayEquals(exp, act);
    }

    //=================================================
    //=================== Add End =====================
    //=================================================

    @Test
    public void addToEndMany() {
        int[] array = new int[]{1, 232, 43432, 123, 543, 4343, 123, 5644, 34, 12};
        this.list.init(array);
        this.list.addEnd(1);
        int[] exp = new int[]{1, 232, 43432, 123, 543, 4343, 123, 5644, 34, 12, 1};
        int[] act = this.list.toArray();
        assertArrayEquals(exp, act);
    }

    @Test
    public void addToEndTwo() {
        int[] array = new int[]{1, 232};
        this.list.init(array);
        this.list.addEnd(1);
        int[] exp = new int[]{1, 232, 1};
        int[] act = this.list.toArray();
        assertArrayEquals(exp, act);
    }

    @Test
    public void addToEndOne() {
        int[] array = new int[]{1};
        this.list.init(array);
        this.list.addEnd(1);
        int[] exp = new int[]{1, 1};
        int[] act = this.list.toArray();
        assertArrayEquals(exp, act);
    }

    @Test
    public void addToEndZero() {
        int[] array = new int[]{};
        this.list.init(array);
        this.list.addEnd(1);
        int[] exp = new int[]{1};
        int[] act = this.list.toArray();
        assertArrayEquals(exp, act);
    }

    @Test
    public void addToEndNull() {
        this.list.init(null);
        this.list.addEnd(1);
        int[] exp = new int[]{1};
        int[] act = this.list.toArray();
        assertArrayEquals(exp, act);
    }

    //=================================================
    //=================== Add by Pos =====================
    //=================================================

    @Test
    public void addByPoseMany() {
        int[] array = new int[]{1, 232, 43432, 123, 543, 4343, 123, 5644, 34, 12};
        this.list.init(array);
        this.list.addByPos(0, 12);
        int[] exp = new int[]{12, 1, 232, 43432, 123, 543, 4343, 123, 5644, 34, 12};
        int[] act = this.list.toArray();
        assertArrayEquals(exp, act);
    }

    @Test
    public void addByPoseTwo() {
        int[] array = new int[]{1, 232};
        this.list.init(array);
        this.list.addByPos(2, 12);
        int[] exp = new int[]{1, 232, 12};
        int[] act = this.list.toArray();
        assertArrayEquals(exp, act);
    }

    @Test
    public void addByPoseOne() {
        int[] array = new int[]{1};
        this.list.init(array);
        this.list.addByPos(1, 12);
        int[] exp = new int[]{1, 12};
        int[] act = this.list.toArray();
        assertArrayEquals(exp, act);
    }

    @Test
    public void addByPoseZero() {
        int[] array = new int[]{};
        this.list.init(array);
        this.list.addByPos(0, 12);
        int[] exp = new int[]{12};
        int[] act = this.list.toArray();
        assertArrayEquals(exp, act);
    }

    @Test
    public void addByPoseNull() {
        this.list.init(null);
        this.list.addByPos(0, 12);
        int[] exp = new int[]{12};
        int[] act = this.list.toArray();
        assertArrayEquals(exp, act);
    }

    @Test(expected = ListEmptyExceptions.class)
    public void addByPoseIncorrect() {
        int[] array = new int[]{1, 232};
        this.list.init(array);
        this.list.addByPos(3, 12);
    }

    //=================================================
    //=================== Add by Pos =====================
    //=================================================

    @Test
    public void removeStartMany() {
        int[] array = new int[]{1, 232, 43432, 123, 543, 4343, 123, 5644, 34, 12};
        this.list.init(array);
        int exp = 1;
        int act = this.list.removeStart();
        assertEquals(exp, act);
    }

    @Test
    public void removeStartTwo() {
        int[] array = new int[]{1, 232};
        this.list.init(array);
        int exp = 1;
        int act = this.list.removeStart();
        assertEquals(exp, act);
    }

    @Test
    public void removeStartOne() {
        int[] array = new int[]{1};
        this.list.init(array);
        int exp = 1;
        int act = this.list.removeStart();
        assertEquals(exp, act);
    }

    @Test(expected = ListEmptyExceptions.class)
    public void removeStartNull() {
        this.list.init(null);
        int exp = 0;
        int act = this.list.removeStart();
        assertEquals(exp, act);
    }

    @Test(expected = ListEmptyExceptions.class)
    public void removeStartZero() {
        int[] array = new int[]{};
        this.list.init(array);
        this.list.removeStart();
    }

    //=================================================
    //=================== Add by Pos =====================
    //=================================================

    @Test
    public void removeEndMany() {
        int[] array = new int[]{1, 232, 43432, 123, 543, 4343, 123, 5644, 34, 12};
        this.list.init(array);
        int exp = 12;
        int act = this.list.removeEnd();
        assertEquals(exp, act);
    }

    @Test
    public void removeEndTwo() {
        int[] array = new int[]{1, 232};
        this.list.init(array);
        int exp = 232;
        int act = this.list.removeEnd();
        assertEquals(exp, act);
    }

    @Test
    public void removeEndOne() {
        int[] array = new int[]{1};
        this.list.init(array);
        int exp = 1;
        int act = this.list.removeEnd();
        assertEquals(exp, act);
    }

    @Test(expected = ListEmptyExceptions.class)
    public void removeEndZero() {
        int[] array = new int[]{};
        this.list.init(array);
        this.list.removeEnd();
    }

    @Test(expected = ListEmptyExceptions.class)
    public void removeEndNull() {
        this.list.init(null);
        this.list.removeEnd();
    }


    //=================================================
    //=================== Remove by Pos =====================
    //=================================================

    @Test
    public void removeByPoseMany() {
        int[] array = new int[]{1, 232, 43432, 123, 543, 4343, 123, 5644, 34, 12};
        this.list.init(array);
        int exp = 43432;
        int act = this.list.removeByPos(2);
        assertEquals(exp, act);
    }

    @Test
    public void removeByPoseTwo() {
        int[] array = new int[]{1, 232};
        this.list.init(array);
        int exp = 232;
        int act = this.list.removeByPos(1);
        assertEquals(exp, act);
    }

    @Test
    public void removeByPoseOne() {
        int[] array = new int[]{1};
        this.list.init(array);
        int exp = 1;
        int act = this.list.removeByPos(0);
        assertEquals(exp, act);
    }

    @Test(expected = ListEmptyExceptions.class)
    public void removeByPoseZero() {
        int[] array = new int[]{};
        this.list.init(array);
        this.list.removeByPos(0);
    }

    @Test(expected = ListEmptyExceptions.class)
    public void removeByPoseNull() {
        this.list.init(null);
        this.list.removeByPos(0);
    }

    @Test(expected = ListEmptyExceptions.class)
    public void removeByPoseIncorrect() {
        int[] array = new int[]{1, 232};
        this.list.init(array);
        this.list.removeByPos(2);
    }

    //=================================================
    //=================== max =====================
    //=================================================

    @Test
    public void maxMany() {
        int[] array = new int[]{1, 232, 43432, 123, 543, 4343, 123, 5644, 34, 12};
        this.list.init(array);
        int exp = 43432;
        int act = this.list.max();
        assertEquals(exp, act);
    }

    @Test
    public void maxTwo() {
        int[] array = new int[]{1, 232};
        this.list.init(array);
        int exp = 232;
        int act = this.list.max();
        assertEquals(exp, act);
    }

    @Test
    public void maxOne() {
        int[] array = new int[]{1};
        this.list.init(array);
        int exp = 1;
        int act = this.list.max();
        assertEquals(exp, act);
    }

    /**
     * хз чо будет
     */

    @Test(expected = ListEmptyExceptions.class)
    public void maxZero() {
        int[] array = new int[]{};
        this.list.init(array);
        int exp = 0;
        int act = this.list.max();
        assertEquals(exp, act);
    }

    @Test(expected = ListEmptyExceptions.class)
    public void maxNull() {
        this.list.init(null);
        int exp = 0;
        int act = this.list.max();
        assertEquals(exp, act);
    }

    //=================================================
    //=================== min =====================
    //=================================================

    @Test
    public void minMany() {
        int[] array = new int[]{1, 232, 43432, 123, 543, 4343, 123, 5644, 34, 12};
        this.list.init(array);
        int exp = 1;
        int act = this.list.min();
        assertEquals(exp, act);
    }

    @Test
    public void minTwo() {
        int[] array = new int[]{1, 232};
        this.list.init(array);
        int exp = 1;
        int act = this.list.min();
        assertEquals(exp, act);
    }

    @Test
    public void minOne() {
        int[] array = new int[]{1};
        this.list.init(array);
        int exp = 1;
        int act = this.list.min();
        assertEquals(exp, act);
    }

    /**
     * хз чо будет
     */

    @Test(expected = ListEmptyExceptions.class)
    public void minZero() {
        int[] array = new int[]{};
        this.list.init(array);
        int exp = 0;
        int act = this.list.min();
        assertEquals(exp, act);
    }

    @Test(expected = ListEmptyExceptions.class)
    public void minNull() {
        this.list.init(null);
        int exp = 0;
        int act = this.list.min();
        assertEquals(exp, act);
    }

    //=================================================
    //=================== maxPos =====================
    //=================================================

    @Test
    public void maxPosMany() {
        int[] array = new int[]{1, 232, 43432, 123, 543, 4343, 123, 5644, 34, 12};
        this.list.init(array);
        int exp = 2;
        int act = this.list.maxPos();
        assertEquals(exp, act);
    }

    @Test
    public void maxPosTwo() {
        int[] array = new int[]{1, 232};
        this.list.init(array);
        int exp = 1;
        int act = this.list.maxPos();
        assertEquals(exp, act);
    }

    @Test
    public void maxPosOne() {
        int[] array = new int[]{1};
        this.list.init(array);
        int exp = 0;
        int act = this.list.maxPos();
        assertEquals(exp, act);
    }

    /**
     * хз чо будет
     */

    @Test(expected = ListEmptyExceptions.class)
    public void maxPosZero() {
        int[] array = new int[]{};
        this.list.init(array);
        int act = this.list.maxPos();
    }

    @Test(expected = ListEmptyExceptions.class)
    public void maxPosNull() {
        this.list.init(null);
        int act = this.list.maxPos();
    }

    //=================================================
    //=================== minPos =====================
    //=================================================

    @Test
    public void minPosMany() {
        int[] array = new int[]{1, 232, 43432, 123, 543, 4343, 123, 5644, 34, 12};
        this.list.init(array);
        int exp = 0;
        int act = this.list.minPos();
        assertEquals(exp, act);
    }

    @Test
    public void minPosTwo() {
        int[] array = new int[]{1, 232};
        this.list.init(array);
        int exp = 0;
        int act = this.list.minPos();
        assertEquals(exp, act);
    }

    @Test
    public void minPosOne() {
        int[] array = new int[]{1};
        this.list.init(array);
        int exp = 0;
        int act = this.list.minPos();
        assertEquals(exp, act);
    }

    @Test(expected = ListEmptyExceptions.class)
    public void minPosZero() {
        int[] array = new int[]{};
        this.list.init(array);
        int act = this.list.minPos();
    }

    @Test(expected = ListEmptyExceptions.class)
    public void minPosNull() {
        this.list.init(null);
        int act = this.list.minPos();
    }

    //=================================================
    //=================== sort() =====================
    //=================================================

    @Test
    public void sortMany() {
        int[] array = new int[]{1, 232, 43432, 123, 543, 4343, 123, 5644, 34, 12};
        this.list.init(array);
        int[] exp = new int[]{1, 12, 34, 123, 123, 232, 543, 4343, 5644, 43432};
        int[] act = this.list.sort();
        assertArrayEquals(exp, act);
    }

    @Test
    public void sortTwo() {
        int[] array = new int[]{232, 1};
        this.list.init(array);
        int[] exp = new int[]{1, 232};
        int[] act = this.list.sort();
        assertArrayEquals(exp, act);
    }

    @Test
    public void sortOne() {
        int[] array = new int[]{1};
        this.list.init(array);
        int[] exp = new int[]{1};
        int[] act = this.list.sort();
        assertArrayEquals(exp, act);
    }

    @Test(expected = ListEmptyExceptions.class)
    public void sortZero() {
        int[] array = new int[]{};
        this.list.init(array);
        this.list.sort();
    }

    @Test(expected = ListEmptyExceptions.class)
    public void sortNull() {
        this.list.init(null);
        this.list.sort();
    }

    //=================================================
    //=================== get =====================
    //=================================================

    @Test
    public void getMany() {
        int[] array = new int[]{1, 232, 43432, 123, 543, 4343, 123, 5644, 34, 12};
        this.list.init(array);
        int exp = 123;
        int act = this.list.get(3);
        assertEquals(exp, act);
    }

    @Test
    public void getTwo() {
        int[] array = new int[]{1, 232};
        this.list.init(array);
        int exp = 232;
        int act = this.list.get(1);
        assertEquals(exp, act);
    }

    @Test
    public void getOne() {
        int[] array = new int[]{1};
        this.list.init(array);
        int exp = 1;
        int act = this.list.get(0);
        assertEquals(exp, act);
    }


    @Test(expected = ListEmptyExceptions.class)
    public void getZero() {
        int[] array = new int[]{};
        this.list.init(array);
        this.list.get(0);
    }

    @Test(expected = ListEmptyExceptions.class)
    public void getNull() {
        this.list.init(null);
        this.list.get(0);
    }

    @Test(expected = ListEmptyExceptions.class)
    public void getIncorrect() {
        int[] array = new int[]{1, 232, 43432, 123, 543, 4343, 123, 5644, 34, 12};
        this.list.init(array);
        this.list.get(10);
    }

    //=================================================
    //================= halfRevers ====================
    //=================================================

    @Test
    public void halfReversMany() {
        int[] array = new int[]{1, 232, 43432, 123, 543, 4343, 123, 5644, 34, 12};
        this.list.init(array);
        int[] exp = new int[]{4343, 123, 5644, 34, 12, 1, 232, 43432, 123, 543};
        int[] act = this.list.halfRevers();
        assertArrayEquals(exp, act);
    }

    @Test
    public void halfReversEven() {
        int[] array = new int[]{1, 232, 43432, 123, 543, 4343, 123, 5644, 34, 12, 10};
        this.list.init(array);
        int[] exp = new int[]{4343, 123, 5644, 34, 12, 10, 1, 232, 43432, 123, 543};
        int[] act = this.list.halfRevers();
        assertArrayEquals(exp, act);
    }

    @Test
    public void halfReversTwo() {
        int[] array = new int[]{1, 232};
        this.list.init(array);
        int[] exp = new int[]{232, 1};
        int[] act = this.list.halfRevers();
        assertArrayEquals(exp, act);
    }

    @Test
    public void halfReversOne() {
        int[] array = new int[]{1};
        this.list.init(array);
        int[] exp = new int[]{1};
        int[] act = this.list.halfRevers();
        assertArrayEquals(exp, act);
    }

    @Test(expected = ListEmptyExceptions.class)
    public void halfReversZero() {
        int[] array = new int[]{};
        this.list.init(array);
        int[] act = this.list.halfRevers();
    }

    @Test(expected = ListEmptyExceptions.class)
    public void halfReversNull() {
        this.list.init(null);
        int[] act = this.list.halfRevers();
    }

    //=================================================
    //================= Revers ====================
    //=================================================

    @Test
    public void reversMany() {
        int[] array = new int[]{1, 232, 43432, 123, 543, 4343, 123, 5644, 34, 12};
        this.list.init(array);
        int[] exp = new int[]{12, 34, 5644, 123, 4343, 543, 123, 43432, 232, 1};
        int[] act = this.list.revers();
        assertArrayEquals(exp, act);
    }

    @Test
    public void reversTwo() {
        int[] array = new int[]{1, 232};
        this.list.init(array);
        int[] exp = new int[]{232, 1};
        int[] act = this.list.revers();
        assertArrayEquals(exp, act);
    }

    @Test
    public void reversOne() {
        int[] array = new int[]{1};
        this.list.init(array);
        int[] exp = new int[]{1};
        int[] act = this.list.revers();
        assertArrayEquals(exp, act);
    }

    @Test(expected = ListEmptyExceptions.class)
    public void reversZero() {
        int[] array = new int[]{};
        this.list.init(array);
        int[] exp = new int[]{};
        int[] act = this.list.revers();
    }

    @Test(expected = ListEmptyExceptions.class)
    public void reversNull() {
        this.list.init(null);
        int[] exp = new int[]{};
        int[] act = this.list.revers();
    }

    //=================================================
    //=================== set =====================
    //=================================================

    @Test
    public void setMany() {
        int[] array = new int[]{1, 232, 43432, 123, 543, 4343, 123, 5644, 34, 12};
        this.list.init(array);
        this.list.set(3, 1000);
        int[] exp = {1, 232, 43432, 1000, 543, 4343, 123, 5644, 34, 12};
        int[] act = this.list.toArray();
        assertArrayEquals(exp, act);
    }

    @Test
    public void setTwo() {
        int[] array = new int[]{1, 232};
        this.list.init(array);
        this.list.set(1, 1000);
        int[] exp = {1, 1000};
        int[] act = this.list.toArray();
        assertArrayEquals(exp, act);
    }

    @Test
    public void setOne() {
        int[] array = new int[]{1};
        this.list.init(array);
        this.list.set(0, 1000);
        int[] exp = {1000};
        int[] act = this.list.toArray();
        assertArrayEquals(exp, act);
    }


    @Test(expected = ListEmptyExceptions.class)
    public void setZero() {
        int[] array = new int[]{};
        this.list.init(array);
        this.list.set(0, 10);
    }

    @Test(expected = ListEmptyExceptions.class)
    public void setNull() {
        this.list.init(null);
        this.list.set(0, 10);
    }

    @Test(expected = ListEmptyExceptions.class)
    public void setIncorrect() {
        int[] array = new int[]{1, 232, 43432, 123, 543, 4343, 123, 5644, 34, 12};
        this.list.init(array);
        this.list.set(10, 1);
    }
}
