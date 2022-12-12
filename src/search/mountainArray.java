package search;

public class mountainArray {
    public static void main(String[] args) {
        //whatever is the array
    }
    static int peakIndexInMountainArray(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]>arr[mid+1]){
                //you are in decreasing part of array
                //so mid can be the answer
                //still can check at the left for bigger value
                end=mid;
            }else{
                //you are in ascending part of array
                start=mid+1;
                //because [mid+1]>[mid]
            }
        }
        return start;
    }
}
