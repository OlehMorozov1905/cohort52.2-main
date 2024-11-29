<details>
  <summary style="cursor: pointer;"><b>English</b></summary>

# Variables
- identifiers that are assigned specific values
- name with a small letter
- when declaring a variable, it is necessary (required!) to indicate the **type of data** that will be stored in this variable

Java is a strongly typed language! All variables must be explicitly declared before use, with an EXPLICIT indication of their type.

# Primitive data types:

There are **8 primitive data types** in Java:
+ byte - an integer occupies 1 byte in memory (8 bits = 8 cells that can only contain 0 or 1)
  11111111 is a number in binary number system 128
+ short (short) - an integer takes up 2 bytes in memory
+ char (character) - positive integer takes up 2 bytes in memory
+ int (integer) - an integer takes up 4 bytes in memory
  11111111 11111111 11111111 11111111
+ long (long integer) - an integer takes up 8 bytes in memory
  11111111 11111111 11111111 11111111 11111111 11111111 11111111 11111111 ...
+ float (floating) - a floating point number takes 4 bytes in memory
+ double (double precision) - a floating point number takes 8 bytes in memory

+ boolean () - a special logical type that takes one of two values: true or false

String is a non-primitive data type; it is responsible for a string (a set of characters).

# Basic arithmetic operations:
     - + addition
     - - subtraction
     - * multiplication

     - / integer division (**get the integer part from the division**)
     Examples:
         25 / 7 = 3
         37 / 6 = 6
         100 / 25 = 4
         101 / 25 = 4

     - % division with remainder (we get the remainder of the division)
     Examples:
         25% 7 = 4 (7 * 3 = 21, 25 - 21 = 4)
         37% 6 = 1
         100% 25 = 0
         101% 25 = 1

         13% 4 = 1 (3 * 4 = 12, 1 remaining)

         20% 2 = 0 is an even number
         21% 2 = 1 is an odd number

</details>

<hr>

<details style="padding-top: 18px">
  <summary style="cursor: pointer;"><b>На русском</b></summary>

# Переменные
- идентификаторы, которым присваиваются значения
- называть с маленькой буквы (length, sumOfNubers)
- при объявлении переменной необходимо (обязательно!) указывать **тип данных**, которые будут храниться в этой переменной

Java - **строго типизированный язык**! 
Переменные должны быть объявлены перед использованием с ЯВНЫМ указанием их типа.

**Примеры:**
int num;
double size;
boolean isEqual;

# Примитивные типы данных:

1 ячейка - это БИТ информации 

В Java существует **8 примитивных типов данных**:
+ byte - целое число занимает в памяти 1 байт (8 бит = 8 ячеек, которые могут содержать только 0 или 1)
  11111111 - это число в двоичной системе счисления 128
+ short (короткий) - целое число занимает в памяти 2 байта
+ char (символ) - целое положительное число занимает в памяти 2 байта
+ int (integer - целый) - целое число занимает в памяти 4 байта
  11111111 11111111 11111111 11111111
+ long (длинное целое) - целое число занимает в памяти 8 байт
  11111111 11111111 11111111 11111111 11111111 11111111 11111111 11111111 ...
+ float (плавающий) - число с плавающей точкой занимает в памяти 4 байта
+ double (двойная точность) - число с плавающей точкой занимает в памяти 8 байт

+ boolean () - специальный логический тип принимающий одно из двух значений: **true** или **false**

String - это не примитивный тип данных, отвечает за строку (набор символов), является объектом, ссылочным типом.

# Основные арифметические операции:
    - + сложение
    - - вычитание
    - * умножение

    - / деление нацело(**получаем целую часть от деления**)
    Примеры:
        25 / 7 = 3
        37 / 6 = 6
        100 / 25 = 4
        101 / 25 = 4
        38 / 5 = 7
        90 / 20 = 4
        
          27 / 5 = 5
          17 / 3 = 5

    - % деление с остатком (**получаем остаток от деления**)
    Примеры:
        25 % 7 = 4 (7 * 3 = 21 , 25 - 21 = 4)
        37 % 6 = 1
        100 % 25 = 0
        101 % 25 = 1

        13 % 4 = 1 (3 * 4 = 12, 1 в остатке)

        20 % 2 = 0 - это четное число
        21 % 2 = 1 - это число нечетное

        19 / 5 = 3 
        19 % 5 = 4

</details>
