<h3 style="text-align: center; padding-bottom: 14px">2024-02-02</h3>

Interview Questions## Next Topics:

**L23 - Library application, CRUD operations
L24 - RegEx, String vs StringBuilder
L25 - Abstract classes and abstract methods
L26 - Interfaces
L27 - Iteration and anchoring
L28 - Selecting elements from an array that satisfy a given condition, Predicate interface**
L29 - Generics
L30 - Comparable<T> and Comparator<T> for sorting an array of objects
L31 - Arrays class and its methods
L32 - Iteration and anchoring

# Lesson plan #29 10/22/2024:

## 1. What we did in the last lesson:
- for Employee-Company implemented the methods:
* totalSalary
* totalSales
  and tests for them.

- developed the application according to the UML diagram
  Car-Garage

## 2. Discussing homework:
method averageSalary for Employee-Company
methods:
* Employee[] findEmployeeHoursGreaterThan(int hours);
* Employee[] findEmployeeSalaryRange(double min, double max);
  and tests for them.

Any questions?

----------------------------------------------------------------------------

## 3. Plan for today's lesson:

- finish developing the Car-Garage application according to the UML notation
- the concept of Generic (acquaintance) and the Predicate<T> interface

- Generics - meaning and application;
- using generics in Comparable<T> and Comparator<T> interfaces to sort an array of objects.

## 4. Practice:
- finishing the development of the application according to the UML diagram
  Car-Garage: methods for selecting elements from an array that satisfy a given condition.

- sorting an array of Wine objects:
- by year of production
- alphabetically
- by cost
- by type

___


## Следующие темы:

**L23 - приложение Library, CRUD-операции
L24 - RegEx, String vs StringBuilder**
**L25 - Абстрактные классы и абстрактные методы
L26 - Интерфейсы**
**L27 - Повторение и закрепление**
**L28 - Выборка элементов из массива, удовлетворяющих заданному условию, интерфейс Predicate**
L29 - Generics (дженерики)
L30 - Comparable<T> и Comparator<T> для сортировки массива объектов
L31 - класс Arrays и его методы
L32 - Повторение и закрепление


# План занятия №29 22.10.2024:

## 1. Что мы сделали на прошлом занятии:
- для Employee-Company реализовали методы:

    * totalSalary: ключевой алгоритм - запустить цикл и "обежать" весь массив объектов и выполняем требуемые вычисления.
    totalSalary += employees[i].calcSalary()

  * totalSales: ключевой алгоритм - искомое поле есть в дочернем классе и нет в классе-родителе, поэтому в ходе цикла
  нам надо отобрать те объекты, которые instanceof Class, делаем безопасный кастинг и получаем доступ к полю и методам.
  
  и тесты к ним.

- разрабатывали приложение согласно UML-схеме
  Car-Garage


## 2. Обсуждаем ДЗ:
- метод averageSalary для Employee-Company

- методы:
*   Employee[] findEmployeeHoursGreaterThan(int hours);
*   Employee[] findEmployeeSalaryRange(double min, double max);
и тесты к ним.

Есть ли вопросы?

----------------------------------------------------------------------------

## 3. План на сегодняшнее занятие:

- закончить разработку приложения Car-Garage согласно UML-нотации
  - понятие Generic (знакомство) и интерфейс Predicate<T>

- Generics - смысл и применение;
- использование generics в интерфейсах Comparable<T> и Comparator<T> для сортировки массива объектов.

## 4. Практика:
- заканчиваем разработку приложения согласно UML-схеме
  Car-Garage: методы для отбора элементов из массива, удовлетворяющих заданному условию.

- сортируем массив объектов типа Wine:
  - по году производства
  - по алфавиту
  - по стоимости
  - по типу







