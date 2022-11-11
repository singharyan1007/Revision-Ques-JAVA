package arrays;

public class RemoveDuplicateFromArray {
    public static void main(String[] args) {
        int[] arr={1,1,3,4,4};
        System.out.println(remove(arr));
    }
    static int remove(int[] nums){
        int pos=1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]!=nums[i+1]){
                nums[pos]=nums[i+1];
                pos++;
            };
        }
        return pos;
    }

}
