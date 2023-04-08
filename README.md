# DataStructures-And-Algorithms-Java
Java Implementation of data structures and algorithms
## Arrays
1. Print array elements
```java
int res[] = {1,2,3,4,5,6,7,8,9};
for(int i=0;i< res.length;i++){
    System.out.print(res[i]+" ");
  }
 ```
2. Remove even integers from array
```java
public static void removeEven(int arr[]){
        int oddCount=0;
        for(int i=0;i< arr.length;i++){
            if(arr[i]%2!=0){
                oddCount++;
            }
        }
        int idx = 0;
        int res[] = new int[oddCount];

        for(int i=0;i< arr.length;i++){
            if(arr[i]%2!=0){
                res[idx]=arr[i];
                idx++;
            }
        }
        for(int i=0;i< res.length;i++){
            System.out.print(res[i]+" ");
        }

    }
```
3. Reverse an array in java
```java
public static void reverseArray(int arr[], int start, int end){
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] =temp;
            start++;
            end--;
        }
        System.out.println("\n==================");
        System.out.println("after reversing");
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
```
4. To find the minimum value element in an array
```java
 public static void findMin(int arr[]){
        int min = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("\nthe min value in the array is: "+min);
    }
```
5. To find the second max element in an array
```java
public static void secondMax(int arr[]){
        int max = Integer.MIN_VALUE;
        int second_max = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                second_max = max;
                max=arr[i];
            } else if (arr[i]>second_max && arr[i]!=max ) {
                second_max = arr[i];
            }
        }
        System.out.println("\nSecond max element is: "+second_max);
    }
```
6. Move zeros to the end
```java
public static void moveZeros(int arr[]){
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0 && arr[j]==0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            } else if (arr[j]!=0) {
                j++;

            }
        }
        System.out.println("\nAfter moving all the zeros to the end");
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
```
7. Resizing an array
```java
    public static void resizeArray(int arr[], int newSize){
        int temp[] = new int[newSize];
        for(int i =0;i<arr.length;i++){
            temp[i] =arr[i];
        }
        arr = temp;
        System.out.println("\nthe new size of the array is: "+arr.length);
    }
  ```
8. Finding the missing number
```java
 public static void findMissing(int arr[]){
        int n = arr.length+1;
        int sum =( n*(n+1))/2;
        int sum_of_n = 0;
        for(int i=0;i< arr.length;i++){
            sum_of_n = sum_of_n+arr[i];
        }
        int missing_no = sum-sum_of_n;
        System.out.println("\nthe missing number is: "+missing_no);
    }
 ```
9. To check if string is pallindrome or not
 ```java
  public static void isPallindrom(String str) {
        char arr[] = str.toCharArray();
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            if (arr[start] != arr[end]) {
                System.out.println("Not pallindome");
            }
            start++;
            end--;
        }
        System.out.println(str + " is a pallindromw!");
    }
 ```

## LinkedLists
1. SinglyLinkedList
    1. Java Implementation of SinglyLinkedList
    ```java
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
    }
    ```
    3. To print linkedlist
    ```java
    public static void printList(ListNode head){
        ListNode current = head;
        while (current!=null){
            System.out.print(current.data+" -->");
            current=current.next;
        }
        System.out.print("null");
        System.out.println();
    }
    ```
    5. To print length of linkedlist
    ```java
    public static void printLength(ListNode head){
        ListNode current = head;
        int count = 0;
        while (current!=null){
            count=count+1;
            current=current.next;
        }
        System.out.println("\nThe length of the linkedList is: "+count);
    }
    ```
    6. Insert node at the beginning of linkedlist
    ```java
        public static void insertAtStart(SinglyLinkedList sll, int val){
        ListNode node = new ListNode(val);
        node.next = sll.head;
        sll.head = node;
    }
    ```
    7. Insert node at the end of linkedlist
    ```java
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
    ```
    8. Insert node at a given valid position in linkedlist
    ```java
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
    ```
    9. Delete the first node in a linkedlist
    ```java
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
    ```
    10. Delete the last node in a linkedList
    ```java
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
    ```
    11. Delete the nth node from the linkedlist
    ```java
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
    ```
    12. Search element in a singlylinkedlist
    ```java
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
    ```
    13. Reverse a singlylinkedlist
    ```java
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
    ```
    14. Find the middle node of a singlylinkedlist
    ```java
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
    ```
    15. Find the nth node from the end of singlylinkedlist
    ```java
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
    ```
    16. Remove duplicated from singlylinkedlist
    ```java
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
    ```
    17. Insert node in a sorted singlylinkedlist
    ```java
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
    ```
    18. Remove given key from a singlyLinkelist
    ```java
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
    ```
    19. Detect loop in a singlylinkedlist
    ```java
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
    ```
    20. Find the start of loop in a singlylinkedlist
    ```java
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
    ```
    21. Remove loop in a singlylinkedlist
    ```java
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
    ```
    22. Merge two sorted linked list
    ```java
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
    ```
    23. Perform addition of two linkedlist
    ```java
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
    ```
2. DoublyLinkedList
    1. Java Implementation of DoublyLinkedList
    2. Print the doublyLinkedlist
    3. Insert node at the beginning of doublylinkedlist
    4. Insert node at the end of doublylinkedlist
    5. Delete node at the beginning of doublylinkedList
    6. Delete node at the end of doublylinkedList
2. CircularLinkedList
    1. Java Implementation of CircularLinkedList
    2. Print the CircularLinkedList
    3. Insert node at the beginning of CircularLinkedList
    4. Insert node at the end of CircularLinkedList
    5. Remove first node of circularsinglylinkedlist


## Stack
1. Java Implementation of Stack using linkedlist
2. Reverse a String using Stack
3. Next Greater Element
4. Valid Parenthisis problem

## Queue
1. Java Implementation of Queue using linkedlist
2. Insert element into a queue
3. Remove element from a queue
4. How to generate binary numbers from 1 to n using queue

## BinaryTree
1. Java Implementation of Binary Tree
2. Pre-order tree traversal (Recursive)
3. Pre-order tree traversal (Iterative)
4. In-order tree traversal (Recursive)
5. In-order tree traversal (Iterative)
6. Level order tree traversal
7. Find the max value in a Binary Tree

## BinarySearchTree
1. Java Implementation of Binary Search Tree
2. Insert value in BST
3. search for a key in BST
