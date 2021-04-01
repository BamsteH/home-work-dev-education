package org.bitbucket.trees;

import java.util.*;

public class BinaryTree implements ITree {

    private static class Node {

        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Node node = (Node) o;
            return value == node.value && Objects.equals(left, node.left) && Objects.equals(right, node.right);
        }

        void add(int value) {
            if (value < this.value) {
                if (this.left == null) {
                    this.left = new Node(value);
                } else {
                    this.left.add(value);
                }
            } else if (value > this.value) {
                if (this.right == null) {
                    this.right = new Node(value);
                } else {
                    this.right.add(value);
                }
            } else {
                throw new IllegalArgumentException();
            }
        }

        void width(Counter counterHeight, List<Integer> array) {
            counterHeight.counter++;
            if (this.left != null) {
                this.left.width(counterHeight, array);
            }
            counterHeight.counter--;
            while (array.size() <= counterHeight.counter) {
                array.add(0);
            }
            array.set(counterHeight.counter, array.get(counterHeight.counter) + 1);
            if (this.right != null){
                this.right.width(counterHeight, array);
            }
            counterHeight.counter--;
        }

        void height(Counter counterHeight, Counter maxHeight){
            counterHeight.counter++;
            if (this.left != null) {
                this.left.height(counterHeight,maxHeight);
            }
            counterHeight.counter--;
            if (counterHeight.counter > maxHeight.counter){
                maxHeight.counter = counterHeight.counter;
            }
            if (this.right != null){
                this.right.height(counterHeight, maxHeight);
            }
            counterHeight.counter--;
        }

        void leaves(Counter leavesCount){
            if (Objects.nonNull(this.left)){
                this.left.leaves(leavesCount);
            }
            if (this.left == null && this.right == null){
                leavesCount.counter++;
            }
            if (Objects.nonNull(this.right)){
                this.right.leaves(leavesCount);
            }
        }

        void nodes(Counter countNodes){
            if (Objects.nonNull(this.left)){
                this.left.leaves(countNodes);
            }

            countNodes.counter++;

            if (Objects.nonNull(this.right)){
                this.right.leaves(countNodes);
            }
        }

        void sort(){

        }

        @Override
        public int hashCode() {
            return Objects.hash(value, left, right);
        }
    }

    private static class Counter {

        int counter;

        public Counter(int counter) {
            this.counter = counter;
        }

        public Counter() {
            this.counter = 0;
        }

        void increment() {
            counter++;
        }

    }

    Node root;
    int size;

    public BinaryTree(int[] array) {
        this.init(array);
    }

    public BinaryTree() {
        this.init(new int[0]);
    }

    @Override
    public void init(int[] array) {

    }

    @Override
    public void clear() {
        this.root = null;
        this.size = 0;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public int[] toArray() {
        return new int[0];
    }

    @Override
    public void add(int value) {

    }

    @Override
    public void delete(int value) {

    }

    @Override
    public int width() {
        return 0;
    }

    @Override
    public int height() {
        return 0;
    }

    @Override
    public int nodes() {
        return 0;
    }

    @Override
    public int leaves() {
        return 0;
    }

    @Override
    public void reverse() {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BinaryTree that = (BinaryTree) o;
        return Arrays.equals(this.toArray(), that.toArray());
    }

    @Override
    public int hashCode() {
        return Objects.hash(root);
    }

    private boolean hasRepeatingElements(int[] array) {
        Set set = new HashSet();
        for (int j : array) {
            if (!set.add(j)) {
                return true;
            }
        }
        return false;
    }
}
