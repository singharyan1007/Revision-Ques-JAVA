package search;

public class minNumber {
    public static void main(String[] args) {
        int[] arr={1,-18,7,56,35};
        System.out.println(min(arr));
    }
    static int min(int[] array){
        int ans=array[0];
        for(int i=0;i<array.length;i++){
            if(array[i] < ans){
                ans=array[i];
            }
        }
        return  ans;
    }
}
