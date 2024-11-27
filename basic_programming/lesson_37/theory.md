<details>
  <summary style="cursor: pointer;"><b>English</b></summary>

# Collections and Iterator
Collections in Java are a set of classes and interfaces that represent various data structures and allow you to work with groups of objects.

Collections simplify the management, storage, and processing of data, providing convenient and efficient tools for working with different types of data.

**Why do we need collections?**
Collections make working with data easier and more efficient by providing standard methods for adding, removing, searching, and sorting elements, without requiring the developer to implement these algorithms manually.

## Why do we need an iterator briefly, without going into details:
In Java, the Iterator interface is used to sequentially iterate over the elements of collections (for example, lists, sets, and other data structures. The main purpose of the Iterable interface is to provide a standardized way to iterate over the elements of a collection without revealing its internal structure.

## Why do we need an iterator in detail:
When an object (list, set, etc.) encapsulates a **set of elements**, then, as a rule, there is a need to iterate over all the elements
of this set.

**Solution option 1:**
If we create a getter for such an object to iterate over it, then by returning a reference to it, we essentially give **_unsafe access to the entire set outside the object_**.
Anyone who receives this reference via the getter can then uncontrollably change the contents of the set inside the object.
**Solution option 2:**
If we return a copy of the set, then this **_negatively affects performance_**, since the set can be very very large.

To solve this problem, there is the **Iterator pattern**.
The essence of the pattern is to create a third-party object that "knows" how to "sort through" (iterate) a set of elements,
encapsulated in the original object.

The iterator object must have two functionalities (two methods):
1) know how to determine whether there is a next element - boolean hasNext();
2) return the current element and move to the next - T next().

In Java, there is an Iterator<T> interface with two abstract methods:
boolean hasNext(), returning true if there are still elements, and false if we have reached the end of the set, and
T next() returning the current element and moving the "pointer" to the next element.
The Iterator interface also has an additional default method void remove(), which has an empty body.
If we need to implement the functionality of correctly removing the current element during iteration,
then the remove method must be overridden.

A class that encapsulates a set to be iterated can implement the Iterable<T> interface
which has only one abstract method Iterator<T> iterator(), which returns an iterator for objects of this class.

For Iterable objects, you can use the for-each loop.
Its signature is as follows:
for (T e: "set of T"){
do_something;

};
In the body of this loop, the variable "e" takes the value of each element from the iterated set in turn.

ATTENTION!
In the for-each loop, you cannot modify the iterated set.

# Complexity (computational complexity)

The concept of **Complexity** (computational complexity) allows you to evaluate the efficiency of the algorithmic solutions used.
In simple terms, we can say that computational complexity tells us in proportion to which mathematical function the number of actions grows when processing a set of elements if the number of elements of this
set increases.

To describe computational complexity, the so-called **"Big O notation"**.

For example, the entry:
O(1) indicates the constant complexity of the algorithm - the number of operations with elements remains a constant finite number and does not grow as the number of elements increases.
**Example:**
The number of elements has increased by 100 times, but the number of operations performed in the algorithm does not change.

O(n) indicates the linear complexity of the algorithm - the number of operations with elements grows proportionally to the number of elements themselves.
**Example:**
the number of elements has increased by 100 times -> the number of operations has also increased by 100 times

O(log(n)) characterizes the logarithmic complexity - the number of operations with elements grows an order of magnitude less than the number of elements themselves.
**Example:**
the number of elements has increased by 100 times -> the number of operations has increased by only 10 times

**ATTENTION!**
The choice of the structure used from Collections is influenced by two main factors:
1. The presence or absence of duplicates in the collection
2. The computational complexity of the algorithms in the internal methods of the collection

### 1. The presence or absence of duplicates
- If **duplicates are needed**, then structures such as **`List`** (for example, `ArrayList`, `LinkedList`) are suitable, where you can store several identical values.
- If **duplicates are not allowed**, choose **`Set`** (for example, `HashSet`, `TreeSet`, `LinkedHashSet`). These structures automatically guarantee the uniqueness of elements.

### 2. The computational complexity of operations
The computational complexity affects the performance of the program and depends on which operations will be performed most often:


</details>

<hr>

<details style="padding-top: 18px">
  <summary style="cursor: pointer;"><b>На русском</b></summary>

# Коллекции и итератор
**Коллекции** в Java — это набор классов и интерфейсов, которые представляют различные структуры данных и позволяют работать с группами объектов. 
Коллекции упрощают управление, хранение и обработку данных, предоставляя удобные и эффективные инструменты (методы) для работы с данными разного типа.

**Зачем нужны коллекции?**
Коллекции делают работу с данными проще и эффективнее за счёт стандартных методов для добавления, удаления, поиска и сортировки элементов, не требуя от разработчика реализации этих алгоритмов вручную.

