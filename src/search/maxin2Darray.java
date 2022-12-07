package search;

public class maxin2Darray {
    public static void main(String[] args) {
        int arr[][]={
                {2,3,5},
                {13,23,18},
                {9,8,19,20}
        };
        int ans=maxvalue(arr);
        System.out.println(ans);
    }
    static int maxvalue(int[][] arr){
        int max=Integer.MIN_VALUE;
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                if(arr[row][col]>max);
                max=arr[row][col];
            }
        }
        return max;
    }
}
