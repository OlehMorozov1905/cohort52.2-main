<h3 style="text-align: center; padding-bottom: 14px">2024-02-02</h3>

Interview Questions## Next Topics:

**L23 - Library application, CRUD operations
L24 - RegEx, String vs StringBuilder
L25 - Abstract classes and abstract methods
L26 - Interfaces
L27 - Iteration and anchoring
L28 - Selecting elements from an array that satisfy a given condition, Predicate interface**
L29 - Generics
L30 - Comparable<T> and Comparator<T> for sorting an array of objects
L31 - Arrays class and its methods
L32 - Iteration and anchoring

# Lesson plan #30 10/23/2024:



___


## Следующие темы:

**L23 - приложение Library, CRUD-операции
L24 - RegEx, String vs StringBuilder**
**L25 - Абстрактные классы и абстрактные методы
L26 - Интерфейсы**
**L27 - Повторение и закрепление**
**L28 - Выборка элементов из массива, удовлетворяющих заданному условию, интерфейс Predicate**
**L29 - Generics (дженерики)
L30 - Comparable<T> и Comparator<T> для сортировки массива объектов**
L31 - класс Arrays и его методы
L32 - Повторение и закрепление


# План занятия №30 23.10.2024:

## 1. Что мы сделали на прошлом занятии:
закончили: 
- метод averageSalary для Employee-Company и тест 

- методы:
Employee[] findEmployeeHoursGreaterThan(int hours); // без использования Predicate
Employee[] findEmployeeSalaryRange(double min, double max);
    и тесты к ним.

реализовали методы в GarageImplementation для отбора элементов из массива, удовлетворяющих заданному условию:
  * выборка по модели: car -> car.getModel().equals(model) // замена if(car.getModel().compareTo(model))
  * выборка по компании: car -> car.getCompany().equals(company)
  * выборка по цвету: car -> car.getColor().equals(color)
  * по двигателю: car -> car.getEngine() > min && car.getEngine() < max

создали класс Wine, массив объектов типа Wine, выполнили его сортировку:
*   по году производства
*   по алфавиту
*   по стоимости

## 2. Обсуждаем ДЗ:
- сортировка объектов массива типа Car
- методы и тесты для GarageImpl

Есть ли вопросы?

----------------------------------------------------------------------------

## 3. План на сегодняшнее занятие:

- класс Arrays и его методы:
  - toString
  - sort
  - binarySearch
- использование лямбда-выражений (элементы функционального программирования) в компараторах
- сортировка объектов Integer

4. Практика:
- создать класс Soldier (Солдат) с полями:
  - name: String
  - height: int
  - weight: double
  - profile: int;
- создать массив "солдат" на 5 элементов
  - John, 182, 82.3, 91
  - Peter, 175, 77.1, 75
  - Robin, 162, 55.1, 91
  - Mary, 159, 55.1, 91
  - Ann", 162, 55, 88
- отсортировать солдат "естественным" образом - по росту
- отсортировать по имени
- по значению profile
- по весу
- проверить работу метода binarySearch на массиве объектов

- отсортировать массив с объектами из класса-обертки Integer







