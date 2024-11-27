<details>
  <summary style="cursor: pointer;"><b>English</b></summary>

# Arrays
1. Why do we need data arrays?

The main function of arrays is **storing large amounts of SIMILAR information**.

## Examples of arrays that you know from life:
- age data is an array of integers
- a list of employee names is an array of strings (String type)
- data with the results of precise measurements is an array of type double
- the result of answers to questionnaire questions with Yes and No options is an array of type boolean

There is a variable and a data type => how to save them????
int X = 1000;
int Y = 2000;
int Z = 2500;
... so inconvenient.

Conveniently, the data can be turned into an array:
int X[0], X[1], X[2], ..., X[9] - array length 10
double Y[0], Y[1], Y[2], ..., Y[29] - array length 30
short[]
byte[]
long[]
float[]
char[]
boolean[]
String[]

## Definition (definition):

* An array is a container object that holds a fixed number of values of a **single type**.

* An array can contain data of **ONLY ONE type**.
* The type of what is stored in the array is the data types that we have in the Java language, there are no other types.

**Main characteristics of an array:**
- **type** of the data placed in it (int, double, boolean, long, String, ...),
- **name** of the array (like a variable name),
- **length** (natural number, cannot be negative) = array size (number of cells, length),
  always has **type int**.

**IMPORTANT!** - you cannot change the length of an array after it has been created.

In arrays, as everywhere(!) in Java, **elements are numbered from zero**.

2. Array declaration syntax:

- **Step 1:**
- defining/setting the **type of stored data** (an array stores data of ONE type),
- planning the dimension (one-dimensional, two-dimensional, etc.) and size (depends on the amount of data)

- **Step 2:** declaring and initializing the array

Type[] arrayName = new Type[size];
The "=" symbol is the value assignment operator
new is a constructor call.

**Examples:**
int[] arrayNum = new int[5]; // defined an array of integers, array length = 5
arrayNum[0] is the first element of the array, arrayNum[4] is the last element

String[] arrayCity = new String[10]; // defined an array of strings, array length = 10
arrayCity[0] is the first element of the array, arrayCity[9] is the last element

double[] arrayResults = new double[100]; // defined an array of fractional numbers, array length = 100
arrayResults[0] is the first element of the array, arrayResults[99] is the last element

3. Filling the array
   After the procedure of creating (initializing) the array, it is filled with **default values**.
- for int all elements = 0
- for float, double all elements = 0.0
- for String all elements = "null"
- for char all elements = '\0'
- for boolean all elements = false

Direct (manual) filling of the array
**Examples:**

// set the array
int[] myArray = new int[3];
the array is called myArray, the data type is int , the array length is 3

// assign values to its elements
myArray[0] = 5;
myArray[1] = -19;
myArray[2] = 155;
------------------

int[] numbers = {10, 20, 30, 40, 50};

the array name is numbers, the data type is int, the array length is 5
numbers[0] = 10
numbers[1] = 20
numbers[3] = 40

numbers.length = 5
__________________

String[] directions = new String[4];

directions = {"left", "right", "up", "down"};
directions[0] = "left"
directions[1] = "right"
.....
directions[3] = "down"

directions[4] = "up-side-down" - error, attempt to access a non-existent array element
directions[5] - error, attempt to access a non-existent array element,
out of range - going beyond the array bounds
__________________

int[] marks = {2, 5, 4, 3, 5, 3, 5, 4, 1}; // you can also define an array this way
marks.length - returns the length of the marks array

double[] temperature = {16.0, 18.0, 17.5, 22.6, 25.0, 28.0, 26.8}
temperature.length - returns the length of the temperature array

4. Accessing array elements:
   An array element is accessed by the **array name** and the **element index** in it:
   arrayName[n] is the n-th element in the array named arrayName, numbering starts with 0

# For loop

## Syntax

`for(initial parameter value int i = 0; logical expression (i < n); increment step i++ ) {
operator 1;
operator 2;
...
}`

As a rule, the for loop is used to **iterate through all array values**.

`for(int i = 0; i < array length; i++) {

doSomething;
...
}`

Is it possible to build any cycles with the for loop? - More likely NO than yes.

Can i-- be? The answer is YES, in this case the loop goes in reverse order.

## Using the For loop

### Filling an array according to a mathematical pattern

* arithmetic progression
* geometric progression
* values of a given function, for example x squared => x * x

### Filling an array with random data:

* double a = Math.random(); - generates a random number in the range from [0, 1) - brackets from mathematics
  [ => 0 - maybe, ) => 1 - can't be

* double x = (Math.random() * (b-a) ) + a - generates a random number in the range from [a, b) (a<b)
  a - maybe, b - can't be

* int n = (int)(Math.random() * (b - a + 1) + a) - generates a random **integer** number in the range [a, b]
  a - maybe, b - maybe

* Random is a class in Java

## Standard tasks and operations with arrays:
- searching for an element of an array;
- adding a new element (to the beginning, to the end, to the middle of an array);
- editing (changing) an array element;
- deleting an array element;
- finding the maximum/minimum value;
- sorting the array in ascending/descending order;
- deleting duplicates;
- shifting the array;
- deleting empty (zero) elements.

We will gradually go through all these points.

</details>

<hr>

<details style="padding-top: 18px">
  <summary style="cursor: pointer;"><b>На русском</b></summary>

# Массивы
1. Зачем нужны массивы данных?

Главная функция массивов - **хранение больших объемов ОДНОТИПНОЙ информации**.

## Примеры массивов, которые вам известны из жизни:
- данные о возрасте - это массив целых чисел
- список фамилий сотрудников - это массив строк (тип String)
- данные с результатами точных измерений - это массив типа double
- результат ответов на вопросы анкеты с вариантами Да и Нет - это массив типа boolean

