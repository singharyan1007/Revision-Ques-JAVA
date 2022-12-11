package binarysearch;

import java.util.Arrays;

//it is same as ceiling problem. Here the letters wrap.
//Means if the condition is not satisfied or the letter not found then we return the first letter of the array
//return last position % arr.length
public class firstandlastindex {
    public static void main(String[] args) {
         int[] arr={5,7,7,7,7,7,8,8,9};
         int target=7;
         int[] ans=search(arr,target);
        System.out.println(Arrays.toString(ans));
    }


    /////////Brute force solution//////////////////
//    static int[] search(int[] arr,int target){
//        int start=0;
//        int end=0;
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]==target){
//                start=i;
//            }
//        }
//        for(int i=arr.length-1;i>0;i--){
//            if(arr[i]==target)
//                end=i;
//        }
//        return new int[] {end,start};
//    }


    //////////////////////Binary search solution//////////////////
 //   We check for fist occurence and for last occurence
    static int[] search(int[]arr,int target){
        int[] ans={-1,-1};
        int start=searchoccurence(arr,target,true);
        int end=searchoccurence(arr,target,false);
        ans[0]=start;
        ans[1]=end;
        return ans;

    }
    static int searchoccurence(int[]arr,int target,boolean searchfirstindex){
        int ans=-1;
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;

            if(target<arr[mid]){
                end=mid-1;
            }else if(target > arr[mid])
                start=mid+1;
            else{
                ans=mid;
                if(searchfirstindex){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }
        }
        return ans;
    }


}
