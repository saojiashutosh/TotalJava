package TotalJava.OOPs.Inheritance;

public class SingleLevelInheritance {
    public static void main(String[] args){
        Fish nimo = new Fish();
        nimo.eat();
        nimo.breath();
        nimo.fins();
    }
}

class Animal{
    void eat(){
        System.out.println("eats");
    }

    void breath(){
        System.out.println("breaths");
    }
}

class Fish extends Animal{
    void fins(){
        System.out.println("fins");
    }
}