package sololearn.lesson60;

/*import com.google.common.math.Stats;*/

import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[ ] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> evennums = new ArrayList<Integer>();

        while(evennums.size()<3){
            int num = scanner.nextInt();
            evennums.add(num);
        }

        int num1 = evennums.get(0);
        int num2 = evennums.get(1);
        int num3 = evennums.get(2);

        int avg = (num1 + num2 + num3)/3;
        System.out.println(avg);


    }
}

/*
    int avg = (int) Stats.meanOf(evennums);
    System.out.println(avg);
    */
