package TotalJava.Function;

public class BinaryToDecimal {
    public static void main (String[] args){
        int deci = binaryTodecimal(101);
        System.out.println("Decimal of Number : "+deci);
    }

    private static int binaryTodecimal(int num) {
        int deci = 0 ;
        int pow = 0 ;

        while(num>0){
            int last = num % 10;
            deci = (int) (deci + (last * Math.pow(2,pow)));
            pow ++;
            num=num/10;
        }
        return  deci;
    }
}
