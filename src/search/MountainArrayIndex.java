package search;

import java.util.Arrays;

public class MountainArrayIndex {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,3,1};
        int target=3;

        int ans=search(arr,target);
        System.out.println(ans);
    }
    static int search(int[] arr,int target){
        int peak=peakvalue(arr);
        int start=searchoccurence(arr,target,0,peak);
        if(start !=-1){
            return start;
        }else{
            return searchoccurence(arr,target,peak+1,arr.length-1);
        }

    };
    static int peakvalue(int[] arr ){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(arr[mid]>arr[mid+1])
                end=mid;
            else start=mid+1;

        }
        return start;
    }
    static int searchoccurence(int[]arr,int target,int start,int end){
        boolean Ascen= arr[start]<arr[end];

        while(start<=end){
            int mid=start+ (end-start)/2;
            if(target==arr[mid])
                return mid;

            if(Ascen){
                if (target < arr[mid]) {
                    end = mid - 1;
                } else if (target > arr[mid]) {
                    start = mid + 1;
                }
            }else{
                if(target>arr[mid])
                    end=mid-1;
                else {
                    start=mid+1;

                }
            }
        }
        return -1;

    }

}
