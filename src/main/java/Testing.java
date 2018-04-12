import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by zhaoyibin on 19:47 19/10/2017
 */
public class Testing {
    public static Node sortList1(Node head) {
        Node node = new Node(-1);
        node.next = head;
        if (head == null) {
            return null;
        }
        Node cur = head.next;
        Node pre = head;
        while (cur != null) {
            if (cur.value < pre.value) {
                Node nextNode = cur.next;
                Node cur2 = node.next;
                Node temp = node;
                while (cur.value > cur2.value && cur2 != cur) {
                    temp = cur2;
                    cur2 = cur2.next;
                }
                temp.next = cur;
                cur.next = cur2;
                pre.next = nextNode;
            } else {
                pre = cur;
                cur = cur.next;
            }
        }
        return node.next;
    }

    public static Node sortList2(Node head) {
        int temp;
        Node curNode = head;
        while (curNode != null) {
            Node nextNode = curNode.next;
            while (nextNode != null) {
                if (nextNode.value < curNode.value) {
                    temp = nextNode.value;
                    nextNode.value = curNode.value;
                    curNode.value = temp;
                }
                nextNode = nextNode.next;
            }
        }
        return head;
    }

    public static Node sortList(Node head){
        Node h = head;  Node p = head.next;
        Node q;
        while(p != null && p.next != null){
            q = p.next;
            if(p.value > q.value){
                Node r = q.next;
                p.next = r;
                q.next = p;
                h.next = q;
            }
        }
        return head;
    }

    public static void main(String[] args) {


        final int N = 10;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            list.add(i);
        }
        Node dummy = new Node(-1);
        Node node = dummy;
        Collections.shuffle(list);
        for (int i = 0; i < N; i++) {
            Node newNode = new Node(list.get(i));
            node.next = newNode;
            node = newNode;
        }
        print(dummy.next);
        Node newHead = sortList(dummy.next);
        print(newHead);

    }

    public static void print(Node head) {
        Node node = head;
        while (node != null) {
            System.out.print(node.value + ",");
            node = node.next;
        }
    }
}

class Node {
    public int value;
    public Node next;

    public Node(int value) {
        this.value = value;
        this.next = null;
    }
}
