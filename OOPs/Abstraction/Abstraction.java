package TotalJava.OOPs.Abstraction;
public class Abstraction {
    public static void main(String[] args ){
        Horse h = new Horse();
        h.walks();
        h.eats();
        
        Hen hen = new Hen();
        hen.walks();
        hen.eats();
    }
}

abstract class Animal{
    void eats(){
        System.out.println("All animals eats");
    }

    abstract void walks();
}

class Horse extends Animal{
    void walks(){
        System.out.println("Walks on 4 legs");
    }
}

class Hen extends Animal{
    void walks(){
        System.out.println("Walks on 2 legs");
    }
}