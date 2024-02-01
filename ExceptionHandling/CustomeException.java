package TotalJava.ExceptionHandling;

public class CustomeException {
    public static void main(String[] args){
        int a = 20 ;
        int b;

        try {
            b=18/a;
            if(b==0){
                throw new AshutoshException("I don't want to divide by zero");
            }
        }
        catch (AshutoshException e){
            b=18/1;
            System.out.println("thats a default output "+ e);
        }

        System.out.println(b);
    }
}
