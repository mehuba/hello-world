package concurrency;

/**
 * Created by Nico on 6/15/17 11:43.
 */
public class ReferenceTest {

    public static void main(String[] args) {

        Node<Integer> tail = new Node<Integer>(1);
        Node<Integer> t = tail, p = t;
        tail = new Node<Integer>(2);

        if (t != (t = tail)) {
            System.out.println("true");
        }


    }

    private static class Node<E> {
        volatile E item;
        volatile Node<E> next;

        public Node(E item) {
            this.item = item;
        }
    }

}
