import java.util.List;

public class SinglyLinkedList {
    private ListNode head;

    private static class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }
    //todo function to print the elements in linkedList
    public static void printList(ListNode head){
        ListNode current = head;
        while (current!=null){
            System.out.print(current.data+" -->");
            current=current.next;
        }
        System.out.print("null");
        System.out.println();
    }
    //todo: function to print the length of the linkedlist
    public static void printLength(ListNode head){
        ListNode current = head;
        int count = 0;
        while (current!=null){
            count=count+1;
            current=current.next;
        }
        System.out.println("\nThe length of the linkedList is: "+count);
    }
    //todo: function to insert at the start of the linkedList (add as head)
    public static void insertAtStart(SinglyLinkedList sll, int val){
        ListNode node = new ListNode(val);
        node.next = sll.head;
        sll.head = node;
    }

    //todo: fucntion to insert node at the end of the linkedList
    public static void insertAtEnd(SinglyLinkedList sll, int val){
        ListNode node = new ListNode(val);

        if(sll.head==null){
            sll.head = node;
        }
        ListNode current = sll.head;
        while(current.next!=null){
            current=current.next;
        }
        current.next=node;
    }

    //todo: function to insert node at given position
    public static void insertAtPos(SinglyLinkedList sll, int val, int pos){
        ListNode newNode = new ListNode(val);

        if(pos==1){
            newNode.next=sll.head;
            sll.head = newNode;
        }
        else{
            ListNode prev = sll.head;
            int count = 1;
            while (count<pos-1){
                prev = prev.next;
                count++;
            }
            ListNode current = prev.next;
            newNode.next = current;
            prev.next = newNode;
        }
    }

    //todo: delete the first element in the singlylinkedlist
    public static void deleteFirst(SinglyLinkedList sll){
        if(sll.head == null){
            System.out.println("empty list, nothing to delete");
        }
        ListNode temp = sll.head;
        sll.head = sll.head.next;
        temp.next = null;
        System.out.println("the linkedlist after deleting the first node");
        ListNode current = sll.head;
        while (current!=null){
            System.out.print(current.data+" -->");
            current=current.next;
        }
        System.out.print("null");
        System.out.println();

    }
    //todo: to delete the last node of linkedList
    public static void deleteLast(SinglyLinkedList sll){
        if(sll.head == null || sll.head.next==null){
            sll.head=null;
        }
        ListNode current = sll.head;
        ListNode previous = null;
        while(current.next!=null){
            previous=current;
            current=current.next;
        }
        previous.next=null;

    }

    //todo: delete a node in a given valid position
    public static void deletenthNode(SinglyLinkedList sll,int pos){
        if(pos==1){
            sll.head = sll.head.next;
        }
        else {
            ListNode previous = sll.head;
            int count = 1;
            while (count<pos-1){
                previous=previous.next;
                count++;
            }
            ListNode current = previous.next;
            previous.next = current.next;
        }
    }

    //todo: function to search a key in linkedlist
    public static boolean search(SinglyLinkedList sll,int key){
        ListNode current = sll.head;
        while (current!=null){
            if(current.data==key){
                System.out.println("key found");
                return true;
            }
            current=current.next;
        }
        System.out.println("key not found");
        return false;
    }

    //todo: reverse a singly linkedlist
    public static ListNode reverse(ListNode head){
        if(head==null)
            return head;
        ListNode prev = null;
        ListNode current = head;
        ListNode next = null;
        while (current!=null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
       return prev;
    }

    //todo: return the middle element of a linkedlist
    public static ListNode middleNode(ListNode head){
        if(head==null){
            return null;
        }
        ListNode slowptr= head;
        ListNode fastptr = head;
        while (fastptr!=null && fastptr.next!=null){
            slowptr=slowptr.next;
            fastptr=fastptr.next.next;
        }
        System.out.println(slowptr.data);
        return slowptr;
    }

    public static void main(String[] args) {
     SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
     singlyLinkedList.head = new ListNode(10);
     ListNode second = new ListNode(20);
     ListNode third = new ListNode(30);
     singlyLinkedList.head.next = second;
     second.next = third;
     //print the linkedList
     printList(singlyLinkedList.head);
     //print the length of the linkedList
     printLength(singlyLinkedList.head);
     //to insert node at the beginning of linkedlist
     insertAtStart(singlyLinkedList,40);
     printList(singlyLinkedList.head);
     //to insert node at the end of linkedlist
     insertAtEnd(singlyLinkedList,50);
     printList(singlyLinkedList.head);
     //to insert node at any given valid position of linkedlist
     insertAtPos(singlyLinkedList,60,2);
     printList(singlyLinkedList.head);
     //to delete the first element
     deleteFirst(singlyLinkedList);
     //delete the last element of linkedlist
     // deleteLast(singlyLinkedList);
     //deletes the node at a given valid position
     deletenthNode(singlyLinkedList,2);
     printList(singlyLinkedList.head);
     //to seach a key in linkedlist
     search(singlyLinkedList,30);
     // reverse(singlyLinkedList.head);
     printList(singlyLinkedList.head);
     middleNode(singlyLinkedList.head);
    }
}