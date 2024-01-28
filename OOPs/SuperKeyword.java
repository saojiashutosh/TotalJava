package TotalJava.OOPs;

public class SuperKeyword {
    public static void main(String[] args){
        Horse h1=new Horse();
    }
}

class Animal{
    Animal(){
        System.out.println("Animal Counstructor is called");
    }
}

class Horse extends Animal{
    Horse(){
        System.out.println("Horse Counstructor is called");
    }
}