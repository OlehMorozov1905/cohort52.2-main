<h3 style="text-align: center; padding-bottom: 14px">2024-02-02</h3>

# Lesson plan #17 02/10/2024:

## 1. What we did in the last lesson:
OOP principles:
- abstraction;
- encapsulation;
- polymorphism;
- inheritance.

We learned what classes, objects and their fields, methods in classes are.
- how to define object fields in a class;
- what is an **object constructor** and what is it for;
- **getters** and **setters** - methods for getting and setting object field values;
- **toString** or **display** method for displaying an object in the console.

Created classes:
- Car
- Employee

Learned how to **create objects** based on classes using constructors (this is a special class method):
`Car car = new Car( "BMW, 10, 120_000, 12_500.00 );
Employee employee = new Employee(1,"Peter","Ivanov", 3000,true);`

## 2. Discussing homework:
- Pet
- Student

Any questions?
----------------------------------------------------------------------------

## 3. Plan for today's lesson:

- Topic: polymorphism.

## 4. Practice:

- Implementing the BankAccount class:
- fields: account, owner, bank, branch, balance
- creating several constructors for different needs (this is an illustration of polymorphism)
- implementing the display() and display(String greeting) methods (this is another illustration
  polymorphism)
- implement the deposit() and withdraw() methods in the BankAccount class

## 5. Git technology, using GitHub

**The essence of the technology:**
- **the programmer** develops **on his local computer** (offline), all folders (directories) of the project and

files are placed in a folder, the contents of which are tracked by git - THIS IS THE **LOCAL REPOSITORY**;

- to save the results of the work, the **REMOTE REPOSITORY** (on line) is used, where a copy of the folder with all its contents is sent when the programmer:
1. commits COMMIT (changes in the local repository) and
2. makes PUSH (sending to the remote repository);

_________________________________________________________
**Key algorithm (know how):**
Git "knows how" to track all changes that occur in the LOCAL REPOSITORY
since the last successful synchronization with the REMOTE REPOSITORY:
- folder names, their location
- file names
- changes in files (changes from 1 character)
- appearance of new folders and files in them
- etc.

Git sends the changes that occurred in the local repository to the remote repository and writes in the log when this was done.
-------------------------------------------------------

**Instructions:**

Step 1. Log in to GitHub
Step 2. Create your repository, name: Name-LastName-AIT-course-2024
- Public
- necessarily without README
  Step 3. Select a folder and create a new project in IntelliJ IDEA:
- File -> New -> Project
- give the project a name, select the folder
  Step 4. Enable Git in the project:
- in the top menu, select VCS -> Enable version control
- Git -> Manage remotes -> click +
- insert a link to your repository
  Step 5. Copy the folders with the code to the project for sending to GitHub
  Step 6. Commit and Push - send your code to GitHub

___

# План занятия №17 02.10.2024:

## 1. Что мы сделали на прошлом занятии:
Принципы ООП:
- абстрагирование;
- инкапсуляция;
- полиморфизм;
- наследование.

Узнали, что такое классы, объекты и их поля, методы в классах.
- как определять поля объекта в классе;
- что такое **конструктор** объекта и для чего он нужен;
- **геттеры** и **сеттеры** - методы для получения и установки значений полей объекта;
- метод **toString** или **display** для отображения объекта в консоли.

Создали классы:
- Car
- Employee

Научились **создавать объекты** на основе классов с помощью конструкторов (это специальный метод класса):
`Car car = new Car( "BMW, 10, 120_000, 12_500.00 );
Employee employee = new Employee(1,"Peter","Ivanov", 3000,true);`

## 2. Обсуждаем ДЗ:
- Pet
- Student


Есть ли вопросы?
----------------------------------------------------------------------------

## 3. План на сегодняшнее занятие:

- Тема: полиморфизм.

## 4. Практика:

- Реализуем класс BankAccount:
  - поля: account, owner, bank, branch, balance
  - создаем несколько конструкторов под разные нужды (это иллюстрация полиморфизма)
  - реализуем метод display() и display(String greeting) (это еще одна иллюстрация
    полиморфизма)
  - реализуем методы deposit() и withdraw() в классе BankAccount

## 5. Технология Git, использование GitHub

**Суть технологии:**
- **программист** ведет разработку **на своем локальном компьютере** (в режиме offline), все папки (директории) проекта и
  файлы помещаются в папку на его компьютере, содержание которой отслеживает git - ЭТО **ЛОКАЛЬНЫЙ РЕПОЗИТОРИЙ**;

- для сохранения результатов работы используется **УДАЛЕННЫЙ РЕПОЗИТОРИЙ** (on line), куда отправляется
  копия папки со всем ее содержимым когда программист:

  1. фиксирует COMMIT (изменения в локальном репозитории) и
  2. делает PUSH (отправку в удаленный репозиторий);

_________________________________________________________
**Ключевой алгоритм (know how):**
Git "умеет" отслеживать все изменения, которые происходят в ЛОКАЛЬНОМ РЕПОЗИТОРИИ
с момента последней успешной синхронизации с УДАЛЕННЫМ РЕПОЗИТОРИЕМ:
- названия папок, их расположение
- название файлов
- изменения в файлах (изменения от 1 символа)
- появление новых папок и файлов в них
- и т.д.

Git отправляет в удаленный репозиторий произошедшие в локальном репозитории изменения и записывает в журнал, когда это было сделано.
--------------------------------------------------------

**Инструкция:**

**Шаг 1.** Выполнить вход на GitHub

**Шаг 2.** Создать свой репозиторий, имя: Имя-Фамилия-AIT-course-2024 
- Public
- обязательно без README (галочку не ставим!)
- после создания репозитория копируем ссылку на него

- **Шаг 3.** Открываем текущий проект в IntelliJ IDEA
ИЛИ 
- создаем новый проект в IntelliJ IDEA:
- File -> New -> Project
- задаем имя проекта, выбираем папку, в которой будет лежать проект.

**Шаг 4.** Включаем в проекте Git:
- в верхнем меню выбираем VCS -> Enable version control, в этот момент названия классов в папке меняют цвет на бордовый. 
Подключаем папку к удаленному репозиторию:
- Git -> Manage remotes -> нажимаем + 
- вставляем ссылку на свой репозиторий, которую скопировали на Шаге 2, сохраняем.

**Шаг 5.** Выделяем пакеты или классы и добавляем их в Git: 
правая кнопка мыши -> Git -> +Add
Цвет имен классов должен изменится с бордового на зеленый.
 
**Шаг 6.** Делаем Commit и Push - отправляем свой код на GitHub.
Потребуется авторизация на GitHub, получение токена.
Цвет имен классов должен изменится на черный.







