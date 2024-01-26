package TotalJava.OOPs.Inheritance;

public class HybridInheritance {
    public static void main(String[] args){
        GrandMother Rekha = new GrandMother();
        Rekha.property();
        Rekha.Farms();

        Son Madhura =  new Son();
        Madhura.bike();
        Madhura.Farms();
        Madhura.house();
    }
}

class GrandFather{
    void Farms(){
        System.out.println("Farms");
    }
}

class GrandMother extends GrandFather{
    void property(){
        System.out.println("Property");
    }
}

class Father extends GrandFather{
    void house(){
        System.out.println("House");
    }
}

class Son extends Father {
    void bike(){
        System.out.println("Bike");
    }
}