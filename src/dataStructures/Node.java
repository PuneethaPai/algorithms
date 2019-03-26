package dataStructures;

class Node<T> {

    Node<T> right;
    Node<T> left;
    T data;

    Node(Node<T> left, T data, Node<T> right) {
        this.left = left;
        this.data = data;
        this.right = right;
    }

    Node(T data) {
        this(null, data, null);
    }

    @Override
    public String toString() {
        return "(" + (left == null ? "" : left) + data + (right == null ? "" : right) + ')';
    }
}
