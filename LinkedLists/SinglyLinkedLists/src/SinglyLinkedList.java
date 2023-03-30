public class SinglyLinkedList {
    private static ListNode head;

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
    //todo: to find the nth node from the last in a linkedlist
    public static void lastFronNth (SinglyLinkedList sll,int n){
        if(sll.head==null || n<0){
            return;
        }
        ListNode mainPtr = sll.head;
        ListNode refPtr = sll.head;
        int count = 0;
        while (count<n){
            refPtr = refPtr.next;
            count++;
        }
        while (refPtr!=null){
            refPtr = refPtr.next;
            mainPtr = mainPtr.next;
        }

        System.out.println("lastFronNth: "+mainPtr.data);
    }

    //todo: remove duplicates from sorted singly linked list
    public static void removeDuplicates(SinglyLinkedList sll){
        if(sll.head ==null){
            return;
        }
        ListNode current = sll.head;
        while (current!=null && current.next!=null){
            if(current.data==current.next.data){
                current.next = current.next.next;
            }
            else {
                current=current.next;
            }
        }
    }

    //todo: insert node in sorted singly linked list

    public static void insertToSortedlist(SinglyLinkedList sll, int val){
        ListNode newNode = new ListNode(val);
        if(sll.head==null){
            sll.head=newNode;
        }
        ListNode current = sll.head;
        ListNode temp = null;

        while (current!=null && current.data<newNode.data){
            current=current.next;
            temp = current;
        }
        newNode.next = current;
        temp.next = newNode;

    }

    //todo: remove a given key from singlylinkedlist
    public static void deleteNodeKey(SinglyLinkedList sll,int key){
        ListNode currnt = sll.head;
        ListNode temp = null;

        if(sll.head==null){
            return;
        }
        if(currnt!=null && currnt.data ==key){
            currnt=currnt.next;
            return;
        }
        while (currnt!=null && currnt.data!=key){
            temp =currnt;
            currnt=currnt.next;
        }
        if(currnt==null){
            return;
        }
        temp.next=currnt.next;
    }

    //todo: to detect loop in a singlylinkedlist
    public static boolean containsLoop(SinglyLinkedList sll){
        ListNode fastPtr = sll.head;
        ListNode slowPtr = sll.head;

        while (fastPtr!=null &&  fastPtr.next!=null){
            fastPtr=fastPtr.next.next;
            slowPtr = slowPtr.next;

            if(fastPtr==slowPtr){
                return true;
            }
        }

        return false;
    }

    //todo: to find the starting of loop in a singly linked list
    public ListNode startOfLoop(){
        ListNode fastPtr = head;
        ListNode slowPtr = head;

        while (fastPtr!=null && fastPtr.next!=null) {
            fastPtr = fastPtr.next.next;
            slowPtr = slowPtr.next;
            if(fastPtr==slowPtr){
                return getStartingNode(slowPtr);
            }
        }
        return null;
    }

    //todo: to remove loop from a singly linked list
    public static void removeLoop(ListNode head){
        ListNode fastPtr = head;
        ListNode slowPtr = head;
        while (fastPtr!=null && fastPtr.next!=null){
            fastPtr=fastPtr.next.next;
            slowPtr = slowPtr.next;
            if(fastPtr==slowPtr){
                breakLoop(slowPtr);
            }
        }
    }
    public static void breakLoop(ListNode slowPtr){
        ListNode temp = head;
        while (temp.next!=slowPtr.next){
            temp=temp.next;
            slowPtr=slowPtr.next;
        }
        slowPtr.next = null;
    }
    public ListNode getStartingNode(ListNode slowPtr){
        ListNode temp = head;
        while (temp!=slowPtr){
            temp = temp.next;
            slowPtr = slowPtr.next;
        }
        return temp;
    }

    //todo: merge 2 sorted linked list

    public static ListNode merge(ListNode a, ListNode b){
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        while (a!=null && b!=null){
            if(a.data<= b.data){
                tail.next=a;
                a=a.next;

            }
            else {
                tail.next=b;
                b=b.next;
            }
            tail=tail.next;
        }
        if(a==null){
            tail.next=b;
        }
        if(b==null){
            tail.next=a;
        }
        return dummy.next;
    }

    //todo: add two linked list
    public ListNode addList(ListNode a, ListNode b){
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        int carry = 0;
        while(a!=null || b!=null){
            int x = (a!=null) ? a.data:0;
            int y = (b!=null) ? b.data:0;
            int sum = carry + x + y;
            carry = sum/10;
            tail.next = new ListNode(sum%10);
            tail=tail.next;
            if(a!=null)a=a.next;
            if(b!=null)b=b.next;

        }
        if(carry>0){
            tail.next = new ListNode(carry);
        }
        return dummy.next;
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
     //get the last nth node
     lastFronNth(singlyLinkedList, 2);
     //removes duplicated from sorted singly linked list
     removeDuplicates(singlyLinkedList);
     printList(singlyLinkedList.head);
     //creating a sorted singly linked list
     SinglyLinkedList sll = new SinglyLinkedList();
     insertAtStart(sll,10);
     insertAtEnd(sll,20);
     insertAtEnd(sll,30);
     insertAtEnd(sll,40);
     insertAtEnd(sll,50);
     printList(sll.head);
     //to insert node in a sorted singlylinked list
     insertToSortedlist(sll,35);
     //to delete node in a singlylinked list given key
     deleteNodeKey(sll,35);
     //loop check in singlylinkedlist
     containsLoop(sll);
     //to remove loop
     removeLoop(sll.head);


    }
}