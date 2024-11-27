<h3 style="text-align: center; padding-bottom: 14px">2024-02-02</h3>

Interview Questions## Next Topics:

L23 - Library application, CRUD operations
L24 - RegEx, String vs StringBuilder
L25 - Abstract classes and abstract methods
L26 - Interfaces
L27 - Iteration and anchoring
L28 - Selecting elements from an array that satisfy a given condition, Predicate interface
L29 - Generics
L30 - Comparable<T> and Comparator<T> for sorting an array of objects
L31 - Arrays class and its methods
L32 - Iteration and anchoring


# Lesson plan #27 10/18/2024:

## What we have learned in the past two weeks:
- learned to inherit classes, super and theirs relatives
- use JUnit tests
- develop, define "layers, structure" of a monolithic application
- learned about wrapper classes Integer, Double, Character, Byte, Boolean and their methods parse() etc.
- learned TDD, try to write tests before developing methods
- StringBuilder class and its methods
- mastered the code generator for creating constructor, getter and setters, toString, equals + hashCode
- learned and learned how to use ReGex
- learned CRUD operations and create methods for them
- got acquainted with the concept of "interfaces", learned how to create abstract methods
- implement interfaces (inherit methods from the interface) where they are needed
- learned GitHub

## 1. What we did in the last lesson:
**Fulfilled the development plan:**

- create an **abstract** Employee class and define in it
  an abstract method calcSalary();

- create child classes Manager (extends), SalesManager and Worker, implement methods for calculating salaries in them:
* Manager: base + grade*hours
* SalesManager: salesValue * percent
* Worker: grade*hours

- create **interface** Company and define a set of methods for the "company" in it:
* adding an employee +
* finding an employee by id +
* updating an employee +
* deleting an employee +
* printing a list of employees +
* number of employees +
* payroll volume
* sales volume

- create a class CompanyImpl, add two fields:
- Employee[]
- size
- inherit methods from the Company interface (implements), **BUT do not implement**
------------------------------------------------------------------------------------

The following items remain:
* create CompanyImplTest and implement tests for methods
* implement methods in the CompanyImpl class

## 2. Discussing homework:
- abstract class Detail
- class Gear
- class Lever

Any questions?
---------------------------------------------------------------------------

## 3. Today's lesson plan:
- Abstract classes and abstract methods
- Interfaces
  Their use for application development - continued.

## 4. Practice:
The following points remain:
* implement tests for methods in CompanyImplTest
* implement methods in the CompanyImpl class

___


## Следующие темы:

**L23 - приложение Library, CRUD-операции
L24 - RegEx, String vs StringBuilder**
**L25 - Абстрактные классы и абстрактные методы
L26 - Интерфейсы**
L27 - Повторение и закрепление
L28 - Выборка элементов из массива, удовлетворяющих заданному условию, интерфейс Predicate
L29 - Generics (дженерики)
L30 - Comparable<T> и Comparator<T> для сортировки массива объектов
L31 - класс Arrays и его методы
L32 - Повторение и закрепление


# План занятия №27 18.10.2024:

## Чему мы научились за прошедшие две недели:
- научились наследовать классы, super и наследники 
- использовать JUnit тесты
- разрабатывать, определять "слои, структуру" монолитного приложения
- узнали классы-обертки Integer, Double, Character, Byte, Boolean и их методы parse() и т.д.
- изучили TDD, стараемся писать тесты до разработки методов
- класс StringBuilder и его методы
- освоили генератор кода для создания constructor, getter and setters, toString, equals + hashCode
- изучили и научились пользоваться ReGex
- изучили CRUD - операции и создавать под них методы
- познакомились с концептом "интерфейсов", научились создавать абстрактные методы
- имплементировать интерфейсы (наследовать методы из интерфейса) там, где они нужны
- освоили GitHub

## 1. Что мы сделали на прошлом занятии:
**Выполнили план разработки:**

- создать **абстрактный** класс Employee и определить в нем
  абстрактный метод calcSalary();

  - создать дочерние классы Manager (extends), SalesManager и Worker, реализовать в них методы начисления зарплаты:
    * Manager: base + grade*hours
    * SalesManager: salesValue * percent
    * Worker: grade*hours

  - создать **интерфейс** Company и определить в нем набор методов для работы "компании":
      * добавление сотрудника +
      * нахождение сотрудника по id +
      * обновление cотрудника +
      * удаление сотрудника +
      * печать списка сотрудников +
      * кол-во сотрудников +
      * объем ФОТ
      * объем продаж
    
  - создать класс CompanyImpl, добавили два поля:
          - Employee[]
          - size
          - методы наследуем из интерфейса Company (implements), **НО не реализуем**
------------------------------------------------------------------------------------ 

Остались следующие пункты:
* создать CompanyImplTest и реализовать тесты для методов
* реализовать методы в классе CompanyImpl


## 2. Обсуждаем ДЗ:
- абстрактный класс Detail
  - класс Gear
  - класс Lever

Есть ли вопросы?
----------------------------------------------------------------------------

## 3. План на сегодняшнее занятие:
- Абстрактные классы и абстрактные методы
- Интерфейсы
Их применение для разработки приложений -> продолжение.

## 4. Практика:
Остались следующие пункты:
* реализовать тесты для методов в CompanyImplTest
* реализовать методы в классе CompanyImpl







