<details>
  <summary style="cursor: pointer;"><b>English</b></summary>

## Methods arguments. Return.

The method name starts with a lowercase letter.

camelCase is a naming style, when the 1st letter is lowercase, and then the "words" start with a capital letter.

toDoSomething is the correct method name, which is in the verb style.

ToDoOne - by convention it should not be called this way.

**Method signature** is its first line, which specifies:
- access modifier
- public
- private
- ...
- method type static or empty
- void or type of result returned by the method
- method name
- arguments - data passed to the method

---------------------------------------------------------

## Methods
void - this means empty, nothing

A method that returns nothing - void (empty, nothing) and does not accept anything as input (empty in brackets),
BUT does what it says when it is called, looks like this:

public static void methodName(){
doSomething();
}
// void indicates that the method does not return anything

---------------------------------------------------------

A method that does not return anything, takes parameters (arguments in brackets are separated by commas),
BUT does what it says when it is called, looks like this:

public static void methodName(Type1 t1, Type2 t2){
doSomething();
t1 = ...;
t2 = ...;
}

// Type1 t1 - an explicit indication of the type and name of the variable with which the method will work
// void indicates that the method does not return anything

----------------------------------------------------------

A method that takes parameters (arguments) and returns a result of type Type looks like this:

public static Type methodName(Type t1, Type t2, ...){
doSomething();
return ...; // response, result from/to the method
}

A method can return data of only **ONE TYPE**, which is specified in its signature.
The result of a method that returns data can and should be **received, assigned to a variable** of the corresponding type.

Any method is called by its name either without parameters (), or with parameters (a, b), which are passed to the method.
`int size;` is a variable declaration
`int size()` is a method call that returns an integer

</details>

<hr>

<details style="padding-top: 18px">
  <summary style="cursor: pointer;"><b>На русском</b></summary>

## Methods arguments. Return.

Имя метода начинаем с маленькой буквы.

camelCase - это стиль наименования, когда 1-я буква - маленькая, а далее "слова" начинаются с большой.

toDoSomething - это верное название метода, что-то в стиле глагола.

ToDoOne - по соглашению так называть не следует.

**Сигнатура метода** - это его первая строчка, в которой указываются:
- модификатор доступа
  - public
  - private
  - ...
- тип метода static или пусто
- void или тип возвращаемого методом результата
- название метода
- аргументы - передаваемые в метод данные

---------------------------------------------------------

## Методы
void - это означает пустой, ничего

Метод, который ничего не возвращает - void (пустой, ничего) и ничего на вход не принимает (в скобках пусто), 
НО делает то, что в нем написано, когда его вызывают, выглядит так:

public static void methodName(){
    doSomething();
}
// void указывает на то, что метод ничего не возвращает

---------------------------------------------------------

Метод, который ничего не возвращает, принимает параметры (в скобках есть аргументы через запятую), 
НО делает то, что в нем написано, когда его вызывают, выглядит так:

public static void methodName(Type1 t1, Type2 t2){
    doSomething();
    t1 = ...;
    t2 = ...;
}

// Type1 t1 - явное указание на тип и название переменной, с которой будет работать метод
// void указывает на то, что метод ничего не возвращает

----------------------------------------------------------

Метод, который принимает параметры (аргументы) и возвращает результат типа Type выглядит так:

public static Type methodName(Type t1, Type t2, ...){
    doSomething();
    return ...; // ответ, результат из/от метода
}

Метод может вернуть данные только **ОДНОГО ТИПА**, который указан в его сигнатуре.
Результат работы метода, который возвращает данные, можно и нужно **принимать, присваивать в переменную** соответствующего типа.

Любой метод вызывается по его имени либо без параметров (), либо с параметрами (a, b), которые передаются в метод.
`int size;` - это объявление переменной
`int size()`- это вызов метода, который возвращает целое число

</details>
