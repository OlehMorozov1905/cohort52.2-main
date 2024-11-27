package homework_10.podlesna;

// Собрать в массив данные о дневной температуре в вашем городе за прошедшую неделю.
// Выведите на печать температуру, которая была во вторник и затем в четверг.
// Найти среднюю температуру за прошлую неделю.

import java.time.LocalDate;
import java.time.DayOfWeek;
import java.time.temporal.TemporalAdjusters;
import java.util.Scanner;

public class DaytimeTemperatures {
    public static <ZoneId> void main(String[] args) {
        int temperature[] = new int[7];
        Scanner in = new Scanner(System.in);
        int sum = 0;

        // LocalDate currentDATE = LocalDate.now(); // дата сегодняшняя 2024-09-23

        LocalDate lastMonday = LocalDate.now().with(TemporalAdjusters.previous(DayOfWeek.MONDAY)); // прошлый понедельник
        LocalDate lastTuesday = LocalDate.now().with(TemporalAdjusters.previous(DayOfWeek.TUESDAY));
        LocalDate lastThursday = LocalDate.now().with(TemporalAdjusters.previous(DayOfWeek.THURSDAY));


        for (int i = 0; i < temperature.length; i++)
        {
            LocalDate day = lastMonday.plusDays(i);
            System.out.print("Input temperature for " + day.getDayOfWeek() + " " + day + " ");
            temperature[i] = in.nextInt();
        }

        System.out.println("Thursday's temperature " + lastTuesday + " was: " + temperature[1] + " degrees Celsius.");
        System.out.println("Thursday's temperature " + lastThursday + " was: " + temperature[3] + " degrees Celsius.");

        for (int i = 0; i < temperature.length; i++)
        {
            sum = sum + temperature[i];
        }

        sum = sum / temperature.length;

        System.out.println("Last week's average temperature was " + sum + " degrees Celsius.");

    }
}