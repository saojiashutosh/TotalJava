package TotalJava.Pattern;

public class InvertedStar {
    public static void main (String[] args){
        int  i =0 , j=0;
        for( i = 1 ; i<=4 ; i++ ){
            for( j = 4; j >= i; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
