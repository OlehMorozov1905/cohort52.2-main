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

# Lesson plan #32 10/25/2024:

## 1. What we did in the last lesson:
- created a City class, sorted by the number of population
- sorted the list alphabetically
- used Arrays.binarySearc to search for array elements
- inserted a city into the array, preserving its sorting order

## 2. Discussing homework:
- own class - sorting, searching, inserting
- Car-Garage - adding methods for getting sorted lists via the Garage interface.

Any questions?

---------------------------------------------------------------------------

## 3. Today's lesson plan:

- Enum - enumerated type in Java

4. Practice:
   **Task 1.**
   Closing the "leftovers" for the week:
- Check the operation of the Arrays.copyOf method
- Check the operation of the Arrays.copyOfRange method

**Task 2.**
Refactor the Employee-Company application:
- remove method - use System.arraycopy
- findEmployeesHoursGreaterThan method - use lambda expression
- findEmployeesSalaryRange method - use lambda expression

## Practice on Enum:
**Task 1.**
Set ENUM seasons - seasons of the year (Summer, Autumn, Winter, Spring)
Try it out on it methods:
.VALUES()
.toString
.ordinal()
.valueOf()

**Task 2.**
Set Emun Month, determine the months, their names and the number of days in them.
Implement a method that allows you to add months to the selected one, getting the correct month.
Example: AUG + 6 month = FEB
Check the method in the application.

**Task 3.**
Using enum, write a program to sell 4 types of coffee:
ESPRESSO,
AMERICANO,
CAPPUCCINO,
LATTE
Offer the user a choice of coffee, based on the selection, inform the cost of the drink.

___


## Следующие темы:

**L23 - приложение Library, CRUD-операции
L24 - RegEx, String vs StringBuilder**
**L25 - Абстрактные классы и абстрактные методы
L26 - Интерфейсы**
**L27 - Повторение и закрепление**
**L28 - Выборка элементов из массива, удовлетворяющих заданному условию, интерфейс Predicate**
**L29 - Generics (дженерики)
L30 - Comparable<T> и Comparator<T> для сортировки массива объектов**
**L31 - класс Arrays и его методы**
L32 - Повторение и закрепление


# План занятия №32 25.10.2024:

## 1. Что мы сделали на прошлом занятии:
- создали класс City, сортируемый по количеству начеления
- отсортировали список по алфавиту
- пользовались Arrays.binarySearch для поиска элементов массива
- использовали System.arraycopy() - 5 аргументов (полиморфизм)
- вставили город в массив, сохраняя порядок его сортировки

## 2. Обсуждаем ДЗ:
- собственный класс - сортировка, поиск, вставка
- Car-Garage - добавление методов для получения сортируемых списков через интерфейс Garage.

Есть ли вопросы?

----------------------------------------------------------------------------

## 3. План на сегодняшнее занятие:

- Enum - перечисляемый тип в Java

4. Практика:
**Задание 1.**
 Закрываем "остатки" за неделю:
- Проверьте работу метода Arrays.copyOf
- Проверьте работу метода Arrays.copyOfRange

**Задание 2.**
Выполните рефакторинг приложения Employee-Company:
- метод remove - использовать System.arraycopy
- метод findEmployeesHoursGreaterThan - использовать лямбда-выражение
- метод findEmployeesSalaryRange - использовать лямбда-выражение

## Практикум по Enum:
**Задача 1.**
Задать ENUM seasons - времена года (Summer, Autumn, Winter, Spring)
Опробовать на нем методы:
.VALUES()
.toString
.ordinal()
.valueOf()

**Задача 2.**
Задайте Emun Month, определите месяца, их наименования и количество в них дней.
Реализуйте метод, позволяющий прибавлять месяца к выбранному, получая правильный месяц.
Пример: AUG + 6 month = FEB
Проверьте работу метода в приложении.

**Задача 3.**
Используя enum, напишите программу для продажи 4-х видов кофе:
ESPRESSO,
AMERICANO,
CAPPUCCINO,
LATTE
Предложите пользователю кофе на выбор, по результатам выбора сообщите стоимость напитка.





