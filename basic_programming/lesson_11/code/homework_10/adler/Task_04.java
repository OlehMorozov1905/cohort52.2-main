package homework_10.adler;

// code by Gloria Adler

//Задача 4 (*)
//Задан массив целых чисел: 56, 73, 15, -10, 37, -14, 25, 65, 33, 38.
//Найдите максимальный элемент массива и его индекс.
public class Task_04 {
    public static void main(String[] args) {
        int[] element = {56, 73, 15, -10, 37, -14, 25, 65, 33, 38};
        int max = element[0];
        int maxIndex = 0;

        // максимальный элемент массива
        for (int i = 0; i < element.length; i++) {

            if (element[i] > max){
                max = element[i];
                maxIndex = i;//индекс максимального элемента
            }
        }
        System.out.println("Max element = " + max + ".");
        System.out.println("Index of max element: " + maxIndex + ".");
    }
}


