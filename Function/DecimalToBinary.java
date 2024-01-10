package TotalJava.Function;

public class DecimalToBinary {
    public static void main(String[] args){
        int bina = decimalTobinary(5);
        System.out.println("Binary of Number : "+ bina);
    }

    private static int decimalTobinary(int num) {
        int bina = 0 ;
        int pow = 0 ;
        while(num > 0){

            int rem = num % 2 ;
            bina = (int) (bina + (rem * Math.pow(10,pow)));

            pow ++;
            num = num / 2 ;
        }
        return bina;
    }
}
