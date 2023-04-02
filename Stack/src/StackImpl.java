//stacks can be represented using arrays or linkedlists
//LIFO (last in first out)
//operations: PUSH, POP
//1. Push: push a new element to the top of the list
//2. POP: remove the element at the top of the list

public class StackImpl {
    private ListNode top;
    private int length;

    private class ListNode{
        private int data;
        private ListNode next;
        public ListNode(int data){
            this.data=data;
        }
    }
    public StackImpl(){
        top=null;
        length=0;
    }

    public int length(){
        return length;
    }
    public boolean isEmpty(){
        return length==0;
    }

    public void insert(int data){
        ListNode temp = new ListNode(data);
        temp.next = top;
        top = temp;
        length++;
    }
    public int delete(){
        if(isEmpty()){
            System.out.print("stack is empty");

        }
        int result = top.data;
        top=top.next;
        length--;
        return result;
    }
    public int peak(){
        if(isEmpty()){
            System.out.print("stack is empty");
        }
        return top.data;
    }
    public void display(){
        if(isEmpty()){
            System.out.print("stack is empty");

        }
        ListNode temp = top;
        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
        System.out.print("-->");
    }
}