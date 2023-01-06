package sorting;

import java.util.Arrays;

public class missingnumber {
    //to be performed using cyclic sort
    public static void main(String[] args) {
        int[] arr={4,1,0,2};
        cyclic(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void cyclic(int[] arr){
        //index=value;
        int i=0;
        while(i<arr.length){
            int correct=arr[i];
            if(arr[i]<arr.length && arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }else
                i++;
        }
        for(int j=0;j<arr.length;j++){
            if(arr[j]!=j){
                System.out.println(j);

            }else
                System.out.println(arr.length);
        }
    }
    static void swap(int[] arr, int start, int last){
        int temp=arr[start];
        arr[start]=arr[last];
        arr[last]=temp;
    }
}
