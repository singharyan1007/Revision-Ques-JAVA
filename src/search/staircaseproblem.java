package search;

public class staircaseproblem {
    public static void main(String[] args) {
        int n=5;
        //Leet code solution explaination
        //if we consider k to be the answer then complete rows contain 1 + 2 + 3... + k= k*(k+1)/2 number of coins
        //k*(k+1)/2 <= N
        //always consider long for large range
        System.out.println(stair(n));

    }
    static int stair(int n){
        long start=0;
        long end=n;
        while(start<=end){
            long mid=start+(end-start)/2;
            long current=mid*(mid+1)/2;
            if(current==n){
                return (int)mid;
            }if(n<current)
                end=mid-1;
            else{
                start=mid+1;
            }
        }
        return (int)end;
    }
}
