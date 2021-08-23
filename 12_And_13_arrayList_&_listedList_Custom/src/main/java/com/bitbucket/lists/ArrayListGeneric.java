package com.bitbucket.lists;


import com.bitbucket.lists.exceptions.ListEmptyExceptions;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListGeneric<T extends Comparable<?>> implements IListGen<T> {


    private Object[] array = new Object[10];

    private int index;

    @Override
    public void init(T[] init) {
        if (init == null) {
            throw new ListEmptyExceptions();
        } else {
            this.index = init.length;
            for (int i = 0; i < this.index; i++) {
                this.array[i] = init[i];
            }
        }
    }

    @Override
    public void clear() {
        this.index = 0;
    }

    @Override
    public int size() {
        return this.index;
    }

    @Override
    public Object[] toArray() {
        Object[] result = new Object[size()];
        for (int i = 0; i < this.index; i++) {
            result[i] = array[i];
        }
        return result;
    }

    @Override
    public void addStart(T val) {
        for (int i = this.index; i > 0; i--) {
            this.array[i] = this.array[i - 1];
        }
        this.array[0] = val;
        this.index++;
    }

    @Override
    public void addEnd(T val) {
        this.array[this.index] = val;
        this.index++;
    }

    @Override
    public void addByPos(int pos, T val) {
        int j = 0;
        Object[] result = new Object[this.index + 1];
        if (pos > this.index) {
            throw new ListEmptyExceptions();
        } else if (pos == this.index) {
            addEnd(val);
        } else if (pos == 0) {
            addStart(val);
        } else {
            for (int i = 0; i <= this.index; i++) {
                if (i == pos) {
                    result[i] = val;
                    j++;
                } else {
                    result[i] = this.array[i-j];
                }
            }
        }
        this.array = result;
        this.index++;
    }

    @Override
    public T removeStart() {
        Object removedVal = this.array[0];
        Object[] result = new Object[size() - 1];
        for (int i = 0; i < this.index - 1; i++) {
            result[i] = this.array[i+1];
        }
        this.array = result;
        this.index--;
        return (T) removedVal;
    }

    @Override
    public T removeEnd() {
        int size = size();
        Object removedVal = this.array[size - 1];
        Object[] result = new Object[size - 1];
        for (int i = 0; i < this.index - 1; i++) {
            result[i] = this.array[i];
        }
        this.array = result;
        this.index--;
        return (T) removedVal;
    }

    @Override
    public T removeByPos(int pos) {
        int size = size();
        int j = 0;
        if(pos >= size){
            throw new ListEmptyExceptions();
        }
        Object removedVal = this.array[pos];
        Object[] result = new Object[size - 1];
        for (int i = 0; i < this.index; i++) {
            if (i == pos){
                j++;
            } else {
                result[i-j] = this.array[i];
            }
        }
        this.array = result;
        this.index--;
        return (T) removedVal;
    }

    @Override
    public T max() {
        return null;
    }

    @Override
    public T min() {
        return null;
    }

    @Override
    public int maxPos() {
        return 0;
    }

    @Override
    public int minPos() {
        return 0;
    }

    @Override
    public T[] sort() {
        return null;
    }

    @Override
    public T get(int pos) {
        return null;
    }

    @Override
    public T[] halfRevers() {
        return null;
    }

    @Override
    public T[] revers() {
        return null;
    }

    @Override
    public void set(int pos, T val) {

    }
}

