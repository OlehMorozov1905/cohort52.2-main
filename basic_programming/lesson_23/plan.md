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


# Lesson plan #23 10/14/2024:

## 1. What we did in the last lesson:
- studied TDD
- implemented the User class, validation methods for strings:
- email
- password

## 2. Discussing homework:
- ArrayMethods and tests
- 100 random integers, methods and tests
- Address class and field validation:
- city name
- zip code

Any questions?
----------------------------------------------------------------------------

## 3. Plan for today's lesson:
CRUD operations and CRUD applications

Architecture - multi-layer monolithic application:
- model
- controller

- Application:
  Books, the library stores them.
  We need to implement:
- adding an object to an array of objects;
- removing an object from an array of objects;
- searching for an object.

## 4. Practice:
**Back 1.**
Create a Book class with the fields:
long isbn, String title, String author, int yearOfPublishing.
Check ISBN for the correct number of digits = 13.

Create a Library class with the fields:
Book[] books, int size.

Implement the class constructor.
Implement the methods:
- print a list of all books in the library;
- get the number of books in the library;
- search for a book by ISBN;
- add a book to the library taking into account the requirements:
- do not add null
- do not add a duplicate
- do not add more than the library can accommodate.
- delete a book from the library.

Create a BookAppl class, in which, using the methods of the Library class:
- create a Library object for 5-6 books;
- add 1-2 more books to the library;
- get the current size of the library (number of books);
- print all the books in the library;
- test the operation of the book search method by ISBN;
- delete a book from the library;
- check the number of books after deletion and print the existing books.

___


## Следующие темы:

L23 - приложение Library, CRUD-операции
L24 - RegEx, String vs StringBuilder
L25 - Абстрактные классы и абстрактные методы
L26 - Интерфейсы
L27 - Повторение и закрепление
L28 - Выборка элементов из массива, удовлетворяющих заданному условию, интерфейс Predicate
L29 - Generics (дженерики)
L30 - Comparable<T> и Comparator<T> для сортировки массива объектов
L31 - класс Arrays и его методы
L32 - Повторение и закрепление


# План занятия №23 14.10.2024:

## 1. Что мы сделали на прошлом занятии:
- изучали TDD
- реализовали класс User, методы-валидаторы для строк:
  - email
  - password

## 2. Обсуждаем ДЗ:
- ArrayMethods и тесты
- 100 случайных целых чисел, методы и тесты
  - подход 1: подсчитать в тесте у массива, которй стенерирован
  - подход 2: взять первый попавшийся свой массив, например, на 6 чисел
- класс Address и валидация полей:
  - название города
  - индекс

Есть ли вопросы?
----------------------------------------------------------------------------

## 3. План на сегодняшнее занятие:
CRUD-операции и CRUD-приложения

Архитектура - многослойное монолитное приложение:
- model
- controller

- Приложение:
  Книги, библиотека их хранит. 
Необходимо реализовать:
  - добавление объекта в массив объектов;
  - удаление объекта из массива объектов;
  - поиск объекта.

isbn - обеспечивает идентификацию книги.

## 4. Практика:
**Задние 1.**
Создать класс Book с полями:
long isbn, String title, String author, int yearOfPublishing.
Проверить ISBN на корректное количество цифр = 13.

Создать класс Library с полями:
Book[] books, int size.

Реализовать конструктор класса.
Реализовать методы:
- печать списка всех книг в библиотеке;
- получение кол-ва книг в библиотеке;
- поиска книги по ISBN;
- добавление книги в библиотеку с учетом требований:
  - не добавлять null
  - не добавлять дубликат
  - не добавлять больше, чем может вместить в себя библиотека.
- удаление книги из библиотеки.

Создать класс BookAppl, в котором используя методы класса Library:
- создать объект типа Library на 5-6 книг;
- добавить в библиотеку еще 1-2 книги;
- получить текущий размер библиотеки (кол-во книг);
- напечатать все книги, имеющиеся в библиотеке;
- проверить работу метода поиска книги по ISBN;
- удалить какую-нибудь книгу из библиотеки;
- проверить количество книг после удаления и распечатать имеющиеся книги.
