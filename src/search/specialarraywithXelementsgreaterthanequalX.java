package search;

public class specialarraywithXelementsgreaterthanequalX {
    public static void main(String[] args) {
        int[] arr={0,4,3,0,4};
        int ans=search(arr);
        System.out.println(ans);
    }
    static int search(int[] arr){
        int start = 0;
        int count = 0;
        int end = findMax(arr);
        int mid = 0;
        while(start <= end){
            mid = start + (end - start)/2;
            count = findCount(arr, mid);
            if(mid == count){
                return mid;
            }
            else if(mid < count){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }

        }
        return -1;
    }
    static int findMax(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            max = Math.max(max,arr[i]);
        }
        return max;
    }
    static int findCount(int[] arr, int mid){
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] >= mid){
                count++;
            }
        }
        return count;
    }
}
