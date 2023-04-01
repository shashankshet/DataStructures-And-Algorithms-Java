public class DoublyLinkedList{
    private ListNode head;
    private ListNode tail;
    int length;

    private class ListNode{
        private int data;
        private ListNode next;
        private ListNode previous;

        private ListNode(int data){
            this.data = data;
        }
    }
    public DoublyLinkedList(){
        this.head = null;
        this.tail = null;
        this.length = 0;
    }
    public boolean isEmpty(){
        return length==0;
    }
    public int length(){
        return length;
    }

    public void displayForward(){
        if(head==null){
            return;
        }
        ListNode temp = head;
        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
        System.out.print("null \n");
    }

    public void displayBackward(){
        if(tail==null){
            return;
        }
        ListNode temp = tail;
        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp=temp.previous;
        }
        System.out.print("null \n");
    }

    public void insertFirst(int value){
        ListNode newNode = new ListNode(value);
        if(isEmpty()){
            tail=newNode;
        }
        else{
            newNode.next = head;
            head = newNode;
            length++;
        }
    }

    public void insertLast(int value){
        ListNode newNode = new ListNode(value);
        if(isEmpty()){
            head=newNode;
        }
        else{
            tail.next = newNode;
            newNode.previous = tail;
        }
        tail = newNode;
        length++;
    }

    public ListNode deleteFirst(){

        ListNode temp = head;
        if(head==tail){
            tail=null;
        }
        else{
            head.next.previous=null;
        }
        head=head.next;
        temp.next=null;
        length--;
        return temp;
    }

    public ListNode deleteLast(){
        ListNode temp = tail;
        if(head==tail){
            head=null;
        }
        else{
            tail.previous.next=null;
        }
        tail=tail.previous;
        temp.previous = null;
        length--;
        return temp;
    }


    public static void main(String args[]){
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.insertFirst(1);
        dll.insertFirst(10);
        dll.displayForward();
        dll.insertLast(20);
        dll.insertLast(40);
        dll.insertLast(60);
        dll.displayForward();
        dll.displayBackward();
        dll.deleteFirst();
        dll.deleteLast();
        dll.displayForward();

    }
}