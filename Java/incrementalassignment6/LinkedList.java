package incrementalassignment6;


class Node<T> {
    T data;
    Node next;

    public Node(T data) {
        this.data = data;
        this.next = null;
    }
}


class Slist<T> {
    private SlistIterator<T> Iterator;

    SlistIterator<T> iterator() {
        if (this.Iterator == null) {
            Iterator = new SlistIterator<>();
        }
        return this.Iterator;
    }

    @Override
    public String toString() {
        SlistIterator sli = this.Iterator;
        Node current = sli.getHead();
        StringBuilder sb = new StringBuilder();
        while (current != null) {
            sb.append(current.data).append(" ");
            current = current.next;
        }
        return sb.toString();
    }

}

class SlistIterator<T> {
    private Node head = null;
    private Node current;

    public Node getHead() {
        return head;
    }

    public void append(T data) {
        if (head == null) {
            head = new Node(data);
            return;
        } else {
            current = head;
            while (current.next != null)
                current = current.next;
            current.next = new Node(data);
        }
    }


    /*public void printList() {
        StringBuilder sb = new StringBuilder();
        current = head;
        while (current != null) {
            sb.append(current.data).append(" ");
            current = current.next;
        }
        System.out.println(sb.toString());
    }*/


    public void remove() {
        if (head == null)
            return;
        else {
            current = head;
            head = current.next;
            current = null;
        }
    }

}


public class LinkedList {
    public static void main(String[] args) {
        Slist<Integer> list = new Slist<>();
        SlistIterator<Integer> it = list.iterator();
        it.append(5);
        it.append(6);
        it.append(7);
        it.append(8);
        it.append(9);
        System.out.println(list);
        it.remove();
        it.remove();
        //list.printList();
        System.out.println(list);

    }
}
