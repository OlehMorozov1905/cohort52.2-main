<details>
  <summary style="cursor: pointer;"><b>English</b></summary>

# Arrays and methods

Arrays and methods.
Arrays as objects. The concept of a reference in Java. Stack and Heap.
Passing arguments to a method by reference and by value.

1. Unlike primitives (these are variables of primitive types), **objects** are complex structures that combine various data that characterize the state of an object and the functionality (methods) responsible for its behavior.
   More details - in a week, when there will be OOP.

2. **Arrays** in Java are **objects**.

Definition from the documentation:
An array is a container object that contains a **fixed number** of values ​​**of the same type**.

3. Java uses two types of memory: Stack and Heap.
- Stack stores data that has a clearly defined size in bytes.
  A stack is an area of memory that is used to store method calls and their local variables. Memory for the stack is allocated when a method is called and freed when it is completed. Since the stack is organized as LIFO (last in, first out), operations with it are performed very quickly.
  When primitives are used as local variables inside a method, they are stored on the stack.

` public void exampleMethod() {
int a = 10; // Primitive 'a' is stored on the stack
double b = 20.5; // Primitive 'b' is stored on the stack
}`

- The size of data stored in the Heap can change dynamically.
  Java stores all objects in the Heap. The stack stores references to objects.

4. An array is stored in the Heap, the array name is a reference and is stored in the Stack.
   An array variable stores the address of the array in the Heap, i.e. it is a reference to the array.

int[] array is a variable of the array type.

A variable with the address of the array is stored in the Stack, because the address in memory always has a fixed length in bytes.
Data – array values, stored in Heap.

5. When calling a method, primitive type arguments (int, double) are copied, i.e. their value is passed (pass by value).
   When passing **objects** as arguments, such as arrays, only addresses (references) are copied. The objects themselves are not copied. Arguments-objects are said to be passed by reference (pass by reference).

</details>

<hr>

<details style="padding-top: 18px">
  <summary style="cursor: pointer;"><b>На русском</b></summary>

# Массивы и методы

Массивы и методы.
Массивы как объекты. Понятие ссылки в Java. Stack and Heap.
Передача аргументов в метод по ссылке и по значению.

1. В отличие от примитивов (это переменные примитивных типов), **объекты** представляют собой сложные структуры, объединяющие в себе разнообразные данные, которые характеризуют состояние объекта и функциональность (методы), отвечающие за его поведение.
   Подробнее - через неделю, когда будет ООП.

2. **Массивы** в Java являются **объектами**.

Определение из документации:
Массив – это объект-контейнер, содержащий **фиксированное количество** значений **одного типа**.

3. Java использует два типа памяти: **Stack** и **Heap**.
- В Stack хранятся данные имеющие четко заданный размер в байтах.
Стек — это область памяти, которая используется для хранения вызовов методов и их локальных переменных. Память для стека выделяется при вызове метода и освобождается при его завершении. Поскольку стек организован как LIFO (последний вошел, первый вышел), операции с ним выполняются очень быстро.
Когда примитивы используются в качестве локальных переменных внутри метода, они хранятся в стеке.

`  public void exampleMethod() {
int a = 10; // Примитив 'a' хранится в стеке
double b = 20.5; // Примитив 'b' хранится в стеке
}`

- Размер данныx, хранящихся в Heap, может динамически меняться.
  Все объекты Java хранит в Heap. 

Cсылки на объекты стеке хранятся в стеке.

4. Массив хранится в Heap, имя массива является ссылкой и хранится в Stack.
Переменная типа массив хранит в себе адрес массива в Heap, т. е. является ссылкой на массив.

int[] array - это переменная типа массив. 

Переменная с адресом массива хранится в Stack, т. к. адрес в памяти всегда имеет фиксированную длину в байтах.
Данные – значения массива, хранятся в Heap.

5. При вызове метода, аргументы примитивного типа (int, double) копируются, т. е. передается их значение (pass by value).
При передаче в качестве аргументов **объектов**, например массивов, копируются только адреса (ссылки). Сами объекты не копируются. Говорят, что аргументы-объекты передаются по ссылке (pass by reference).


</details>
