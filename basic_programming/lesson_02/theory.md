<details>
  <summary style="cursor: pointer;"><b>English</b></summary>

# Algorithm and its properties
**Algorithm** is a _clear_ _sequence_ of _actions_, the execution of which gives some pre-known _result_.

**Main properties of the algorithm:**
1. Accuracy
2. Unambiguity
3. Universality
4. Consistency
5. Effectiveness, finiteness

# Java

## Java programming language
**Java** is a high-level programming language, originally developed by Sun Microsystems and released in 1995.
It works on various platforms, such as Windows, Mac OS, and various versions of UNIX.
Java is a high-level, classical programming language.

Two key properties of the Java language:
1. Strict typing, all input variables must have their own type;
2. Strict implementation of OOP (object-oriented programming) principles, which means that programming in Java is mainly built around objects and classes.

**Java** is a general-purpose programming language designed to allow programmers to write code once and run it on any platform or architecture (WORA).

## Syntax Features

### Naming (Identifiers)
**All Java components require a name.**
Each identifier must begin with "A" through "Z" or "a" through "z", "$" or "_".
After the first character, it can have any combination of characters. A keyword cannot be used as an identifier.

**Important!!!** - identifier in Java is case-sensitive!
- Java is case-sensitive, that is, the identifier Hello and hello have different meanings.
  x, X are different identifiers!

Example of correct spelling: age, $salary, _value, __1_value.

Example of incorrect spelling: 123abc, -salary (names cannot start with 0 through 9 or special characters).

In Java, as in all programming languages, **there cannot be two identical identifiers**, the compiler will show an error.

### Class Names
– All class names **must have an uppercase first letter**.

### Compound Names
If multiple words are used to form a class name, the first letter of each inner word
must be uppercase, for example, "MyJavaClass".

Method and Variable Names – In Java syntax, all method names must begin with **a lowercase letter**.

If multiple words are used to form a method name or variable name, then
the first letter of each inner word must be uppercase, for example, "myMethodName()", and the very first letter must be lowercase.

**Program File Name = Class Name**
– The program file name must exactly match(!) the class name.
When saving a file, you should save it using the class name (remember about case sensitivity) and add ".java" at the end of the name (if the names do not match, your program will not compile), for example,
"MyJavaProgram" is the name of the class, then the file should be saved as "MyJavaProgram.java".

This naming style is called **CamelCase**.

**The main() method**

`public static void main(String args[]){

}
`
– the program processing starts with the main() method, which is a mandatory part of every program.

**Keywords**
A total of **50 service (keywords)** words are reserved in Java.

List of keywords in alphabetical order:

abstract assert boolean break byte case catch char class const continue default do double else enum extends
final finally float for goto if implements import instanceof int interface long native new package private
protected public return short static strictfp super switch synchronized this throw throws transient try
void volatile while

**Important!** The keyword cannot be used as a constant or variable, or any other
identifier names.

## Java Program Structure

The structure of a Java program consists of several key components that together form a complete application.

Here are the main elements:

1. **Packages**:
- Packages are used to group related classes and interfaces. This helps organize project files and makes libraries and classes easier to access.

2. **Classes**:
- All functions and variables are in classes. Each Java file typically contains one public class, whose name is the same as the file name.

3. **Methods**:
- Functions in Java are called methods. They can perform certain actions and return a result. Every Java program starts with a call to the `main` method.

4. **Variables**:
- Variables are used to store data. In Java, the type of each variable must be declared.

5. **Constants**:
- Used to store values ​​that should not change during program execution.

6. **Comments**:
   //
   /*

*/
- Allows you to leave notes and descriptions in the code without affecting its execution.

# Methods

**Methods** are the main "building blocks" in Java, which make up the "code" for implementing various functionalities.

