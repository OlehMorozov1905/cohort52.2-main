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

# Lesson plan #31 10/24/2024:



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


# План занятия №31 24.10.2024:

## 1. Что мы сделали на прошлом занятии:

- использовали лямбда-выражения в компараторах

`@Test
void testSortSoldiersByName(){
printArray(soldiers);
Arrays.sort(soldiers, (s1, s2) -> s1.getName().compareTo(s2.getName())); // сортировка по алфавиту от A до Z потом a до z
printArray(soldiers);
}`

- научились производить сортировку по нескольким полям
  `  @Test
  void testSortSoldiersByProfile(){
  printArray(soldiers);
  Arrays.sort(soldiers, (s1, s2) -> {
  int res = -(s1.getProfile() - s2.getProfile()); // sort by Profile
  return res !=0 ? res : - s1.getHeight() + s2.getHeight(); // sort by Height
  });
  printArray(soldiers);
  }`

- отработали использование binarySearch для поиска элемента в массиве объектов
  `  @Test
  void testArraysBinarySearch(){
  printArray(soldiers);
  System.out.println("------------------------------------");
  Arrays.sort(soldiers, (s1, s2)-> (s1.getProfile() - s2.getProfile())); // sort aray before searching!!!
  printArray(soldiers);
  Soldier pattern = new Soldier(null, 0, 0, 100); // who's searching
  int index = Arrays.binarySearch(soldiers, pattern, (s1, s2)-> (s1.getProfile() - s2.getProfile())); // search
  System.out.println(index);
  printArray(soldiers);
  }`


## 2. Обсуждаем ДЗ:
- сортировка массивов объектов своего типа
- сортировка массивов объектов типа Double

Есть ли вопросы?

----------------------------------------------------------------------------

## 3. План на сегодняшнее занятие:

- класс Arrays и его методы:
  * Arrays.copyOf
  * Arrays.copyOfRange
  * System.arraycopy

4. Практика:
   **Задание 1.**
   Создать класс City - название, население.
   Сделать класс Citi сортируемым по полю кол-во населения.
   Создать массив городов:
   City("Denver", 600_000);
   City("Boston", 670_000);
   City("Chicago", 2_700_000);
   City("Atlanta", 470_000);
   City("New York", 8_500_000);
   City("Dallas", 1_300_000);

Распечатать в отсортированном виде.
Есть ли в списке городов город с населением 1.2 млн человек?
Отсортируйте список по алфавиту.
Есть ли в списке город по имени Chicago? Какой он имеет номер в списке?

Скопируйте массив в другой, имеющий в 2 раза большую длину.
Отсортируйте полученный массив.

Имеется ли в списке городов город Salem?
"Salem", 690_000

Проверьте работу метода System.arraycopy, скопировав часть массива.
Проверьте работу метода Arrays.copyOfRange

Вставьте город Salem в список, сохранив порядок сортировки по населению.

**Задание 2.**
Выполните рефакторинг приложения Employee-Company:
- метод remove - использовать System.arraycopy
- метод findEmployeesHoursGreaterThan - использовать лямбда-выражение
- метод findEmployeesSalaryRange - использовать лямбда-выражение







