package homework_12.array_methods;

import java.util.Scanner;

public class ArrayMethodsAppl {

    public static void main(String[] args) {

        int[] myArray = ArrayMethods.fillArray(-10, 10, 20);

        ArrayMethods.printArray(myArray);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number for searching: ");
        int n = scanner.nextInt();

        boolean isInArray = ArrayMethods.searchInArray(myArray, n);
        System.out.println("Number " + n + " is in array: " + isInArray);

        System.out.println("===================================================");
        double[] money = {100, 200, 300, 150, 400};
        double[] newMoney = ArrayMethods.calculatePercent(money, 5.0);
        ArrayMethods.printArrayDouble(newMoney);

    }

}
