package CDLL;

public class Main {
    public static void main(String[] args) {
        CDLL cd=new CDLL();
//        Node n1=new Node(1);
//        Node n2=new Node(2);
//        Node n3=new Node(3);
//
//
//        cd.head=n1;
//        n1.next=n2;
//        n2.prev=n1;
//        n2.next=n3;
//        n3.prev=n2;
//        cd.tail=n3;
//
//       cd.tail.next=cd.head;
//       cd.head.prev=cd.tail;
//        // forward

       //Backward
        int[] arr={2,1,3,5,9};
        for(int i=0;i<arr.length;i++) {
            cd.insert(arr[i]);
        }
        cd.linearSearch(5);
        cd.sort();

        cd.printForward();
    }
}
