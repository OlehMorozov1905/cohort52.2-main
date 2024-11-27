<details>
  <summary style="cursor: pointer;"><b>English</b></summary>

# String, immutable

1. In Java, the String class is immutable, which means that once a String object is created, its state (i.e., value) cannot be changed. Any operations that seem to change the string actually create a new string without changing the original.

In Java, strings are stored in a String pool, which allows you to save memory by reusing already created strings. It is the immutability of strings that makes this approach possible.

2. The immutability of String class objects can affect the performance of our application if it requires a large number of changes to a string variable.
   For such cases, Java has a StringBuilder class. Objects of this class have the same
   functionality as String class objects, but only StringBuilder objects are mutable.

# Regular Expression

The regular expression language belongs to the category of domain-specific languages.
Such languages are designed to solve problems from a specific subject area.
The regular expression language is designed to process text data.

Regular expressions are supported by most programming languages, including Java.
For more information about the regular expression language in Java, see the presentation and the Java Tutorials.

<a href="https://docs.oracle.com/javase/tutorial/essential/regex/index.html" target="_blank">Java Tutorials. Regular Expressions</a>

## Used for the following Java classes:
- String
- Pattern
- Matcher

## Used for:
- search
- validation (checking)
- extraction
- modification

## Syntax:

* . - (Dot) Any single character
* [ ] - Set of individual characters [abc] or range [a-c]
* [^] - Negation of set or range [^abc] or [^a-c]
* \\d - any decimal digit [0-9]
* \\D - any symbol except digit [^0-9]
* \\s - any whitespace symbol
* \\S - any non-whitespace symbol
* \\w - any alphanumeric symbol [a-zA-Z0-9_]
* \\W - any non-alphanumeric symbol [^a-zA-Z0-9_]

How many times the last specified character can be repeated
*     + - one or more
*     * - 0 or more
*     ? - 0 or 1
*     {m} - exactly m times
*     {n,m} - no less than n but no more than m
*     {n,} - no less than n

Additional symbols
*     | - X|Y either X or Y
*     () -grouping matching subsequences are
*     remembered and numbered from left to right
*     beginning from 1. Example, “(KU)\1” matches KUKU
*     ^ - beginning of text
*     $ - end of text

## RegEx and class String
* .matches (regex) - returns true if a string matches a given regex
* .split(regex) - returns array of tokens separated by delimiters matching regex
* .replaceAll(regex, substring) replace all the string’s parts matching regex with the given substring
* .replaceFirst(regex, substring) replace first encountered the string’s part matching regex with the given substring

</details>

<hr>

<details style="padding-top: 18px">
  <summary style="cursor: pointer;"><b>На русском</b></summary>

# String, immutable

1. В Java класс String является неизменяемым (immutable), что означает, что после создания объекта типа String его состояние (то есть значение) не может быть изменено. Любые операции, которые кажутся изменяющими строку, на самом деле создают новую строку, не изменяя оригинальную.

   В Java строки хранятся в пуле строк (String pool), что позволяет экономить память, повторно используя уже созданные строки. Именно неизменяемость строк (immutable) делает возможным такой подход.

2. Неизменяемость объектов класса String, может повлиять на производительность нашей
   аппликации, если в ней требуется произвести большое количество изменений строковой переменной.
   Для таких случаев в Java создан класс StringBuilder. Объекты этого класса обладают такой же
   функциональность, как и у объектов класса String, но только объекты класса StringBuilder
   являются изменяемыми (mutable).

# Regular Expression

Язык регулярных выражений относится к категории предметно-ориентированных языков.
Такие языки предназначены для решения задач из какой-то определенной предметной области.
Язык регулярных выражений предназначен для обработки текстовых данных.

Регулярные выражения поддерживаются большинством языков программирования, в том числе и Java.
Подробно о языке регулярных выражений в Java, смотрите в презентации и в Java Tutorials.

<a href="https://docs.oracle.com/javase/tutorial/essential/regex/index.html" target="_blank">Java Tutorials. Regular Expressions</a>

## Применяется для следующих классов Java:
- String
- Pattern
- Matcher

## Используется для:
- поиска
- валидации(проверки)
- извлечения
- модификации

## Синтаксис:
* . - (Dot) Any single character
* [ ] - Set of individual characters [abc] or range [a-c]
* [^] - Negation of set or range [^abc] or [^a-c]
* \\d - any decimal digit [0-9]
* \\D - any symbol except digit [^0-9]
* \\s - any whitespace symbol
* \\S - any non-whitespace symbol
* \\w - any alphanumeric symbol [a-zA-Z0-9_]
* \\W - any non-alphanumeric symbol [^a-zA-Z0-9_]

## Количество повторений
How many times the last specified character can be repeated
*     + - one or more
*     * - 0 or more
*     ? - 0 or 1
*     {m} - exactly m times
*     {n,m} - no less than n but no more than m
*     {n,} - no less than n

## Дополнительные символы
*     | - X|Y either X or Y
*     () -grouping matching subsequences are
*     remembered and numbered from left to right
*     beginning from 1. Example, “(KU)\1” matches KUKU
*     ^ - beginning of text
*     $ - end of text

## RegEx и класс String
* .matches (regex) - returns true if a string matches a given regex
* .split(regex) - returns array of tokens separated by delimiters matching regex
* .replaceAll(regex, substring) replace all the string’s parts matching regex with the given substring
* .replaceFirst(regex, substring) replace first encountered the string’s part matching regex with the given substring


</details>
