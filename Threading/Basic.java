package TotalJava.Threading;

public class Basic {
    public static void main(String[] args ) throws InterruptedException {
        A obj1 = new A();
        B obj2 = new B();

        obj2.setPriority(Thread.MAX_PRIORITY);

        obj1.start();
        Thread.sleep(10);

        obj2.start();
    }
}

class A extends Thread{
    public void run(){
        for (int i = 0; i <100 ; i++) {
            System.out.println("hii");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class B extends Thread {
    public void run(){
        for (int i = 0; i < 100; i++) {
            System.out.println("hello");
        }
    }
}