<details>
  <summary style="cursor: pointer;"><b>English</b></summary>

# Abstract classes and methods

1. When creating applications, it is sometimes useful/necessary to create a class from which other classes should inherit,
   but it is advisable to prohibit the creation of objects of this parent class.

In this case, the parent class is declared as abstract,
using the **abstract** keyword before the class name.
**Objects of an abstract class cannot be created.**

1. To select elements from an array that satisfy a given condition, you must first count the number of array elements that satisfy the condition. Then create an array for this number, and only then fill it. To implement this functionality, we create methods that return an array.

2. Testing methods that return an array is carried out using assertArrayEquals.

3. Starting with Java 8, default methods can be used in interfaces.
   Such a method is marked with the default keyword and has a ready-made implementation.
   Default methods do not necessarily need to be overridden.

4. The default interface fields are constants. That is, marked as public static final.

5. UML (Unified Modeling Language) is a graphical description language for object modeling in the field of software development, for modeling business processes, system design and displaying organizational structures. UML is a general-purpose language, an open standard that uses graphical notations to create an abstract model of a system, called a UML model. UML was created to define, visualize, design, and document, mainly, software systems. UML is not a programming language, but code generation is possible based on UML models.

6. Class diagram - a static structural diagram that describes the structure of a system, showing the classes of the system, their attributes, methods, and dependencies between classes.

7. Starting with Java 5, the language has Generics - parameterized types and methods.
   The task of "generics" is to make it possible to write universal, strongly typed code, in which the decision

on a specific type is postponed "for later". For example, the type on which an object "specializes"

is determined not at the time of class creation, but at the time of object creation.
The parameter (generic) is specified in angle brackets - ``<T>`` (diamond operator).

8. Starting with Java 8, the Predicate``<T>`` interface appeared.
   This interface has a single abstract method: boolean test(T t);
   Objects of the Predicate type are used to organize selection by condition (filtering).

9. In Java, you can create objects of anonymous classes. That is, create objects of interfaces, or abstract classes,
   while immediately, on the spot, implementing abstract methods. Starting with Java 8, for interfaces and abstract classes
   that have only one abstract method, you can use a simplified syntax of lambda expressions:
   (arguments) -> method body


</details>

<hr>

<details style="padding-top: 18px">
  <summary style="cursor: pointer;"><b>На русском</b></summary>

1. Для выборки элементов из массива, удовлетворяющих заданному условию, надо сначала подсчитать количество элементов массива, удовлетворяющих условию. Потом создать массив под это количество, и только потом его заполнить. Для реализации такой функциональности, мы создаем методы возвращающие массив.

2. Тестирование методов возвращающих массив, осуществляется при помощи assertArrayEquals.

3. Начиная с Java 8 в интерфейсах можно использовать дефолтные методы.
   Такой метод помечается ключевым словом default и имеет готовую реализацию.
   Дефолтные методы не обязательно переопределять в дочерних классах.

4. Полями интерфейса по умолчанию являются константы. Т. е. помеченные как public static final.

5. UML (Unified Modeling Language — унифицированный язык моделирования) — язык графического описания для объектного моделирования в области разработки программного обеспечения, для моделирования бизнес-процессов, системного проектирования и отображения организационных структур. UML является языком широкого профиля, это — открытый стандарт, использующий графические обозначения для создания абстрактной модели системы, называемой UML-моделью. UML был создан для определения, визуализации, проектирования и документирования, в основном, программных систем. UML не является языком программирования, но на основании UML-моделей возможна генерация кода.

6. Диаграмма классов (Class diagram) — статическая структурная диаграмма, описывающая структуру системы, демонстрирующая классы системы, их атрибуты, методы и зависимости между классами.

7. Начиная с Java 5 в языке появились Generics - параметризованные типы и методы.
   Задача "дженериков", сделать возможным писать универсальный, строго типизированный код, в котором решение
   о конкректном типе откладывается "на потом". Например, тип на котором "специализируется" объект
   определяется не в момент создания класса, а в момент создания объекта.
   Параметр (generic) указывается в угловых скобках - ``<T>`` (diamond operator).

8. Начиная с Java 8, появился интерфейс Predicate``<T>``.
   В этом интерфейсе есть единственный абстрактный метод: boolean test(T t);
   Объекты типа Predicate используются для организации выборки по условию (фильтрации).

9. В Java можно создавать объекты анонимных классов. Т. е. создавать объекты интефейсов, или абстрактных классов,
   при этом сразу, на месте, имплементируя абстрактные методы. Начиная с Java 8, для интерфейсов и абстрактных классов имеющих только один абстрактный метод, можно использовать упрощенный синтаксис **лямбда выражений**:
   (arguments) -> method body

</details>
