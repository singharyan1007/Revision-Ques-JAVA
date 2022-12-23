package search;

public class duplicaterotatedarray {
    public static void main(String[] args) {
        int[] arr={2,2,2,9,2,2,2};
        int pivot=duplicatearraypivot(arr);
        System.out.println(pivot);
    }
    static int duplicatearraypivot(int[] arr){
        //STEP 1--- PERFORM NORMAL PIVOT SEARCH
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(mid<end && arr[mid]>arr[mid+1])
                return mid;
            if(start<mid && arr[mid]<arr[mid-1])
                return mid-1;

            if(arr[start]>arr[mid])
                end=mid-1;
            else
                start=mid+1;

            //CHECK FOR DUPLICATES
            //IF START==MID==END
            //DELETE OR IGNORE DUPLICATES
            //BUT CHECK FOR PIVOT i.e. IF THE START OR END ELEMENT IS A PIVOT

            if(arr[start] == arr[mid] && arr[start]==arr[end])

                //check for pivot in start position
                if(start<end && arr[start]<arr[start+1])
                    return start;
            start++;

            //check for pivot in end position
            if(end>start && arr[end]>arr[end-1])
                return end;

            end--;

            //////SPECIAL CASE=------MEMORISE
            //if left half is sorted then pivot is in right hand side
            if(arr[start]<arr[mid] || arr[start]==arr[mid] && arr[mid]>arr[end])
                start=mid+1;
            else{
                end=mid-1;
            }

        }
        return -1;

    }
}
