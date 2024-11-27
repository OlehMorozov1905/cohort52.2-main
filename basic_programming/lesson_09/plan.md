<h3 style="text-align: center; padding-bottom: 14px">2024-02-02</h3>

# Lesson plan #9 09/20/2024:

## 1. What we learned in the last lesson:
- structured programming;
- ...
- ...
- ...
- ...
- theorem ...
- prefix and postfix operations;
- adding conditions to loops and building nested loops;
- prime numbers, a method for determining whether a number is prime.

**What we learned in 2 weeks:**
- ...
- ...
- ...

Important topics from the theory:
- string concatenation
- casting (type conversion)
- variable scope

## 2. Discussing homework:
- x-- + --x when x = 5?
- natural numbers less than 200 and multiples of 13
- determining the time of day
- movie tickets
- chess dock

Any questions?
-------------------------------------------------------------

## 3. Today's lesson plan:
The String class and its methods - see the Theory section.

## 4. Practice:

Task 1.
Improve the calculator so that it continues to work after performing one action with a pair of numbers.

Exercises with String class methods.

- length() - returns the number of characters in the string;

- charAt(int position) - returns the character located at the given position (the numbering of positions starts from zero);

- indexOf(String str), indexOf(char c), lastIndexOf(String str), lastIndexOf(char c) - return the position of the first

found string or character in the string, starting to search from the beginning (indexOf) or from the end (lastIndexOf),
can also search starting from a given position indexOf(String str, int pos);

- substring(int start, int end) - returns a part of the string (substring), starting from the start position,
  and ending at the end position, while the character at the start position will be included in the resulting string,
  and the character at the end position is not included;

- replace(String str1, String str2) - replaces all strings found in the string str1 with str2;

- toUpperCase() and toLowerCase() - returns the string in uppercase or lowercase, respectively;

- equalsIgnoreCase(String str) - compares strings, ignoring the difference between uppercase and lowercase letters;

- set the day of the month, month name, year as variables.

Insert the date of Gagarin's flight into the string as:
"Date of Gagarin's flight into space: day - month - year." and print it in the console.

Use String.format()

___

# План занятия №9 20.09.2024:

## 1. Что мы узнали на прошлом занятии:
- структурное программирование;
  - цикл
  - шаг алгоритма (оператор присвоения)
  - условие (условный оператор)
  - метод
  - теорема Бема - Якопини
- префиксные и постфиксные операции:
  - до обращения (использования в операции, перед операндом) переменной --y
  - после обращения (использования в операции, после операнда) к переменной y--
- добавляем в циклы условия и строим вложенные циклы;
- простые (prime) числа, метод для определения является ли число простым.

**Что я узнал(а), чему научился/научилась за 8 занятий?**
- запрашивать данные от пользователя для ввода с клавиатуры
- создавать методы и передавать в них данные (аргументы), получать из них результат
- задавать условия, использовать if else
- особые навыки: вовремя вставать из-за компьютера!
- использование операторов для вычислений
- использовать switch ( : , ->)
- создавать и использовать циклы 
- пользоваться debager (очень полезная вещь!)
- пользоваться специальными символами на клавиатуре при наборе кода
- пользоваться IDE IntelliJ IDEA
- быстро искать информацию
- использовать принцип DRY (пишем методы)
- понимать и использовать операции / , % в целых числах
- понимать задание, понимать его, писать код!
- видеть варианты решения по аналогии!
- структурно мыслить, задавать правильные вопросы
- учиться в онлайн-формате
- печатать информацию в консоли
- когда надо, убирать ln из println
- узнали типы int, double, char, boolean, String 
- менять тип данных
- уложилось в голове как работает компьютер

Важные темы из теории (не забыть!):
- конкатенация строк
- кастинг (преобразование типов)
- область видимости переменных 

## 2. Обсуждаем ДЗ:
- x-- + --x при x = 5?
- натуральные числа меньшие 200 и кратные 13
- определение времени суток
- билеты в кинотеатр
- шахматная доска

Есть ли вопросы?
----------------------------------------------------------------------------

## 3. План на сегодняшнее занятие:
Класс String и его методы - см. раздел Теория.


## 4. Практика:

Доработать калькулятор так, чтобы он продолжал работать после выполнения одного действия с парой чисел.

----------------------------------------------

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

- задайте в виде переменных число месяца, название месяца, год. 

Вставьте в строку дату полета Гагарина в виде:
"Дата полета Гагарина в космос: число – месяц – год." и напечатайте ее в консоли. 
Используйте String.format()
