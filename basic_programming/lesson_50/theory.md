<details>
  <summary style="cursor: pointer;"><b>English</b></summary>

Glossary of terms:
**Exception** - exception, special situation (translated from English)
**Error** - error.
**Throw** - throw.
**try** - try, attempt.
**catch** - catch, catch
**message** - message

**Briefly:**

An error in a method interrupts its work at the point of origin of the error, and destroys the entire stack of functions. In this case, Java creates and "throws" a special object characterizing the error (the object is created on the basis of a class built into Java).
All such objects inherit the **Throwable** class (written with a capital letter), translated as "throwable".

All heirs of **Throwable** are divided into two categories: **Error** and **Exception**.
Error - these are errors with which nothing can be done. For example, lack of memory.
The second category, Exception - exceptional situations caused by an incorrect state of the program.
There are two types of errors: checked and unchecked.
The compiler "sees" the first type and forces the programmer to react to them somehow.
The developer decides how to react to unchecked errors (and whether to react at all).

Error handling is performed using the try-catch-finally construct.
In the try blocks, we specify what to do if everything is OK.
In the catch block, we handle errors.
The finally block is executed in any case.

We can create our own errors and "throw" them using the throw keyword.
If we want to create a checked exception, we can inherit the Exception class.
If an unchecked exception, we inherit the RuntimeException class.

If we encounter a checked exception, but do not want to handle it in this method using try-catch, and decide to throw this exception to the calling method, we can use the throws keyword in the method signature.

### Syntax
`try { // try
// Block of code to try

}
catch(Exception e) { // catch
// Block of code to handle errors
}`

#### Explanations
The **try** statement allows you to define a block of code
to be tested for errors while it is being executed.

The **catch** statement allows you to define a block of code
to be executed, if an error occurs in the try block.
The **try and catch keywords come in pairs**:

Many exceptions and user errors can be handled by yourself using if, BUT WHY?
Java developers provide standard tools for this -
the Throwable class (a descendant of the Object class) and its methods.

**Examples:**
1. Division by 0;
2. Array out of bounds;
3. Checking user input for correctness.

A good article with examples:
https://www.geeksforgeeks.org/flow-control-in-try-catch-finally-in-java/

**Algorithm for using try ... catch**
1. If the program crashes (the exit code is not 0), work with the user is stopped
2. then we look at the diagnostics - what is printed at the moment the program crashes, there are indications of the line numbers
   in the code where errors occur
3. These lines need to be "dressed" with the try ... catch construct

## Checked and UNchecked exceptions
Checked errors (exception) - ~~by whom~~ or what are they checked?

- **checked** -> these are the exceptions that are checked by the Java compiler, we simply will not be allowed to run the application, it is better to use them when writing your own applications.

- **UNchecked** - these are the ones that are not checked by the compiler, they are better to use when writing an application using third-party libraries or frameworks.



</details>

<hr>

<details style="padding-top: 18px">
  <summary style="cursor: pointer;"><b>На русском</b></summary>

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

- **проверяемые** -> это те exceptions, которые **проверяются компиллятором Java**, нам просто не дадут запустить приложение, их лучше использовать при написании собственных приложений.

- **НЕпроверяемые** - это те, которые не проверяются копмпилятором, их лучше использовать, когда пишем приложение с использованием сторонних библиотек или фреймворков.

</details>
