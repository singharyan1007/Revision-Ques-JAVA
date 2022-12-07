package search;

import java.util.Arrays;

public class searchin2Darray {
    public static void main(String[] args) {
        int arr[][]={
                {2,3,5},
                {13,23,18},
                {9,8,19,20}
        };
        int target=-1;
        int[] ans=searchh(arr,target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] searchh(int[][] arr,int target){
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                if(arr[row][col]==target)
                    return new int[]{row,col};
            }

        }
        return new int[]{-1,-1};
    }
}
