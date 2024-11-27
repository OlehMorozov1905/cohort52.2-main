<h3 style="text-align: center; padding-bottom: 14px">2024-02-02</h3>

# Lesson plan #5 09/16/2024:

# Plan for the upcoming lessons
L5 - conditions, logical expressions
L6 - ternary operator, switch case
L7 - while and do while loops
L8 - arrays and for loop
L9 - review for the week

## 1. What we learned in the last lesson:
- primitive data types in Java, there are 8 of them, they differ in name
  and the amount of memory allocated.

The most commonly used:
- int - 4 bytes (1 byte = 8 bits)
- double
- char
- boolean

Why 8 data types? - there are no others, they are not needed.

- mathematical operations:
- + - adds numbers, variables, in another case - "plus" it connects (concatenation) expressions at the time of printing
- constants - WRITTEN IN CAPITAL LETTERS

- how to **declare** a variable:
- first specify the type (specify only once)
- then come up with a name, example: areaOfCircle
- after the '=' symbol specify the value of the variable.

- variable name (title)
- start writing with a lowercase letter
- cannot start with a number
- camelStyle
- variable name is usually given in English
- cannot coincide with reserved words of the language

- methods:
- void - execute code, do not return anything
- receive arguments ()
- return the result when called
- have a return type in the signature
- the type and name of the variables with which the method performs operations are indicated in parentheses

## 2. Discussing homework:
- converting money
- converting degrees Celsius to degrees Fahrenheit
- converting nautical miles to kilometers

Any questions?

----------------------------------------------------------------------------

## 3. Plan for today's lesson:

**Conditions**
Conditions, logical expressions, comparison operations.

**If Statements**
Conditional operator - teaching the program to make decisions.

See the theory section.

## 4. Practice:

- **Task 1:**
  Check if a number is positive or negative.
  Check if an integer is even or odd.
  Check age. If the user is 18 or younger, then say "You must come with your guardian", otherwise say "You are allowed to act independently".

- **Task 2:**
  Declare two integer variables a and b and assign them arbitrary values ​​of natural numbers.
  Create a third variable res and display its value on the screen like this:
  If a = b, then res will be equal to (a + b) * 5 and if not, then (a - b) * 5.

- **Task 3.** Write a method that returns the maximum of two integers.
  Implement a method that returns the maximum of three integers. The numbers are specified in the program.
  Write a method that returns the maximum of two integers, use the ternary operator.

- **Task 4:**
  Implement a method that determines whether one integer is divisible by another or not.

----------------------------------------------------------------------------------------------
- **Task 5:**
  Develop an application for solving a quadratic equation using the coefficients of a quadratic trinomial a, b, and c.
  Calculate the discriminant using the formula: d = b*b - 4*a*c
  If d > 0, then x1 = (-b + Math.sqrt(d))/(2*a), x2 = (-b - Math.sqrt(d))/(2*a).
  If d = 0, then x = -b / (2*a).
  If d < 0, then report that there are no roots.


___

# План на ближайшие занятия
L5 - условия, логические выражения
L6 - тернарный оператор, switch case
L7 - циклы while и do while
L8 - массивы и цикл for
L9 - повторение за неделю

# План занятия №5 16.09.2024:

## 1. Что мы узнали на прошлом занятии:
- примитивные типы данных в Java, всего их 8, отличаются названием
и объемом выделяемой памяти.

Самые употребляемые:
  - int - 4 байта (1 байт = 8 бит)
  - double 
  - char
  - boolean

Почему 8 типов данных? - других нет, не нужны.

- математические операции:
  - + - складывает числа, переменные, в другом случае - "плюс" он соединяет (конкактенация) выражения в момент печати
  - константы - ПИШУТСЯ БОЛЬШИМИ БУКВАМИ

- как **объявить** переменную:
  - сначала указываем тип (указываем только один раз)
  - затем придумать имя, пример: areaOfCircle
  - после символа '=' указывем значение переменной.

  - имя переменной (наименование)
    - начинаем писать с маленькой буквы
    - нельзя начинать с цифры
    - camelStyle
    - имя переменной принято давать на английском языке
    - не может совпадать с зарезервированными словами языка

- методы:
  - void - выполняют код, ничего не возвращают
  - получают аргументы ()
  - возвращают результат при вызове
    - имеют в сигнатуре тип возвращаемого результата
    - в круглых скобках указываются тип и имя переменных, с которыми метод выполняет операции 

## 2. Обсуждаем ДЗ:
- конвертация денег
- перевод градусов Цельсия в градусы Фаренгейта
- перевод морских миль в километры

Есть ли вопросы?

----------------------------------------------------------------------------

## 3. План на сегодняшнее занятие:

**Conditions**
Условия, логические выражения, операции сравнения.

**If Statements**
Условный оператор - учим программу принимать решения.

См. раздел теория.

## 4. Практика:

- **Задание 1:**
  Проверка положительное или отрицательное число.
  Проверка четное или нечетное целое число.
  Проверка возраста. Если пользователю 18 лет и менее, то сообщить "Вам надо
  прийти вместе с вашим опекуном", иначе сообщить "Вам разрешено действовать самостоятельно".

- **Задание 2:**
  Объявите две переменные целого типа a и b и присвойте им произвольные значения натуральных чисел.
  Создайте третью переменную res и выведите ее значение на экран таким образом:
  Если a = b, то res будет равно (a + b) * 5 a если нет, то (a - b) * 5.

- **Задание 3.** Написать метод, возвращающий максимальное из двух целых чисел.
  Реализовать метод, который возвращает максимальное из трех целых чисел. Числа задаются в программе.
  Написать метод, возвращающий максимальное из двух целых чисел, использовать тернарный оператор.

- **Задание 4:**
  Реализовать метод, определяющий, делится ли одно целое число на другое нацело или нет.

-----------------------------------------------------------------------------------------------
- **Задание 5(*):**
  Разработать аппликацию для решения квадратного уравнения по коэффициентам квадратного трехчлена а, b и с.
  Дискриминант вычислить по формуле: d = b*b - 4*a*c
  Если d > 0 , то x1 = (-b + Math.sqrt(d))/(2*a), x2 = (-b - Math.sqrt(d))/(2*a).
  Если d = 0, то x = -b / (2*a).
  Если d < 0, то сообщить, что корней нет.
