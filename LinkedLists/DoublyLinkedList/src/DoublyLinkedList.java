public class DoublyLinkedList {
    private static ListNode head;
    private ListNode tail;
    private int length;

    private static class ListNode{
        private int data;
        private ListNode next;
        private ListNode previous;
        private ListNode(int data){
            this.data=data;
        }
    }
    public DoublyLinkedList(){
        this.head=null;
        this.tail=null;
        this.length=0;
    }
    public boolean isEmpty(){
        return length==0;
    }
    public int length(){
        return length;
    }
    public void displayForward(ListNode head){
        if(head==null){
            return;
        }
        ListNode temp = head;
        while (temp!=null){
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
        System.out.print("null");
    }

    public void displayBackward(ListNode tail){
        if(tail==null){
            return;
        }
        ListNode temp = tail;
        while (temp!=null){
            System.out.print(temp.data+"-->");
            temp=temp.previous;
        }
        System.out.print("null");
    }


    public static void main(String[] args) {
       DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        doublyLinkedList.head = new ListNode(10);
        ListNode second = new ListNode(20);
        ListNode third = new ListNode(30);
        ListNode fourth = new ListNode(40);
        doublyLinkedList.head.next=second;
        second.next=third;
        third.next=fourth;
        doublyLinkedList.displayForward(doublyLinkedList.head);
        doublyLinkedList.displayBackward(doublyLinkedList.tail);

    }
}