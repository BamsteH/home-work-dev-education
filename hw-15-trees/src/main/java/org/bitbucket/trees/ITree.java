package org.bitbucket.trees;

public interface ITree {

    void init(int[] array);

    String toString();

    void clear();

    int size();

    int[] toArray();

    void add(int value);

    void delete(int value);

    int width();

    int height();

    int nodes();

    int leaves();

    void reverse();

}
