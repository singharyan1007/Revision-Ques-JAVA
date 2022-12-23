package search;

public class mininrotatedarray {
    public static void main(String[] args) {
//        int[] arr1={0,1,2,3,4,5,6,7};
        int[] arr={4,5,6,7,0,1,2};
        int minvalue=pivotposition(arr);
        System.out.println(minvalue);

        //now we get the pivot
        //we find the smallest in first ascending then in second ascending

        }


    static int pivotposition(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;

            if(mid<end && arr[mid]>arr[mid+1])
                return arr[mid+1];
            else if(start<mid && arr[mid]<arr[mid-1]){
                return arr[mid];
            }
            if(arr[start]>arr[mid]){
                end=mid-1;
            }else{
                start=mid+1;
            }

        }
        return Integer.MAX_VALUE;
    }


}

