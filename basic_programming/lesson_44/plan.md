<h3 style="text-align: center; padding-bottom: 14px">2024-02-02</h3>

# Lesson plan #44 11/12/2024:

## 1. What we did in the last lesson:
* streams of primitives Integer, Long, Double
* stream Stream<String> cities
* List<String> cityList
* select the needed using ...
* transform using ...
* sort using ...
* collect into a collection using ...
* List of cars <CarStream>

## 2. Discussing homework:
- evaluate students
- select prime numbers from a list
- class Boat and its processing

Any questions?

------------------------------------------------- --------------------------

## 3. Topic of the lesson:
- using .stream() in practical problems

## 4. Practice:

**Task 1.**
- problems about Programmers and Technologies (programming languages)

Create a Programmer class.
In this class, it is necessary to take into account the programmers and the number of programming languages ​​that the programmers know (technologies).
The more languages ​​(quantity), the "cooler" the programmer.

To obtain data from the Programmer class, it is necessary to answer the questions:
1. Which of the programmers knows the most languages ​​(by name)
   F I -> number of languages ​​or number of languages ​​-> programmer
2. Which languages ​​are advantageous among our programmers
   programming language -> how many programmers know it

**Task 2.**
- a task about Containers and Parcels:

Create a Container class with fields: String label (marking) and List<Box> - a list of boxes with parcels.
Create a Box class with a field: List<Parcel> - a list of parcels.
The Container and Box classes are iterable.
Create a Parcel (package) class with a double weight field - the weight of the parcel.
Create a ShipmentAppl class using the main method.
Think of a random number of containers (10 to 20).
In each container, think of a random number of boxes (10 to 20).
In each box, think of a random number of parcels (5 to 10).
It is assumed that each parcel has an average weight of = 2 kg.

Below, read the total number of parcels in all boxes and their total weight.

Find the label of the container that has the largest number of parcels.

Choose all containers with the maximum dose of parcels.


___

## Пройденные темы:

**L23 - приложение Library, CRUD-операции
L24 - RegEx, String vs StringBuilder**
**L25 - Абстрактные классы и абстрактные методы**
**L26 - Интерфейсы
L27 - Повторение и закрепление
L28 - Выборка элементов из массива, удовлетворяющих заданному условию, интерфейс Predicate
L29 - Generics (дженерики)
L30 - Comparable<T> и Comparator<T> для сортировки массива объектов**
**L31 - класс Arrays и его методы
L32 - Повторение и закрепление**

## Пройденные темы:
**L33 - Enum - перечислимый тип
L34 - Java Time API
L35 - Album application with LocalDate field
L36 - JCF - introduction, Iterator<T>, foreach loop, iList 
L37 - List<T>, ArrayList<>()
L38 - LinkedList<>() 
L39 - Set<T>, HashSet<>()**
**L40 - TreeSet<>(), Collections** 
**L41 - Map<K, V>, HashMap<>(), TreeMap<T>()**
L42 - Повторение и закрепление
-----------------------

# Следующие темы
**- Stream API**
- IO API - читать, писать в файлы (ex. ToDoList)
- Git, GitHub - веточки (brunch, fork), коллективная разработка
- написать итоговый проект


# План занятия №44 12.11.2024:

## 1. Что мы сделали на прошлом занятии:
* стримы примитивов Integer, Long, Double
* стрим Stream<String> cities
* List<String> cityList
  * отбираем нужное с помощью ...
  * преобразуем с помощью ...
  * сортируем с помощью ...
  * собираем в коллекцию с помощью ...
* List<CarStream> cars

## 2. Обсуждаем ДЗ:
- оценки студентов
- отбор простых чисел из списка
- класс Boat и его обработка


Есть ли вопросы?

----------------------------------------------------------------------------

## 3. Тема занятия:
- использование .stream() в практических задачах


## 4. Практика:

**Задание 1.**
- задача о Программистах и Технологиях (языки программирования), 
  - возможные варианты этой же задачи по смыслу:
    - туристы и страны
      - турист 1 - страна 1, страна 2, ...
      - турист 2 - страна 2, страна 3, ...
    - группа товаров и их поставщики
      - костюмы - brand 1, brand 2 ...

Создайте класс Programmer.
В этом классе нужно учесть программиста и количество языков программирования, которые знает программист (technology).
Чем больше языков (количество), тем "круче" программист.

Используя данные из класса Programmer необходимо ответить на вопросы:
1. Кто из программистов знает больше всего языков (поименно)
   Ф И - > кол-во языков или кол-во языков -> программист
2. Какие языки пользуются популярностью среди наших программистов
   язык программирования -> сколько программистов его знают




**Задание 2.**
- задача о Контейнерах и Посылках:

Создайте класс Container с полями: String label (маркировка) и List<Box> - список коробок с посылками.
Создайте класс Box с полем: List<Parcel> - список посылок.
Классы Container и Box являются итерируемыми.
Создайте класс Parcel (посылка) с полем double weight - вес посылки.
Создайте класс ShipmentAppl с методом main.
Задумайте случайное количество контейнеров (от 10 до 20).
В каждом контейнере задумайте случайное количество коробок (от 10 до 20).
В каждой коробке задумайте случайное количество посылок (от 5 до 10).
Предположим, что каждая посылка в среднем имеет вес = 2 кг.

Подсчитайте общее количество посылок во всех ящиках и их общий вес.

Найдите label того из контейнеров, в котором оказалось максимальное количество посылок.

Найдите все контейнеры с максимальным количеством посылок.






