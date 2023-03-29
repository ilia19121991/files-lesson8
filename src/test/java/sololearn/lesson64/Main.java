package sololearn.lesson64;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[ ] args) {
        ArrayList<Integer> nums = new ArrayList<Integer>();

        Scanner scanner = new Scanner(System.in);

        /** заполняем ArrayList*/
        while(nums.size()<5){
            int num = scanner.nextInt();
            nums.add(num);

        }


        System.out.println(Collections.max(nums));
        System.out.println(Collections.min(nums));

        /** в обратном порядке */
        Collections.reverse(nums);
        System.out.println(nums);

        /** в обратном порядке (по итогу вернули порядок) */
        Collections.reverse(nums);
        System.out.println(nums);

        /** Расставляем элементы в рандомном порядке */
        Collections.shuffle(nums);
        System.out.println(nums);

        /** Расставляем в порядке возрастания */
        Collections.sort(nums);
        System.out.println(nums);


    }
}
