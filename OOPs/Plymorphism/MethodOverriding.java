package TotalJava.OOPs.Plymorphism;

public class MethodOverriding {
    public static void main(String[] args){
        Dear d = new Dear();
        d.eats();
    }
}

class Animal{
    void eats(){
        System.out.println("Eats Flesh");
    }
}

class Dear extends Animal{
    void eats(){
        System.out.println("Eats Grass");
    }
}