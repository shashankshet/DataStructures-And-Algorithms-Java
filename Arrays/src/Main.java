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
}