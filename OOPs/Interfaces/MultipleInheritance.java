package TotalJava.OOPs.Interfaces;

public class MultipleInheritance {
    public static void main(String[] args){
        Bear b = new Bear();
        b.eats();
    }
}

interface Carnivore{
    void eats(); // eats grass
}

interface Harbivore{
    void eats();// eats meat
}

class Bear implements Carnivore , Harbivore {
    public void eats(){
        System.out.println("Eats both Grass as well as Meat");
    }
}