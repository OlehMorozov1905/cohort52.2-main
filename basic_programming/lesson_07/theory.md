<details>
  <summary style="cursor: pointer;"><b>English</b></summary>

**Cycles** are operators of repeated execution of actions.

The `while` cycle in Java (read as the 'vile' cycle) - formalizes multiple actions in a
laconic structure.

**while** in English means **while**

Drawing a While cycle flowchart in the app.diagrams.net editor

**Example:**
The algorithm for slicing apples for a pie in the form of `while` in Java could look like this:

The algorithm of the cycle "in words":
_______________________
while(numberofApplesInBasin > 0) {
apple = Basin.takeNextApple();
putInPie(apple.peel().slice());
numberofApplesInBasin = numberofApplesInBasin - 1; // decrement, decreases the number of apples by one;
// same thing: numberOfApplesInBasin--;
}
System.out.println('There are no more apples in the basket.');

**Important terms!:**
Loop parameter: number of apples
Loop condition: number of apples > 0
Loop body: operators (what's inside {} )

## Syntax

while (Logical expression) {
// Loop body - periodically executed operator(s)
}

It is executed as follows (step by step):
1. Calculate the Logical condition following in brackets `while`.
2. If the logical condition is true, then the operators in the loop body {} are executed,
   after executing the last operator in the loop body, we go back to checking the condition.
3. If the logical condition is false, then we leave the `while` loop, go to the line below after the loop body.

## While loop is a **conditional** loop

Because we always pre-calculate the logical expression (loop entry condition) before executing the loop body,
this type of `while` is often called a conditional loop.

Let's build a table of the first ten integer, positive powers of 3:

// initial data

int number = 3; // Number raised to the power
int result = 1; // Result of raising to the power
int power = 1; // Initial exponent

while(power <= 10) { // loop entry condition
result *= number; // result = result * number;
System.out.println(number + " to the power of " + power + " = " + result);
power++; // power = power + 1;
}

Result of console output:

```
3 to the power of 1 = 3
3 to the power of 2 = 9
3 to the power of 3 = 27
3 to the power of 4 = 81
3 to the power of 5 = 243
3 to the power of 6 = 729
3 to the power of 7 = 2187
3 to the power of 8 = 6561
3 to the power of 9 = 19683
3 to the power of 10 = 59049
```

## Loop with a postcondition

The second type of loop:

do {
// Loop body - periodically executed operator(s)
} while (Logical expression);

It is executed as follows (steps):
1. The loop body is executed (immediately after the keyword `do`).
2. We calculate the Logical condition following in brackets after `while`. 3. If the logical condition is true, then go (return) to step 1
4. If the logical condition is false, then exit the `while` loop.

A loop with a postcondition - the loop body is processed at least **once**.
**This is how it differs from a loop with a precondition.**

**Loop launch algorithm:**
Step 1. Set the variable (counter, parameter) of the loop;
Step 2. Determine the loop repetition condition;
Step 3. Fill the loop body with the necessary operators;
Step 4. Change the variable (counter, parameter) of the loop;
Step 5. Debugging: launch the loop and check its operation at the extreme values ​​and in general.

Useful when debugging a loop:
- enable intermediate prints of the loop parameter and the obtained result at the debugging stage;
- check the loop operation at the extreme values ​​of the parameter (0 and the last value), and then at 1-2 iterations independently (pen, paper, calculator);
- use debugger.

</details>

<hr>

<details style="padding-top: 18px">
  <summary style="cursor: pointer;"><b>На русском</b></summary>

**Циклы** – это операторы многократного выполнения действий.

Цикл `while`(пока) в Java (читается цикл 'вайл') - оформляет многократные действия в
лаконичную структуру.

**while** в переводе с английского означает **пока**

Рисуем блок-схему цикла While в редакторе app.diagrams.net

**Пример:**
Алгоритм по нарезке яблок для пирога в виде `while` в Java мог бы выглядеть как:

Алгоритм цикла "словами":
_______________________
    while(количествоЯблокВТазике > 0) {
        яблоко = Tазик.взятьОчередноеЯблоко();
        положитьВПирог(яблоко.чистить().нарезать());
        числоЯблокВТазике = числоЯблокВТазике - 1; // декремент, уменьшает количество яблок на единицу;
        // то же самое: числоЯблокВТазике--;
    }
    System.out.println('Яблоки в корзине закончились.');

**Важные термины!:**
Параметр цикла: количество яблок
Условие цикла: количество яблок > 0
Тело цикла: операторы (то, что стоит внутри {} )

## Синтаксис

    while (Логическое выражение) {
        // Тело цикла - периодически выполняемые оператор(ы)
    }

Выполняется следующим образом (по шагам):
1. Вычисляем Логическое условие, следующее в скобках за `while`.
2. Если логическое условие истинно, то выполняются операторы в теле цикла {},
   после выполнения последнего оператора в теле цикла, переходим обратно на проверку условия.
3. Если логическое условие ложно, то покидаем цикл `while`, переходим на строчку ниже после тела цикла.

## Цикл While - это цикл **с предусловием**

Так как перед выполнением тела цикла мы всегда предварительно вычисляем логическое выражение (условие входа в цикл),
то этот вид `while` часто называют циклом с предусловием.

Построим таблицу первых десяти целых, положительных степеней числа 3:

    // начальные данные 
      int number = 3; // Возводимое в степень число
      int result = 1; // Результат возведения в степень
      int power = 1; // Начальный показатель степени

      while(power <= 10) { // условие входа в цикл
        result *= number; // result = result * number;
        System.out.println(number + " в степени " + power + " = " + result);
        power++; // power = power + 1;
      }

Результат вывода в консоль:

    ```
    3 в степени 1 = 3
    3 в степени 2 = 9
    3 в степени 3 = 27
    3 в степени 4 = 81
    3 в степени 5 = 243
    3 в степени 6 = 729
    3 в степени 7 = 2187
    3 в степени 8 = 6561
    3 в степени 9 = 19683
    3 в степени 10 = 59049
    ```

## Цикл с постусловием

Второй вид цикла:

    do {
        // Тело цикла - периодически выполняемые оператор(ы)
    } while (Логическое выражение);

Выполняется следующим образом (шаги):
1. Выполняется тело цикла (сразу после ключевого слова `do`).
2. Вычисляем Логическое условие, следующее в скобках за `while`.
3. Если логическое условие истинно, то переходим (возвращаемся) на шаг 1
4. Если логическое условие ложно, то покидаем цикл `while`.

Цикл с постусловием - тело цикла отрабатывается как минимум **один раз**.
**Это его отличие от цикла с предусловием.**

**Алгоритм запуска цикла:**
Шаг 1. Задаем переменную (счетчик, параметр) цикла;
Шаг 2. Определяем условие повторения цикла;
Шаг 3. Заполняем тело цикла необходимыми операторами;
Шаг 4. Изменяем переменную (счетчик, параметр) цикла;
Шаг 5. Отладка: запустить цикл и проверить его работу на крайних значениях и в целом.

Полезно при отладке цикла:
- включить на этапе отладки промежуточные печати параметра цикла и получаемого результата;
- проверить работу цикла при крайних значениях параметра (0 и последнее значение), а потом на 1-2 итерации самостоятельно (ручка, бумажка, калькулятор);
- использовать **debugger**.

</details>
