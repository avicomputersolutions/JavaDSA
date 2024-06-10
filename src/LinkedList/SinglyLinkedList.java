package LinkedList;



public class SinglyLinkedList {

    protected ListNode head;

   public static class ListNode{
        protected int data;
        protected ListNode next;

        public ListNode(int data){
            this.data=data;
            this.next=null;
        }
    }





    protected void printLinkedList(){
        ListNode cur=head;
        while(cur != null){
            System.out.print(cur.data+"->");
            cur=cur.next;
        }
        System.out.println("null");
    }
    protected int length(){
        int c=0;
        ListNode cur=head;
        while(cur != null){
            c++;
            cur=cur.next;
        }
        return c;
    }
    protected void insertFirst(int value){
        ListNode newNode=new ListNode(value);
        newNode.next=head;
        head=newNode;
    }
    protected void  insertLast(int value){
        ListNode newNode=new ListNode(value);
        if(head==null){
            head=newNode;
            return;
        }

        ListNode cur=head;
        while(cur.next != null){
            cur=cur.next;
        }
        cur.next=newNode;

    }
    protected void insertAtPositoin(int pos,int value){
        ListNode newNode=new ListNode(value);
        if(pos == 1){
            newNode.next=head;
            head=newNode;
        }else{
            ListNode previous=head;
            int count=1;
            while(count< pos-1){
                previous=previous.next;
                count++;
            }
            ListNode cur=previous.next;
            previous.next=newNode;
            newNode.next=cur;
        }
    }
    protected int deleteAtFirst(){
            ListNode cur=head;
            head=head.next;
            return cur.data;
    }
    protected ListNode deleteAtLast(){
        if(head==null ||head.next==null){

            return head;
        }

        ListNode cur=head;
        ListNode prev=null;
        while(cur.next != null){
            prev=cur;
            cur=cur.next;

        }
        prev.next=null;
        return cur;
    }
    protected ListNode deletAtPositoin(int pos){
       if(pos==1){
           ListNode cur=head;
           head=head.next;
           return cur;
       }else{
           ListNode prev=head;
           int c=1;
           while(c<pos-1){
               prev=prev.next;
               c++;
           }
           ListNode cur=prev.next;
           prev.next=cur.next;

           return cur;

       }
    }
}

 class Main{
    public static void main(String[] args) {
        SinglyLinkedList s=new SinglyLinkedList();

//        s.start=new SinglyLinkedList.ListNode(1);
//        second=new SinglyLinkedList.ListNode(2);
//        ListNode third=new ListNode(3);
//        ListNode fourth=new ListNode(4);
//        ListNode fifth=new ListNode(5);
//        ListNode sixth=new ListNode(6);
//
//        s.head.next =second;
//        second.next=third;
//        third.next=fourth;
//        fourth.next=fifth;
//        fifth.next=sixth;
//
//        s.insertAtPositoin(1,3);
//        s.insertAtPositoin(2,5);
//        s.insertAtPositoin(3,3);
//        s.insertAtPositoin(4,2);
//        s.insertAtPositoin(5,8);
//        s.insertAtPositoin(6,4);
//        s.printLinkedList();
//        System.out.println(s.deleteAtFirst());
//        s.printLinkedList();
//
//        System.out.println(s.deleteAtLast().data);
//        s.printLinkedList();
//
//        System.out.println(s.deletAtPositoin(2).data);
//        s.printLinkedList();
//        System.out.println(s.length());
    }
}