package com.bitbucket.lists;

import com.bitbucket.lists.exceptions.ListEmptyExceptions;

public class ArrayListZeroCapacity implements IList {

    private int[] array = new int[0];

    @Override
    public void init(int[] init) {
        if (init == null) {
            this.array = new int[]{};
        } else {
            this.array = new int[init.length];
            for (int i = 0; i < init.length; i++) {
                this.array[i] = init[i];
            }
        }
    }

    @Override
    public void clear() {
        this.array = new int[]{};
    }

    @Override
    public int size() {
        return this.array.length;
    }

    @Override
    public int[] toArray() {
        int size = size();
        int[] result = new int[size];
        for (int i = 0; i < size; i++) {
            result[i] = this.array[i];
        }
        return result;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < size(); i++) {
            str.append(this.array[i]).append(", ");
        }
        return "";
    }

    @Override
    public void addStart(int val) {
        int size = size();
        int[] array = new int[size + 1];
        array[0] = val;
        for (int i = 0; i < size; i++) {
            array[i + 1] = this.array[i];
        }
        this.array = array;
    }

    @Override
    public void addEnd(int val) {
        int size = size();
        int[] array = new int[size + 1];
        array[size] = val;
        for (int i = 0; i < size; i++) {
            array[i] = this.array[i];
        }
        this.array = array;
    }


    @Override
    public void addByPos(int pos, int val) {
        int size = size();
        if (pos > size) {
            throw new ListEmptyExceptions();
        } else if (pos == size) {
            addEnd(val);
        } else if (pos == 0) {
            addStart(val);
        } else {
            int[] array = new int[size + 1];
            int j = 0;
            for (int i = 0; i < size + 1; i++) {
                if (i == pos) {
                    array[i] = val;
                } else {
                    array[i] = this.array[j];
                    j += 1;
                }
            }
        }
    }

    @Override
    public int removeStart() {
        if (size() == 0) {
            throw new ListEmptyExceptions();
        }
        int[] array = new int[size() - 1];
        for (int i = 1; i < size() - 1; i++) {
            array[i] = this.array[i];
        }
        int firstNumFromArray = get(0);
        this.array = array;
        return firstNumFromArray;
    }

    @Override
    public int removeEnd() {
        int size = size();
        if (size == 0) {
            throw new ListEmptyExceptions();
        }
        int[] array = new int[size - 1];
        for (int i = 0; i < size - 1; i++) {
            array[i] = this.array[i];
        }
        int lastNumFromArray = get(size - 1);
        this.array = array;
        return lastNumFromArray;
    }

    @Override
    public int removeByPos(int pos) {
        int size = size();
        if (pos > size - 1) {
            throw new ListEmptyExceptions();
        }
        int[] array = new int[size - 1];
        int j = 0;
        int numFromPos = get(pos);
        for (int i = 0; i < size - 1; i++) {
            if (i != pos) {
                array[j] = this.array[i];
                j += 1;
            }
        }
        return numFromPos;
    }

    @Override
    public int max() {
        int size = size();
        if (size == 0) {
            throw new ListEmptyExceptions();
        }
        int maxValue = this.array[0];
        for (int i = 0; i < size; i++) {
            if (maxValue < this.array[i]) {
                maxValue = this.array[i];
            }
        }
        return maxValue;
    }

    @Override
    public int min() {
        int size = size();
        if (size == 0) {
            throw new ListEmptyExceptions();
        }
        int minValue = this.array[0];
        for (int i = 0; i < size; i++) {
            if (minValue > this.array[i]) {
                minValue = this.array[i];
            }
        }
        return minValue;
    }

    @Override
    public int maxPos() {
        int size = size();
        if (size == 0) {
            throw new ListEmptyExceptions();
        }
        int pos = 0;
        int maxValue = this.array[pos];
        for (int i = 0; i < size; i++) {
            if (maxValue < this.array[i]) {
                maxValue = this.array[i];
                pos = i;
            }
        }
        return pos;
    }

    @Override
    public int minPos() {
        int size = size();
        if (size == 0) {
            throw new ListEmptyExceptions();
        }
        int pos = 0;
        int minValue = this.array[pos];
        for (int i = 0; i < size; i++) {
            if (minValue > this.array[i]) {
                minValue = this.array[i];
                pos = i;
            }
        }
        return pos;
    }

    @Override
    public int[] sort() {
        int size = size();
        if (size == 0) {
            throw new ListEmptyExceptions();
        }
        boolean end;
        do {
            end = false;
            for (int i = 0; i < size - 1; i++) {
                if (this.array[i] > this.array[i + 1]) {
                    int tmp = this.array[i + 1];
                    this.array[i + 1] = this.array[i];
                    this.array[i] = tmp;
                    end = true;
                }
            }

        } while (end);
        return this.array;
    }

    @Override
    public int get(int pos) {
        return this.array[pos];
    }

    @Override
    public int[] halfRevers() {
        int size = size();
        if (size == 0) {
            throw new ListEmptyExceptions();
        }
        int halfCell = (size / 2) + (size % 2);
        int[] cloneArray = new int[size];
        for (int i = 0; i < size; i++) {
            if (i < halfCell) {
                cloneArray[i] = this.array[(size / 2) + i];
            } else {
                cloneArray[i] = this.array[i - halfCell];
            }
        }
        this.array = cloneArray;
        return this.array;
    }

    @Override
    public int[] revers() {
        int size = size();
        if (size == 0) {
            throw new ListEmptyExceptions();
        }
        int[] cloneArray = new int[size];
        for (int i = 0; i < size; i++) {
            cloneArray[i] = this.array[size - i - 1];
        }
        this.array = cloneArray;
        return this.array;
    }

    @Override
    public void set(int pos, int val) {
        if (size() <= pos) {
            throw new ListEmptyExceptions();
        }
        this.array[pos] = val;
    }

}
