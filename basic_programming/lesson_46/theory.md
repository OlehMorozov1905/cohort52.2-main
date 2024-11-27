<details>
  <summary style="cursor: pointer;"><b>English</b></summary>

# Java IO API

In Java IO, streams represent a sequence of data used to transfer information. An I/O stream points to an input source or an output destination, and can represent many different types of sources and destinations, such as disk files, devices, other programs, and memory arrays.

In Java, streams support many different types of data, including:
* bytes,
* primitive data types,
* objects.

### Basic Stream Classes
* **InputStream** — reads data from a source one element at a time.
* **OutputStream** — writes data to a destination one element at a time.

### Abstract Classes
* **OutputStream** — an abstract class for outputting data. Contains the `abstract void write(int b)` method, which is used to write a single byte to the stream.
* **FileOutputStream** — extends `OutputStream` and implements the `write` method, allowing bytes to be written directly to a file.

* **InputStream** — an abstract class for input data. Contains the `abstract int read()` method, which allows you to read a single byte from the stream.
* **FileInputStream** — extends `InputStream` and implements the `read` method, allowing you to read bytes from a file. If `read` returns `-1`, it means that all data from the stream has already been read.

These base classes and their methods form the basis for working with input and output streams in Java, providing convenient tools for working with files, devices, and other data sources.


</details>

<hr>

<details style="padding-top: 18px">
  <summary style="cursor: pointer;"><b>На русском</b></summary>

# Java IO API

В Java IO потоки представляют собой последовательность данных, используемую для передачи информации. Поток ввода/вывода указывает на источник ввода или пункт назначения вывода, и может быть представлен различными типами источников и направлений, такими как дисковые файлы, устройства, другие программы и массивы памяти.

В Java потоки поддерживают работу с разными типами данных, включая:
* байты (8 бит),
* примитивные типы данных,
* объекты.

### Основные классы потоков
* **InputStream** — читает данные из источника (source) по одному элементу за раз.
* **OutputStream** — записывает данные в пункт назначения (destination) по одному элементу за раз.

Oracle, javadoc

### Абстрактные классы
* **OutputStream** — абстрактный класс для вывода данных. Содержит метод `abstract void write(int b)`, который предназначен для записи одного байта в поток.
* **FileOutputStream** — расширяет `OutputStream` и реализует метод `write`, позволяя записывать байты непосредственно в файл.

* **InputStream** — абстрактный класс для ввода данных. Содержит метод `abstract int read()`, который позволяет читать один байт из потока.
* **FileInputStream** — расширяет `InputStream` и реализует метод `read`, позволяя считывать байты из файла. Если `read` возвращает `-1`, это означает, что все данные из потока уже считаны.

Эти базовые классы и их методы составляют основу для работы с потоками ввода и вывода данных в Java, обеспечивая удобные инструменты для работы с файлами, устройствами и другими источниками данных.

# Exceptions

Словарь терминов:
**Exception** - исключение, особая ситуация (перевод с английского)
**Error** - ошибка.
**Throw** - бросать.
**try** - пробовать, пытаться.
**catch** - ловить, поймать
**message** - сообщение

**Кратко:**

Ошибка в методе, прерывает его работы в точке происхождения ошибки, и разрушает весь стек функций. При этом Java создает и "пробрасывает" специальный объект характеризующий ошибку (объект создается на базе встроеного в Java класса).
Все такие объекты наследуют классу **Throwable** (написан с большой буквы), в переводе - "бросаемый".

Все наследники **Throwable** делятся на две категории: **Error** и **Exception**.
Error - это ошибки с которыми ничего сделать нельзя. Например, нехватка памяти.
Вторая категория, Exception - исключительные ситуации вызванные некорректным состоянием программы.
Ошибки бывают двух типов: checked (проверяемые) и unchecked (непроверяемые).
Первый тип компилятор "видит" и заставляет программиста как-то на них отреагировать.
Как реагировать на непроверяемые ошибки (и реагировать ли вообще), решает сам разработчик.

Обработка ошибок осуществляется при помощи конструкции try-catch-finally.
В блоки try мы указываем, что делать если все нормально.
В блоке catch обрабатываем ошибки.
Блок finally выполняется в любой случае.

Мы можем создавать свои ошибки и "бросать" их при помощи ключевого слова throw.
Если мы хотим создать проверяемое исключение, то можно наследовать классу Exception.
Если непроверяемое, то наследуем классу RuntimeException.

Если мы столкнулись с проверяемым исключением, но не хотим его обрабатывать в данном методе при помощи try-catch, и решили пробросить это исключение в вызывающий метод, то можно воспользоваться ключевым словом throws в сигнатуре метода.

## Major reasons why an exception Occurs
* Invalid user input - неправильный ввод пользователя
* Device failure - сломалось устройство, выключили питание и т.д.
* Loss of network connection - потеряли Интернет, Ethernet и т.д.
* Physical limitations (out of disk memory) - нехватка памяти ОЗУ, жестких дисков
* Opening an unavailable file - открытие недоступного файла
* Code errors - ошибки кода программистов

### Differences between Error and Exception that is as follows:
* **Error:** An Error indicates a **serious problem** that a reasonable application
  should **not try to catch**.
* **Exception:** Exception indicates **conditions** that a reasonable application
  **might try to catch**.

Кострукция **try ... catch** используется в тот момент, когда программа завершает работу
некорректно, Code выхода из программы отличен от 0.

### Синтаксис
`try { // попытаться
//  Block of code to try

}
catch(Exception e) { // схватить
//  Block of code to handle errors
}`

#### Пояснения
The **try** statement allows you to define a block of code
to be tested for errors while it is being executed.

The **catch** statement allows you to define a block of code
to be executed, if an error occurs in the try block.
The **try and catch keywords come in pairs**:

Многие исключения и ошибки пользователя можно обрабатывать самому с помощью if, НО ЗАЧЕМ?
Разработчики Java предоставляют стандартный инструментарий для этого -
это класс Throwable (потомок класса Object) и его методы.

**Примеры:**
1. Деление на 0;
2. Выход за пределы массива;
3. Проверка ввода пользователя на корректность.

Хорошая статья с примерами:
https://www.geeksforgeeks.org/flow-control-in-try-catch-finally-in-java/

**Алгоритм применения try ... catch**
1. Ели программа падает (код окончания не равен 0), работа с пользователем прекращается
2. то смотрим на дигностику - то, что печатается в момент падения программы, там есть указания на номера строк
   в коде, в которых происходят ошибки
3. На эти строки надо "одеть" конструкцию try ... catch


## Проверяемые и НЕпроверяемые исключения
Проверяемые ошибки (exception)- ~~кем~~ или чем проверяются?

- **проверяемые** -> это те exceptions, которые проверяются компиллятором Java, нам просто не дадут запустить приложение, их лучше использовать при написании собственных приложений

- **НЕпроверяемые** - это те, которые не проверяются копмпилятором, их лучше использовать, когда пишем приложение с использованием сторонних библиотек или фреймворков


</details>
