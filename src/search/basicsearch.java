package search;

public class basicsearch {
    public static void main(String[] args) {
        int[] nums={1,18,7,56,35};
        int target=18;
        int ans=linearsearch(nums,target);
        System.out.println(ans);

    }

    static int linearsearch(int[] arr, int target ){
        if(arr.length==0)
            return -1;

        for(int i=0;i<arr.length;i++){
            int element=arr[i];
            if(element == target)
                return i;

        };
        return -1;

    };
}
