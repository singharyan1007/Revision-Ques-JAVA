package search;

public class maxWealth {
    public static void main(String[] args) {
        int[][] arr={
                {1,5},
                {7,5},
                {1,10}
        };
        int ans=maxmoney(arr);
        System.out.println(ans);
    }
    static int maxmoney(int[][] arr){
        int ans=Integer.MIN_VALUE;
        for(int row=0;row<arr.length;row++){
            int sum=0;
        for(int col=0;col<arr[row].length;col++){
            sum+=arr[row][col];
            if(sum>ans)
                ans=sum;
        }
        }
        return ans;
    }
}







