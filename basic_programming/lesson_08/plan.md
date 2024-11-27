<h3 style="text-align: center; padding-bottom: 14px">2024-02-02</h3>

# Lesson plan #8 09/19/2024:

## 1. What we learned in the last lesson:
**Conditions**
Conditions, logical expressions, comparison operations.

a = b =

a > b - is it false or true?

step 1:

step 2:

a ? z

code a:

code z:

means

- logical expressions, comparison operations:
  x == y - is ...
  x >= y - is ...
  x != y - is ...
  x < y - is ...
  x <= y - is ...

Logical unions:
&, && - is the logical union ...
|, || - is the logical union ...
^ - is the logical union ...

Answer to the question, when is & used, and when is && ?
& - always checks both operands, regardless of the first value;
&& - if the first operand is **false**, the second operand is not checked, since the result is already known (false).

Answer to the question, when to use | and when || ?
| - always checks both operands, regardless of the first value
|| - if the first operand is **true**, the second operand is not checked, since the result is already known (true).

**If Statements**
Conditional operator - teach the program to make decisions.

What is a flowchart? - see the illustrations.

## 2. Discussing homework:
- minimum of two numbers
- existence of a triangle
- purchase price with a discount

Any questions?

-----------------------------------------------------------------------------

## 3. Plan for today's lesson:

Conditional operators, continued:
- ternary operator
- switch ... case

Keyboard data entry using the Scanner class.

Data types:
- char (symbol),
- String (string, i.e. a set of characters)

See the Theory section.

## 4. Practice:
- **Task 1.**
  Set two variables and their values ​​in the program that are responsible for the coordinates of a point on a plane.
  Determine which quadrant the point with these coordinates falls into.

- **Task 2.**
  The program specifies two integers.
  Find the minimum of them using the ternary operator.
  Supplement the program with the ability for the user to enter numbers.

- **Task 3.**
  Parents allow their child to play on the computer for 1 hour.
  Write a program that will respond to the grade received at school:

1. "Well done!", the time for playing on the computer is increased by 30 minutes.
2. "Good", you can play on the computer for the usual 60 minutes.
3. "Mediocre", the time for playing is reduced by 30 minutes.
4. "Bad!", no playing on the computer today.
5. "Shame on the family!", no playing on the computer for 2 days.

- **Task 4.**
  Write a program that determines the day of the week based on the entered digit from 1 to 7.
  The second option - for digits from 1 to 5, the program reports that it is a weekday, and for 6 and 7, that it is a day off.

- **Task 5.**
  Calculate the discount amount and the purchase price taking into account the discount according to the following rules:
- purchase amount up to 100 euros - 0% discount
- purchase amount from 101 euros to 200 euros - 2% discount
- purchase amount from 201 euros to 500 euros - 5% discount
- purchase amount from 501 euros to 1000 euros - 10% discount
- purchase amount over 1000 euros - 20% discount
  The purchase amount is entered from the keyboard.


___

# План занятия №8 19.09.2024:

## 1. Что мы узнали на прошлом занятии:

- цикл с предусловием   | while loop
- цикл с постусловием   | do...while loop

  while ( логическое выражение -> ИСТИНА ) {
     ...
     // тело цикла, которое повторяется
     ...
  }
  ...
- **параметр** цикла:
  - это переменная, выступает часто в роли счетчика
  - часто это тип int 
  - входит в понятие "исходные данные"
  - он изменяется внутри цикла, чтобы была возможность выйти из цикла
  - он влияет на количество повторений цикла
  - участвует в логическом выражении (условие), которое контролирует цикл
  - если параметр не меняется и не участвует в условии выхода из цикла, то цикл будет бесконечным

См. раздел Теория.

## 2. Обсуждаем ДЗ:
- повторение строки;
- сумма цифр числа;
- бегун;
- счастливый билет(*)

Есть ли вопросы?

----------------------------------------------------------------------------

## 3. План на сегодняшнее занятие:
- структурное программирование;
- префиксные и постфиксные операции;
- добавляем в циклы условия и строим вложенные циклы;
- простые числа, метод для определения является ли число простым.

## 4. Практика:

Задача 1.
Пользователь вводит с клавиатуры строку.
Распечатайте каждую букву строки на новой строчке.
Используйте методы length и charAt() класса String.

Задание 2.
Распечатать в консоли все числа от 1 до 100, которые делятся на 5 без остатка.

Задание 3.
Распечатать в консоли таблицу умножения от 1 до 10.

Задание 4.
Пользователь вводит натуральное число n. Определите, является ли оно простым.
Простое число - это такое число, которое делится **ТОЛЬКО** на себя и на 1.
Примеры: 2, 3, 5, 7, 11, 13, 17, 19, ...
Обеспечьте защиту от ввода пользователем отрицательных чисел.

Задание 5.
Доработать калькулятор так, чтобы он продолжал работать после выполнения одного действия.

