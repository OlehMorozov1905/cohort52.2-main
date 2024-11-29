import java.util.Random;

public class Shooter {

//    У стрелка есть 10 попыток поразить мишень. Смоделируйте 10 выстрелов с помощью датчика случайных чисел.
//    Ответьте на вопрос, сколько очков набрал стрелок?
//    Попал ли он хоть раз в центр мишени?

    public static void main(String[] args) {

     // Стрелок может попасть в мишень, учитывается в какой круг, какого диаметра он попал.
        // 0 - промазал
        // 1 - попал в край мишени
        // 2 - попал чуть ближе к центру
        // ....
        // 10 - попал в центр

        // сумма всех чисел - это сколько очков он набрал

        Random random = new Random(); // сделали объект

        int[] shoots = new int[10]; // массив для результатов, объявили

        // shooting
        for (int i = 0; i < shoots.length; i++) {

//            int shoot = random.nextInt(11); // = - это присвоение
//            shoots[i] = shoot;

            shoots[i] = random.nextInt(11);
            System.out.print(shoots[i] + " ");
        }
        System.out.println();

        int sum = 0; // объявили переменную

        for (int i = 0; i < shoots.length; i++) {
            sum = sum + shoots[i];
        }

        System.out.println("Result = " + sum);

        boolean apple = false;

        for (int i = 0; i < shoots.length; i++) {
            if( shoots[i] == 10 ){
                apple = true;
            }
        }

        System.out.println("Hit the apple: " + apple);

    }
}
