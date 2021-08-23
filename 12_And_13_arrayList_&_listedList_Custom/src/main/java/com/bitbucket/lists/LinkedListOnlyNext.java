package com.bitbucket.lists;

import com.bitbucket.lists.exceptions.ListEmptyExceptions;

public class LinkedListOnlyNext implements IList {

    private Node root;

    public static class Node {

        int value;

        Node next;

        public Node(int value) {
            this.value = value;
        }

    }

    @Override
    public void init(int[] init) {
        if (init != null) {
            for (int i = 0; i < init.length; i++) {
                addEnd(init[i]);
            }
        }
    }

    @Override
    public void clear() {
        this.root = null;
    }

    @Override
    public int size() {
        Node tmp = this.root;
        int count = 0;
        while (tmp != null) {
            tmp = tmp.next;
            count++;
        }
        return count;
    }


    @Override
    public int[] toArray() {
        int size = size();
        if (size == 0) {
            return new int[0];
        }
        int count = 0;
        int[] array = new int[size];
        Node tmp = this.root;
        while (tmp != null) {
            array[count] = tmp.value;
            tmp = tmp.next;
            count++;
        }
        return array;
    }

    @Override
    public void addStart(int val) {
        Node tmp = new Node(val);
        tmp.next = this.root;
        this.root = tmp;
    }

    @Override
    public void addEnd(int val) {
        if (this.root == null) {
            this.root = new Node(val);
        } else {
            Node tmp = this.root;
            while (tmp.next != null) {
                tmp = tmp.next;
            }
            tmp.next = new Node(val);
        }
    }

    @Override
    public void addByPos(int pos, int val) {
        if (pos == 0) {
            addStart(val);
        } else if (pos < 0 || pos > size()) {
            throw new ListEmptyExceptions();
        } else if (pos == size()) {
            addEnd(val);
        } else {
            Node tmp = this.root;
            Node newNode = new Node(val);
            for (int i = 0; i < pos - 1; i++) {
                tmp = tmp.next;
            }
            newNode.next = tmp.next;
            tmp.next = newNode;
        }
    }

    @Override
    public int removeStart() {
        Node tmp = this.root;
        if (tmp == null) {
            throw new ListEmptyExceptions();
        }
        int result = tmp.value;
        this.root = tmp.next;
        return result;
    }

    @Override
    public int removeEnd() {
        Node tmp = this.root;
        if (tmp == null) {
            throw new ListEmptyExceptions();
        }
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        int result = tmp.value;
        tmp = null;
        return result;
    }

    @Override
    public int removeByPos(int pos) {
        Node tmp = this.root;
        int size = size();
        if (pos < 0 || pos >= size) {
            throw new ListEmptyExceptions();
        }
        if (pos == 0) {
            return removeStart();
        } else if (pos == size - 1) {
            return removeEnd();
        } else {
            for (int i = 0; i < pos - 1; i++) {
                tmp = tmp.next;
            }
            int result = tmp.next.value;
            tmp.next = tmp.next.next;
            return result;
        }
    }

    @Override
    public int max() {
        Node tmp = this.root;
        if (tmp == null) {
            throw new ListEmptyExceptions();
        }
        int maxValue = tmp.value;
        while (tmp.next != null) {
            if (tmp.next.value > maxValue) {
                maxValue = tmp.next.value;
            }
            tmp = tmp.next;
        }
        return maxValue;
    }

    @Override
    public int min() {
        Node tmp = this.root;
        if (tmp == null) {
            throw new ListEmptyExceptions();
        }
        int minValue = tmp.value;
        while (tmp.next != null) {
            if (tmp.next.value < minValue) {
                minValue = tmp.next.value;
            }
            tmp = tmp.next;
        }
        return minValue;
    }

    @Override
    public int maxPos() {
        Node tmp = this.root;
        if (tmp == null) {
            throw new ListEmptyExceptions();
        }
        int maxValue = tmp.value;
        int maxValuePos = 0;
        int pos = 0;
        while (tmp != null) {
            if (tmp.value > maxValue) {
                maxValue = tmp.value;
                maxValuePos = pos;
            }
            tmp = tmp.next;
            pos++;
        }
        return maxValuePos;
    }

    @Override
    public int minPos() {
        Node tmp = this.root;
        if (tmp == null) {
            throw new ListEmptyExceptions();
        }
        int minValue = tmp.value;
        int minValuePos = 0;
        int pos = 0;
        while (tmp != null) {
            if (tmp.value < minValue) {
                minValue = tmp.value;
                minValuePos = pos;
            }
            tmp = tmp.next;
            pos++;
        }
        return minValuePos;
    }

    @Override
    public int[] sort() {
        Node tmp = this.root;
        if (tmp == null) {
            throw new ListEmptyExceptions();
        }
        int min = min();
        removeByPos(minPos());
        addStart(min);
        int size = size();
        int j = 0;
        if (size == 1 || size == 2) {
            return toArray();
        } else {
            do {
                tmp = this.root;
                j = 0;
                for (int i = 0; i < size - 2; i++) {
                    if (tmp.next.value > tmp.next.next.value) {
                        Node tmpNext = new Node(tmp.next.next.value);
                        tmp.next = tmp.next.next;
                        tmp.next.next = tmpNext;
                        tmpNext.next = tmp.next.next.next;
                        j++;
                    }
                }
            } while ((j != 0));
            return toArray();
        }
    }

    @Override
    public int get(int pos) {
        Node tmp = this.root;
        int size = size();
        if (pos < 0 || pos >= size) {
            throw new ListEmptyExceptions();
        }
        if (pos == 0) {
            return this.root.value;
        } else {
            for (int i = 0; i < pos - 1; i++) {
                tmp = tmp.next;
            }
            return tmp.next.value;
        }
    }

    @Override
    public int[] halfRevers() {
        Node tmp = this.root;
        Node last = this.root;
        if (tmp == null) {
            throw new ListEmptyExceptions();
        }
        int size = size();
        if (size < 2) {
            return toArray();
        }
        for (int i = 0; i < size; i++) {
            tmp = tmp.next;
        }
        tmp.next = last;
        tmp = tmp.next;
        int halfSize = (size / 2) + (size % 2) - 1;
        for (int i = 0; i < halfSize; i++) {
            tmp = tmp.next;
        }
        this.root = tmp.next;
        tmp.next = null;
        return toArray();
    }

    @Override
    public int[] revers() {
        int size = size();
        Node tmp = this.root;
        for (int i = 0; i < size; i++) {
            addStart(tmp.value);
            tmp = tmp.next;
        }
        Node newTmp = this.root;
        for (int i = 0; i < size; i++) {
            tmp = tmp.next;
        }
        tmp.next = null;
        return toArray();
    }

    @Override
    public void set(int pos, int val) {
        if (this.root == null) {
            throw new ListEmptyExceptions();
        }
        if (size() <= pos){
            throw new ListEmptyExceptions();
        }
        Node tmp = this.root;
        for (int i = 0; i < pos; i++) {
            tmp = tmp.next;
        }
        tmp.value = val;
    }
}
