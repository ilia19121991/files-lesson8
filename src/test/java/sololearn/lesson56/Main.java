package sololearn.lesson56;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        String[] categories = {"PCs", "Notebooks", "Tablets", "Phones", "Аccessories"};

        //complete the code
        try {
            String merch = categories[choice];
            System.out.println(merch);
        } catch(Exception e) {
            System.out.println("Wrong Option");
        }
    }
}
