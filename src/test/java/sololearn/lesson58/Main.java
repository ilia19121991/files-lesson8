package sololearn.lesson58;

class Main {
    public static void main(String[ ] args) {
        Name name = new Name();
        name.setPriority(1);

        Welcome welcome = new Welcome();
        welcome.setPriority(6);

        name.start();
        welcome.start();



    }
}

//extend the Thread class
class Welcome extends Thread {
    public void run() {
        System.out.println("Welcome!");
    }
}

//extend the Thread class
class Name extends Thread {
    public void run() {
        System.out.println("Please enter your name");
    }
}
