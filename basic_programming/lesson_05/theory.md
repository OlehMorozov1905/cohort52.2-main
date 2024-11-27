<details>
  <summary style="cursor: pointer;"><b>English</b></summary>

# Conditions (conditions, comparisons)
What is greater 15 or 37?

And how do we understand this? - ...

25 - 17 =
17 - 25 =

How does the computer understand this?
Compare numbers A and B
**Algorithm:**
Step 1: A - B = C
Step 2: If C > 0, then A > B is TRUE, and if C < 0, then A > B is FALSE

What is greater -52 or -85?

What is greater a or z (Latin alphabet)?

Each number has a code in numbers, we compare these numbers (codes).
a is less than z, because its code is less, it is earlier in the ASCII table

AAAA > AAA1
And how do we understand this? - ...
How does the computer understand this? - ...

## Condition
* symbol > greater than , x > y - logical expression
* symbol < less than , x < y
* this == equal, x == y
* this >= greater than or equal
* this <= less than or equal
* this != NOT equal (<> - this is in other languages)
  all of the above are logical expressions.

A logical expression takes the value:
- FALSE or TRUE - this is the boolean type;

## Logical operators:
Logical operations connect (combine) various conditions:
* Logical negation, also known as NOT or inversion.
  It is denoted by the “!” symbol before the operand. It is applied to one operand.

* Logical AND, also known as AND or conjunction.
  It is denoted by the “&” symbol between the two operands to which it is applied. Example: (x > 0) & (x < 10) - X is between and to
  AND and AND => AND
  AND L => L
  L and AND => L
  L and L => L

* Logical OR in Java, also known as OR, also known as disjunction. It is denoted by the symbol “|” between
  two operands.
  Example: x < 0 | x >10 in this expression we get false when x = 2, 3, ... 9
  AND or AND => AND
  AND or L => AND
  L or AND => AND
  L or L => L

* Exclusive or, XOR, strict disjunction.
  It is denoted by the symbol “^” between two operands.
  AND or AND => L
  AND or L => AND
  L or AND => AND
  L or L => L

Logical operators (|| and &&):

|| (logical OR): Returns true if at least one of the conditions is true. Checks the first operand, and if it is true, the second operand is not checked (lazy evaluation).
&& (logical AND): Returns true only if both conditions are true. Checks the first operand, and if it is false, the second operand is not checked (lazy evaluation).

Bitwise operators (| and &):

| (bitwise OR): Applies to each bit of the operands. Returns 1 in each bit if at least one of the corresponding bits of the operands is 1.
& (bitwise AND): Applies to each bit of the operands. Returns 1 in each bit if both corresponding bits of the operands are 1.

The results of comparisons and logical operators are always of type **boolean**,
that is, they can be either TRUE or FALSE.

**THIRD OPTION IS NOT GIVEN! - this is the law of formal logic.**

# Conditional operator

## Operator if( condition ) , condition is a logical expression

The most universal way to organize the execution of some part of the code **depending on the condition**,
is to use the conditional operator:

if(condition)
{...}

The condition in the brackets of the if ( ... ) operator is a logical expression, very often it is a comparison.

The conditional operator has a **full form**, or **short form** (without else).

**Full form:**
`if (condition){
command_1;
command_2;
...
} else { // otherwise
command_1;
command_2;
...
}`
... next command

**Short form** (without else):
`if (condition) {
command_1;
command_2;
...
}`
... next command

</details>

<hr>

<details style="padding-top: 18px">
  <summary style="cursor: pointer;"><b>На русском</b></summary>

# Conditions (условия, сравнения)
Что больше 15 < 37 - это ИСТИНА 

А как мы это понимаем? - с помощью вычитания
25 - 17 = 8 > 0 => 25 > 17 - это true

17 - 25 = -8 < 0 => 17 < 25 - это true 

Как компьютер это понимает?
Сравнить числа A и B

