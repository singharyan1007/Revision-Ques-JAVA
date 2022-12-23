package search;

public class singleelementinsortedarray {
    public static void main(String[] args) {
        int[] arr={3,3,7,7,10,11,11};
        int ans=find(arr);
        System.out.println(ans);
    }
    static int find(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(start==end){
                return arr[mid];
            }
            if(arr[start]==arr[start+1])
                start=start+2;
            else{
                return arr[start];
            }
            if(arr[end]==arr[end-1])
                end=end-2;
            else
                return arr[end];
        }
        return -1;
    }
}
