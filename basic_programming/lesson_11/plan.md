<h3 style="text-align: center; padding-bottom: 14px">2024-02-02</h3>

# Lesson plan #11 09/24/2024:

## 1. What we did in the last lesson:
- studied the theory on the topic of arrays
- studied the syntax of the for loop
- created an array of integers from 1 to 20, filled it, printed it
- created an array char[26] alphabet
- created an array for student grades, calculated the average grade
- used type conversion - casting
- (char)
- (double)
-----------------------------
Questions for understanding:
- why do we need arrays?
- what data types can be in an array?
- what are the advantages of the for loop? disadvantages?

-------------------------------
Questions for knowledge:
there is an array int[] array = new int[100];
- what it looks like/access the 1st element -
- what it looks like/access the last element -
- what it looks like/access the current element -

## 2. Discussing homework:
- temperature for the past week
- array of even numbers, printing in reverse order
- rearranging array elements
- (*) finding the maximum element and its index

Any questions?
----------------------------------------------------------------------------

## 3. Plan for today's lesson:
Arrays - continued:
- finding the minimum and maximum value in an array of data;
- finding the index of an element;
- filling an array with random data;
- passing an array to a method.

## 4. Practice:

**Problem 1.**
You are given an array of integers: 75, 34, -15, -123, 57, -145, 86, 77, 48, -59.
Find the minimum element of the array and its index.
What will be the result if there are several identical minimum elements in the array?
Find the maximum element of the array and its index.
Swap the minimum and maximum elements, print the array.

**Problem 2.**
Problem about "inclusions".
You have an array of integers in which the number X occurs several times.
Find out how many times this number occurs in the array? In what places in the array is it?

**Problem 2.**
Simulate throwing a dice 20 times. Count how many times each side came up?
Check if the probabilities of the dice sides coming up are equal?

**Task 3.**
Give an array of 10 random natural numbers between 1 and 100.
Ask the user for a natural number.
Determine whether the number is in the array. Create and use the
searchInArray method, which receives an array and the number to search for as input and returns
the answer - whether the number was found in the array.

___

# План занятия №11 24.09.2024:

## 1. Что мы сделали на прошлом занятии:
- изучили теорию по теме массивы
- изучили синтаксис цикла for (for loop)
- создали массив целых чисел от 1 до 20, заполнили его, распечатали
- создали массив char[26] alphabet
- создали массив для оценок студента, рассчитали средний балл
- использовали преобразование типов - casting
  - (char) - преобразование в желаемый тип данных
  - (double) - 
всего 8 типов примитивов, можно переводить из одного типа в другой 
------------------------------
Вопросы на понимание:
- для чего нам нужны массивы?
хранить большой объем однотипных данных под одним именем (наименованием) в контейнере-объекте

- какие типы данных могут быть в массиве?
int, double, boolean, char, byte, float, long, short, String

- в чем преимущества цикла for? недостатки?
позволяет перебирать массив по индексам, компактная запись, используется когда понятно или известно число итераций цикла, в синтаксисе for - первая строчка позволяет "задать цикл полностью". 

- надо помнить, что нумерация (индексация) массива начинается с 0. 

-------------------------------
Вопросы на знания:
имеется массив int[] array = new int[100];
- как выглядит/обратиться к 1-му элементу - array[0]
- как выглядит/обратиться к последнему элементу - array[99], array[array.length - 1]
- как выглядит/обратиться к текущему элементу - array[i], после него array[i + 1], перед ним array[i - 1]

## 2. Обсуждаем ДЗ:
- температура за прошедшую неделю
- массив четных чисел, печать в обратном порядке
- перестановка местами элементов массива
- (*) поиск максимального элемента и его индекса

Есть ли вопросы?
----------------------------------------------------------------------------

## 3. План на сегодняшнее занятие:
Массивы - продолжение:
- поиск минимального и максимального значения в массиве данных;
- поиск индекса элемента;
- заполнение массива случайными данными;
- передача массива в метод.

## 4. Практика:

**Задача 1.**
Задан массив целых чисел: 75, 34, -15, -123, 57, -145, 86, 77, 48, -59.
Найдите минимальный элемент массива и его индекс.
Каков будет результат, если в массиве несколько одинаковых минимальных элементов?
Найдите максимальный элемент массива и его индекс.
Поменяйте местами минимальный и максимальный элементы, распечатайте массив.

**Задача 2.**
Задача о "вкраплениях".
Имеется массив целых чисел, в котором несколько раз встречается число X.
Выясните, сколько раз это число встречается в массиве? На каких местах массива оно стоит?

**Задача 3.**
Смоделируйте бросок игрального кубика 20 раз. Подсчитайте, сколько раз выпала каждая грань?
Проверьте, равны ли вероятности выпадений граней кубика?

**Задача 4.**
Задайте массив из 10 случайных натуральных чисел в интервале от 1 до 100.
Запросите у пользователя какое-то натуральное число.
Определите, есть ли это число в массиве. Создайте и используйте метод
searchInArray, который получает на вход массив и искомое число, а возвращает
ответ - нашлось ли это число в массиве.






