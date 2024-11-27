<h3 style="text-align: center; padding-bottom: 14px">2024-02-02</h3>

# Lesson plan #33 10/28/2024:

## What we have learned in the past two weeks, version from 10/18/2024, L27:
- learned to inherit classes, super and heirs
- use JUnit tests
- develop, define "layers, structure" of a monolithic application
- learned about wrapper classes Integer, Double, Character, Byte, Boolean and their methods parse(), etc.
- learned TDD, try to write tests before developing methods
- StringBuilder class and its methods
- mastered the code generator for creating constructor, getter and setters, toString, equals + hashCode
- learned and learned how to use ReGex
- learned CRUD operations and create methods for them
- got acquainted with the concept of "interfaces", learned how to create abstract methods
- implement interfaces (inherit methods from the interface) where they are needed
- learned GitHub
- learned how to sort objects in arrays using the Comparable and Comparator interface
- it is better to have/store arrays sorted (binarySearch)
- learned how to copy arrays of objects using System.arraycopy()
- select results from an array of objects by criterion using Predicate and lambda expressions
- continue learning how to write Comparator<T>
- use generics (now they will be all the time)
- use actively Arrays.sort and its other methods

# Lesson plan #33 10/28/2024:

## 1. What we did in the last lesson:
* Arrays class methods:
* Studied how the Arrays.copyOf method works
* Studied how the Arrays.copyOfRange method works

* Refactored the Employee-Company application:
* remove method - use System.arraycopy
* findEmployeesHoursGreaterThan method - use lambda expression
* findEmployeesSalaryRange method - use lambda expression

## 2. Discussing homework:
- application refactoring

Any questions?

----------------------------------------------------------------------------

## 3. Plan for today's lesson:

- Enum is an enumerated type in Java, see theory.

## Enum Workshop:
**Task 1.**
Set ENUM seasons - seasons of the year (Summer, Autumn, Winter, Spring)
Try the methods on it:
.VALUES()
.toString
.ordinal()
.valueOf()

**Task 2.**
Set Enum Month, define the months, their names and the number of days in them.
Implement a method that allows you to add months to the selected one, getting the correct month.
Example: AUG + 6 month = FEB
Check the method in the application.

**Task 3.**
Using enum, write a program to sell 4 types of coffee:
ESPRESSO,
AMERICANO,
CAPPUCCINO,
LATTE
Offer the user a choice of coffee, and based on the results of the selection, inform the cost of the drink.

___


## Пройденные темы:

L23 - приложение Library, CRUD-операции
L24 - RegEx, String vs StringBuilder**
L25 - Абстрактные классы и абстрактные методы
L26 - Интерфейсы
L27 - Повторение и закрепление
L28 - Выборка элементов из массива, удовлетворяющих заданному условию, интерфейс Predicate
L29 - Generics (дженерики)
L30 - Comparable<T> и Comparator<T> для сортировки массива объектов**
L31 - класс Arrays и его методы
L32 - Повторение и закрепление

## Следующие темы:
L33 - Enum - перечислимый тип
L34 - Java Time API
L35 - Album application with LocalDate field
L36 - JCF - introduction, Iterator<T>, foreach loop, iList 
L37 - List<T>, ArrayList<>()
L38 - LinkedList<>() 
L39 - Set<T>, HashSet<>()
L40 - TreeSet<>()
L41 - Map<K, V>, HashMap<>(), TreeMap<T>()
L42 - Повторение и закрепление


## Чему мы научились за прошедшие две недели, версия от 18.10.2024, L27:
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
- научились сортировать объекты в массивах с помощью интерфейса Comparable и Comparator
- массивы лучше иметь/хранить отсортированными (binarySearch)
- научились копировать массивы объектов с помощью System.arraycopy()
- отбирать результаты из массива объектов по критерию с помощью Predicate и лямбда-рыражения
- продолжаем учиться писать Comparator<T>
- используем дженерики (теперь они будут все время)
- используем активно Arrays.sort и другие его методы

# План занятия №33 25.10.2024:

## 1. Что мы сделали на прошлом занятии:
* методы класса Arrays:
  * Изучили работу метода Arrays.copyOf
  * Изучили работу метода Arrays.copyOfRange

* Выполнили рефакторинг приложения Employee-Company:
  * метод remove - использовать System.arraycopy
  * метод findEmployeesHoursGreaterThan - использовать лямбда-выражение
  * метод findEmployeesSalaryRange - использовать лямбда-выражение

## 2. Обсуждаем ДЗ:
- рефакторинг приложений

Есть ли вопросы?

----------------------------------------------------------------------------

## 3. План на сегодняшнее занятие:

- Enum - перечисляемый тип в Java, см. теорию.

## Практикум по Enum:
**Задача 1.**
Задать ENUM seasons - времена года (Summer, Autumn, Winter, Spring)
Опробовать на нем методы:
.VALUES()
.toString
.ordinal()
.valueOf()

**Задача 2.**
Задайте Enum Month, определите месяца, их наименования и количество в них дней.
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





