public class Main {
    public static void main(String[] args) {
        // TODO: 3/21/2023  printing array elements
        int res[] = {1,2,3,4,5,6,7,8,9};
        for(int i=0;i< res.length;i++){
            System.out.print(res[i]+" ");
        }
        System.out.println();
        //to remove even elements in array
        removeEven(res);
        //to reverse an array
        reverseArray(res,0,res.length-1);
        //to find min element in an array
        findMin(res);
        //to find the second max element from an array
        secondMax(res);
        //to moves zeros to the end of the array
        moveZeros(new int[]{1, 2, 0, 4, 5, 0, 0, 0});
        //to resize am array
        resizeArray(res,20);
        //to find the missing number in the array
        findMissing(new int[]{1,3,4,5,6,7,8});
        //to check is str is pallindrom or not
        isPallindrom("madam");
    }
    //todo:  fucntion to remove even elements from array
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
    //todo: function to reverse am array
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

    //todo: to find the minimunm element in the array
    public static void findMin(int arr[]){
        int min = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("\nthe min value in the array is: "+min);
    }

    //todo: To find the second max element from an array
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

    //todo: move zeros to the end of the array
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

    //todo: function to resize array
    public static void resizeArray(int arr[], int newSize){
        int temp[] = new int[newSize];
        for(int i =0;i<arr.length;i++){
            temp[i] =arr[i];
        }
        arr = temp;
        System.out.println("\nthe new size of the array is: "+arr.length);
    }

    //todo: function to find the missing element
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

    //todo: to check if a string is pallindrome or not
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

}