DRY (Don't repeat yourself) is the main principle of software development.

# Number systems (additional material)

1. **Decimal system (base 10):**
- **Base:** 10
- **Digits:** 0, 1, 2, 3, 4, 5, 6, 7, 8, 9
- **Example:** 365 (3 * 10^2 + 6 * 10^1 + 5 * 10^0)
- **Application:** Widely used in everyday life. All arithmetic operations (addition, subtraction, multiplication, division) are performed in the decimal system.

2. **Binary (base 2):**
- **Base:** 2
- **Digits:** 0, 1
- **Example:** 1101 (1 * 2^3 + 1 * 2^2 + 0 * 2^1 + 1 * 2^0)
- **Use:** Used in computers and digital electronics because binary data is naturally represented in electronic systems (0 - no voltage, 1 - voltage).

3. **Octal (base 8):**
- **Base:** 8
- **Digits:** 0, 1, 2, 3, 4, 5, 6, 7
- **Example:** 53 (5 * 8^1 + 3 * 8^0)
- **Use:** Rarely used in programming, but may be encountered in certain contexts. Often used in UNIX systems to represent file permissions.

4. **Hexadecimal (base 16):**
- **Base:** 16
- **Digits:** 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, A, B, C, D, E, F (where A = 10, B = 11, C = 12, D = 13, E = 14, F = 15)
- **Example:** 1A3 (1 * 16^2 + 10 * 16^1 + 3 * 16^0)
- **Use:** Widely used in programming, especially when working with memory and colors. Convenient for representing binary data in a compact way.

These number systems have their own advantages and are used depending on the context. The decimal system is widely used in everyday life, while binary, octal and hexadecimal are often used in programming and digital engineering.

</details>

<hr>

<details style="padding-top: 18px">
  <summary style="cursor: pointer;"><b>На русском</b></summary>

# Алгоритм и его свойства
**Алгоритм** — это _четкая_ _последовательность_ _действий_, выполнение которой дает какой-то заранее известный _результат_.

**Главные свойства алгоритма:**
1. Точность
2. Однозначность
3. Универсальность
4. Последовательность
5. Результативность, конечность

# Java

## Язык программирования Java
**Java** – высокоуровневый язык программирования, изначально разработанный компанией
Sun Microsystems и выпущенный в 1995 году.
Работает на различных платформах, таких как Windows, Mac OS, а также различных версиях UNIX.
Java – это высокоуровневый, классический язык программирования. 

Два ключевых свойства языка Java:
1. Строгая типизация, все вводимые переменные должны иметь свой тип;
2. Строгая реализация принципов ООП (объектно-ориентированное программирование), что означает, что программирование в Java в основном строится вокруг объектов и классов.

**Java** – это язык программирования общего назначения, предназначенный для того, чтобы программисты - могли писать код один раз и запускать на любых платформах и архитектурах (WORA).

## Синтаксические особенности

### Наименования (идентификаторы)
**Все компоненты Java требуют наличие имени.**
Каждый идентификатор должен начинаться с «A» до «Z» или «a» до «z», «$» или «_».
  После первого символа может иметь любую комбинацию символов. Ключевое слово не может быть использовано в качестве идентификатора.

**Важно!!!** – идентификатор в Java чувствителен к регистру!
– язык Java чувствителен к регистру, то есть идентификатор Hello и hello имеют разный смысл.
x, X - это разные идентификаторы!

  Пример правильного написания: age, $salary, _value, __1_value.

  Пример неправильного написания: 123abc, -salary (нельзя начинать имя с цифры 0 до 9 и специальных символов).

В Java, как и во всех языках программирования, **не может быть двух одинаковых идентификаторов**, компилятор покажет ошибку.

### Название классов 
– у всех названий классов **первая буква должна быть в верхнем регистре**.

### Составные наименования
Если несколько слов используются, чтобы сформировать название класса, первая буква каждого внутреннего слова
должна быть в верхнем регистре, например, «MyJavaClass».

Название методов и переменных – в синтаксисе Java все имена методов должны начинаться **с буквы нижнего регистра**. 
Если несколько слов используются, чтобы сформировать имя метода или название переменной, то
первая буква каждого внутреннего слова должна быть в верхнем регистре, например, «myMethodName()», а самая первая - в малом.

**Название файла программы = название класса**
– наименование файла программы должно точно совпадать(!) с именем класса.
При сохранении файла, Вы должны сохранить его, используя имя класса (помните о чувствительности к регистру)и добавить «.java» в конце имени (если имена не совпадают, Ваша программа не будет компилироваться), например,
«MyJavaProgram» – это название класса, тогда файл должен быть сохранен как «MyJavaProgram.java».

Этот стиль наименования называется **CamelCase**.

**Метод main()**

`public static void main(String args[]){

}
`
– обработка программы начинается с метода main(), который является обязательной частью каждой программы.

**Ключевые слова**
Всего зарезервировано **50 служебных (ключевых)** слов в Java.

Список ключевых слов по алфавиту:

abstract assert boolean break byte case catch char class const continue default do double else enum extends
final finally float for goto if implements import instanceof int interface long native new package private
protected public return short static strictfp super switch synchronized this throw throws transient try
void volatile while

**Важно!** Ключевое слово не может быть употреблено в качестве константы или переменной, или любых других
имен идентификаторов.

## Структура Программы Java

Структура программы на Java состоит из нескольких ключевых компонентов, которые совместно образуют полноценное приложение. 
Вот основные элементы:

1. **Пакеты (Packages)**:
   - Пакеты используются для группировки связанных классов и интерфейсов. Это помогает организовать файлы проекта и облегчает доступ к библиотекам и классам.

2. **Классы (Classes)**:
   - Все функции и переменные находятся в классах. Каждый файл Java обычно содержит один публичный класс, имя которого совпадает с именем файла.

3. **Методы (Methods)**:
   - Функции в Java называются методами. Они могут выполнять определенные действия и возвращать результат. Каждая программа на Java начинается с вызова метода `main`.

4. **Переменные (Variables)**:
   - Переменные используются для хранения данных. В Java тип каждой переменной должен быть объявлен.

5. **Константы (Constants)**:
   - Используются для хранения значений, которые не должны изменяться во время выполнения программы.

6. **Комментарии (Comments)**: 
//
/*

*/
   - Позволяют оставлять заметки и описания в коде, не влияя на его выполнение.

# Методы

**Методы** - главные "строительные кирпичики" в Java, для реализации различных функциональностей из которых состоит "код".

DRY (Don’t repeat yourself - не повторяйся) - основной принцип разработки программного обеспечения.


# Системы счисления (дополнительный материал)

1. **Десятичная система (основание 10):**
    - **Основание:** 10
    - **Цифры:** 0, 1, 2, 3, 4, 5, 6, 7, 8, 9
    - **Пример:** 365 (3 * 10^2 + 6 * 10^1 + 5 * 10^0)
    - **Применение:** Широко используется в повседневной жизни. Все арифметические операции (сложение, вычитание, умножение, деление) выполняются в десятичной системе.

2. **Двоичная система (основание 2):**
    - **Основание:** 2
    - **Цифры:** 0, 1
    - **Пример:** 1101 (1 * 2^3 + 1 * 2^2 + 0 * 2^1 + 1 * 2^0)
    - **Применение:** Используется в компьютерах и цифровой электронике из-за естественности представления двоичных данных в электронных системах (0 - нет напряжения, 1 - есть напряжение).

3. **Восьмеричная система (основание 8):**
    - **Основание:** 8
    - **Цифры:** 0, 1, 2, 3, 4, 5, 6, 7
    - **Пример:** 53 (5 * 8^1 + 3 * 8^0)
    - **Применение:** Редко используется в программировании, но может встречаться в определенных контекстах. Часто используется в UNIX-системах для представления прав доступа к файлам.

4. **Шестнадцатеричная система (основание 16):**
    - **Основание:** 16
    - **Цифры:** 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, A, B, C, D, E, F (где A = 10, B = 11, C = 12, D = 13, E = 14, F = 15)
    - **Пример:** 1A3 (1 * 16^2 + 10 * 16^1 + 3 * 16^0)
    - **Применение:** Широко используется в программировании, особенно при работе с памятью и цветами. Удобна для представления двоичных данных компактным образом.

Эти системы счисления обладают своими преимуществами и используются в зависимости от контекста. Десятичная система широко распространена в повседневной жизни, тогда как двоичная, восьмеричная и шестнадцатеричная часто используются в программировании и цифровой технике.

</details>
