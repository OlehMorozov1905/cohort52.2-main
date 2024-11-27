<details>
  <summary style="cursor: pointer;"><b>English</b></summary>

# Primitive and Reference Types in Java
In Java, all data is divided into two main types: primitive types and reference types.
Understanding the differences between them and how they are stored in RAM is **important for writing efficient code**.

## Primitive Types
Primitive types are the basic data types that directly store values.
There are 8 primitive types in Java:
1. byte (1 byte)
2. short (2 bytes)
3. int (4 bytes)
4. long (8 bytes)
5. float (4 bytes)
6. double (8 bytes)
7. char (2 bytes)
8. boolean (size depends on the JVM, usually 1 byte)

Primitive types are stored directly in the memory allocated for such variables - either on the stack or on the heap, depending on whether they are local variables or object fields.
* Objects and their fields are stored on the heap.
* Local variables and references to objects are stored on the stack.

- If a primitive type is declared as a local variable in a method, it will be stored on the stack.

This is because local variables have a short lifetime and exist only within the execution of the method.

- If a primitive type is a class field, i.e. an object field, it will be stored on the heap.

This is because the object to which these fields belong is created on the heap.

## Reference Types
Reference types are **objects** and **arrays**.
Examples of reference types:
* Strings
* arrays
* user-defined classes

Reference types are stored differently than primitives.

When an object is created:
- the variable that refers to this object stores only the address (or reference) to this memory location and it is stored on the stack.
- the object itself is stored on the heap, where memory is allocated for it.

## Upper, down casting for reference type variables. The instanceof operator.

1. A reference of a parent type (Computer) can refer to an object of a child type (Laptop, SmartPhone).

When creating an array Computers[] computers = new Compuner[7], we create objects of the Computer type and all
computers[i] are objects of the Computer type.

In this case, Java itself performs **upper casting** (upward conversion).
Example:
computers[3] = new Laptop("M2", 16, 1024, "Apple", 3000, 14.1, 2.6, 10);

Upward conversion occurs automatically and does not require explicit specification.
This is a safe operation, since any object of the child type is also an object of the parent type.
That is why we can easily create an array of Computer objects and create objects of the child classes Laptop and SmartPhone in it. However, the fields and methods of the child classes remain inaccessible until we do **down casting**.
computers[3] must be explicitly made an object of the child class Laptop.

This can only be done when

(computers[3] instanceof Laptop) is a logical expression in brackets.

You can check the conformity of types using the **instanceof** operator.

If you try to assign a value to a reference of a child type of a parent type, the compiler will require explicit casting (down casting).
In this case, if the reference of the parent type points to another child object, then an error will occur during the execution of

the code.

2. Comparing objects using "==" is incorrect, since "==" formally compares the equality of references, i.e.
   the addresses of objects. But you need to compare "by fields".
   All objects in Java are descendants of the Object class.
   The equals method is defined in the Object class to compare objects. If we want objects of our class to be compared with each other by the fields we need, we need to
   override the equals method in our class, specifying in it the logic of comparing a given object with
   another.

3. Objects of the String class created using double quotes are string
   constants. This means that each time we specify a string with the same content in double quotes, a new object is not created. We get a reference to the same object.

# Inheritance - important additions

1. If it is necessary to prohibit inheritance from a class, the final modifier is used.

final class SuperMan {
...
}

2. All classes that do not explicitly specify a super class inherit from the **Object** class.
   That is, the Object class is the parent of all classes in Java by default.
   In particular, all classes inherit the toString method from the Object class, which returns a string
   representation of the object (fields and their values ​​in one line).
   That is why each toString() method has the @Override annotation

3. You can check the type conformity (the relationship of objects of different classes) using the **instanceof** operator.


</details>

<hr>

<details style="padding-top: 18px">
  <summary style="cursor: pointer;"><b>На русском</b></summary>

# Примитивные и ссылочные типы в Java
В Java все данные делятся на два основных типа: примитивные типы и ссылочные типы.
Понимание различий между ними и их хранение в оперативной памяти **важно для написания эффективного кода**.

