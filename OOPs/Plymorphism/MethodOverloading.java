package TotalJava.OOPs.Plymorphism;

public class MethodOverloading {
    public static void main(String[] args){
        Calculator calc= new Calculator();
        System.out.println(calc.sum(5,6));
        System.out.println(calc.sum((float)4.5,(float)6.8));
        System.out.println(calc.sum(3,5,7));
    }
}

class Calculator{
    int sum(int a , int b){
        return  a+b;
    }

    float sum(float a,float b){
        return a+b;
    }

    int sum(int a, int b, int c){
        return a+b+c;
    }
}