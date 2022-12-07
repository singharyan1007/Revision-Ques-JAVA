package search;

public class evendigitNos {
    public static void main(String[] args) {
        int[] arr={11,134,5889,0,1};
        System.out.println(evendigits(arr));
    }
    static int evendigits(int[] arr){
        int count=0;
       for (int num:arr){
           if(even(num))
               count++;

       }
        return count;
    }
    static boolean even(int num){
        int numberOfDigits = digits2(num);
//        if (numberOfDigits % 2 == 0) {
//            return true;
//        }
//        return false;

        return numberOfDigits % 2 == 0;
    }
    //optimised code for calculating number of digits
    static int digits2(int num){
        if(num<0)
            num=num * -1;

        return (int)(Math.log10(num))+1;
    }

    static int digits(int num) {

        if (num < 0) {
            num = num * -1;
        }

        if (num == 0) {
            return 1;
        }

        int count = 0;
        while (num > 0) {
            count++;
            num = num / 10; // num /= 10
        }

        return count;
    }

}
