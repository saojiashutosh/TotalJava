package TotalJava.OOPs;

public class Constroctor {
    public static void main(String[] args){
        Student s1 = new Student("Ashutosh",2201164);
        System.out.println(s1.name);
        System.out.println(s1.rollno);

        Pens p1 = new Pens();
    }
}

class Student{
    String name;
    int rollno;

    Student(String name,int rollno){
        this.name=name;
        this.rollno=rollno;
    }
}

class Pens{
    String color;
    int tip;
    Pens(){
        System.out.println("Pen constructor is called .....");
    }
}