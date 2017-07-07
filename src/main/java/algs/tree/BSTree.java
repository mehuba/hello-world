package algs.tree;

/**
 * Created by Nico on 6/27/17 19:03.
 */
public class BSTree {

    private Node root;

    public class Node <T extends Comparable<T>> {
        T key;
        Node left;
        Node right;
        Node parent;

        public Node(T key, Node left, Node right, Node parent) {
            this.key = key;
            this.left = left;
            this.right = right;
            this.parent = parent;
        }
    }



}
