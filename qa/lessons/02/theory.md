<details>
  <summary style="cursor: pointer;"><b>English</b></summary>

# Basic information about computers and software

## How does a computer read and store information?
- computer architecture:
- CPU,
- RAM,sdgbgbsfbs
- HDD/SSD,
- sfdbs
- Software:
- OS
- Utilities
- Application

## Programming languages, program code, compiler (interpreter)

## JVM + JDK
Java Virtual Machine is a "virtual machine" that allows you to run programs written in Java on a real machine (computer).
The same Java program can run on different devices and operating systems (such as Windows, Mac, Linux, and others), without changing the program code.
This is possible because the JVM does all the "adaptation" of the code for a specific device.

Java Development Kit is a set of tools for Java program developers. It is like a complete set of tools for a builder: it has everything you need to create, test, and run Java applications. The JDK includes a Java **compiler** (which converts code written in Java into a format understandable by the Java Virtual Machine), Java class libraries that provide various functions, such as for working with files, networks, and so on, as well as other useful tools, such as for debugging programs and optimizing them.
In short, the JDK is everything a developer needs to work with Java.

A **compiler** is a special program that translates the source code of a program written by a programmer, for example, in a programming language such as Java or C++, into machine code that can be executed on a computer.

The process of developing programs:
- writing code in an editor;
- eliminating syntax errors;
- compiling and running;
- debugging, eliminating errors;
- evaluating the result.

## Number systems - decimal, binary, etc.
https://calcus.ru/perevod-sistem-schisleniya

</details>

<hr>

<details style="padding-top: 18px">
  <summary style="cursor: pointer;"><b>На русском</b></summary>

# Базовые сведения о компьютерах и программном обеспечении

## Как компьютер считает и хранит информацию?
- архитектура компьютера:
    - CPU - central processing unit, "черный ящик"
    - RAM - random access memory
    - HDD/SSD - solid state drive
    - периферия - монитор, клавиатура, мышь, принтер, перья, планшеты и т.д.

Hardware - это все выше.

- Программное обеcпечение (Software):
    - OS - operating system (операционная система), BIOS стартует первым, "будит" ОС
    - Utilities - служебные программы, набор программ для разных целей (архиваторы, "обновители", драйверы) 
    - Application - приложения для работы
      - бухучет
      - банкинг
      - управление производством
      - логистика
      - документооборот
      - "творчество"
      - геоприложения
      - Интернет (браузеры)

## Языки программирования, программный код, компиллятор (интерпретатор)
Ада Лавлейс - первая программистка

Алан Тьринг в 1930 гг. придумал "машину"
- бесконечная ячеистая лента
- читающая и пишущая головка
- возможность записать или считать из ячейки 0 или 1 
"Игра в имитацию" (Enigma)

## JVM + JDK
Java Virtual Mashine — это "виртуальная машина", которая позволяет запускать программы, написанные на языке Java на реальной машине (компьютере).
Одна и та же Java-программа может работать на разных устройствах и операционных системах (как Windows, Mac, Linux и другие), без изменений в коде программы.
Это возможно потому, что JVM занимается всей "адаптацией" кода под конкретное устройство.

**Java Development Kit** — это набор инструментов для разработчиков программ на языке Java. Это как полный набор инструментов для строителя: в нём есть всё, что нужно для создания, тестирования и запуска Java-приложений. 

В состав JDK входят **компилятор** Java (который превращает код, написанный на языке Java, в формат, понятный Java Virtual Machine), библиотеки классов Java, которые предоставляют различные функции, например, для работы с файлами, сетью и так далее, а также другие полезные инструменты, например, для отладки программ и их оптимизации. 
Если коротко, то JDK — это всё, что нужно разработчику для работы с Java.

**Компиллятор** — это специальная программа, которая переводит написанный программистом исходный код программы, например, на языке программирования как Java или C++, в машинный код, который может исполняться на компьютере.

