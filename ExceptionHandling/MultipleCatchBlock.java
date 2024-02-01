package TotalJava.ExceptionHandling;

public class MultipleCatchBlock {
    public static void main(String[] args){
        int a = 100 ;
        int b=0;
        int[] array = new int[5];

        try {
//            `System.out.println(a/b);
            System.out.println(array[5]);
        }
        catch (ArithmeticException e){
            System.out.println("Hello");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("null");
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
