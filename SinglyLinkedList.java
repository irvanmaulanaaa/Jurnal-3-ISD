import java.util.*;

public class SinglyLinkedList {
    
    private ListNode head;
    private ListNode tail;

    public SinglyLinkedList() {
        head = null;
        tail = null;
    }

    public void insertAtFront (buku insertItem) {
        ListNode newNode = new ListNode(insertItem);

        if (isEmpty()) {
            head = tail = new ListNode(insertItem);
        } else {
            newNode.next = newNode;
            head = newNode;
        }
    }

    public void insertAtBack(buku insItem) {
        ListNode newNode= new ListNode(insItem);

        if (isEmpty()) {
            head  = tail = new ListNode(insItem);
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    private boolean isEmpty() {
        return head == null;
    }

    public buku removeFromBack() throws NoSuchElementException {
        if (isEmpty()) {
            throw new NoSuchElementException("listnya kosong");
        }

        buku removedItem = tail.data;

        if (head == tail) {
             head = tail = null;
        } else {
            ListNode current = head;

            while (current.next != tail) {
                current = current.next;
            }
            tail = current;
            current.next = null;
        }
        return removedItem;
    }

    public buku removeFromFront() throws NoSuchElementException {
        if (isEmpty()) {
            throw new NoSuchElementException("listnya kosong");
        }

        buku removedItem = head.data;

        if (head == tail) {
            head = tail = null;
        }

        head = head.next;

        return removedItem;
    }

    public void print() {
        if (isEmpty()) {
            System.out.printf("listnya kosong");
            return;
        }
        ListNode current = head;

        // while not at end of list, output current node's data
        while (current != null) {
            System.out.printf("%s ", current.data);
            current = current.next;
        }
        System.out.println();
    }
}