## Зачем нужен итератор кратко, не вдаваясь в подробности:
В Java интерфейс Iterator служит для последовательного перебора элементов коллекций (например, списков, множества и других структур данных. Основная цель интерфейса Iterable — предоставить стандартизированный способ прохода по элементам коллекции, не раскрывая её внутреннюю структуру.

## Зачем нужен итератор развернуто:
Когда объект (список, множество и пр.) инкапсулирует внутри себя **множество элементов**, то, как правило, имеется необходимость перебрать все элементы
этого множества.

**Вариант решения 1:**
Если для перебора создать геттер такого объекта, то возвращая на него ссылку, мы по сути даем **_небезопасный доступ ко всему множеству за пределами объекта_**.
Получивший эту ссылку по геттеру объект затем может безконтрольно менять содержимое множества внутри объекта.
**Вариант решения 2:**
Если возвращать копию множества, то это **_негативно влияет на производительность_**, так как множество может быть весьма и весьма большим.

## Паттерн Итератор
 Для решения этой проблемы существует **паттерн "Итератор"**.
Суть паттерна – это создать сторонний объект, который "знает" как "перебирать" (итерировать) множество элементов, инкапсулированных в исходном объекте.

Объект итератор должен иметь две функциональности (т.е. два метода):
1) знать как определить, есть ли следующий элемент - boolean hasNext();
2) вернуть текущий элемент и перейти к следующему - T next().

В Java существует интерфейс Iterator<T> с двумя абстрактными методами:
boolean hasNext(), возвращающий true если еще есть элементы, и false если дошли до конца множества, и
T next() возвращающий текущий элемент, и переводящий "указатель" к следующему элементу.
В интерфейсе Iterator существует еще дополнительный дефолтный метод void remove(), который имеет пустое тело.
Если нам необходимо реализовать функциональность корректного удаления текущего элемента в процессе итерирования,
то метод remove надо переопределить.

Класс инкапсулирущий множество, которое надо итерировать, может имплементировать интерфейс Iterable<T> у
которого только один абстрактный метод Iterator<T> iterator(), возвращающий итератор для объектов данного класса.

Для Iterable объектов можно использовать цикл for-each.
Его сигнатура вот такая: 
for (T e: "set of T"){ 
    do_something;
};
В теле этого цикла переменная "e" принимает поочередно значение каждого элемента из итерируемого множества.

**ВНИМАНИЕ!**
В цикле for-each **нельзя создавать/модифицировать итерируемое множество**.

# Complexity (вычислительная сложность)

Понятие **Complexity** (вычислительная сложность), позволяет оценить эффективность применяемых алгоритмических решений.
Простым языком можно сказать, что вычислительная сложность говорит, пропорционально какой математической функции растет
количество действий при обработке множества элементов, если увеличивать количество элементов этого
множества.

Для описания вычислительной сложности используется т. н. **"Big O notation"**.

Например, запись:
O(1) говорит о константной сложности алгоритма - количество операций с элементами остается постоянным конечным числом и не растет при увеличении количества элементов.
**Пример:**
Количество элементов выросло в 100 раз, но при этом количество выполняемых в алгоритме операций не изменяется.

O(n) говорит о линейной сложности алгоритма - количество операций с элементами растет пропорционально количеству самих элементов.
**Пример:**
кол-во элементов выросло в 100 раза -> количество операций выросло также в 100 раз

O(log(n)) характеризует логарифмическую сложность - количество операций с элементами растет на порядок меньше, чем количество самих элементов.
**Пример:**
кол-во элементов выросло в 100 раз -> количество операций выросло всего в 10 раз

## Как правильно выбрать структуру из JKF для своей задачи?
На выбор используемой из Collections структуры влияют два основных фактора:
1. Наличие или отсутствие в коллекции дубликатов
2. Вычислительная сложность алгоритмов во внутренних методах коллекции

### 1. Наличие или отсутствие дубликатов
- Если **нужны дубликаты**, то подойдут такие структуры, как **`List`** (например, `ArrayList`, `LinkedList`), где можно хранить несколько одинаковых значений.
- Если **дубликаты не допускаются**, выбирают **`Set`** (например, `HashSet`, `TreeSet`, `LinkedHashSet`). Эти структуры автоматически гарантируют уникальность элементов.

### 2. Вычислительная сложность операций
Вычислительная сложность влияет на производительность программы и зависит от того, какие операции будут чаще всего выполняться:

- **Добавление и удаление элементов**:
    - В **`ArrayList`** добавление в конец выполняется за (O(1)), но удаление или вставка в середине — за (O(n)).
    - В **`LinkedList`** операции добавления и удаления в начале и в конце эффективны (\(O(1)\)), но вставка и удаление в середине могут быть медленными (\(O(n)\)), так как требуют перемещения указателей.

- **Поиск элементов по значению или ключу**:
    - В **`HashSet`** и **`HashMap`** доступ к элементам занимает (O(1)) в среднем, так как они используют хеширование.
    - В **`TreeSet`** и **`TreeMap`** поиск, добавление и удаление имеют сложность (O(log n)), поскольку они реализованы как сбалансированные деревья и поддерживают порядок.

### Примеры выбора коллекции по этим критериям:
- **Если нужны уникальные элементы и быстрый поиск**: `HashSet`.
- **Если нужны уникальные элементы в отсортированном порядке**: `TreeSet`.
- **Если нужна структура с дубликатами и доступ по индексу**: `ArrayList`.
- **Если нужна очередь с элементами, которые будут извлекаться в определённом приоритете**: `PriorityQueue`.

Таким образом, исходя из наличия/отсутствия дубликатов и требуемой производительности основных операций, можно выбрать коллекцию, которая обеспечит наиболее эффективное выполнение задачи.

</details>
