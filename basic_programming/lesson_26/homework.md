
<details style="margin-top: 16px">
  <summary style="cursor: pointer; color: blue;"><b>English</b></summary>

**TASK 1.**
Implement the application according to the following plan:

Abstract class Detail with fields:
barCode: long
size: double
material: String
vendor: String
weight: double

Child class Gear with fields:
radius: double
tooth: int

Child class Lever with fields:
power: double

Interface Stock with methods:
- add a part to the warehouse
- find a part by barCode
- update data about the part
- delete a part
- total weight of all parts in the warehouse
- average weight of parts in the warehouse

StockImpl
- inherit methods from the Stock interface

StockImplTest
- implement tests


</details>

<hr>

<details style="margin-top: 16px">
  <summary style="cursor: pointer; color: blue;"><b>На русском</b></summary>

**ЗАДАНИЕ 1.**
Реализовать приложение по следующему плану:

Абстрактный класс Detail (деталь) с полями:
*     barCode: long
*     size: double
*     material: String
*     vendor: String
*     weight: double

Дочерний класс Gear (шестеренка) с полями:
*     radius: double
*     tooth: int

Дочерний класс Lever (рычаг) с полями:
*     power: double

Интерфейс Stock c методами:
* добавить деталь на склад
* найти деталь по barCode
* обновить данные о детали
* удалить деталь
* общая масса всех деталей на складе
* средняя масса деталей на складе

StockImpl
* унаследовать методы из интерфейса Stock

StockImplTest
* реализовать тесты

ЗАДАНИЕ 2(*).
Провести рефакторинг Document-Archive с учетом Interface.

</details>
