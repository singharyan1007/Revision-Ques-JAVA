package search;

public class squarerootofX {
    public static void main(String[] args) {
        int x=8;
        System.out.println(squareroot(x));

    }
    static int squareroot(int a){
        int start=1;
        int end=a;
        while(start<end){
            int mid=start+(end-start)/2;
            if(mid*mid<=a){
                return mid;
            }else if(mid*mid>a){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return -1;
    }
}
