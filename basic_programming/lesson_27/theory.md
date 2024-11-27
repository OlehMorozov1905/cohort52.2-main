<details>
  <summary style="cursor: pointer;"><b>English</b></summary>

# Abstract classes and methods

1. When creating applications, it is sometimes useful/necessary to create a class from which other classes should inherit,
   but it is advisable to prohibit the creation of objects of this parent class.

In this case, the parent class is declared as abstract,
using the **abstract** keyword before the class name.
**Objects of an abstract class cannot be created.**

Example:

`public abstract class Transport { ... }`

then this class will be prohibited from creating its objects, but it is possible to inherit classes
Car, Bus, LKW, Boat, etc. with parent fields and methods (super).

2. Abstract methods can be created in abstract classes. These are methods that have the abstract keyword in their signature and **no method body**. Abstract methods must be overridden
   in child classes.

NB!: If a child class does not override an abstract method, then it (the class)
must also be declared as abstract.

## Examples of abstract classes and their methods:

### Example 1
public abstract class Language{
String locale;
String group;

abstract void setLanguage();
}

### Example 2
abstract class Human {
String gender;
String race;

abstract void eatFood();
abstract void sleep();
}

### Example 3
abstract class Shape { // figure
double size;

abstract double perimeter();
}

# Interface in Java

1. In Java, you can create a structure that specifies **only abstract methods** - these are methods that have only a signature and no body.

Such structures are called **interfaces**, and they are defined using the **interface** keyword.

Classes can implement (inherit) interfaces using the **implements** keyword.

In simple words:
- we write the methods we need as abstract, omitting the word abstract, since in interface all methods are abstract!
- we inherit these methods using implements in the class(es) where these methods are useful and needed.

In Java, classes can extend (**extends**) only one class, BUT can implement
(**implements**) several interfaces. In this case, the implemented interfaces are listed separated by commas.


</details>

<hr>

<details style="padding-top: 18px">
  <summary style="cursor: pointer;"><b>На русском</b></summary>

# Абстрактные классы и методы

1. При создании приложений бывает полезно/необходимо создать класс от которого должны наследоваться другие классы.
**Абстрактный класс задает базовые поля и методы**, общие для всего семейства наследуемых классов.

При таком подходе целесообразно запретить создание объектов этого родительского класса.
В этом случае родительский класс объявляется как абстрактный,
используя ключевое слово **abstract** перед именем класса.

**Объекты абстрактного класса создавать нельзя.** (запрещено на уровне компилятора). 
Объекты создаются на базе дочрених классов.

   **Пример:**

   `public abstract class Transport { ... }`

   тогда для этого класса будет запрещено создание его объектов, но можно наследовать классы
   Car, Bus, LKW, Boat и т.д. с родительскими полями и методами (super).

2. В абстрактных классах можно создавать абстрактные методы. Это методы у которых в сигнатуре присутствует
   ключевое слово abstract и **отсутствует тело метода**. Абстрактные методы должны быть переопределены
   в дочерних классах.

   NB!: Если дочерний класс не переопределяет абстрактный метод, то он (класс)
   тоже должен быть объявлен как абстрактный.

## Примеры абстрактных классов и их методов:

### Пример 1
      public abstract class Language{
            String locale;
            String group;
      
            abstract void setLanguage();
        }

### Пример 2
      abstract class Human {
         String gender;
         String race;

         abstract void eatFood();
         abstract void sleep();
      }

### Пример 3
    abstract class Shape { // фигура
        douuble size;

        abstract double perimeter();
    }

# Interface в Java

1. В Java можно создать структуру, в которой указаны **только абстрактные методы** - это методы, у которых есть
   только сигнатура и нет тела.

   Такие структуры называются **интерфейсами**, и они определяются при помощи ключевого слова **interface**.

   Классы могут **имплементировать** (наследовать) интерфейсы при помощи ключевого слова **implements**.

   Простыми словами:
   - прописываем необходимые нам методы как абстрактные, опуская слово abstract, так как в interface все методы абстрактные!
- наследуем эти методы с помощью implements в класс(ы), где эти методы полезны и нужны.

  В Java классы могут расширять (**extends**) только один класс, НО могут имплементировать
  (**implements**) несколько интерфейсов. В этом случае имплементируемые интерфейсы перечисляются через запятую.

</details>
