package TotalJava.Recursion.Practise;

import java.util.SplittableRandom;

public class YearConversion {
    public static void main(String[] args){
        String[] str = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        int year = 1947 ;
        yearConversion(str , year);
    }

    public static void yearConversion(String[] str, int year) {
        if(year==0){
            return;
        }
        System.out.println(year);
        int idx = year % 10 ;
        yearConversion(str , year /10);
        System.out.print(idx +" ");
        System.out.print(str[idx]+" ");
    }
}
