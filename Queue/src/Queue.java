//queue FIFO data structure: first in first out
// insertion at rear end
// deletion at front end

import java.util.LinkedList;

public class Queue {
    private ListNode front;
    private ListNode rear;
    private int length;

    public class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data=data;
            this.next=null;
        }
    }
    public int length(){
        return length;
    }
    public boolean isEmplty(){
        return length==0;
    }
    public void enqueue(int data){
        ListNode temp = new ListNode(data);
        if(isEmplty()){
            front=temp;
        }
        else {
            rear.next=temp;
        }
        rear=temp;
        length++;
    }

    public int dequeue(){
        if(isEmplty()){
            System.out.println("queue is empty");
        }
        int res = front.data;
        front=front.next;
        if(front==null){
            rear=null;
        }
        length--;
        return res;
    }

    public void display(){
        if(isEmplty()){
            System.out.println("empty queue");
        }
        ListNode temp = rear;
        while (temp!=null){
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
        System.out.print("null");
    }

    public String[] generataBinaryNumber(int n){
        String[] res = new String[n];
        java.util.Queue<String> queue = new LinkedList<>();
        queue.offer("1");
        for (int i=0;i<n;i++){
            res[i] = queue.poll();
            String n1 = res[i]+"0";
            String n2 = res[i]+"1";
            queue.offer(n1);
            queue.offer(n2);
        }
        return res;
    }

    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueue(10);
        queue.enqueue(30);
        queue.enqueue(120);
        queue.dequeue();
        queue.display();
        String[] res = queue.generataBinaryNumber(5);
        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }
    }

}