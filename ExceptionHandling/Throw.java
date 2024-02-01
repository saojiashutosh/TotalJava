package TotalJava.ExceptionHandling;

public class Throw {
    public static void main(String[] args){
        int a = 20 ;
        int b=0;
        int[] array = new int[5];

        try {
            b=18/a;
            if(b==0){
                throw new ArithmeticException("I don't want to divide by zero");
            }
        }
        catch (ArithmeticException e){
            b=18/1;
            System.out.println("thats a default output "+ e);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("null");
        }
        catch (Exception e){
            System.out.println(e);
        }
        System.out.println(b);
    }
}
