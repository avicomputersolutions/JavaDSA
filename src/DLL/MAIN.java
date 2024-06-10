package DLL;

public class MAIN {
    public static void main(String[] args) {
        Node n1=new Node(1);
        Node n2=new Node(2);
        Node n3=new Node(3);
        Node n4=new Node(4);
        Node n5=new Node(5);
        Node n6=new Node(6);

        DLL d=new DLL();
        d.head=n1;
        n1.next=n2;
        n2.prev=n1;
        n2.next=n3;
        n3.prev=n2;
        n3.next=n4;
        n4.prev=n3;
        n4.next=n5;
        n5.prev=n4;
        n5.next=n6;
        n6.prev=n5;

        d.printForward();
        d.addFirst(8);
        d.printForward();
        d.addLast(9);
        d.printForward();
        d.addAtPos(7,3);
        d.printForward();
        d.delAtFirst();
        d.printForward();
        d.delAtLast();
        d.printForward();
    }
}
