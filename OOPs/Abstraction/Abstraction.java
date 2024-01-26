package TotalJava.OOPs.Abstraction;
public class Abstraction {
    public static void main(String[] args ){
//        to show the constructor hierarchy
        Mustang myHorse= new Mustang();

        System.out.println();

        Horse h = new Horse();
        h.eats();
        h.walks();
        System.out.println(h.color);
        h.changeColor();

        System.out.println();

        Hen hen = new Hen();
        hen.eats();
        hen.walks();
        hen.changeColor();
        System.out.println(hen.color);
    }
}

abstract class Animal{
    String color;

    Animal(){
        System.out.println("Animal constructor called");
    }
    void eats(){
        System.out.println("All animals eats");
    }

    abstract void walks();
}

class Horse extends Animal{

    Horse(){
        System.out.println("Horse constructor called");
    }
    void changeColor(){
        color= "Dark Brown";
    }
    void walks(){
        System.out.println("Walks on 4 legs");
    }
}

class Mustang extends Horse{
    Mustang(){
        System.out.println("Mustang Constructor is called");
    }
}

class Hen extends Animal{
    void changeColor(){
        color="Yellow";
    }
    void walks(){
        System.out.println("Walks on 2 legs");
    }
}