<h3 style="text-align: center; padding-bottom: 14px">2024-02-02</h3>

# Lesson plan #18 10/07/2024:

## 1. What we did in the last lesson:
- Continued to study the principles of OOP:
- **abstraction**
- **encapsulation**
- **polymorphism**
- inheritance

- Implemented the BankAccount class:
- fields: account, owner, bank, branch, balance
- created several constructors for different needs (**this is an illustration of polymorphism**)
- implemented the deposit() and withdraw() methods in the BankAccount class
- created several BankAccount objects using different constructors
- default value for primitives
- int
- double
- String
- called, tested methods on the created objects

## 2. Discussing homework:
- Book class and its constructors
- Cube class and its methods
- IbanCode class and its methods:
- lengthCode(String code), which returns the number of characters in the account
- controlCode(String code), which returns the sum of the ASCII codes of the first two characters
- isValid(String code), which checks the barcode for the correct number of characters

Any questions?
--------------------------------------------------------------------------

## 3. Today's lesson plan:

- Topic: inheritance, see Theory.
- using arrays and objects.

## 4. Practice:

**Task 1.**
Practicing Abstraction.
Define a set of fields for the class:
- Company

- Tree

- Building

- Letter

- User

**Task 2.**
Class HumanBeing
boolean Gender;
double height;
double weight;
String race;
String country;
String eyeColor;

Child classes:
Citizen **extends** HumanBeing
String passportId;
String taxesId;
LocalDate birthDay;
boolean criminalStatus;

Employee **extends** Citizen
int id;
double salary;
String jobTitle;
int workExperience;

Create a set of fields and constructors for objects.

**Task 3.**
Class Beverage

child classes:
Beer
Wine

Create a set of fields and constructors for objects.

**Task 4.**
Create a class Computer with fields:
- cpu
- ram
- ssd
- brand
- price

Create a child class Laptop with fields:
- weight
- hours
  extending the Computer class.

Create multiple instances of each class.

What is the total memory of all devices in the warehouse?
What is the total cost of all devices in the warehouse?

___

# План занятия №18 07.10.2024:

## 1. Что мы сделали на прошлом занятии:
- Продолжили изучать принципы ООП:
  - **абстрагирование**
  - **инкапсуляция**
  - **полиморфизм**
  - наследование 

- Реализовали класс BankAccount:
  - поля: account, owner, bank, branch, balance
  - создали несколько конструкторов под разные нужды (**это иллюстрация полиморфизма**)
  - реализовали методы deposit() и withdraw() в классе BankAccount
  - создали несколько объектов типа BankAccount с помощью разных конструкторов
    - значение для примитивов **по умолчанию** (by default)
      - int - 0
      - double - 0.0
      - String - null (пустая ссылка)
  - вызвали, опробовали методы на созданных объектах 

## 2. Обсуждаем ДЗ:
- класс Book и его конструкторы
- класс Cube и его методы (sumPerimeter, sumArea, sumVolume) 
- класс IbanCode и его методы:
  - lengthCode(String code), который возвращает количество символов в счете
  - controlCode(String code), который возвращает сумму ASCII-кодов первых двух символов
  - isValid(String code), который проверяет штрих-код на правильное количество символов

Есть ли вопросы?
----------------------------------------------------------------------------

## 3. План на сегодняшнее занятие:

- Тема: наследование, см. раздел Теория.
- использование массивов и объектов.

## 4. Практика:

**Задание 1.**
Тренируем Абстрагирование.
Задайте набор полей для класса:
- компания (Company)

- дерево (Tree)

- здание (Building)

- письмо (Letter)

- пользователь (User)


**Задание 2.**
Class HumanBeing

boolean Gender;
double height;
double weight;
String race;
String country;
String eyeColor;

дочерние классы:
Citizen **extends** HumanBeing
String passportId;
String taxesId;
LocalDate birthDay;
boolean criminalStatus;

Employee **extends** Citizen
int id;
double salary;
String jobTitle;
int workExperience;

Создать набор полей и конструкторы для объектов.

**Задание 3.**
Class Beverage (Напиток)

дочерние классы:
Beer
Wine

Создать набор полей и конструкторы для объектов.

**Задание 4.**
Создать класс Computer c полями:
- cpu
- ram
- ssd
- brand
- price
  
Создать дочерний класс Laptop с полями:
- weight
- hours
  расширяющий класс Computer.
  
Создать несколько экземпляров каждого класса.
  
Какой общий объем памяти у всех устройств на складе?
Какова общая стоимость всех устройств на складе?

  