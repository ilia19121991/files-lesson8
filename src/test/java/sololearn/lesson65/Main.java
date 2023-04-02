package sololearn.lesson65;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[ ] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedList<Integer> nums = new LinkedList<Integer>();

        while(nums.size()<5){
            int num = scanner.nextInt();
            nums.add(num);
        }


        int sum = 0;
        Iterator<Integer> it = nums.iterator();
        while (it.hasNext()) {
            int value = it.next();
            sum += value;
        }

        System.out.println(sum);
    }
}
