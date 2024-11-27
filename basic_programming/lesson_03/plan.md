<h3 style="text-align: center; padding-bottom: 14px">2024-02-02</h3>

# Lesson plan #3 09/12/2024:

## 1. What we learned in the last lesson:
- what is an algorithm?
- ...

- learned about the syntactic features of the Java language
- _2xyz - is this what you can call an identifier?
- -1a - is this what you can call an identifier?

- learned to print in the console
- learned to format methods that call methods that call other methods...
- the DRY principle - how does it stand for?
- tried debugger

## 2. Discussing homework:
- 3 methods in depth
- a fairy tale

What was difficult?
What problems did you encounter?

----------------------------------------------------------------------------

## Plan for today's lesson:

Using Java for mathematical calculations and computational problems.
Methods with arguments, returning a result from a method.

**We will need:**
* Primitive data types (we will use them to put data into RAM)
* Variables/identifiers (we will use them to get this data)
* Arithmetic operations (we apply them and get the result)
* Methods that return the result

See the Theory section.

## Practice

**General scenario of actions:**
- declaring variables - name + type;
- assigning values to them;
- calculations;
- printing the answer.

**Tasks:**
1. Set integer variables x and y, perform mathematical operations with them, print the results along with text explanations:
- what variables were involved;
- what operations were performed with them;
- what was the result.

2. Calculate the area of a rectangle.
   Set the length and width of the rectangle as variables of type double.
   Create a method that takes two doubles as input and returns a double of the area of ​​the rectangle.

3. Calculate the circumference of a circle given its radius.
   Set the radius of the circle as a double variable.

Implement a method that returns a double and calculates the circumference of a circle given its radius.


___

# План занятия №3 12.09.2024:

## 1. Что мы узнали на прошлом занятии:
- что такое алгоритм и его свойства?
  - алгоритм это - четкая последовательность действий, важно - направлена на результат!
    - точность
    - универсальность
    - результативность
    - однозначность
    - последовательность
    - конечность
    - понятность
    - выполнимость
    - ДИСКРЕТНОСТЬ (слона надо есть по частям)

- узнали о синтаксических особенностях языка Java (чуствительность к Регистру)
  - _2xyz - так можно назвать идентификатор? - ДА, можно '_' - этот символ допустим
  - -1a - а так можно назвать идентификатор? - НЕТ, нельзя, '-' - этот символ НЕ допустим
  - имя любого Java-класса начинается с Большой буквы
  
- научились печатать в консоли
- научились оформлять методы, которые вызывают методы, которые вызывают другие методы... 
- принцип DRY - как расшифровывается? Don't repeat yourself.
- попробовали debugger

## 2. Обсуждаем ДЗ:
- 3 метода вглубь
- сказка 

Что было сложно? 
С какими проблемами столкнулись?

----------------------------------------------------------------------------

## План на сегодняшнее занятие:

Применение Java для математических расчетов и вычислительных задач.
Методы с аргументами, возвращение результата из метода.

**Нам понадобятся:**
* Примитивные типы данных (с их помощью мы положим данные в оперативную память)
* Переменные/идентификаторы (с их помощью них мы будем доставать эти данные)
* Арифметические операции (применяем и получаем результат)
* Методы, которые возвращают результат

См. раздел Теория.

## Практика

**Общий сценарий действий:**
- объявление переменных - имя + тип;
- присваивание им значений;
- вычисления;
- печать ответа.

**Задачи:**
1. Задать целочисленные переменные x и y, выполнить c ними математические действия, напечатать результаты вместе с текстовыми пояснениями:
- какие переменные участвовали;
- какие действия с ними выполнялись;
- что получилось в результате.

2. Вычислить площадь прямоугольника.
Задайте длину и ширину прямоугольника как переменные типа double. 
Создайте метод, который получает на вход два числа типа double и возвращает тип double площадь прямоугольника.

3. Вычислить длину окружности по ее радиусу.
Задайте радиус окружности как переменную типа double. 
Реализуйте метод, который вернет тип double и вычислит длину окружности по ее радиусу.

-----------------------------------------------------------------------------------------------
**Дополнительные задачи:**

**Задача 1.**
В программе задаются часы, минуты и секунды.
Нужно вывести общее количество секунд, прошедших с начала суток.

**Задача 2.**
В программе задается количество секунд, прошедших с начала суток (целое число не более 86 400).
Нужно вывести часы, минуты и секунды.

**Задача 3.**
У вас есть автомобиль, который расходует X литров топлива на 100 км. Вам нужно рассчитать, сколько топлива потребуется для поездки на расстояние Y км. (calculateFuelConsumption)

Ожидаемый вывод
Расход топлива для 150 км при расходе 8 л/100 км. составляет ... литров.
Расход топлива для 300 км при расходе 10 л/100 км. составляет ... литров.

**Задача 4.**
Калькулятор криптовалюты для Васи (CryptoCalculator)

Условие:
У Васи есть 12350 монет криптовалюты. Все монеты он купил по цене 0.27 евро. Сегодня монета стоит 16.38 евро.

Вопросы:
На какую сумму Вася может рассчитывать, если продаст все свои монеты?
Имя метода: calculateTotalValue

Какая прибыль будет у Васи, если он продаст монеты сейчас?
Имя метода: calculateProfit

Сколько монет нужно продать, чтобы получить x прибыль?
Имя метода: coinsForXProfit

Какая стоимость монеты должна быть, чтобы получить x прибыль?
Имя метода: priceForXProfit

Сколько монет нужно по текущему курсу, чтобы получить x сумму?
Имя метода: coinsForXAmount

Cо звёздочкой *:
Всё то же самое, только любой доход облагается налогом. Налог 23%.
Метод: applyTax

**_Подсказки:_**
double calculateTotalValue(double initialCoins, double currentPrice)
double calculateProfit(double initialCoins, double initialPrice, double currentPrice)
double coinsForXProfit(double initialCoins, double initialPrice, double currentPrice, double desiredProfit)
double priceForXProfit(double initialCoins, double initialPrice, double desiredProfit)
double coinsForXAmount(double currentPrice, double desiredAmount)
double applyTax(double income)

-------------------------------------