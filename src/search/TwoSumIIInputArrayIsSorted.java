package search;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TwoSumIIInputArrayIsSorted {
    public static void main(String[] args) {
        int[] arr={-1,0};
        int target=-1;
        int[] ans=search(arr, target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] search(int[] arr, int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            int result=arr[start]+arr[end];
            if(result==target)
                return new int[] {start+1,end+1};
            else if(result>target){
                end=mid;
            }
            else{
                start=mid+1;
            }
        }
        return new int[] {-1,-1};
    }
}
