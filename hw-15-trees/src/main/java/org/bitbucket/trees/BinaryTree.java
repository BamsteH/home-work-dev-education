package org.bitbucket.trees;

import java.util.Arrays;
import java.util.Objects;

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

        @Override
        public int hashCode() {
            return Objects.hash(value, left, right);
        }
    }

    Node root;

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

}
