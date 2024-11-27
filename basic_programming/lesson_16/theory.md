<details>
  <summary style="cursor: pointer;"><b>English</b></summary>

# OOP - object-oriented programming (OOP)

A look at programming "from a new angle" (different from the procedural) was proposed by
**Alan Kay** and **Dan Ingalls** in the Smalltalk language. Here the concept of **class** became
the fundamental idea for all other language constructs
(that is, a class in Smalltalk is a primitive by which more complex constructs are described).
It became the first widely used object-oriented
programming language.

**Java** is a high-level programming language, originally developed by
Sun Microsystems and released in 1995.
It works on various platforms, such as Windows, Mac OS, and various versions of OS UNIX.
Java is a language that **fully implements the concept of OOP**.

## Four principles of object-oriented programming:
- abstraction (),
- encapsulation,
- polymorphism,
- inheritance.

You need to know these principles, they are asked about in interviews.

## Classes, objects, fields and methods.

Classes in Java define new data types that are formed from existing
primitive data types.

Each class encapsulates Objects, these are instances of a given type that are identical in
their characteristics and behavior.

Encapsulates == describes, sets a template, defines the characteristics and behavior of OBJECTS
of a class.

Just as we can create a **set of variables of a primitive type**,
we can create a set of classes, and in them a set of objects of a given class.

**Classes** contain **fields** and **methods**:
* Fields contain data characterizing the object;
* Methods define the functionality of the object.

## Abstraction
Abstraction allows developers to focus on important aspects of a class,
ignoring details that are not critical to solving the current problem.

## Encapsulation
Encapsulation is the unification in a class of data characterizing the state of an object (the composition of fields, their values), and the functionality responsible for its behavior (methods).

**Encapsulation** is one of the key principles of OOP, which allows you to hide the details of the implementation of an object and provide only the necessary interface for interacting with it.
It is like wrapping a gift - you only see the appearance, you do not know what is inside,
but you can find out what is inside and act through methods.

Due to encapsulation, a mechanism is provided that allows you to delimit access to various fields and methods of a class. This mechanism is called "hiding".

## Creating a class (capsule)
- **Step 1:** creating fields
- we define a list of variables and their types, decide on the values ​​of modifiers
* public or private (most often)
* static

- when writing code for a class field, we go in the opposite direction, first we write:
- modifier
- then the variable type
- then the variable name

- **Step 2:** defining methods

- standard methods:
- constructor (allows you to create objects, class instances)
- getters (allow you to get the values of object fields), get = get
- setters (allow you to set the values of object fields), set = set the value

- additional methods

**Example:**
Class **Car:** - this is a new data TYPE (!!!) **Car**
Class fields:

- brand: String brand;
- color: String color;
- model: String model;
- year of manufacture: int year;
- engine power: double enginePower;
- fuel type: String fuelType;

The 'car' object includes/collects all the listed fields.

A set of **homogeneous objects** forms a **Class**.

- objects are described using standard data types, specifying a set of fields that characterize the
  object. A set of fields is a description of the object and its state
  (object characteristics).

- class objects are created using a **constructor** (standard class method),
  field values are set using **setters** (these are standard class methods),
  field values are found out using **getters** (these are standard class methods).

- the state of objects is changed using METHODS (an example for a car is to stop, drive, accelerate,
  brake, change the number, change the color, etc.).

</details>

<hr>

<details style="padding-top: 18px">
  <summary style="cursor: pointer;"><b>На русском</b></summary>

# ООП - объектно ориентированное программирование (OOP)

Взгляд на программирование «под новым углом» (отличным от процедурного) предложили
**Алан Кэй** и **Дэн Ингаллс** в языке Smalltalk. Здесь понятие **класса** стало
основообразующей идеей для всех остальных конструкций языка
(то есть класс в Smalltalk является примитивом, посредством которого описаны более сложные конструкции).
Именно он стал первым широко распространённым объектно-ориентированным
языком программирования.

**Java** – высокоуровневый язык программирования, изначально разработанный компанией
Sun Microsystems и выпущенный в 1995 году. 
Работает на различных платформах, таких как Windows, Mac OS, а также различных версиях OS UNIX.
Java - это язык, который **полностью реализует концепцию ООП**.

## Четыре принципа объектно-ориентированного программирования:
- абстрагирование (),
- инкапсуляция (encapsulation),
- полиморфизм (polymorphism),
- наследование (inheritance).

Эти принципы надо знать, о них спрашивают на собеседованиях.

## Классы, объекты, поля и методы.

Классы в Java определяют новые типы данных, которые формируются из имеющихся
примитивных типов данных.

Каждый класс инкапсулирует в себе Объекты, это экземпляры данного типа одинаковые по
своим характеристикам и поведению.

Инкапсулирует == описывет, задает шаблон, определяет характеристики и поведение ОБЪЕКТОВ
класса.

Так же, как мы можем создать **множество переменных примитивного типа**,
мы можем создавать множество классов, а в них множество объектов данного класса.

**Классы**, **объекты**, **поля** и **методы**:
* Поля содержат данные характеризующие объект;
* Методы определяют функциональность объекта.

## Абстрагирование
Абстрагирование позволяет разработчикам сосредоточиться на важных аспектах класса, 
игнорируя детали, которые не являются критичными для решения текущей задачи.

## Инкапсуляция
Инкапсуляция - это объединение в классе данных, характеризующих состояние
объекта (состав полей, их значения), и функциональность отвечающую за его поведение (методы).

**Инкапсуляция** - это один из ключевых принципов ООП, который позволяет скрыть детали
реализации объекта и предоставить только необходимый интерфейс для взаимодействия с ним.
Это подобно упаковке подарка - вы видите только внешний вид, не знаете, что внутри,
но можете узнать что внутри и действовать через методы.

За счет инкапсуляции обеспечивается механизм, позволяющий разграничивать доступ к
различным полям и методам класса. Этот механизм называется "сокрытие".


## Создание класса (капсулы)
- **Шаг 1:** создание полей
    - определяем перечень переменных и их типов, принимаем решения о значениях модификаторов
        * public или private (чаще всего)
        * static

    - при написании кода для поля класса идем в обратном направлении, сначала пишем:
        - модификатор
        - потом тип переменной
        - потом имя переменной

- **Шаг 2:** определение методов

    - стандартные методы:
        - конструктор (позволяет создавать объекты, экземпляры класса)
        - геттеры (позволяют получить значения полей объекта), get = получать
        - сеттеры (позволяют установить значения полей объекта), set = устанавливать значение

    - дополнительные методы


**Пример:**
Класс **Автомобиль:** - это новый ТИП данных(!!!) **Car**
Поля класса:

- марка: String brand;
- цвет: String color;
- модель: String model;
- год выпуска: int year;
- мощность двигателя: double enginePower;
- тип топлива: String fuelType;

Объект 'car' включает/собирает в себя все перечисленные поля.

Совокупность **однородных объектов** формирует **Класс (Class)**.

- объекты описывают с помощью стандартных типов данных, задавая набор полей, которые характеризуют
  объект. Совокупность полей – это есть описание объекта и его состояния
  (характеристики объекта).

- объекты класса создают с помощью **конструктора** (стандартного метода класса),
  значения полей устанавливают с помощью **сеттеров** (это стандартные методы класса),
  значения полей узнают с помощью **геттеров** (это стандартные методы класса).

- состояние объектов изменяют с помощью МЕТОДОВ (пример для автомобиля - стоять, ехать, разгоняться,
  тормозить, сменить номер, сменить цвет и т.д.).


</details>
