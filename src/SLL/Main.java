package SLL;

public class Main {
    public static void main(String[] args) {
        SLL s=new SLL();

//       Node n1=new Node(3);
//        Node n2=new Node(2);
//        Node n3=new Node(5);
//        Node n4=new Node(6);
//        Node n5=new Node(1);
//        Node n6=new Node(9);


//       s.start=n1;
//        n1.next=n2;
//        n2.next=n3;
//        n3.next=n4;
//        n4.next=n5;
//        n5.next=n6;
        s.insertAtFirst(3);
        s.insertAtFirst(5);
        s.insertAtFirst(6);
        s.insertAtLast(8);
        s.printSLL();
        System.out.println("length ="+ s.length());
//        s.deleteAtLast();
//        s.printSLL();
//
//        System.out.println(s.search(8));
//        System.out.println(s.sum());


    }
}
