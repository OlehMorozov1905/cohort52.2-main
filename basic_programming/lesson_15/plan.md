<h3 style="text-align: center; padding-bottom: 14px">2024-02-02</h3>

# Lesson plan #15 09/30/2024:

## Past weeks:
L5 - conditions, logical expressions
L6 - ternary operator, switch case
L7 - while and do while loops
L8 - loops + conditions, nested loops
L9 - weekly review
--------------------------------
L10 - arrays and for loop
L11 - arrays - filling and searching, using random number generator
L12 - static methods for working with arrays, moving methods to class and calling them
L13 - array sorting (bubble sort), searching in array using binarySearch
L14 - weekly review
----------------------------------------------
## Next topics:
L15 - String class and its methods
L16 - introduction to OOP: classes, objects, fields and methods, encapsulation
L17 - Git technology
L18 - abstraction, constructors and polymorphism
L19 - inheritance
L20 - object comparison, standard class methods
L21 - wrapper classes
L22 - Unit testing

# Lesson plan #15 09/30/2024:

## 1. What we did in the last lesson:
- developed the bubbleSort method for sorting arrays
- developed the swap and reverseArray methods for "reversing" an array
- solved problems to consolidate the material (arrays and the for loop)

## 2. Discussing homework:
- adding a random duplicate to an ordered array and finding it
- finding a "lucky dumpling"
- a method that receives an array as input and sorts it using the selection sort algorithm

Any questions?
----------------------------------------------------------------------------

## 3. Plan for today's lesson:

The String class and its methods - see the Theory section.

4. Practice:

Exercises with methods of the String class.

- length() - returns the number of characters in the string;

- charAt(int position) - returns the character at the given position (position numbering starts from zero);

- indexOf(String str), indexOf(char c), lastIndexOf(String str), lastIndexOf(char c) - return the position of the first

found string or character in the string, starting to search from the beginning (indexOf) or from the end (lastIndexOf),
they can also search starting from a given position indexOf(String str, int pos);

- substring(int start, int end) - returns a part of the string (substring), starting from the start position,
  and ending at the end position, while the character at the start position will be included in the resulting string,
  and the character at the end position is not included;

- replace(String str1, String str2) - replaces all strings str1 found in the string with str2;

- toUpperCase() and toLowerCase() - return the string in upper or lower case, respectively;

- equalsIgnoreCase(String str) - compares strings, ignoring the difference between upper and lower case letters;

- split(String regex) - converts the string to an array whose elements are parts of the string,
  separated by some separator (regex = regular expression).

- set the day of the month, the name of the month, and the year as variables.

Insert the date of Gagarin's flight into the string in the form:
"Date of Gagarin's flight into space: day – month – year." and print it in the console.
Use String.format()

___


## Прошедшие недели:
L5 - условия, логические выражения
L6 - тернарный оператор, switch case
L7 - циклы while и do while
L8 - циклы + условия, вложенные циклы
L9 - повторение за неделю
--------------------------------------------
L10 - массивы и цикл for
L11 - массивы - заполнение и поиск, использование датчика случайных чисел
L12 - статические методы для работы с массивами, вынос методов в класс и их вызов
L13 - сортировка массива (bubble sort), поиск в массиве методом binarySearch
L14 - повторение за неделю
----------------------------------------------
## Следующие темы:
L15 - класс String и его методы
L16 - введение в ООП: классы, объекты, поля и методы, инкапсуляция
L17 - технология Git
L18 - абстрагирование, конструкторы и полиморфизм
L19 - наследование
L20 - сравнение объектов, стандартные методы классов
L21 - классы-обертки (wrapper-classes)
L22 - Unit-тестирование

# План занятия №15 30.09.2024:

## 1. Что мы сделали на прошлом занятии:
- разработали метод bubbleSort для сортировки массивов
- разработали метод swap и reverseArray для "разворота" массива
- решили задачи на закрепление материала (массивы и цикл for)

## 2. Обсуждаем ДЗ:
- добавление в упорядоченный массив случайного дубликата и его поиск
- поиск "счастливого пельменя"
- метод, получающий на вход массив и сортирующий его по алгоритму selection sort

Есть ли вопросы?
----------------------------------------------------------------------------

## 3. План на сегодняшнее занятие:

Класс String и его методы - см. раздел Теория.

4. Практика:

Упражнения с методами класса String.
- length() - возвращает количество символов в строке;

- charAt(int position) - возвращает символ находящийся на данной позиции (нумерация позиций начинается с нуля);

- indexOf(String str), indexOf(char c), lastIndexOf(String str), lastIndexOf(char c) - возвращают позицию первой
  найденной строки или символа в строке, начиная искать с начала (indexOf) или с конца (lastIndexOf),
  могут искать также начиная с заданной позиции indexOf(String str, int pos);

- substring(int start, int end) - возвращает часть строки (подстроку), начиная с позиции start,
  и заканчивая позицией end, при этом символ стоящий на стартовой позиции будет включен в результирующую строку,
  а символ стоящий на позиции end не включен;

- replace(String str1, String str2) - заменяет все найденные в строке строки str1 на str2;

- toUpperCase() и toLowerCase() - возвращает строку в верхнем, или нижнем регистре соответственно;

- equalsIgnoreCase(String str) - сравнивает строки, игнорируя разницу между большими и маленькими буквами;

- split(String regex) - преобразует строку в массив, элементами которого являются части строки,
  разделенные каким-то разделителем (regex = regular expression).

- задайте в виде переменных число месяца, название месяца, год.

Вставьте в строку дату полета Гагарина в виде:
"Дата полета Гагарина в космос: число – месяц – год." и напечатайте ее в консоли.
Используйте String.format()





