package TotalJava.OOPs.Inheritance;

public class MultiLevel {
    public static void main(String[] args){
        Java atharv = new Java();
        atharv.Course();
        atharv.Subject();
        atharv.Topics();
    }
}

class College{
    void Course(){
        System.out.println("MCA");
    }
}

class Course extends College {
    void Subject(){
        System.out.println("Java");
        System.out.println("Python");
    }
}

class Java extends Course{
    void Topics(){
        System.out.println("DSA");
        System.out.println("OOPS");
    }
}