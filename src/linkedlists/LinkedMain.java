package linkedlists;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedMain {
    public static void main(String[] arr) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(10);
        ll.add(20);
        ll.add(22);
        ll.add(30);
        ll.add(42);
        ll.add(30);
        ll.add(50);
        ll.add(1, 15);
        System.out.println(ll.contains(20));

        ll.removeLastOccurrence(30);
//        ll.removeLast();
//        ll.removeFirstOccurrence(30);
//        ll.removeFirst();
        Iterator<Integer> iterator = ll.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        /* Understanding the Clone
        LinkedList<Integer> clone;
        clone = (LinkedList<Integer>) ll.clone();
        System.out.println(clone.descendingIterator());*/
        // CreateLinkedList();
    }

    private static void CreateLinkedList() {
        /*
                ------------------------------
      HEAD ->   | 10 | 20 | 30 | 40 | 50 | 60 | -> NULL
                ------------------------------
        First item in the Linked list address will be hold by head node
        Last item in linked list will hold next item address as null.since it is last element
        */
        /* Adding Manually to LinkedList
        Node ten = new Node(10);
        Node twenty = new Node(20);
        Node thrity = new Node(30);
        Node forty = new Node(40);
        Node fifty = new Node(50);

        Node head = ten;
        ten.setNext(twenty);
        twenty.setNext(thrity);
        thrity.setNext(forty);
        forty.setNext(fifty);
        fifty.setNext(null);*/
//        System.out.println(ten.getData());
//        System.out.println(ten.getNext().getData());
        Node head = null;
        head = insertAtFront(head, 50);
        head = insertAtFront(head, 40);
        head = insertAtFront(head, 30);
        head = insertAtFront(head, 20);
        head = insertAtFront(head, 10);
        head = insertAtFront(head, 5);
        printLinkedList(head);

        head = deleteAtFront(head);
        printLinkedList(head);
    }

    public static Node insertAtFront(Node head, int data) {
        Node newNode = new Node(data);
        newNode.setNext(null);

        if (head == null)
            head = newNode;
        else {
            newNode.setNext(head);
            head = newNode;
        }
        return head;
    }

    public static Node deleteAtFront(Node head) {
        if (head != null) {
            head = head.getNext();
        }
        return head;
    }

    public static void printLinkedList(Node node) {
        System.out.println("Printing the linked list : ");
        Node curr = node;
        while (curr != null) {
            System.out.println(curr.getData());
            curr = curr.getNext();
        }
    }
}
