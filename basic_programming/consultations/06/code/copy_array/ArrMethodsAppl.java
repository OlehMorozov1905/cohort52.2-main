package copy_array;

public class ArrMethodsAppl {
    public static void main(String[] args) {

        int[] intArray = {1, 2, 3, 4, 5, 13};
        System.out.println(ArrMethods.sumOfElements(intArray));

        double[] doubleArray = {1, 2, 3, 4, 5, 13, 0, 1 };
        System.out.println(ArrMethods.averageValue(doubleArray));

        // данные из массива intArray перенести в doubleArray

        for (int i = 0; i < intArray.length; i++) {
            doubleArray[i] = intArray[i];
            System.out.print(doubleArray[i] + " ");
        }

    }
}