Есть переменная и тип данных => как их сохранять????
int X = 1000;
int Y = 2000;
int Z = 2500;
... так неудобно.

Удобно так, данные можно превратить в массив:
int X[0], X[1], X[2], ..., X[9] - длина массива 10
double Y[0], Y[1], Y[2], ..., Y[29] - длина массива 30
short[]
byte[]
long[]
float[]
char[]
boolean[]
String[]

## Defenition (определение):

* An array is a container object that holds a fixed number of values of a **single type**.
  Массив – это объект-контейнер, содержащий **фиксированное количество** значений **одного типа**.

* В массиве могут содержаться данные **ТОЛЬКО ОДНОГО типа**.
* Тип того, что хранится в массиве - это типы данных, которые у нас есть в языке Java, других типов нет.

**Главные характеристики массива:**
- **тип** помещённых в него данных (int, double, boolean, long, String,  ...),
- **имя** массива (как имяПеременной),
- **длина** (натуральное число, не может быть отрицательным) = размер массива (количество ячеек, длина),
  всегда имеет **тип int**.

**ВАЖНО!** - изменить длину массива после его создания нельзя.

В массивах, как и везде(!) в Java, **элементы нумеруются с нуля**.

2. Синтаксис объявления массива:

- **Шаг 1:**
    - определение/задание **типа хранимых данных** (в массиве хранятся данные ОДНОГО типа),
    - планирование размерности (одномерные, двумерные, и т.д.) и размера (зависит от количества данных)

- **Шаг 2:** объявление и инициация массива

  Тип[] имяМассива = new Тип[размер];
  Символ " = " - это оператор присвоения значения
  new - это вызов конструктора.

  **Прмеры:**
  int[] arrayNum = new int[5]; // определили массив целых чисел, длина массива = 5
  arrayNum[0] - это первый элемент массива, arrayNum[4] - это последний элемент

  String[] arrayCity = new String[10]; // определили массив строк, длина массива = 10
  arrayCity[0] - это первый элемент массива, arrayCity[9] - это последний элемент

  double[] arrayResults = new double[100]; // определили массив дробных чисел, длина массива = 100
  arrayResults[0] - это первый элемент массива, arrayResults[99] - это последний элемент


3. Заполнение массива
   После процедуры создания (инициализации) массива он наполнен **значениями по умолчанию**.
    - для int все элементы = 0
    - для float, double все элементы = 0.0
    - для String все элементы = "null"
    - для char все элементы = '\0'
    - для boolean все элементы = false


Прямое (ручное) заполнение массива
**Примеры:**

// задаем массив
		int[] myArray = new int[3]; 
массив называется myArray, тип данных - int , длина массива = 3

// присваиваем значения его элементам
		myArray[0] = 5;
		myArray[1] = -19;
		myArray[2] = 155;
------------------

        int[] numbers = {10, 20, 30, 40, 50};

название массива - numbers, тип данных int, длина массива - 5
numbers[0] = 10
numbers[1] = 20
numbers[3] = 40

        numbers.length = 5
__________________

        String[] directions = new String[4];

        directions = {"left", "right", "up", "down"};
        directions[0] = "left"
        directions[1] = "right"
        .....
        directions[3] = "down"

        directions[4] = "up-side-down" - ошибка, попытка обращения к несуществующему элементу массива
        directions[5] - ошибка, попытка обращения к несуществующему элементу массива, 
                        out of range - выход за пределы массива
__________________

        int[] marks = {2, 5, 4, 3, 5, 3, 5, 4, 1}; // так тоже можно задавать массив
            marks.length - возвращает длину массива marks

        double[] temperature = {16.0, 18.0, 17.5, 22.6, 25.0, 28.0, 26.8}
            temperature.length - возвращает длину массива temperature


4. Доступ к элементам массива:
   Доступ к элементу массива получают по **имени массива** и **индексу элемента** в нем:
   arrayName[n] - это n-й элемент в массиве с именем arrayName, нумерация начинается с 0

# Цикл For (for loop)

## Синтаксис

        `for(начальное значение параметра int i = 0; логическое выражение (i < n); шаг приращения i++ ) {
            оператор 1;
            оператор 2;
            ...
        }`

Как правило, цикл for используют для **перебора всех значений массива**.

`for(int i = 0; i < длины массива; i++) {

   doSomething;
   ...
}`

Можно ли циклом for построить любые циклы? - Скорее НЕТ, чем да.

Может ли быть i-- ? Ответ - ДА, в этом случае цикл идет в обратном порядке.

## Применение цикла For

### Заполнение массива в соответствии с математической закономерностью

*    арифметическая прогрессия
*    геометрическая прогрессия
*    значения заданной функции, например x в квадрате => x * x

### Заполнение массива случайными данными:

* double a = Math.random(); - генерирует случайное число в интервале от [0, 1) - скобки из математики
  [ =>  0 - может быть, ) => 1 - не может быть

* double x = (Math.random() * (b-a) ) + a  - генерирует случайное число в интервале от [a, b) (a<b)
  a - может быть, b - не может быть

* int n = (int)(Math.random() * (b - a + 1) + a) - генерирует случайное **целое** число в интервале [a, b]
  a  - может быть, b  - может быть

* Random - это класс в Java

## Стандартные задачи и операции с массивами:
- поиск элемента массива; - OK
- добавление нового элемента (в начало, в конец, в середину массива); - ok
- редактирование(изменение) элемента массива; - ok
- удаление элемента массива; - ...
- поиск максимального/минимального значения; - ok
- сортировка массива по возрастанию/убыванию; - OK
- удаление дубликатов; - ok
- сдвиг массива; - ok, ...
- удаление пустых (нулевых, null) элементов.

Постепенно мы пройдем все эти пункты.

</details>
