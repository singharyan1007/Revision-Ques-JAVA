package binarysearch;

public class ceilingofanumber {
    public static void main(String[] args) {
        int[] arr={2,3,4,6,11,14,16,18};
        int target=15;
        int ans=search(arr,target);
        System.out.println(ans);
    }
    static int search(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target==arr[mid]){
                return arr[mid];
            }
           else if(target<arr[mid]){
                end=mid-1;
            }
            else if(target>arr[mid]) {
                start = mid + 1;
            }
        }
        return arr[start];
    }
}
