package dataStructures;

import java.util.Comparator;

public class BinarySearchTree<T extends Number & Comparable<T>> {
    private Node<T> root;

    BinarySearchTree() {
        this.root = null;
    }

    BinarySearchTree(T... values) {
        add(values);
    }

    private Node<T> add(Node<T> root, T value) {
        if (root == null) return new Node<>(null, value, null);
        Comparator.comparing()
        if (value.compareTo(root.data) <= 0) {
            root.left = add(root.left, value);
        } else {
            root.right = add(root.right, value);
        }
        return root;
    }

    @Override
    public String toString() {
        return root.toString();
    }

    BinarySearchTree<T> add(T... values) {
        for (T value : values) {
            this.root = add(this.root, value);
        }
        return this;
    }
}
