<h3 style="text-align: center; padding-bottom: 14px">2024-02-02</h3>

# Lesson plan #16 01/10/2024:

## 1. What we did in the last lesson:
- looked at the String class and its methods:

- length() - returns the length of the string, type ...

- charAt(int position) - returns the character at the specified position, type ...

- indexOf(String str), indexOf(char c), lastIndexOf(String str), lastIndexOf(char c) - return indices or parts of the string ???, type ...

- substring(int start, int end) - returns a part of the string, start is included, end is not included, type ...

- replace( str1, str2) - replaces str1 with str2

Example: Electrification str1 = "fic", replacement with str2 = "kif" => Electrification

- toUpperCase() and toLowerCase() - changes the case, returns type ...

- equalsIgnoreCase(String str) - returns True or False, type ...

- split(String regex) - performs convert **string** to **array**

## 2. Discussing homework:
- work/practice with a string;
- counting words in a sentence.

Any questions?
------------------------------------------------------------

## 3. Plan for today's lesson:

OOP is the next generation programming paradigm.

Classes, objects and their fields, methods.

We will study:
- how to define object fields in a class;
- what is an object constructor and what is it for;
- getters and setters - methods for getting and setting object field values;
- toString or display method for displaying a class object in the console.

**OOP principles:**
- abstraction;
- encapsulation;
- polymorphism;
- inheritance

## 4. Practice:

- create a Car class, move() method. Сreate a CarAppl class, in which there are several objects of the Car type.

- we create a class Employee:
- fields
- constructor
- getters and setters
- display method

- create a class FirmaAppl, in which:
  - create objects of the Employee type
  - define the salary and calculate its total amount.

___

# План занятия №16 01.10.2024:

## 1. Что мы сделали на прошлом занятии:
- рассмотрели класс String и его методы:

  - length() - возвращает длину строки, тип int (Integer)
  
  - charAt(int position) - возвращает символ на указанной позиции, тип char

  - indexOf(String str), indexOf(char c), lastIndexOf(String str), lastIndexOf(char c) - возвращают индексы, тип int

  - substring(int start, int end) - возвращает часть строки, start - входит, end - не входит, тип String

  - replace( str1, str2) - выполняет замену str1 на str2, возвращает тип String

  Пример: Электрофикация str1 = "фик", замена на str2 = "киф"  => Электрокифация

  - toUpperCase() и toLowerCase() - меняет регистр, возвращает тип String

  - equalsIgnoreCase(String str) - возвращает True или False, тип boolean

  - str.split(String regex) - выполняет преобразование **строки** в **массив с элементами типа String**

Дополним этот список:
.startWith - возвращает тип boolean
.endWith - возвращает тип boolean


## 2. Обсуждаем ДЗ:
- работа/практикум cо строкой;
- подсчет слов в предложении.

Есть ли вопросы?
----------------------------------------------------------------------------

## 3. План на сегодняшнее занятие:

ООП - парадигма программирования следующего поколения.

Классы, объекты и их поля, методы. 
Мы изучим:
- как определять поля объекта в классе;
- что такое конструктор объекта и для чего он нужен;
- геттеры и сеттеры - методы для получения и установки значений полей объекта;
- метод toString или display для отображения объекта класса в консоли.

**Принципы ООП:**
- абстрагирование;
- инкапсуляция;
- полиморфизм;
- наследование

## 4. Практика:

- создадим класс Car, метод move(). Создаем класс CarAppl, в нем несколько объектов типа Car.

- создадим класс Employee (работник):
  - поля
  - конструктор
  - геттеры и сеттеры
  - метод display

- создадим класс FirmaAppl, в котором:
  - создаем объекты типа Employee
  - определим зарплату и вычислим ее общую сумму.









