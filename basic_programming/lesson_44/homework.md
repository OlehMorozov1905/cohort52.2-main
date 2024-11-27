
<details style="margin-top: 16px">
  <summary style="cursor: pointer; color: blue;"><b>English</b></summary>

**Task 1.**

A travel agency specializes in Mediterranean countries - Spain, France, Italy, Greece, Turkey, Tunisia.
There is a table with data on customer trips during 2020-2023 to the listed countries.
Each of the customers visited from one to 3 countries, and some countries 2 or more times.

You need to answer the questions:
1. Which countries are the most popular?
2. Which of the customers visited the largest number of countries?

**Task 2.(*)**
- a task about Containers and Parcels:

Create a Container class with the fields: String label (labeling) and List<Box> - a list of boxes with parcels.
Create a Box class with the field: List<Parcel> - a list of parcels.
The Container and Box classes are iterable.
Create a Parcel class with a double weight field - the weight of the parcel.
Create a ShipmentAppl class with a main method.
Think of a random number of containers (from 10 to 20).
Think of a random number of boxes (from 10 to 20) in each container.
Think of a random number of parcels (from 5 to 10) in each box.
Let's assume that each parcel has an average weight of = 2 kg.

Calculate the total number of parcels in all boxes and their total weight.
Find the label of the container that has the maximum number of parcels.
Find all the containers with the maximum number of parcels.


</details>

<hr>

<details style="margin-top: 16px">
  <summary style="cursor: pointer; color: blue;"><b>На русском</b></summary>

**Задача 0.**
По аналогии с задачами о Boat, Student сделать задачи на основе классоов:
- Book
- Computer

**Задача 1.**

Турагентство специализируется на странах Средиземноморья - Испания, Франция, Италия, Греция, Турция, Тунис.
Имеется таблица с данными о поездках клиентов в течение 2020-2023 годов в перечисленные страны.
Каждый из клиентов посетил от одной до 3 стран, причем некоторые страны по 2 и более раз.

Необходимо ответить на вопросы:
1. Какие страны наиболее популярны?
2. Кто из клиентов посетил наибольшее количество стран?

private static List<Tourist> getTourists() {
return List.of(
new Tourist("Name", "C1", "C2", "C3"),
new Tourist("Olesia", "Iran", "Kyrgystan", "United Arab Emirates", "France", "Italy", "Portugal", "Spain"),
new Tourist("Bilbo Baggins", "Italy", "Spain", "Turkey"),
new Tourist("Tatyana", "Italy", "Spain", "Italy", "Greece", "Turkey"),
new Tourist("Anton", "Germany", "Nederland", "Turkey", "Georgia"),
new Tourist("Sergei_B", "Tunis", "Turkey", "China", "Vietnam"),
new Tourist("Galina", "Italy", "France", "Italy"),
new Tourist("Anatoly", "Montenegro", "Albania", "Greece", "Italy"),
new Tourist("Andrii", "UK", "Ireland", "Spain"),
new Tourist("Liubov", "Croatien", "Slovenien", "Spain", "France", "Egypt"),
new Tourist("Liam", "Spain", "Portugal", "Morocco", "Cyprus"),
new Tourist("Emma", "Greece", "Turkey", "Croatia", "Montenegro"),
new Tourist("Mia", "Italy", "Malta", "Spain", "Turkey"),
new Tourist("Noah", "Turkey", "Greece", "Italy", "Croatia"),
new Tourist("Olivia", "Croatia", "Montenegro", "Albania", "Greece"),
new Tourist("Lucas", "Portugal", "Spain", "France", "Italy"),
new Tourist("Amelia", "Greece", "Cyprus", "Spain", "Italy"),
new Tourist("Oliver", "Spain", "Italy", "Turkey", "Greece"),
new Tourist("Isabella", "France", "Spain", "Italy", "Greece"),
new Tourist("Ethan", "Italy", "Greece", "Spain", "Croatia"),
new Tourist("Ava", "Greece", "Turkey", "Spain", "Italy"),
new Tourist("Liam", "Spain", "Italy", "Morocco", "Greece"),
new Tourist("Sophia", "Italy", "Spain", "Turkey", "Greece"),
new Tourist("Jackson", "Greece", "Spain", "Italy", "Croatia"),
new Tourist("Olivia", "Croatia", "Greece", "Italy", "Montenegro"),
new Tourist("Logan", "Spain", "Greece", "Italy", "Turkey"),
new Tourist("Emma", "Greece", "Italy", "Spain", "Cyprus"),
new Tourist("Aiden", "Italy", "Greece", "Spain", "Turkey")
);
}

**Задача 2.(*)**
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

</details>
