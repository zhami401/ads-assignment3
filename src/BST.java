import java.util.*;

public class BST<K extends Comparable<K>, V> implements Iterable<BST<K,V>.Node> {

    public class Node {
        K key;
        V val;
        Node left, right;

        public Node(K key, V val) {
            this.key = key;
            this.val = val;
        }

        public K getKey() { return key; }
        public V getValue() { return val; }
    }

    private Node root;
    private int size;

    public int size() {
        return size;
    }

    public void put(K key, V val) {
        root = put(root, key, val);
    }

    private Node put(Node node, K key, V val) {
        if (node == null) {
            size++;
            return new Node(key, val);
        }

        int cmp = key.compareTo(node.key);

        if (cmp < 0) node.left = put(node.left, key, val);
        else if (cmp > 0) node.right = put(node.right, key, val);
        else node.val = val;

        return node;
    }

    public V get(K key) {
        Node node = root;
        while (node != null) {
            int cmp = key.compareTo(node.key);
            if (cmp < 0) node = node.left;
            else if (cmp > 0) node = node.right;
            else return node.val;
        }
        return null;
    }

    public void delete(K key) {
        root = delete(root, key);
    }

    private Node delete(Node node, K key) {
        if (node == null) return null;

        int cmp = key.compareTo(node.key);

        if (cmp < 0) node.left = delete(node.left, key);
        else if (cmp > 0) node.right = delete(node.right, key);
        else {
            size--;

            if (node.left == null) return node.right;
            if (node.right == null) return node.left;

            Node min = findMin(node.right);
            node.key = min.key;
            node.val = min.val;
            node.right = delete(node.right, min.key);
        }

        return node;
    }

    private Node findMin(Node node) {
        while (node.left != null) node = node.left;
        return node;
    }


    public Iterator<Node> iterator() {
        List<Node> list = new ArrayList<>();
        inorder(root, list);
        return list.iterator();
    }

    private void inorder(Node node, List<Node> list) {
        if (node == null) return;
        inorder(node.left, list);
        list.add(node);
        inorder(node.right, list);
    }
}

