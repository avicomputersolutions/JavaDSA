package CSLL;

public class CSLL {

    Node start;


    void print(){
        Node cur=start;

        do{
            System.out.print(cur.data+"->");
            cur=cur.next;
        }while(cur!=start);
        System.out.print(start.data);
    }
}
