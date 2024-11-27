<details>
  <summary style="cursor: pointer;"><b>English</b></summary>

# OOP - object-oriented programming (OOP)

## Inheritance

1. Inheritance is a concept of object-oriented programming,
   according to which a created data type can inherit data and functionality
   from an existing type, facilitating the reuse of software components.

**A simpler and more practical definition of inheritance:**
a new class can inherit fields and methods from an existing class.
In the child class, the composition of fields is expanded, and methods are overridden.

2. To initialize inheritance from another class, use the service word **extends**.

Examples:

public class Laptop extends Computer{
...
}
______________________________________________

public class Dog extends Pet {
...
}

______________________________________________

public class Cat extends Pet {
...
}
______________________________________________

The parent class is also called the super class (**super**). The heir class is called a child class.
It is allowed to inherit only from one class.

Using inheritance, in Java, you can build complex class hierarchies.

3. The heir class inherits the fields and methods of the super class.
   In the child class, you can override the methods of the parent class if necessary
   to change, or define new functionality in them.
   Constructors are not inherited (except for the default one, if there are no other constructors).

4. The child class creates its own set of constructors for class objects.
   Fields from the parent class are obtained using super().

### Modifiers
In addition to the public, private modifiers, there are also protected and package-protected modifiers (which is the default modifier).

**protected** modifier:
Access within the package: Members of a class with the protected modifier are available to all classes in the same package.
Access in subclasses: Class members with the protected modifier are also accessible in subclasses, even if they are in a different package. This allows you to inherit and use protected members in a class hierarchy.

**Package-private**:
Access only within a package.
Class members without an explicit access modifier (or with no modifier, which is package access by default) are accessible only to classes in the same package.
They are not accessible to classes in other packages, even if these classes are subclasses.

4. If you want to prohibit inheritance from a class, then the final modifier is used.

final class SuperMan {
...
}

5. All classes that do not explicitly specify a superclass inherit from the **Object** class.
   That is, the **Object class is the parent of all classes in Java** by default.
   In particular, all classes inherit the toString method from the Object class, which returns a string

representation of the object (fields and their values ​​in one line).

6. Check the conformity of types (relationship of objects of different classes),
   using the **instanceof** operator.

-------------------------------------------------------------------------

# OOP

A set of **object fields of uniform structure** forms a **Class**.

- objects are described using standard data types, specifying a set of fields that
  characterize the object. A set of fields is a description of the object and its state
  (object characteristics).

- class objects are created using a **constructor** (standard class method),
  field values are set using **setters** (these are standard class methods),
  field values are found out using **getters** (these are standard class methods).

- the state of objects is changed using methods (an example for a car - stop, go, accelerate,
  brake, get a number, paint in color, etc.).

## The 'this' Keyword in Java
this is a keyword in Java that is used inside class methods to refer to the
**current object**.

It denotes that we are accessing attributes or methods of the object in which the
code is executing.

The **this** keyword can be used to resolve naming conflicts between method arguments and
class fields if they have the same name.

## Encapsulation

The principle of encapsulation in Java (and in object-oriented programming in general) says the following:

Data Hiding: Encapsulation allows you to hide the internal implementation details of a class from the outside world. This is achieved through the use of access modifiers (e.g. private, protected, public). Data hidden in a class can be accessed from other classes **only** through public getters and setters.

Access Control: Encapsulation allows you to control access to the data and methods of a class. For example, variables can be declared as private to prevent direct access from other classes. This helps protect data from misuse and modification.

Maintaining Data Integrity: Using encapsulation helps ensure data integrity. Public methods provided to access private variables (getters and setters) can include checks and validations, which ensures that the data is used correctly.

Simplifying Changes: Thanks to encapsulation, changes in the implementation of a class do not affect the code that uses this class. The external interface (public methods) remains unchanged, which makes it easier to maintain and evolve the code.

## Polymorphism

There are two types of polymorphism:

- Parametric (true) polymorphism.
- "Ad-hoc" polymorphism. It is also called "overloading" of constructors and methods.

Today we will look at "Ad-hoc" polymorphism (polymorphism on demand).

Polymorphism in programming languages ​​and type theory is the ability of the same function (method) to process data of different types, receiving a different set of arguments.
In Java, ad-hoc polymorphism is implemented as the ability to **overload methods**.

We can overload methods by creating **multiple methods and constructors in a class with the same name, but different types and/or number of arguments.**

A method is said to be "overloaded" when we can use the same method to work with different sets of incoming method arguments.

</details>

<hr>

<details style="padding-top: 18px">
  <summary style="cursor: pointer;"><b>На русском</b></summary>

# ООП - объектно ориентированное программирование (OOP)

## Наследование

1. Наследование (англ. inheritance) — концепция объектно-ориентированного программирования,
   согласно которой создаваемый тип данных может наследовать данные (поля) и функциональность (методы)
   от уже существующего типа, способствуя повторному использованию компонентов
   программного обеспечения.

**Более простое и практичное определение наследования:**
создаваемый новый класс может наследовать поля и методы от уже существующего класса.
В дочернем классе состав полей **расширяется**, а методы **переопределяются**.

