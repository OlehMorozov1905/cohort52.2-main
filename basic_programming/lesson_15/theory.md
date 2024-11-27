<details>
  <summary style="cursor: pointer;"><b>English</b></summary>

1. The String class encapsulates data that consists of a set of characters and methods for working with it.

2. The most popular methods for working with strings:

- length() - returns the number of characters in the string;

- charAt(int position) - returns the character at the given position (the numbering of positions starts from zero);

- indexOf(String str), indexOf(char c), lastIndexOf(String str), lastIndexOf(char c) - return the position of the first

found string or character in the string, starting to search from the beginning (indexOf) or from the end (lastIndexOf),
they can also search starting from a given position indexOf(String str, int pos);

- substring(int start, int end) - returns a part of the string (substring), starting from the start position,
  and ending at the end position, while the character at the start position will be included in the resulting string,
  and the character at the end position is not included;

- replace(String str1, String str2) - replaces all strings str1 found in the string with str2;

- toUpperCase() and toLowerCase() - return the string in upper or lower case, respectively;

- equalsIgnoreCase(String str) - compares strings, ignoring the difference between upper and lower case letters;

- split(String regex) - converts the string into an array, the elements of which are parts of the string,
  separated by some separator (regex = regular expression).

3. String for advanced:
   Objects of the String class are **immutable**. Any "change" to an object of the String class,
   in fact, leads to the creation of a new object of the String type in the computer's RAM.
   A very useful article: https://www.baeldung.com/java-string-immutable

</details>

<hr>

<details style="padding-top: 18px">
  <summary style="cursor: pointer;"><b>На русском</b></summary>

1. Класс String **инкапсулирует** в себе данные, которые состоят из набора символов, и методы для работы с ним.

String - это тип в Java. 
int a, boolean b, ...

String str = "Hello!";
str - это имя, оно ложится в стек, значение -> в heap
String - это ссылочный тип данных.

2. Наиболее популярные методы для работы со строками:

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
  разделенные каким-то разделителем (regex = regular expression);

- String.format - способ формирования строки с данными из переменных.

3.    String для продвинутых:
      Объекты класса String являются **неизменными** (immutable). Любое "изменение" объекта класса String,
      на самом деле ведет к созданию нового объекта типа String в оперативной памяти компьютера.
      Очень полезная статья: https://www.baeldung.com/java-string-immutable

</details>
