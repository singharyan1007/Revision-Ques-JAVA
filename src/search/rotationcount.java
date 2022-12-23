package search;

//We can solve for both duplicates and non-duplicates

public class rotationcount {
    //basically we find the pivot and return pivot+1;
    public static void main(String[] args) {
        int[] arr={4,5,6,7,0,1,2};
        int ans=pivotposition(arr);
        System.out.println(ans+1);
    }
    static int pivotposition(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;

            if(mid<end && arr[mid]>arr[mid+1])
                return mid;
            else if(start<mid && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            if(arr[start]>arr[mid]){
                end=mid-1;
            }else{
                start=mid+1;
            }

        }
        return -1;
    }


}
