package com.bitbucket.lists;

import com.bitbucket.lists.exceptions.ListEmptyExceptions;

public class ArrayListTenCapacity implements IList {

    private int[] array = new int[10];

    private int index;

    @Override
    public void init(int[] init) {
        if (init == null) {
            throw new ListEmptyExceptions();
        } else {
            while (init.length / 10 * 7 > this.array.length) {
                this.array = new int[(this.array.length * 3 / 2) + 1];
            }
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
    public int[] toArray() {
        if (this.array == null) {
            throw new ListEmptyExceptions();
        }
        int[] result = new int[this.index];
        for (int i = 0; i < this.index; i++) {
            result[i] = this.array[i];
        }
        return result;
    }

    @Override
    public void addStart(int val) {
        init(this.array);
        for (int i = this.index; i > 0; i--) {
            this.array[i] = this.array[i - 1];
        }
        this.array[0] = val;
        this.index++;
    }

    @Override
    public void addEnd(int val) {
        init(this.array);
        this.array[this.index] = val;
        this.index++;
    }

    @Override
    public void addByPos(int pos, int val) {
        init(this.array);
        int j = 0;
        if (pos > this.index) {
            throw new ListEmptyExceptions();
        } else if (pos == this.index) {
            addEnd(val);
        } else if (pos == 0) {
            addStart(val);
        } else {
            for (int i = 0; i <= this.index; i++) {
                if (i == pos) {
                    this.array[j] = val;
                }
            }
        }
        this.index++;
    }


    @Override
    public int removeStart() {
        init(this.array);
        int result = this.array[this.index - 1];
        int[] newArray = new int[this.index];
        for (int i = 0; i < this.index - 1; i++) {
                newArray[i] = this.array[i];
            }
        init(newArray);
        return result;
    }


    @Override
    public int removeEnd() {
        return 0;
    }

    @Override
    public int removeByPos(int pos) {
        return 0;
    }

    @Override
    public int max() {
        return 0;
    }

    @Override
    public int min() {
        return 0;
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
    public int[] sort() {
        return new int[0];
    }

    @Override
    public int get(int pos) {
        return 0;
    }

    @Override
    public int[] halfRevers() {
        return new int[0];
    }

    @Override
    public int[] revers() {
        return new int[0];
    }

    @Override
    public void set(int pos, int val) {

    }
}
