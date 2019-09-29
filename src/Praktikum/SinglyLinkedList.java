package Praktikum;

public class SinglyLinkedList<E> {
    Node<E> head = null;
    Node<E> tail = null;
    private int size = 0;

    public SinglyLinkedList() {
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public E first() {
        if (isEmpty()) return null;
        return head.getElement();
    }

    public E last() {
        if (isEmpty()) return null;
        return tail.getElement();
    }

    public void addFirst(E e) {
        head = new Node<>(e, head);
        if (size == 0) tail = head;
        size++;
    }

    public void addLast(E e) {
        Node<E> newNode = new Node<>(e, null);
        if (isEmpty()) {
            head = newNode;
        } else {
            tail.setNext(newNode);
        }
        tail = newNode;
        size++;
    }

    public E removeFirst() {
        if (isEmpty()) return null;
        E deleted = head.getElement();
        head = head.getNext();
        size--;
        if (size == 0) {
            tail = null;
        }
        return deleted;
    }

    public E removeLast() {
        Node<E> temp = head;
        Node<E> deleted = head;
        if (isEmpty()) return null;
        while (deleted.getNext() != null) {
            temp = deleted;
            deleted = deleted.getNext();
        }
        if (deleted == head) {
            head = null;
        } else {
            temp.setNext(null);
        }
        return deleted.getElement();
    }
}
