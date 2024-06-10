package CSLL;

import java.security.spec.ECParameterSpec;

public class Main {
    public static void main(String[] args) {
        CSLL cs=new CSLL();
        Node n1=new Node(3);
        Node n2=new Node(2);
        Node n3=new Node(5);
        Node n4=new Node(6);
        Node n5=new Node(1);
        Node n6=new Node(9);


       cs.start=n1;
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;
        n5.next=n6;
        n6.next=cs.start;

        cs.print();
    }
}
