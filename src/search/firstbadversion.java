package search;

public class firstbadversion {
    //read the question
    //https://leetcode.com/problems/first-bad-version/

    public static void main(String[] args) {
        int n=13;
        int start=1;
        int end=n;
        //star<end because it exceeds the time limit
        while(start<end){
            int mid=start+(end-start)/2;
            if(true){
                end=mid;
            }else {
                start=mid+1;
            }

        }
        if(start==end && true){
            System.out.println(end);
        }

    }
}