2. Для инициализации наследования от другого класса используют служебное слово **extends**.

Примеры:

public class Laptop extends Computer{
  ...
}
______________________________________________

public class Dog extends Pet {
  ...
}

______________________________________________

public class Cat extends Pet {
  ...
}
______________________________________________

Родительский класс называют еще супер-классом (**super**). Класс наследник, называют дочерним классом.
Наследовать разрешено только от одного класса.

При помощи наследования, в Java, можно строить сложные иерархии классов.

3. Класс-наследник, наследует поля и методы супер-класса.
   В дочернем классе можно переопределить методы родительского класса, если необходимо
   изменить, или определить в них новую функциональность.
   Конструкторы не наследуются (кроме дефолтного, если других конструкторов
   нет). 

4. В дочернем классе создается свой набор конструкторов для объектов классов. 
Поля из родительского класса получаются с помощью `super()`. 

### Модификаторы
Кроме модификаторов public, private, существуют еще модификаторы protected и package-protected (являющийся дефолтным модификатором).

Модификатор **protected**:
Доступ в пределах пакета: Члены класса с модификатором protected доступны для всех классов в том же пакете.
Доступ в подклассах: Члены класса с модификатором protected также доступны в подклассах, даже если они находятся в другом пакете. Это позволяет наследовать и использовать защищенные члены в иерархии классов.

**Пакетный доступ (package-private)**:
Доступ только в пределах пакета.
Члены класса без явного модификатора доступа (или с отсутствующим модификатором, что по умолчанию является пакетным доступом) доступны только для классов в том же пакете.
Они недоступны для классов в других пакетах, даже если эти классы являются подклассами.

4. Если необходимо запретить наследование от класса, то используется модификатор final.

final class SuperMan {
...
}

5. Все классы у которых явно не указан супер-класс, наследуются от класса **Object**.
   То есть **класс Object является родителем всех классов в Java** по умолчанию.
   В том числе, все классы наследуют от класса Object метод toString, возвращающий строковое
   представление объекта (поля и их значения в одной строчке).

6. Проверить соответствие типов (родство объектов разных классов),
   можно при помощи оператора **instanceof**.

-------------------------------------------------------------------------

# OOP

Совокупность **однородных по своей структуре полей объектов** формирует **Класс (Class)**.

- объекты описывают с помощью стандартных типов данных, задавая набор полей, которые
  характеризуют объект. Совокупность полей – это есть описание объекта и его состояния
  (характеристики объекта).

- объекты класса создают с помощью **конструктора** (стандартного метода класса),
  значения полей устанавливают с помощью **сеттеров** (это стандартные методы класса),
  значения полей узнают с помощью **геттеров** (это стандартные методы класса).

- состояние объектов изменяют с помощью методов (пример для автомобиля - стоять, ехать, разгоняться,
  тормозить, получить номер, покрасить в цвет и т.д.).

## Ключевое слово this в Java
this - это ключевое слово в Java, которое используется внутри методов класса для ссылки на
**текущий объект**.

Оно обозначает, что мы обращаемся к атрибутам или методам объекта, в котором выполняется
данный код.

Слово **this** может быть использовано для разрешения конфликта имён между аргументами метода и
полями класса, если они имеют одинаковые имена.


## Инкапсуляция

Принцип инкапсуляции в Java (и в объектно-ориентированном программировании в целом) говорит о следующем:

Сокрытие данных: Инкапсуляция позволяет скрывать внутренние детали реализации класса от внешнего мира. Это достигается за счет использования модификаторов доступа (например, private, protected, public). Скрытые в классе данные могут быть доступны из других классов **только** через публичные методы геттеры и сеттеры.

Контроль доступа: Инкапсуляция позволяет контролировать доступ к данным и методам класса. К примеру, переменные могут быть объявлены как private, чтобы предотвратить прямой доступ к ним из других классов. Это позволяет защищать данные от некорректного использования и модификации.

Поддержание целостности данных: Использование инкапсуляции помогает обеспечивать целостность данных. Публичные методы, предоставляемые для доступа к приватным переменным (геттеры и сеттеры), могут включать в себя проверки и валидацию, что гарантирует корректное использование данных.

Упрощение изменений: Благодаря инкапсуляции, изменения в реализации класса не влияют на код, который использует этот класс. Внешний интерфейс (публичные методы) остается неизменным, что облегчает поддержание и развитие кода.

## Полиморфизм

Бывает два вида полиморфизма:

- Параметрический (истинный) полиморфизм.
- "Ad-hoc" полиморфизм. Его еще называют "перегрузка" конструкторов и методов.

Сегодня мы рассмотрим "Ad-hoc" полиморфизм (полиморфизм по запросу).

Полиморфизм в языках программирования и теории типов — способность одной и той же функцией (методом) обрабатывать данные разных типов, получая разный набор аргументов.
В Java ad-hoc-полиморфизм реализован в виде возможности **перегружать методы**.

Мы можем перегружать методы, создавая в классе **несколько методов и конструкторов с
одинаковым названием, но отличающихся типами и/или количеством аргументов.**

Говорят, что метод "перегружен", когда мы можем одним и тем же методом работать
с разными наборами входящих аргументов метода.


</details>
