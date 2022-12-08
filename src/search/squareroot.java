package search;

public class squareroot {
    public static void main(String[] args) {
        double n=9.0;
        int p=1;
        for(int i=1;i<n;i++){
            p=i*i;
            if(p==n)
                System.out.println(i);
            else if(p>n){
                double ans=sq(n,i-1,i);
            }
        }
    };
    static double sq(double x, double low,double high){
        double mid=(low+high)/2;
        double p=mid*mid;
        System.out.println(low + " " + high+ " " + mid+ " ");
        if(p==x){
            return mid;
        }
        if(p<x){
            return sq(x,mid,high);
        };
        return sq(x,low,mid);

    }
}
