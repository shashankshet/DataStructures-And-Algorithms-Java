public class CircularSinglyLinkedList{
    private ListNode last;
    private int length;

    private class ListNode{
        private ListNode next;
        private int data;

        public ListNode(int data){
            this.data=data;
        }
    }
    public CircularSinglyLinkedList(){
        last = null;
        length=0;
    }
    private int length(){
        return length;
    }
    public boolean isEmpty(){
        return length==0;
    }

    public void createCircularLinkedList(){
        ListNode one = new ListNode(10);
        ListNode two = new ListNode(20);
        ListNode three = new ListNode(30);
        one.next = two;
        two.next = three;
        three.next = one;
        last = three;
    }

    public void display(){
        if(last==null){
            return;
        }
        ListNode first = last.next;
        while(first!=last){
            System.out.print(first.data+"-->");
            first = first.next;
        }
        System.out.print(first.data);
    }

    public void insertFirst(int val){
        ListNode temp = new ListNode(val);
        if(last==null){
            last = temp;
        }
        else{
            temp.next = last.next;
        }
        last.next=temp;
        length++;
    }

    public void insertLast(int val){
        ListNode temp = new ListNode(val);
        if(last==null){
            last=temp;
            last.next=temp;
        }
        else{
            temp.next = last.next;
            last.next = temp;
            last=temp;
        }
        length++;
    }

    public ListNode deleteFirst(){
        ListNode temp = last.next;
        if(last.next==last){
            last=null;
        }
        else{
            last.next = temp.next;

        }
        temp.next = null;
        length--;
        return temp;
    }

    public static void main(String[] args) {
        CircularSinglyLinkedList csll = new CircularSinglyLinkedList();
        csll.createCircularLinkedList();
        csll.insertFirst(50);
        csll.insertLast(60);
        csll.deleteFirst();
        csll.display();
        // cslll.display();
    }
}