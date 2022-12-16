package search;

public class rotatedbinaryArray {
    public static void main(String[] args) {
        int[] arr={4,5,6,7,0,1,2};
        int target=0;
        // finding the pivot
        int ans=pivot(arr);
        System.out.println(ans);
        if(ans==-1)
            //if no pivot perform normal binary search
            System.out.println(search(arr,target,0,arr.length-1));
        //if pivot is found then we have two ascending arrays
        if(arr[ans]==target)
            System.out.println(ans);

        if(target>=arr[0])
            System.out.println(search(arr,target,0,arr[ans]));

        System.out.println(search(arr,target,ans+1,arr.length-1));
    }
    static int pivot(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(mid<end && arr[mid]>arr[mid+1]){
                //to reject cases of out of range
                return mid;
            };
            if(mid>start && arr[mid]<arr[mid-1]){
                return mid-1;
            };
            //third case will be when starting element will be greater than mid element
            if(arr[start]>arr[mid]){
                end=mid-1;
            }
            //case 4= starting element will be less than mid element
            //therefore start=mid+1;
            if(arr[start]<arr[mid]){
                start=mid+1;
            }
        }
        return -1;

    }

    static int search(int[] arr,int target,int start,int end){
        //binary search from 0-pivot
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target==arr[mid])
                return mid;
            else if(target<arr[mid])
                end=mid-1;
            else if(target>arr[mid])
                start=mid+1;
        }
        return -1;


    }
}
