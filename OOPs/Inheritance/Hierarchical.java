package TotalJava.OOPs.Inheritance;

public class Hierarchical {
    public static void main(String[] args){
        DSA ash = new DSA();
//        as DSA class extends Python class it can access the methods of that class not of OOPS class
        System.out.println("For DSA");
        ash.Trees();
        ash.Basic();

//       as OOPS class extends Python class it can access the methods of that class not of DSA class
        OOPS atharv = new OOPS();
        System.out.println("For OOPS");
        atharv.Basic();
        atharv.Abstraction();
        atharv.Encapsulation();
        atharv.Inhertance();
        atharv.polymorphism();

    }
}

class Python{
    void Basic(){
        System.out.println("LOOPS");
    }
}

class OOPS extends Python{
    void Encapsulation(){
        System.out.println("Encapsulation");
    }

    void Inhertance(){
        System.out.println("Inhertance");
    }

    void polymorphism(){
        System.out.println("polymorphism");
    }

    void Abstraction(){
        System.out.println("Abstraction");
    }
}

class DSA extends Python{
    void Trees(){
        System.out.println("Trees");
    }
}