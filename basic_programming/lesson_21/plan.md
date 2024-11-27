<h3 style="text-align: center; padding-bottom: 14px">2024-02-02</h3>

# Lesson plan #21 10/10/2024:

## 1. What we did in the last lesson:
- studied wrapper classes
- implemented an application with command line arguments

## 2. Discussing homework:
- sum of numbers from the entered string;
- "processing" the entered sentence;
- minimum/maximum numeric values ​​of primitive types, application with command line arguments.

Any questions?
----------------------------------------------------------------------------

## 3. Plan for today's lesson:
- User class
- email and password validation methods
- Unit testing based on the JUnit library

## 4. Practice:

Create a User class, fields:
- email
- password
  develop class methods that validate the correctness of
- email
- password
  in the constructor of the created User class object.

- email requirements:
1) @ exists and only one
2) dot after @ User
3) after last dot 2 or more symbols
4) alphabetic, digits, '_', '-', '.', '@'

- password requirements:
1) length >= 8
2) min one digit
3) min one symbol in upperCase
4) min one symbol in lowerCase
5) min one special symbol (!%@$&)

4. Practice:
- implementation of the User class, email and password validation methods
- testing the methods using tests

___


## Следующие темы:
**L15 - класс String и его методы
L16 - введение в ООП: классы, объекты, поля и методы, инкапсуляция
L17 - технология Git
L18 - абстрагирование, конструкторы и полиморфизм, наследование
L19 - сравнение объектов, стандартные методы классов (equals и hashCode)
L20 - классы-обертки (wrapper-classes)**
L21 - Unit-тестирование, TDD approach 
L22 - повторение


# План занятия №21 09.10.2024:

## 1. Что мы сделали на прошлом занятии:
- изучали классы-обертки (wrapper classes)
- реализовали приложение с аргументами командной строки

## 2. Обсуждаем ДЗ:
- сумма чисел из введенной строки;
- "обработка" введенного предложения;
- минимальные/максимальные числовые значения примитивных типов, приложение с аргументами командной строки.

Есть ли вопросы?
----------------------------------------------------------------------------

## 3. План на сегодняшнее занятие:
- класс User
- методы валидации e-mail и password
- Unit - тестирование на базе библиотеки JUnit

## 4. Практика:

Задача о сумме чисел из строки с применением TDD.

Валидация email и password 

Создать класс User, поля:
- email
- password
разработать методы класса, которые валидируют правильность 
- email
- password
в конструкторе создаваемого объекта класса User. 

- требования к email:
  1) @ exists and only one
  2) dot after @ User
  3) after last dot 2 or more symbols
  4) alphabetic, digits, '_', '-', '.', '@'

- требования к password:
  1) length >= 8
  2) min one digit
  3) min one symbol in upperCase
  4) min one symbol in lowerCase
  5) min one special symbol (!%@$&)

4. Практика:
- реализация класса User, методы валидации email и password
- проверка работы методов с помощью тестов 

