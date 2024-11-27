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


# Lesson plan #26 10/17/2024:

## 1. What we did in the last lesson:
- implemented the LibraryApplication application:
- created an object of the Library type, created an array Book[6], added 4 books to it (objects of the Book type) ;
- added 1 more book to the library;
- got the current size of the library (the total number of books);
- printed a list of books available in the library;
- checked the operation of the method for deleting a book by ISBN;
- check the number of books after deletion and printed the remaining books.

- test-drive the StringBuilder class and its methods
- compare the speed of String vs StringBuilder (100,000 meow)

- study the "sub-language" RegEx (Regular Expression)

## 2. Discussing homework:
RegEx for checking:
a) Credit card number (8-16 digits)
b) Date (Format: DD.MM.YYYY)
c) Date (Format: YYYY-MM-DD)
d) Phone Number (Format: +99(99)9999-9999)
e) Number less and equals 255 (positive)

Any questions?
-----------------------------------------------------------

## 3. Plan for today's lesson:
- Abstract classes and abstract methods
- Interfaces
  Their use for application development.

## 4. Practice:
**Action plan:**
- create an **abstract** Employee class and define an
  abstract method calcSalary() in it;

- create child classes Manager, SalesManager and Worker, implement salary calculation methods in them:

- Manager: base + grade*hours

- SalesManager: salesValue * percent

- Worker: grade*hours

- create a Company interface and define a set of methods for the "company" in it:
- add an employee +
- find an employee by id +
- update an employee +
- delete an employee +
- print a list of employees +
- number of employees +
- payroll volume
- sales volume
- create a CompanyImpl class, fields:
- Employee[]
- size
- inherit methods from the Company interface (implements), **BUT do not implement**
- create CompanyImplTest and implement tests for methods
- implement methods in the CompanyImpl class


___


## Следующие темы:

**L23 - приложение Library, CRUD-операции
L24 - RegEx, String vs StringBuilder**
L25 - Абстрактные классы и абстрактные методы
L26 - Интерфейсы
L27 - Повторение и закрепление
L28 - Выборка элементов из массива, удовлетворяющих заданному условию, интерфейс Predicate
L29 - Generics (дженерики)
L30 - Comparable<T> и Comparator<T> для сортировки массива объектов
L31 - класс Arrays и его методы
L32 - Повторение и закрепление

# План занятия №27 18.10.2024:

## 1. Что мы сделали на прошлом занятии:
- реализовали приложение LibraryApplication:
  - создали объект типа Library, создали массив Book[6], добавили в него 4 книги (объекты типа Book) ;
  - добавили в библиотеку еще 1 книгу;
  - получили текущий размер библиотеки (общее кол-во книг);
  - напечатали список книг, имеющихся в библиотеке;
  - проверили работу метода удаления книги по ISBN;
  - проверить количество книг после удаления и распечатали оставшиеся книги.

- провели тест-драйв класса StringBuilder и его методов
- сравнили по скорости работы String vs StringBuilder (100 000 meow)

- изучили "суб-язык" RegEx (Regular Expression)

## 2. Обсуждаем ДЗ:
RegEx для проверки:
    a) Credit card number (8-16 digits)
    b) Date (Format: DD.MM.YYYY)
    c) Date (Format: YYYY-MM-DD)
    d) Phone Number (Format: +99(99)9999-9999)
    e) Number less and equals 255 (positive)

Есть ли вопросы?
----------------------------------------------------------------------------

## 3. План на сегодняшнее занятие:
- Абстрактные классы и абстрактные методы
- Интерфейсы
Их применение для разработки приложений.

## 4. Практика:
**План действий:**
- создать **абстрактный** класс Employee и определить в нем 
абстрактный метод calcSalary();

  - создать дочерние классы Manager, SalesManager и Worker, реализовать в них методы начисления зарплаты:
  
    - Manager: base + grade*hours
    
    - SalesManager: salesValue * percent
    
    - Worker: grade*hours
    
  - создать интерфейс Company и определить в нем набор методов для работы "компании":
    - добавление сотрудника +
    - нахождение сотрудника по id +
    - обновление cотрудника +
    - удаление сотрудника +
    - печать списка сотрудников + 
    - кол-во сотрудников +
    - объем ФОТ
    - объем продаж
  - создать класс CompanyImpl, поля:
    -   Employee[]
      - size
    - методы наследуем из интерфейса Company (implements), **НО не реализуем**
    - создать CompanyImplTest и реализовать тесты для методов 
    - реализовать методы в классе CompanyImpl







