package array_methods;

import array_methods.ArrayMethods;

import java.util.Scanner;

public class ArrayMethodsAppl {

    public static void main(String[] args) {

//        int[] myArray = ArrayMethods.fillArray(-10, 10, 20);
//
//        ArrayMethods.printArray(myArray);
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Input number for searching: ");
//        int n = scanner.nextInt();
//
//        boolean isInArray = ArrayMethods.searchInArray(myArray, n);
//        System.out.println("Number " + n + " is in array: " + isInArray);

        int[] myArray = {50, 40, 30, 20, 10};

//        System.out.println(ArrayMethods.linearSearch(myArray, 10));
//        System.out.println(ArrayMethods.linearSearch(myArray, 100));

        System.out.println("-------------------------------------------");

        int index = ArrayMethods.binarySearch(myArray, 50);
        System.out.println(index);

    }

    // 1024 - линейный поиск 1023 шагов
    // 1024 - бинарный поиск 9 шагов

    // 32, 45, 24, 28, ... - O(n)
    // O(n2)

}
