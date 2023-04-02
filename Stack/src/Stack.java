import java.util.*;
public class Stack {
    public static String reverse(String str){
        java.util.Stack<Character> stack = new java.util.Stack<>();
        char[] chars = str.toCharArray();
        for(char c: chars){
            stack.push(c);
        }

        for(int i=0;i<str.length();i++){
            chars[i]=stack.pop();
        }
        return new String(chars);
    }

    public static int[] nextGreatest(int[] arr){
        int[] res = new int[arr.length];
        java.util.Stack<Integer> stack = new java.util.Stack<Integer>();
        for(int i=arr.length-1;i>=0;i--){
            if(!stack.isEmpty()){
                while (!stack.isEmpty() && stack.peek()<=arr[i]){
                    stack.pop();
                }
            }
            if (stack.isEmpty()){
                res[i] = -1;
            }
            else {
                res[i]=stack.peek();
            }
            stack.push(arr[i]);
        }
        return res;
    }
    public static Boolean validParenthisis(String s){
        java.util.Stack<Character> stack = new java.util.Stack<>();
        for(char c: s.toCharArray()){
            if(c == '(' ||  c == '{'  || c== '['){
                stack.push(c);
            }
            else {
                if(stack.isEmpty()){
                    return false;
                }
                else {
                    char top = stack.peek();
                    if(c == ')' && top== '(' ||  c=='}'&& top == '{' || c==']'&& top=='['){
                        stack.pop();
                    }
                    else {
                        return false;
                    }
                }

            }


        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String rev =  reverse("shashank");
        System.out.println(rev);
        int newArray[] =  {4,7,3,4,8,1};
        int[] res = nextGreatest(newArray);
        for (int i =0;i<res.length;i++){
            System.out.print(res[i]+ " ");
        }
        if(validParenthisis("[{()}]")){
            System.out.println("valid");
        }
        else {
            System.out.println("not valid");
        }
    }
}