Процесс разработки программ:
- написание кода в редакторе (IDE);
- устранение синтаксических ошибок;
- компилляция и запуск;
- отладка, устранение ошибок;
- оценка полученного результата.

## Системы счисления - десятеричная, двоичная и пр.
   https://calcus.ru/perevod-sistem-schisleniya

десятичная, 10 - это основание системы, придумали арабы, цифры - 0, 1, 2, ..., 9
смысл цифры меняется в зависимости от ее позиции в числе
2 222
4 позиции:
2 - это тысячи
2 - это сотни
2 - это десятки
2 - это единицы

Такие системы счисления называются позиционными.

Римская, египетская - там смысл числа получается с помощью сложения написанных символов.

В двоичной системе только две цифры - 0, 1

0 = 0
1 = 1
10(2) = 2(10)
11(2) = 3(10)
100(2) = 4(10)
... 


-------------------------------------------------------------------------
Дополнительный материал:

# Первая программа

Изучать язык программирования обычно начинают с программы 'Hello, World!', которая выводит этот текст на экран.
```console
Hello, World!
```
На языке Java эта программа будет выглядеть так:
```java
  class Main { 
      public static void main(String[] args) {
          System.out.println("Hello, World!");
      }
  }
```

Текст *Hello, World!* появится на экране благодаря команде `System.out.println()`, где `println()` - это сокращение от английского *print line*. 
Она выводит на экран текст, который указан в скобках. 
В данном случае строку `("Hello, World!")`. 
Строка всегда обрамляется двойными кавычками "". 
Если этого не сделать, то компилятор укажет на синтаксическую ошибку.

# Важные моменты в синтаксисе языка Java

**Чувствительность к регистру**
– язык Java чувствителен к регистру, то есть идентификатор Hello и hello имеют разный смысл.

Название всех классов – **первая буква должна быть в верхнем регистре**.

# camelCase - правила наименования переменных и методов
Если несколько слов используются, чтобы сформировать название класса, первая буква каждого внутреннего слова
должна быть в верхнем регистре, например, `MyJavaClass`

Название методов – в синтаксисе Java все имена методов должны начинаться с буквы нижнего регистра. 
Если несколько слов используются, чтобы сформировать имя метода, то
первая буква каждого внутреннего слова должна быть в верхнем регистре, например, `myMethodName()`

**Название файла программы = название класса**
– наименование файла программы должно точно совпадать с именем класса.
При сохранении файла, Вы должны сохранить его, используя имя класса (помните о чувствительности к регистру)
и добавить «.java» в конце имени (если имена не совпадают, Ваша программа не будет компилироваться). 
Например:
`MyJavaProgram` – это название класса, 
тогда файл должен быть сохранен как `MyJavaProgram.java`

`public static void main(String args[])` – обработка программы начинается с метода main(), который является обязательной
частью каждой программы.

**Идентификаторы** – это имена, используемые для классов, переменных и методов.
Все компоненты Java требуют имена.
Каждый идентификатор должен начинаться с букв латинского алфавита от a до z, символа '$' или '_'.
После первого символа далее идентификатор может иметь любую комбинацию символов. 
Ключевое (служебное) слово языка не может быть использовано в качестве идентификатора.
Идентификатор в Java чувствителен к регистру!

Пример правильного написания: age, $salary, _value, __1_value. 
Пример неправильного написания: 123abc, -salary.

**Ключевые (служебные) слова**
Всего зарезервировано 50 служебных слов в Java.

Список ключевых слов по алфавиту:
abstract assert boolean break byte case catch char class const continue default do double else enum extends
final finally float for goto if implements import instanceof int interface long native new package private
protected public return short static strictfp super switch synchronized this throw throws transient try
void volatile while

**Важно!** Ключевое слово не может быть употреблено в качестве константы или переменной, или любых других
имен идентификаторов.

**Полезно!** Составить свой мини-словарь с переводом ключевых слов.

</details>