**Алгоритм:**
Шаг 1: A - B = С
Шаг 2: Если С > 0, то A > B - это TRUE(ИСТИНА), а если C < 0, то A > B - это FALSE (ЛОЖЬ)

Что больше -52 или -85? 
-52 > - 85

- 52 - (-85) = 33 > 0 => - 52 > - 85

Символы:
Что больше a или z (латинский алфавит)?

Каждое число имеет код в числах, сравниваем эти числа (коды).
a меньше, чем z, потому что ее код меньше, она раньше по таблице ASCII

Заглавные буквы идут раньше
A (65)
B (66)
C (67)

A < B - это истина

AAAA > AAA1 - это true

0 (48)
1 (49)
2 (50)
...
9 (57)


А как мы это понимаем? - ...
Как компьютер это понимает? - ...

## Условие (condition)
*  символ > больше , x > y - логическое выражение
*  символ < меньше , x < y
*  это == равно, x == y
*  это >=  больше или равно
*  это <=  меньше или равно
*  это != НЕ равно (<> - это в других языках)
   всё вышеперечисленное – это логические выражения.

Логическое выражение принимает значение:
- ЛОЖЬ (false) или ПРАВДА (true) - это тип  boolean;

## Логические операторы:
Логические операции соединяют(комбинируют) между собой различные условия:
* Логическое отрицание, оно же NOT или инверсия.
  Обозначается символом “!” перед операндом. Применяется к одному операнду.

* Логическое И, оно же AND или конъюнкция.
  Обозначается символом “&” между двумя операндами,
  к которым применяется. Пример: (x > 0) & (x < 10) - X попадает в интервал от 0 и до 10
  И и И => И
  И и Л => Л
  Л и И => Л
  Л и Л => Л

* Логическое ИЛИ в Java, оно же — OR, оно же — дизъюнкция. Обозначается символом “|” между
  двумя операндами.
  Пример: x < 0 | x >10  в этом выражении получаем ложь, когда x = 2, 3, ... 9
  И или И => И
  И или Л => И
  Л или И => И
  Л или Л => Л

* Исключающее или, XOR, строгая дизъюнкция.
  Обозначается символом “^” между двумя операндами.
  И или И => Л
  И или Л => И
  Л или И => И
  Л или Л => Л

Логические операторы (|| и &&):

    || (логическое ИЛИ): Возвращает true, если хотя бы одно из условий истинно. Проверяет первый операнд, и если он истинный, второй операнд не проверяется (ленивое вычисление).
    && (логическое И): Возвращает true, только если оба условия истинны. Проверяет первый операнд, и если он ложный, второй операнд не проверяется (ленивое вычисление).

Побитовые операторы (| и &):

    | (побитовое ИЛИ): Применяется к каждому биту операндов. Возвращает 1 в каждом бите, если хотя бы один из соответствующих битов операндов равен 1.
    & (побитовое И): Применяется к каждому биту операндов. Возвращает 1 в каждом бите, если оба соответствующих бита операндов равны 1.

Результаты сравнения и логических операторов всегда имеет тип **boolean**,
то есть может быть либо ИСТИНА (true), либо ЛОЖЬ (false).

3 > 3 => false

C > C => false

**Третьего НЕ ДАНО! - это закон формальной логики.**

# Условный оператор

## Оператор if( условие ) , условие - это логическое выражение

Самым универсальный способ организовать выполнение какой-то части кода **в зависимости от условия**,
является использования условного оператора:

if(условие => истина)
  {...} // программа заходит в тело if-а

Условие в скобках оператора if ( ...  ) - это логическое выражение, очень часто - это сравнение.

Условный оператор имеет **полную форму**, или **сокращенную** (без else).

**Полная форма:**
`if (условие){
   команда_1;
   команда_2;
...
} else { // иначе
   команда_1;
   команда_2;
...
}`
... сл. команда

**Сокращенная форма** (без else):
`if (условие) {
   команда_1;
   команда_2;
...
}`
... сл. команда

</details>
