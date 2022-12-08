package binarysearch;

public class orderAgnostic {
    //this is when we are only told that the array is sorted
    //We dont know that the array is ascending or descending
    //////////////IMPORTANT/////////////////////////////////

    public static void main(String[] args) {
        int[] arr = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89};
        int target = 22;
        int ans=agnostic(arr,target);
        System.out.println(ans);


    }
    static int agnostic(int[] arr, int target){
        int start=0;
        int end=arr.length-1;
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
