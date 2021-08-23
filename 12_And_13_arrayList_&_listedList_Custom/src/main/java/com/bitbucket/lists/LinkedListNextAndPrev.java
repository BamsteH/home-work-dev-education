package com.bitbucket.lists;

public class LinkedListNextAndPrev implements IList{

    private LinkedListNextAndPrev.Node root;

    public static class Node {

        int value;

        LinkedListNextAndPrev.Node next;

        LinkedListNextAndPrev.Node prev;
        
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

    }

    @Override
    public int removeStart() {
        return 0;
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
