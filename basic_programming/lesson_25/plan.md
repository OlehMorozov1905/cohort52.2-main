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


# Lesson plan #25 10/16/2024:

## 1. What we did in the last lesson:
We learned what CRUD operations are.

Learned that we use the architecture - "multilayer monolithic application":
- model
- controller
- test

Developed an application for managing the Library:
- Created the Book class
- fields
- id = isbn
- author
- title
- year

- constructor (with ISBN length control of 13 digits)
- allows you to create an object, this is a METHOD
- equals & hashCode - methods for identifying objects by the composition of fields
- toString
  =====================================================
- Created the Library class
- fields
- Book[] - for storing entities (books)
- int size - the current number of entities in the array (array fullness)
- constructor for an object of the Library type
- library
- methods (CRUD):
- printing a list of all books in the library (a la toString);
- getting the number of books in the library;
- searching for a book by ISBN;
- adding a book to the library taking into account the requirements:
- do not add null
- do not add a duplicate
- do not add more than the library can accommodate.
- deleting a book from the library.

Implemented **a set of tests** for the above methods.

## 2. Discussing homework:
- Document - Archive application (similar to Library)

Any questions?
-----------------------------------------------------------

## 3. Plan for today's lesson:

- String and StringBuilder
- String class: the concept of "immutable"
- mutable data types
- StringBuilder class
- String vs StringBuilder

- RegEx (regular expressions)

## 4. Practice:

**Task 1.**
Create a BookAppl class in which, using the methods of the Library class:
- create a Library type object for 5-6 books;
- add 1-2 more books to the library;
- get the current size of the library (number of books);
- print all the books in the library;
- check the operation of the book search method by ISBN;
- delete a book from the library;
- check the number of books after deletion and print the available books.

**Task 2.**
- test-drive StringBuilder methods
- do a performance test: String vs StringBuilder

**Task 3.**
- do exercises on using RegEx

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


# План занятия №25 16.10.2024:

## 1. Что мы сделали на прошлом занятии:
Изучили, что такое CRUD-операции.

Узнали, что мы используем архитектуру - "многослойное монолитное приложение":
- model
- controller
- test

Разработали приложение для управления Библиотекой:
- Создали класс Book
  - поля
    - id = isbn
    - author
    - title
    - year

  - конструктор (с контролем длины ISBN 13 цифр)
    - позволяет создавать объект, это МЕТОД
  - equals & hashCode - методы для идентификации объектов по составу полей 
  - toString
==================================================
- Создали класс Library
  - поля
    - Book[] - для хранения сущностей (книги)
    - int size - текущее количество сущностей в массиве (заполненность массива)
  - конструктор для объекта типа Library
    - library
  - методы (CRUD):
    - печать списка всех книг в библиотеке (a la toString);
    - получение кол-ва книг в библиотеке;
    - поиска книги по ISBN;
    - добавление книги в библиотеку с учетом требований:
      - не добавлять null
      - не добавлять дубликат
      - не добавлять больше, чем может вместить в себя библиотека.
    - удаление книги из библиотеки.

Реализовали **набор тестов** для вышеуказанных методов.


## 2. Обсуждаем ДЗ:
- приложение Document - Archive (по аналогии с Библиотекой)

Есть ли вопросы?
----------------------------------------------------------------------------

## 3. План на сегодняшнее занятие:

- String и StringBuilder
  - класс String: понятие "immutable"
  - mutable типы данных
  - класс StringBuilder
  - String vs StringBuilder

- RegEx (регулярные выражения)

## 4. Практика:

**Задание 1.**
Создать класс BookAppl, в котором используя методы класса Library:
- создать объект типа Library на 5-6 книг;
  - добавить в библиотеку еще 1-2 книги;
  - получить текущий размер библиотеки (кол-во книг);
  - напечатать все книги, имеющиеся в библиотеке;
  - проверить работу метода поиска книги по ISBN;
  - удалить какую-нибудь книгу из библиотеки;
  - проверить количество книг после удаления и распечатать имеющиеся книги.

**Задание 2.**
- проводим test-drive методов  StringBuilder
- делаем тест производительности: String vs StringBuilder

**Задание 3.**
- делаем упражнения на использование RegEx



