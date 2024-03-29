
// Day:15 - Linked List.

import java.util.*;

class Node {

    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }

}

class Solution16 {

    public static Node insert(Node head, int data) {

        Node node = new Node(data);
        Node ptr = head;

        if (head == null) {
            head = node;
        } else {
            while (head.next != null) {
                head = head.next;
            }
            head.next = node;
            head = ptr;
        }

        return head;
    }

    public static void display(Node head) {

        Node start = head;

        while (start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }

    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        Node head = null;
        int N = sc.nextInt();

        while (N-- > 0) {
            int ele = sc.nextInt();
            head = insert(head, ele);
        }

        display(head);

        sc.close();

    }
}
