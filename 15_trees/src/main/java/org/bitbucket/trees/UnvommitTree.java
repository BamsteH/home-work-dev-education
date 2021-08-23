package org.bitbucket.trees;

import org.bitbucket.trees.ITree;

import java.util.*;

public class UnvommitTree implements ITree {

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
            return value == node.value && Objects.equals(left, node.left) && Objects.equals(right, node.right) && Objects.equals(parent, node.parent);
        }

        @Override
        public int hashCode() {
            return Objects.hash(value);
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

        void width(Counter currentHeight, List<Integer> widths) {
            currentHeight.counter++;
            if (Objects.nonNull(this.left)) {
                this.left.width(currentHeight, widths);
            }
            currentHeight.counter--;

            while (widths.size() <= currentHeight.counter) {
                widths.add(0);
            }
            widths.set(currentHeight.counter, widths.get(currentHeight.counter) + 1);

            currentHeight.counter++;
            if (Objects.nonNull(this.right)) {
                this.right.width(currentHeight, widths);
            }
            currentHeight.counter--;
        }


        void height(Counter currentHeight, Counter maxHeight) {
            currentHeight.counter++;
            if (Objects.nonNull(this.left)) {
                this.left.height(currentHeight, maxHeight);
            }
            currentHeight.counter--;

            if (currentHeight.counter > maxHeight.counter) {
                maxHeight.counter = currentHeight.counter;
            }

            currentHeight.counter++;
            if (Objects.nonNull(this.right)) {
                this.right.height(currentHeight, maxHeight);
            }
            currentHeight.counter--;
        }


        private void nodes(Counter nodeNumber) {
            if (Objects.nonNull(this.left)) {
                this.left.nodes(nodeNumber);
            }

            if (Objects.nonNull(this.left) || Objects.nonNull(this.right)) {
                nodeNumber.counter = nodeNumber.counter + 1;
            }

            if (Objects.nonNull(this.right)) {
                this.right.nodes(nodeNumber);
            }
        }

        private void leaves(Counter leaves) {
            if (Objects.nonNull(this.left)) {
                this.left.leaves(leaves);
            }

            if (Objects.isNull(this.left) && Objects.isNull(this.right)) {
                leaves.counter = leaves.counter + 1;
            }

            if (Objects.nonNull(this.right)) {
                this.right.leaves(leaves);
            }
        }

        void reverse() {
            if (Objects.nonNull(this.left)) {
                this.left.reverse();
            }
            Node tmp = new Node(this.value, this.parent);
            tmp.left = this.left;
            tmp.right = this.right;
            this.left = tmp.right;
            this.right = tmp.left;
            if (Objects.nonNull(this.right)) {
                this.right.reverse();
            }
        }

    }

    Node root;
    int size;

    public UnvommitTree(int[] array) {
        this.init(array);
    }

    public UnvommitTree() {
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

    private boolean hasRepeatingElements(int[] array) {
        Set set = new HashSet();
        for (int i = 0; i < array.length; i++) {
            if (!set.add(array[i])) {
                return true;
            }
        }
        return false;
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
        int[] result = new int[this.size];
        if (this.size == 0) {
            return result;
        }
        Counter counter = new Counter();
        this.root.toArray(result, counter);
        return result;
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

    @Override
    public void delete(int value) {

        Node node = find(value);

        if (Objects.isNull(node.left) && Objects.isNull(node.right)) {
            if (Objects.isNull(node.parent)) {
                this.root = null;
            } else if (Objects.equals(node, node.parent.right)) {
                node.parent.right = null;
            } else {
                node.parent.left = null;
            }
        } else if (Objects.isNull(node.left)) {
            if (Objects.isNull(node.parent)) {
                this.root = node.right;
                this.root.parent = null;
            } else if (Objects.equals(node, node.parent.right)) {
                node.parent.right = node.right;
                node.right.parent = node.parent;
            } else {
                node.parent.left = node.right;
                node.right.parent = node.parent;
            }
        } else if (Objects.isNull(node.right)) {
            if (Objects.isNull(node.parent)) {
                this.root = node.left;
                this.root.parent = null;
            } else if (Objects.equals(node, node.parent.right)) {
                node.parent.right = node.left;
                node.left.parent = node.parent;
            } else {
                node.parent.left = node.left;
                node.left.parent = node.parent;
            }
        } else {
            Node nodeToSwap = node.right;
            while (Objects.nonNull(nodeToSwap.left)) {
                nodeToSwap = nodeToSwap.left;
            }
            if (Objects.nonNull(nodeToSwap.right)) {
                nodeToSwap.parent.left = nodeToSwap.right;
                nodeToSwap.right.parent = nodeToSwap.parent;
            } else {
                nodeToSwap.parent.left = null;
            }
            node.value = nodeToSwap.value;
        }
        this.size--;
    }

    private Node find(int value) {
        if (this.size == 0) {
            throw new NoSuchElementException();
        }
        return findNode(value, this.root);
    }

    private Node findNode(int value, Node node) {
        if (Objects.isNull(node)) {
            throw new NoSuchElementException();
        }
        if (node.value == value) {
            return node;
        } else if (value < node.value) {
            return findNode(value, node.left);
        } else {
            return findNode(value, node.right);
        }
    }

    @Override
    public int width() {
        if (Objects.isNull(this.root)) {
            return 0;
        }
        List<Integer> widths = new ArrayList<>();
        Counter counter = new Counter();
        this.root.width(counter, widths);
        Integer result = widths.get(0);
        for (Integer width : widths) {
            if (width > result) {
                result = width;
            }
        }
        return result;
    }

    @Override
    public int height() {
        if (Objects.isNull(this.root)) {
            return 0;
        }
        Counter currentHeight = new Counter(1);
        Counter maxHeight = new Counter(1);
        this.root.height(currentHeight, maxHeight);
        return maxHeight.counter;
    }

    @Override
    public int nodes() {
        if (Objects.isNull(this.root)) {
            return 0;
        }
        Counter nodeNumber = new Counter(0);
        this.root.nodes(nodeNumber);
        return nodeNumber.counter;
    }

    @Override
    public int leaves() {
        if (Objects.isNull(this.root)) {
            return 0;
        }
        Counter nodeNumber = new Counter(0);
        this.root.leaves(nodeNumber);
        return nodeNumber.counter;
    }

    @Override
    public void reverse() {
        this.root.reverse();
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UnvommitTree that = (UnvommitTree) o;
        if (this.size != that.size) {
            return false;
        }
        return Arrays.equals(this.toArray(), that.toArray());
    }

    @Override
    public int hashCode() {
        return Objects.hash(root, size);
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

}