## Примитивные типы
Примитивные типы — это базовые типы данных, которые непосредственно хранят значения.
В Java существует 8 примитивных типов:
1. byte (1 байт)
2. short (2 байта)
3. int (4 байта)
4. long (8 байт)
5. float (4 байта)
6. double (8 байт)
7. char (2 байта)
8. boolean (размер зависит от JVM, обычно 1 байт)

Примитивные типы хранятся непосредственно в памяти, выделенной для таких переменных - как в стеке, так и в куче, в зависимости от того, являются ли они локальными переменными или полями объекта.
* Объекты и их поля хранятся в куче.
* Локальные переменные и ссылки на объекты хранятся в стеке.

- Если примитивный тип объявлен как локальная переменная в методе, он будет храниться в стеке.
  Это происходит потому, что локальные переменные имеют короткое время жизни и существуют только в пределах выполнения метода.

- Если примитивный тип является полем класса, то есть полем объекта, то он будет храниться в куче.
  Это связано с тем, что объект, которому принадлежат эти поля, создается в куче.

## Ссылочные типы
Ссылочные типы представляют собой **объекты** и **массивы**.
Примеры ссылочных типов:
* строки (String)
* массивы
* пользовательские классы

Ссылочные типы хранятся иначе, чем примитивы.
Когда создается объект:
- переменная, которая ссылается на этот объект, хранит только адрес (или ссылку) на эту область памяти и она хранится в стеке.
- сам объект хранится в куче, где под него выделяется память.

## Upper, down casting для переменных ссылочного типа. Оператор instanceof.

1. Ссылка родительского типа (Computer) может ссылаться на объект дочернего типа (Laptop, SmartPhone).
   
При создании массива Computers[] computers = new Compuner[7] мы создаем объекты типа Computer и все
   computers[i] - это объекты типа Computer.

В этом случае Java сама проводит **upper casting** (восходящее преобразование).
Пример:
computers[3] = new Laptop("M2", 16, 1024, "Apple", 3000, 14.1, 2.6, 10);

Восходящее преобразование происходит автоматически и не требует явного указания.
Это безопасная операция, поскольку любой объект дочернего типа также является объектом родительского типа.
Именно поэтому мы легко создаем массив объектов типа Computer и создаем в нем объекты дочерних классов Laptop и SmartPhone.
Однако поля и методы дочерних классов остаются недоступными до тех пор, пока мы не сделаем **down casting**.
computers[3] надо явно сделать объектом дочернего класса Laptop. 
Это можно сделать лишь тогда, когда

(computers[3] instanceof Laptop) - в скобках логическое выражение.

Проверить соответствие типов, можно при помощи оператора **instanceof**.

Если попытаться ссылке дочернего типа присвоить значение ссылки родительского типа, то компилятор потребует явно провести кастинг (down casting).
При этом, если ссылка родительского типа указывает на другой дочерний объект, то в процессе выполнения
кода, произойдет ошибка.

2. Сравнивать объекты через "==" некорректно, т. к. "==" сравнивает формально равенство ссылок, т. е.
   адреса объектов. А нужно сравнивать "по полям".
   Все объекты в Java являются наследниками класса Object.
   Для сравнения объектов в классе Object определен метод equals.
   Если хотим, чтобы объекты нашего класса сравнивались между собой по нужным нам полям, то надо
   переопределить метод equals в нашем классе, указав в нем логику сравнения заданного объекта с
   другим.

3. Объекты класса String создаваемые при помощи двойных кавычек, являются стринговыми
   константами. Это означает, что когда мы каждый раз указываем стринг с одинаковым содержимым в
   двойных кавычках, то новый объект не создается. Мы получаем ссылку на один и тот же объект.

# Наследование - важные дополнения

1. Если необходимо запретить наследование от класса, то используется модификатор final.

final class SuperMan {
...
}

2. Все классы у которых явно не указан супер-класс, наследуются от класса **Object**.
   То есть класс Object является родителем всех классов в Java по умолчанию.
   В том числе, все классы наследуют от класса Object метод toString, возвращающий строковое
   представление объекта (поля и их значения в одной строчке).
   Именно поэтому над каждым методом toString() стоит аннотация @Override

3. Проверить соответствие типов (родство объектов разных классов),
   можно при помощи оператора **instanceof**.


</details>
