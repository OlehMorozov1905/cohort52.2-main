package homework_11;

import java.util.Arrays;

public class Shooter {
    public static void main(String[] args) {
        // define array
        int[] shooting = new int[10];

        //int n = (int)(Math.random() * (b - a + 1) + a) - генерирует случайное **целое** число в интервале [a, b]
        //a  - может быть, b  - может быть

        int a = 0; // left
        int b = 10; // right

        //shooting
        for (int i = 0; i < shooting.length; i++) {
            shooting[i] = (int) (Math.random() * (b - a + 1) + a);

        }
        // another way for print array
        System.out.println(Arrays.toString(shooting)); //

        int points = 0;
        int count = 0;
        for (int i = 0; i < shooting.length; i++) {
            points += shooting[i];
            if (shooting[i] == 10) {
                count++;
            }
        }
        System.out.println("How many points did the shooting score? " + points + " points.");
        System.out.println("Did he ever hit the center of the target: " + count + " times.");
    }
}
