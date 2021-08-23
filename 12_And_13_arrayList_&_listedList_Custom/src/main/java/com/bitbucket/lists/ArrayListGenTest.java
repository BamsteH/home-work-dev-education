package com.bitbucket.lists;

import org.junit.Test;

import java.util.ArrayList;

public class ArrayListGenTest {

    //=================================================
    //=================== AddByPos ========================
    //=================================================

    @Test
    public void init(){
        Integer[] array = new Integer[]{1,2};
        IListGen<Integer> ss = new ArrayListGeneric<>();
        ss.init(array);
        ss.addByPos(1,333);
        Object[] result = ss.toArray();
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }

    @Test
    public void initStr(){
        String[] array = new String[]
                {"22","232"};
        IListGen<String> ss = new ArrayListGeneric<>();
        ss.init(array);
        ss.addByPos(1,"223");
        Object[] result = ss.toArray();
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }

    //=================================================
    //=================== Remove Start ========================
    //=================================================

    @Test
    public void removeStarInt(){
        Integer[] array = new Integer[]{1,2};
        IListGen<Integer> ss = new ArrayListGeneric<>();
        ss.init(array);
        ss.removeStart();
        Object[] result = ss.toArray();
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }

    @Test
    public void RemoveStartStr(){
        String[] array = new String[]
                {"22","232"};
        IListGen<String> ss = new ArrayListGeneric<>();
        ss.init(array);
        ss.removeStart();
        Object[] result = ss.toArray();
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }

//=================================================
    //=================== Remove End ========================
    //=================================================

    @Test
    public void removeEndInt(){
        Integer[] array = new Integer[]{1,2};
        IListGen<Integer> ss = new ArrayListGeneric<>();
        ss.init(array);
        ss.removeEnd();
        Object[] result = ss.toArray();
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }

    @Test
    public void RemoveEndStr(){
        String[] array = new String[]
                {"22","232"};
        IListGen<String> ss = new ArrayListGeneric<>();
        ss.init(array);
        ss.removeEnd();
        Object[] result = ss.toArray();
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }

//=================================================
    //=================== Remove ByPOs ========================
    //=================================================

    @Test
    public void removeByPosInt(){
        Integer[] array = new Integer[]{1,2,3,4,5};
        IListGen<Integer> ss = new ArrayListGeneric<>();
        ss.init(array);
        ss.removeByPos(3);
        Object[] result = ss.toArray();
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }

    @Test
    public void RemoveByPosStr(){
        String[] array = new String[]
                {"22","232","2","3","4"};
        IListGen<String> ss = new ArrayListGeneric<>();
        ss.init(array);
        ss.removeByPos(3);
        Object[] result = ss.toArray();
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }


}
