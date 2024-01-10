package TotalJava.Function;

public class OverLoadingWithDataType {
    public static int Sum(int a,int b){
        return a+b;
    }

    public static float Sum(float a,float b){
        return a+b;
    }

    public static void main(String[] args){
        System.out.println(Sum(5,6));
        System.out.println(Sum(3.2f,6.5f));
    }
}
