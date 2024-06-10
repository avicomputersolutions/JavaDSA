package DLL;

public class DLL {
    Node head;


    DLL() {
        this.head = null;

    }

    void printForward() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    void addFirst(int data) {
        Node n = new Node(data);
        if (head == null) {
            head = n;
        } else {
            n.next = head;
            head = n;
            n.prev = null;
        }

    }

    void addLast(int data) {
        Node n = new Node(data);
        if (head == null) {
            head = n;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = n;
            n.prev = temp;
            n.next = null;
        }

    }

    void addAtPos(int data, int pos) {
        Node newnode = new Node(data);

        if (pos == 1) {
            newnode.next = head;
            head.prev = newnode;
            head = newnode;
        } else {
            Node prev = head;
            int index = 1;
            while (index < pos - 1) {
                prev = prev.next;
                index++;
            }
            Node temp = prev.next;
            prev.next = newnode;
            newnode.prev = prev;
            newnode.next = temp;
            temp.prev = newnode;
        }
    }

    void delAtFirst() {
        if (head == null || head.next == null) {
            return;
        } else {
            head.next.prev = null;
            head = head.next;

        }
    }

    void delAtLast() {
        if (head == null || head.next == null) {
            return;
        } else {
            Node Last = head;
            while (Last.next != null) {
                Last = Last.next;
            }
            Node prev = Last.prev;
            prev.next = null;
        }
    }
}
