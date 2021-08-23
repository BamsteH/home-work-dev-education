package org.bitbucket.trees;

import java.util.*;

public class BinaryTree implements ITree {

    private static class Node {

        int value;
        Node left;
        Node right;
        Node parent;

        public Node(int value, Node parent) {
            this.value = value;
            this.left = null;
            this.right = null;
            this.parent = parent;
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
                    this.left = new Node(value, this);
                } else {
                    this.left.add(value);
                }
            } else if (value > this.value) {
                if (this.right == null) {
                    this.right = new Node(value, this);
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
            if (this.right != null) {
                this.right.width(counterHeight, array);
            }
            counterHeight.counter--;
        }

        void height(Counter counterHeight, Counter maxHeight) {
            counterHeight.counter++;
            if (this.left != null) {
                this.left.height(counterHeight, maxHeight);
            }
            counterHeight.counter--;
            if (counterHeight.counter > maxHeight.counter) {
                maxHeight.counter = counterHeight.counter;
            }
            if (this.right != null) {
                this.right.height(counterHeight, maxHeight);
            }
            counterHeight.counter--;
        }

        void leaves(Counter leavesCount) {
            if (Objects.nonNull(this.left)) {
                this.left.leaves(leavesCount);
            }
            if (this.left == null && this.right == null) {
                leavesCount.counter++;
            }
            if (Objects.nonNull(this.right)) {
                this.right.leaves(leavesCount);
            }
        }

        void nodes(Counter countNodes) {
            if (Objects.nonNull(this.left)) {
                this.left.leaves(countNodes);
            }

            countNodes.counter++;

            if (Objects.nonNull(this.right)) {
                this.right.leaves(countNodes);
            }
        }

        void toArray(int[] array, Counter counter) {
            if (Objects.nonNull(this.left)) {
                this.left.toArray(array, counter);
            }
            array[counter.counter] = this.value;
            counter.increment();
            if (Objects.nonNull(this.right)) {
                this.right.toArray(array, counter);
            }
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
        this.clear();
        if (hasRepeatingElements(array)) {
            throw new IllegalArgumentException();
        }
        for (int element : array) {
            this.add(element);
        }
    }

    @Override
    public void clear() {
        this.root = null;
        this.size = 0;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public int[] toArray() {
        int[] array = new int[this.size];
        if (this.size == 0) {
            return array;
        }
        Counter counter = new Counter();
        this.root.toArray(array, counter);
        return array;
    }

    @Override
    public void add(int value) {
        if (this.size == 0) {
            this.root = new Node(value, null);
            this.size++;
            return;
        }
        this.root.add(value);
        size++;
    }

    private Node findNode(int value, Node node) {
        if (Objects.isNull(node)) {
            throw new NoSuchElementException();
        }
        if (value < node.value) {
            return findNode(value, node.left);
        } else if (value > node.value) {
            return findNode(value, node.right);
        } else {
            return node;
        }
    }

    private Node goToLeft(Node node) {
        if (Objects.nonNull(node.left)) {
            return goToLeft(node.left);
        } else {
            return node;
        }
    }

    @Override
    public void delete(int value) {
        Node node = findNode(value, this.root);
        Node searchedNode = node.right; //нода на худший случай.
        //Наша нода - листок
        if (Objects.isNull(node.left) && Objects.isNull(node.right)) {
            if (node.parent == null) {
                this.root = null;
            } else if (node.parent.right.value == node.value) {
                node.parent.right = null;
            } else if (node.parent.left.value == node.value) {
                node.parent.left = null;
            } else {
                this.root = null;
            }
        }
        //наша нода имеет одну ветвь
        else if (Objects.nonNull(node.left) && Objects.isNull(node.right)) {
            if (node.parent == null) {
                this.root = node.left;
            } else if (node.value < node.parent.value) {
                node.parent.left = node.parent.left.left;
            } else {
                node.parent.right = node.parent.right.left;
            }
        } else if (Objects.isNull(node.left) && Objects.nonNull(node.right)) {
            if (node.parent == null) {
                this.root = node.right;
            } else if (node.value < node.parent.value) {
                node.parent.left = node.parent.left.right;
            } else {
                node.parent.right = node.parent.right.right;
            }
        }
        //наша нода имеет две ветви
        else if (Objects.nonNull(node.left) && Objects.nonNull(node.right)) {

            if (Objects.nonNull(searchedNode.left)) {
                searchedNode = goToLeft(searchedNode);
            }
            node.value = searchedNode.value;
            if (searchedNode.parent.equals(node)) {
                node.right = searchedNode.right;
            } else {
                searchedNode.parent.left = searchedNode.right;
            }
        }
        //наша нода имеет две ветви
        this.size--;
    }

    @Override
    public int width() {
        if (Objects.isNull(this.root)) {
            return 0;
        }
        Counter width = new Counter();
        List<Integer> array = new ArrayList<>();
        this.root.width(width, array);
        int max = array.get(0);
        for (int i = 0; i < array.size(); i++) {
            if (max < array.get(i)) {
                max = array.get(i);
            }
        }
        return max;
    }

    @Override
    public int height() {
        if (Objects.isNull(this.root)) {
            return 0;
        }
        Counter currentHeight = new Counter(1);
        Counter height = new Counter(1);
        this.root.height(currentHeight, height);
        return height.counter;
    }

    @Override
    public int nodes() {
        if (Objects.isNull(this.root)) {
            return 0;
        }
        Counter zeroNode = new Counter();
        this.root.nodes(zeroNode);
        return zeroNode.counter;
    }

    @Override
    public int leaves() {
        if (Objects.isNull(this.root)) {
            return 0;
        }
        Counter zeroNode = new Counter();
        this.root.leaves(zeroNode);
        return zeroNode.counter;
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
