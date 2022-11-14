package arrays;

import java.util.Arrays;

public class CreateTargetArrayintheGivenOrder {
    public static  void main(String[] args) {
        int[] index={0,1,2,2,1};
        int[] nums={0,1,2,3,4};
        int[] target=new int[nums.length];
        for(int i=0;i<index.length;i++){
            int ind=index[i];
            if(ind<i){
                int j=i;
                while(j>ind){
                    target[j]=target[j-1];
                    target[j-1]=nums[i];
                    j--;
                }
            }
            else
                target[i]=nums[ind];
        }
        System.out.println(Arrays.toString(target));
    }

}
