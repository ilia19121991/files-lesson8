package sololearn.lesson58;

public class A extends Thread{
    public void run() {
        System.out.println("Hello");
    }
    public static void main(String[] args) {
        A obj = new A();
        obj.start();
        obj.setPriority(10);
    }
}
