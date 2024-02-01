package TotalJava.ExceptionHandling;

public class TryCatchBlock {
    public static void main(String[] args){
        int a = 100 ;
        int b =0 ;
        try {
            System.out.println(a/b);
        }catch (Exception e){
            System.out.println("Someting went wrong" );
        }
        System.out.println("hello");
    }

}
