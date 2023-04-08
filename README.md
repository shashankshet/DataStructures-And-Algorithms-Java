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
10. To check if string is pallindrome or not
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
    2. To print linkedlist
    3. To print length of linkedlist
    4. Insert node at the beginning of linkedlist
    5. Insert node at the end of linkedlist
    6. Insert node at a given valid position in linkedlist
    7. Delete the first node in a linkedlist
    8. Delete the last node in a linkedList
    9. Search element in a singlylinkedlist
    10. Reverse a singlylinkedlist
    11. Find the middle node of a singlylinkedlist
    12. Find the nth node from the end of singlylinkedlist
    13. Remove duplicated from singlylinkedlist
    14. Insert node in a sorted singlylinkedlist
    15. Remove given key from a singlyLinkelist
    16. Detect loop in a singlylinkedlist
    17. Find the start of loop in a singlylinkedlist
    18. Remove loop in a singlylinkedlist
    19. Merge two sorted linked list
    20. Perform addition of two linkedlist
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
