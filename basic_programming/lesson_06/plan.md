<h3 style="text-align: center; padding-bottom: 14px">2024-02-02</h3>

# Lesson plan #6 09/17/2024:

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

# План занятия №6 17.09.2024:

## 1. Что мы узнали на прошлом занятии:
**Conditions**
Условия, логические выражения, операции сравнения.

a = 74   b = 103

a > b - это ложь или истина? - FALSE

шаг 1: a - b => 74 - 103 = -29 

шаг 2: - 29 < 0

a = -35   b = 67
a > b - ЛОЖЬ

----------------------------
Символы (symbol):

a ? z 

код a: 97 код по таблице ASCII

код z: 122 код по таблице ASCII

значит a < z - это ИСТИНА

----------------------------

- логические выражения, операции сравнения:
  x == y - это проверка, что число x равно y
  x >= y - это проверка, что x больше или равно y
  x != y - это проверка, x НЕ равно y
  x < y - это ... 
  x <= y - это ...

-----------------------------

Логические союзы:
&, && - это логический союз И
|, || - это логический союз ИЛИ
^ - это логический союз XOR исключающее ИЛИ
И ^ И - ЛОЖЬ
И ^ Л - ИСТИНА
Л ^ И - ИСТИНА
Л ^ Л - ЛОЖЬ

Ответ на вопрос, когда используется &, а когда && ?
  & - всегда проверяет оба операнда, независимо от первого значения;
  && - если первый операнд **ложен**, второй операнд не проверяется, так как результат уже известен (ложь).

Ответ на вопрос, когда используется |, а когда || ?
  | - всегда проверяет оба операнда, независимо от первого значения
  || - если первый операнд **истинен**, второй операнд не проверяется, так как результат уже известен (истина).

**If Statements**
Условный оператор - учим программу принимать решения.

Что такое блок-схема? - см. иллюстрации.

## 2. Обсуждаем ДЗ:
- минимум из двух чисел
- существование треугольника
- стоимость покупки со скидкой

Есть ли вопросы?

----------------------------------------------------------------------------

## 3. План на сегодняшнее занятие:

Уcловные операторы, продолжение:
- тернарный оператор
- switch ... case

Ввод данных с клавиатуры с помощью класса Scanner.

Типы данных:
- char (символ),
- String (строка, то есть набор символов)

См. раздел Теория.

## 4. Практика:
- **Задание 1.**
  Задайте в программе две переменные и их значения, которые отвечают за координаты точки на плоскости.
  Определите в какую четверть попадает точка с этими координатами.

- **Задание 2.**
  В программе задаются два целых числа.
  Найдите минимальное из них с помощью тернарного оператора.
  Дополните программу возможностью ввода чисел пользователем.

- **Задание 3.**
  Родители позволяют ребенку играть на компьютере 1 час.
  Напишите программу, которая будет реагировать на полученную в школе оценку:

1. "Молодец!", время для игр на компьютере увеличивается на 30 мин.
2. "Хорошо", ты можешь играть на компьютере обычные 60 минут.
3. "Посредственно.", время для игр уменьшается на 30 мин.
4. "Плохо!", сегодня никаких игр на компьютере.
5. "Позор семьи!", никаких игр на компьютере 2 дня.

- **Задание 4.**
  Написать программу, которая по введенной цифре от 1 до 7 определяет день недели.
  Второй вариант - на цифры от 1 до 5 программа сообщает, что это будний день, а на 6 и 7, что это выходной.

- **Задание 5.**
Рассчитайте величину скидки и стоимость покупки с учетом скидки по следующим правилам:
- сумма покупки до 100 евро - скидка 0%
- сумма покупки от 101 евро до 200 евро - скидка 2%
- сумма покупки от 201 евро до 500 евро - скидка 5%
- сумма покупки от 501 евро до 1000 евро - скидка 10%
- сумма покупки от более 1000 евро - скидка 20%
Сумма покупки вводится с клавиатуры.