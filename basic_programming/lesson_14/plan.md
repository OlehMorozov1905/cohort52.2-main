<h3 style="text-align: center; padding-bottom: 14px">2024-02-02</h3>

# Lesson plan #14 09/27/2024:

## 1. What we did in the last lesson:
- studied storing arrays and variables in computer memory;
- variables and primitives are stored in ...
- arrays are stored in ... and in ...
- arrays are ... data type

- memory overflow as a result of mathematical operations (type - int):
- maximum int = ...

- improving linear search for an element in an array;
- linear search returns ...
- if the desired element is missing, it returns ...
- linear search has computational complexity of ...

- binary search:
- binary search returns ...
- if the desired element is missing, it returns ...
- binary search has computational complexity of ...
- using binary search on an unsorted array ...

## 2. Discussing homework:
- copyOfArray method;
- toss a coin 100 times;
-

Any questions?
---------------------------------------------------------------------------

## 3. Today's lesson plan:

- bubble sort:
  https://www.youtube.com/watch?v=Iv3vgjM8Pv4&ab_channel=kamalyassin

- what have we learned and what have we learned over the past week?

## 4. Practice:
Adding methods to ArrayMethods:
- array turnaround 
- bubble sort

**Task 1.**
Create an array of 20 random integers from -100 to 100.
Sort the resulting array.
Is the number 0 in this array? (find out using binary search)
If yes, then at what place (index) in the array?
If no, then at what index should it be placed?

**Problem 2.**
Create an array of 20 random integers from the range from -100 to 100.
Implement a method that receives the original array as input and returns an array containing only positive numbers from the original array.

___

# План занятия №14 27.09.2024:

## 1. Что мы сделали на прошлом занятии:
- изучили хранение массивов и переменных в памяти компьютера;
 - переменные и примитивы хранятся в стеке
 - массивы хранятся в стеке (имя и тип массива) и в хипе (данные), они связаны с помощью ссылки
 - массивы являются **ссылочным** типом данных

- переполнение памяти в результате математических действий (тип - int):
  - максимальное int составляет 2 147 483 647
  
- совершенствуем линейный поиск элемента в массиве;
  - линейный поиск возвращает ИНДЕКС первого найденного элемента
  - в случае отсутствия искомого элемента возвращается -1
  - линейный поиск имеет вычислительную сложность O(n)

- бинарный поиск (binary search):
  - бинарный поиск возвращает ИНДЕКС найденного элемента
  - в случае отсутствия искомого элемента возвращается - leftIndex - 1 (показывает позицию для вставки)
  - бинарный поиск имеет вычислительную сложность O(log(n))
  - применение бинарного поиска на неотсортированном массиве не имеет практического смысла, результат не интерпретируется

## 2. Обсуждаем ДЗ:
- метод copyOfArray;
- 100 раз подбросить монетку;

Есть ли вопросы?
----------------------------------------------------------------------------

## 3. План на сегодняшнее занятие:

- пузырьковая сортировка (bubble sort):
  https://www.youtube.com/watch?v=Iv3vgjM8Pv4&ab_channel=kamalyassin

  - сравниваем всегда 2 соседних элемента, переставляем их местами, если они расположены не в порядке возрастания
  - цикл должен идти слева направо
  - упорядоченные элементы выключаются из цикла

- что мы узнали и чему научились за прошедшую неделю?
  - использовать методы, доставая их из класса
  - задавать массивы
  - сортировать массивы от меньшего к большему
  - искать нужные элементы массива с помощью линейного и бинарного поиска
  - сортировать массивы с помощью buble sort
  - познакомились со stack и heap
  - научились копировать массив в другой 
  - наполнять, заполнять массив случайными числами
  - суммировать элементы массива
  - получать среднее арифметическое массива 
  - искать минимальный/максимальный элемент масива и их индексы
  - умеем печатать массив
  - научились считать кол-во элементов в массиве по условию


## 4. Практика:
Добавляем методы в ArrayMethods:
- разворот массива
- пузырьковая сортировка

**Задача 1.**
Создать массив из 20-ти случайных целых чисел из интервала от -100 до 100.
Выполните сортировку полученного массива.
Попало ли число 0 в этот массив? (выяснить с помощью binary search)
Если да, то на какое место (индекс) в массиве?
Если нет, то на какой индекс его следует поставить?

**Задача 2.**
Создать массив из 20-ти случайных целых чисел из интервала от -100 до 100.
Реализуйте метод, который получает на вход исходный массив и возвращает массив,
содержащий только положительные числа из исходного массива.









