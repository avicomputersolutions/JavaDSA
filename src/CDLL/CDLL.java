package CDLL;

import javax.sound.midi.Soundbank;

public class CDLL {
    Node head;
    Node tail;

    void printForward(){
        Node temp=head;
        do{
            System.out.print(temp.data+"->");
            temp=temp.next;
        }while(temp!=head);
        System.out.println(temp.data);
    }

    void printBackward(){
        Node last=tail;
        do{
            System.out.print(last.data+"->");
            last=last.prev;
        }while(last!=tail);
        System.out.println(last.data);
    }

    void insert(int data){
        Node n=new Node(data);
        if(head==null){
            head=n;
            tail=n;
            head.prev=tail;
            tail.next=head;
        }else{

            Node last=head;
            while(last.next!=head){
                last=last.next;
            }
            last.next=n;
            n.prev=last;
            tail=n;
            tail.next=head;
            head.prev=tail;

        }
    }

    void delete(){
        if(head==null || tail.next==head.prev){
            return ;
        }else{
            Node last=tail;
            tail=last.prev;
            tail.next=head;
            head.prev=tail;
        }
    }
    void linearSearch(int target){
        Node temp=head;
        int index=1;
        do{
            if(temp.data==target){
                System.out.println("found at index "+index);
                break;
            }else{
                temp=temp.next;
                index++;
            }
        }while(temp!=head);
    }
    void sort(){
        Node temp=head;

        while(temp.next!=head) {
            if (temp.data > temp.next.data) {
                int data = temp.data;
                temp.data = temp.next.data;
                temp.next.data = data;
                temp = temp.next;
            } else {
                temp = temp.next;

            }
        }
    }

}
