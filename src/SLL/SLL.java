package SLL;

import LinkedList.SinglyLinkedList;

public class SLL {

    Node start;

    void printSLL(){
        Node current=start;
        while(current != null){
            System.out.print(current.data+"->");
            current=current.next;
        }
        System.out.println("null");
    }

    void insertAtFirst(int data){
        Node newnode=new Node(data);

        newnode.next=start;
        start=newnode;
    }

    void insertAtLast(int data){
        Node newnode=new Node(data);
        // if SLL is blank
        if(start==null){
            start=newnode;
            return;
        }
        // if SLL is not Blank
        Node current=start;
        while(current.next != null){
            current=current.next;
        }
        current.next=newnode;
    }

    void insertAtPos(int data,int pos){
        Node newnode=new Node(data);

        if(pos==1){
            newnode.next=start;
            start=newnode;
        }else{
            Node prev=start;
            int index=1;
            while(index < pos-1){
                prev=prev.next;
                index++;
            }
            Node cur=prev.next;
            prev.next=newnode;
            newnode.next=cur;
        }
    }

    protected int deleteAtFirst(){
        Node cur=start;
        start=start.next;
        return cur.data;
    }
    protected void deleteAtLast(){
        if(start==null ||start.next==null){

            return ;
        }

        Node cur=start;
        Node prev=null;
        while(cur.next != null){
            prev=cur;
            cur=cur.next;

        }
        prev.next=null;

    }
    protected void deletAtPositoin(int pos){
        if(pos==1){
            Node cur=start;
            start=start.next;
            return;
        }else{
          Node prev=start;
            int c=1;
            while(c<pos-1){
                prev=prev.next;
                c++;
            }
            Node cur=prev.next;
            prev.next=cur.next;



        }
    }

    int length(){
        if(start==null){
            return 0;
        }
        Node cur=start;
        int len=1;
        while(cur.next!=null){
            cur=cur.next;
            len++;
        }
        return len;
    }
    int search(int  data){
        Node cur=start;
        int pos=1;
        while(cur!=null){
            if( cur.data == data){
                return pos;
            }else{
                cur= cur.next;
                pos++;
            }
        }
        return -1;
    }

    int sum(){
        Node cur=start;
        int sum=0;
        while(cur != null){
            sum+= cur.data;
            cur=cur.next;
        }
        return sum;
    }
}
