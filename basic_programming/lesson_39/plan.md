<h3 style="text-align: center; padding-bottom: 14px">2024-02-02</h3>

# Lesson plan #39 11/05/2024:

## 1. What we did in the last lesson:
- discussed the advantages and disadvantages of ArrayList
- solved the problem of merging two lists and removing duplicates
- created an example List<Integer> list = new LinkedList<>(), filled it with random integers, checked the operation of standard methods
- checked the performance of loops
- for each
- Iterator loop
- for i
  for ArrayList and LinkedList (sum of 500 thousand elements.)

## 2. Discussing homework:
- two sheets with temperatures
- capitals of Germany (LinkedList)
- random division of the list into 2 parts

Any questions?

-----------------------------------------------------------------------------

## 3. Lesson topic:
JCF:
Set interface and its implementation class HashSet.
- methods of the Set interface;
- how is HashSet filled and elements searched in it?

## 4. Practice:
**Tasks for using HashSet:**

**Task 1.**
- Find out how many unique words are in the longest sentence in the world by L.N. Tolstoy.
  String sentence = "In the 1800s, in the days when there were no railroads, no highways, no gas or stearin lights, no low spring sofas, no unvarnished furniture, no disappointed young men with glass, no liberal female philosophers, no lovely camellia ladies, of whom there are so many in our time - in those naive times when from Moscow, leaving for St. Petersburg in a cart or carriage, they took with them a whole kitchen of home cooking, traveled for eight days along a soft, dusty or dirty road and believed in Pozharsky cutlets, in Valdai bells and bagels - when on long autumn evenings tallow candles burned, illuminating family circles of twenty and thirty people, at balls wax and spermaceti candles were inserted into candelabra, when furniture was arranged symmetrically, when our fathers were still young not only because of the absence of wrinkles and gray hair, and they shot for women and rushed from the other corner of the room to pick up accidentally or not accidentally dropped handkerchiefs, our mothers wore short waists and huge sleeves and decided family matters by taking out tickets when the lovely camellia ladies hid from daylight - in the naive times of Masonic lodges, Martinists, Tugendbund, in the times of Miloradovich, Davydov, Pushkin - in the provincial town of K. there was a congress of landowners, and the noble elections were ending.";

**Problem 2.**
- Search for mutual friends of two users of a social network.
  In a social network, each user has a list of friends. Write a program that determines mutual friends for two given users.
  Example:
  User A's friends list: ["Ivan", "Maria", "Anna", "Petr"]
  User B's friends list: ["Anna", "Elena", "Petr", "Dmitry"]

Output: ["Anna", "Petr"]

**Task 3.**
- Write an application that will allow you to understand from which places letters are sent to this email.

**Mini-project**
- implementation of the application according to the UML diagram Supermarket

___


## Пройденные темы:

L23 - приложение Library, CRUD-операции
L24 - RegEx, String vs StringBuilder**
L25 - Абстрактные классы и абстрактные методы
L26 - Интерфейсы
L27 - Повторение и закрепление
L28 - Выборка элементов из массива, удовлетворяющих заданному условию, интерфейс Predicate
L29 - Generics (дженерики)
L30 - Comparable<T> и Comparator<T> для сортировки массива объектов**
L31 - класс Arrays и его методы
L32 - Повторение и закрепление

## Следующие темы:
L33 - Enum - перечислимый тип
L34 - Java Time API
L35 - Album application with LocalDate field
L36 - JCF - introduction, Iterator<T>, foreach loop, iList 
L37 - List<T>, ArrayList<>()
L38 - LinkedList<>() 
L39 - Set<T>, HashSet<>()
L40 - TreeSet<>()
L41 - Map<K, V>, HashMap<>(), TreeMap<T>()
L42 - Повторение и закрепление


# План занятия №39 05.11.2024:

## 1. Что мы сделали на прошлом занятии:
- обсудили преимущества и недостатки ArrayList (см. теорию)
- решили задачу об объединении двух списков и удалении дубликатов
- создали пример List<Integer> list = new LinkedList<>(), заполнили его случайными целыми числами, проверили работу стандартных методов
- проверили производительность циклов:
    - for each
    - Iterator loop
    - for i
для ArrayList и LinkedList (сумма 500 тыс. элементов списка)


## 2. Обсуждаем ДЗ:
- два листа с температурой
- столицы Германии (LinkedList)
- случайное разделение списка студентов на 2 части 

Есть ли вопросы?

----------------------------------------------------------------------------

## 3. Тема занятия:
JCF: 
интерфейс Set и его реализация – класс HashSet.
- методы интерфейса Set;
- как происходит заполнение HashSet и поиск в нем элементов?

## 4. Практика:
**Задания на использование HashSet:**

**Задача 1.**
- Выяснить, сколько уникальных слов в самом длинном в мире предложении Л.Н.Толстого.
  String sentence = "В 1800-х годах, в те времена, когда не было еще ни железных, ни шоссейных дорог, ни газового, ни стеаринового света, ни пружинных низких диванов, ни мебели без лаку, ни разочарованных юношей со стеклышками, ни либеральных философов-женщин, ни милых дам-камелий, которых так много развелось в наше время, – в те наивные времена, когда из Москвы, выезжая в Петербург в повозке или карете, брали с собой целую кухню домашнего приготовления, ехали восемь суток по мягкой, пыльной или грязной дороге и верили в пожарские котлеты, в валдайские колокольчики и бублики, – когда в длинные осенние вечера нагорали сальные свечи, освещая семейные кружки из двадцати и тридцати человек, на балах в канделябры вставлялись восковые и спермацетовые свечи, когда мебель ставили симметрично, когда наши отцы были еще молоды не одним отсутствием морщин и седых волос, а стрелялись за женщин и из другого угла комнаты бросались поднимать нечаянно и не нечаянно уроненные платочки, наши матери носили коротенькие талии и огромные рукава и решали семейные дела выниманием билетиков, когда прелестные дамы-камелии прятались от дневного света, – в наивные времена масонских лож, мартинистов, тугендбунда, во времена Милорадовичей, Давыдовых, Пушкиных, – в губернском городе К. был съезд помещиков, и кончались дворянские выборы.";

**Задача 2.**
- Поиск общих друзей у двух пользователей соц.сети.
  В социальной сети у каждого пользователя есть список друзей. Напишите программу, которая определяет общих друзей для двух заданных пользователей.
  Пример:
  Список друзей пользователя A: ["Иван", "Мария", "Анна", "Петр"]
  Список друзей пользователя B: ["Анна", "Елена", "Петр", "Дмитрий"]

  Выход: ["Анна", "Петр"]

**Задача 3.**
- Написать приложение, которое позволит понять, из каких мест на данную почту приходят письма.

**Минипроект**
- реализация приложения по UML-схеме Supermarket


