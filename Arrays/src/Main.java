public class Main {
    public static void main(String[] args) {
        // TODO: 3/21/2023  printing array elements
        int res[] = {1,2,3,4,5,6,7,8,9};
        for(int i=0;i< res.length;i++){
            System.out.print(res[i]+" ");
        }
        System.out.println();

        int result[] = removeEven(res);
        for(int i=0;i< result.length;i++){
            System.out.print(res[i]+" ");
        }
    }
    //todo:  fucntion to remove even elements from array
    public static int[] removeEven(int arr[]){
        int oddCount=0;
        for(int i=0;i< arr.length;i++){
            if(arr[i]%2!=0){
                oddCount++;
            }
        }
        int idx = 0;
        int res[] = new int[oddCount];

        for(int i=0;i< res.length;i++){
            if(arr[i]%2!=0){
                res[idx]=arr[i];
                idx++;
            }
        }
        return res;
    }
}