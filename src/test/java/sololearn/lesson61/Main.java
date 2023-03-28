package sololearn.lesson61;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[ ] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedList<String> words = new LinkedList<String>();

        while(words.size()<5){
            String word = scanner.nextLine();
            words.add(word);
            }

        for (String s: words) {
            if (s.length()>4) {
                System.out.println(s);
            }
        }
        }
    }
