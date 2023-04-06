public class Matrix {
    public void search(int[][]matrix,int n, int x){
        int i=0;
        int j=n-1;
        while(i<n && j>=0){
            if(matrix[i][j]==x){
                System.out.println("key found");
                return;
            }
            if(matrix[i][j]>x){
                j--;
            }
            else{
                i++;
            }
        }
        System.out.println("not found");
    }

}
