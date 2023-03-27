package sololearn.other;


//будьте внимательны с модификаторами доступа
public class Main {

    public static void main(String[] args) {

        int[] arr = new int[2];
        arr[0] = 9;
        arr[1] = 10;
        int res = 0;

        for (int el: arr){
            res+=el;
        }
        System.out.println(res);
    }

}



   /* public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        String movie = read.nextLine();
        int row = read.nextInt();
        int seat = read.nextInt();

        Ticket ticket = new Ticket(movie, row, seat);

        System.out.println("Movie: " + ticket.getMovie());
        System.out.println("Row: " + ticket.getRow());
        System.out.println("Seat: " + ticket.getSeat());
    }
}

class Ticket {
    private String movie;
    private int row;
    private int seat;

    //complete the constructor
    public Ticket(String m, int r, int s) {
        movie = m;
        row = r;
        seat = s;
    }


    public String getMovie() {
        return movie;
    }

    public int getRow() {
        return row;
    }

    public int getSeat() {
        return seat;
    }

    public void setMovie(String movie) {
        this.movie = movie;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

}*/



/*class Second {
    public static void main(String[] args) {
        Person p = new Person();

        p.setAge(25);
        change(p);
        System.out.println(p.getAge());

    }
    static void change (Person p) {
        p.setAge(10);
    }
}

class Person {
    int age;

    public void setAge(int a) {
        this.age = a;
    }

    public int getAge() {
        return age;
    }

}*/

/*class Main {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        Student student = new Student();

        String name = read.nextLine();
        int age = read.nextInt();

        student.name = name;
        student.setAge(age);


        System.out.println("Name: " + student.name);
        System.out.println("Age: " + student.getAge());
    }
}

class Student {

    public String name;
    public int age;

    public int getAge() {
        //complete Getter
        return age;
    }
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
        else {
            System.out.println("Invalid age");
            this.age = 0;
        }
    }
}*/





/*
public class Main {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        Customer customer = new Customer();

        customer.firstName = scanner.nextLine();
        customer.secondName = scanner.nextLine();
        customer.age = scanner.nextInt();
        customer.roomNumber = scanner.nextInt();

        customer.saveCustomerInfo();

    }

}

class Customer {
    String firstName;
    String secondName;
    int age;
    int roomNumber;

    public void saveCustomerInfo(){
        System.out.println("First name: " + firstName);
        System.out.println("Second name: " + secondName);
        System.out.println("Age: " + age);
        System.out.println("Room number: " + roomNumber);

    }
}
*/




/*
    Scanner sc = new Scanner(System.in);
    String stroka = sc.nextLine();
    char[] letters = stroka.toCharArray();

    int length = letters.length;
    char naoborot[] = new char[length];

        for (char c : letters) {
                naoborot[length-1] = c;
                length--;
                }
                System.out.println(naoborot);*/
