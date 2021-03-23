package com.bitbucket.lists;

public interface IListGen<T extends Comparable<?>> {

    void init(T[] init);

    void clear();

    int size();

    <T> T[] toArray();

    void addStart(T val);

    void addEnd(T val);

    void addByPos(int pos, T val);

    T removeStart();

    T removeEnd();

    T removeByPos(int pos);

    T max();

    T min();

    int maxPos();

    int minPos();

    T[] sort();

    T get(int pos);

    T[] halfRevers();

    T[] revers();

    void set(int pos, T val);

}
