<details>
  <summary style="cursor: pointer;"><b>English</b></summary>

# Stream
Stream can be created for any iterized object. Stream is a sequence of operations over the elements of an iterized object.

With the advent of Java 8 Stream API, it allowed programmers to write significantly shorter what previously occupied a lot of lines of code, namely, to simplify work with data sets, in particular, to simplify operations:
- filtration (data selection by criterion),
- sorting,
- transformation,
- and other manipulations with data (see below).

Streams consist of ** intermediate ** and ** terminal ** operations.
There can be several intermediate operations and they always return the stream.
There can be only one terminal operation, and it is placed at the end of Stream.
The terminal operation returns the result of the work of the entire stream.

Stream "lazy". That is, the stream will begin to work only when a terminal operation is added to it.

If in Stream, “on the conveyor”, there are objects that, in turn, are icerized, then using the intermediate Flatmap method, you can “wipe” the contents of these objects. In this case, further "according to the conveyor" will move already the contents of the objects.

The terminal method of Collect can collect the contents of Stream in the structure we need. To do this, he needs to transfer the object of the Imlinative Collector Interface. In practice, the Collector interface itself rarely has to implement the Collectors interface itself, because in the Collectors class there are many methods returning a variety of collectors. For example,
Using colleectors.tolist (), you can get a collector collecting elements of stream into the sheet, and using Collectors.toset () - in Set.

Collectors. grampingby allows you to group the stream elements into Mapa, by the key, which is determined by the corresponding function. In this case, the elements corresponding to one key are collected by default in the sheet.

Collectors. grampingby has overloaded options. For example, instead of a default sheet, the result of the work of a collector can be used as Values.

Details about the scheme of the work of Stream and the main operations, see the presentation.

Useful articles:
https://javarush.com/groups/posts/2203-stream-pi
https://metanit.com/java/tutorial/10.1.php

## Operations with data using Stream API

The `Stream API` Java supports a number of operations that allow you to flexibly manipulate data. In addition to the main ones - filtering, sorting and transformation, other important manipulations with data include:

### 1. ** Reduction (Reduction) **
- the information allows you to aggregate the elements of the flow, for example, by calculating the amount, finding the maximum or minimum value, combining all elements into a line, etc.
- Methods: `redCE ()`, `colorLECT ()`.

### 2. ** Grouping and separation (Grouping and Partitioning) **
- These operations are useful for organizing flow elements into groups or dividing them into categories according to a certain criterion.
- It is most often used in combination with `Collectors`, for example,` Collectors. grampingby () `` Collectors.partitioningby () `.

### 3. ** Transformation in a collection or array (Collecting to Collection or Arrays) **
- allows you to convert the flow back to the collection or array.
- Method: `Collect ()` `Collectors.tolist ()`, `Collectors.toset ()`, or transformation into an array through `toarray ()`.

### 4. ** Search and correspondence (Searching and Matching) **
- determines whether the elements of the flow satisfy certain conditions (for example, the search for the first element, the search for any element, the test for the availability of correspondences).
- Methods: `Anymatch ()`, `allmatch ()`, `nonematch ()`, `foundfirst ()` `foundany ()`.

### 5. ** Association (Concatenation) **
- combines two streams into one.
- Method: `Stream.concat ()`.

### 6. ** Limiting and passing elements (Limiting and Skipping Elements) **
- These operations allow you to cut the flow, leaving only a certain number of elements, or skip the first elements.
- Methods: `limit ()`, `skip ()`.

### 7. ** Parallel processing (Parallel Processing) **
- allows you to process the stream of data in parallel, which can increase productivity when working with large amounts of data.
- Method: `parallelstream ()` or `stream (). Parallel ()`.

### 8. ** Duplicate removal (Removing duplicates) **
- Using `DistINCT ()` you can remove the repeated elements in the stream.

### 9. ** Data check (Peeking) **
- The `Peek ()` method allows you to perform an action for each element, without changing it, which is convenient for debugging or temporary recording of values at the intermediate stages.

Each of these operations helps more flexibly and powerfully to work with data, providing opportunities necessary for various scenarios for their processing.


</details>

<hr>

<details style="padding-top: 18px">
  <summary style="cursor: pointer;"><b>На русском</b></summary>

# Stream
Stream можно создать для любого **итерируемого объекта** (JCF). 
Стрим это последовательность операций над элементами итерируемого объекта.
объекты Car -> GarageImpl - garage
фрукты Абрикос (кость + мякоть) -> ящик -> контейнер (ящики с абрикосами)
посылки (адрес, вес, стоимость, страховка) -> перевозка в контейнере -> на корабль/в грузовик -> разобрать  и оприходовать на склад -> отправить по адресатам 

С появлением **Java 8** Stream API позволило программистам писать существенно короче то, что раньше занимало много строк кода, а именно — упростить работу с наборами данных, в частности, упростить операции:
- фильтрации (отбор данных по критерию) - filter(),
- сортировки - sorted(),
- преобразование - map() - преобразование, flatMap() - "вытрусить, преобразовать",
- сбор в коллекции - списки, мапы
- и другие манипуляции с данными (см. ниже).

Стримы состоят из **промежуточных** и **терминальных** операций.
Промежуточных операций может быть несколько и они всегда возвращают стрим.
Терминальная операция может быть только одна, и она помещается в конец стрима.
Терминальная операция возвращает результат работы всего стрима.

Стрим "ленивый". Т. е. стрим начнет работать, только когда к нему будет добавлена терминальная операция.
Стрим не "трогает" (не изменяет) объект - источник.

Если в стриме, "на конвеере", оказываются объекты, которые в свою очередь являются итерируемыми, то при помощи промежуточного метода flatMap можно "вытрусить" содержимое этих объектов. В таком случае далее "по конвееру" будет двигаться уже содержимое объектов.

Терминальный метод collect может собрать содержимое стрима в нужную нам структуру. Для этого ему надо передать объект имплементирующий интерфейс Collector. На практике имплементировать самим интерфейс Collector приходится редко, т. к. в классе Collectors есть много методов возвращающих разнообразные коллекторы. Например,
при помощи Collectors.toList(), можно получить коллектор собирающий элементы стрима в лист, а при помощи Collectors.toSet() - в сет.

Collectors.groupingBy позволяет сгруппировать элементы стрима в мапу, по ключу, который определяется соответствующей функцией. При этом элементы соответствующие одному ключу собираются по умолчанию в лист.

У Collectors.groupingBy есть перегруженные варианты. Например, вместо дефолтного листа, в качестве values можно использовать результат работы какого-нибудь коллектора.

Подробно о схеме работы стрима и основных операциях, смотрите в презентации.

Полезные статьи:
https://javarush.com/groups/posts/2203-stream-api
https://metanit.com/java/tutorial/10.1.php

## Операции с данными с помощью Stream API

`Stream API` Java поддерживает целый ряд операций, которые позволяют гибко манипулировать данными. Помимо главных - фильтрации, сортировки и преобразования, к другим важным манипуляциям с данными относятся:

### 1. **СведЕние (Reduction)**
- Сведение позволяет агрегировать элементы потока, например, путем вычисления суммы, нахождения максимального или минимального значения, объединения всех элементов в строку и т.д.
- Методы: `reduce()`, `collect()`.

### 2. **Группировка и разделение (Grouping and Partitioning)**
- Эти операции полезны для организации элементов потока по группам или разделения их на категории по определенному критерию.
- Используется чаще всего в сочетании с `Collectors`, например, `Collectors.groupingBy()` и `Collectors.partitioningBy()`.

### 3. **Преобразование в коллекции или массивы (Collecting to Collections or Arrays)**
- Позволяет преобразовать поток обратно в коллекцию или массив.
- Метод: `collect()` с `Collectors.toList()`, `Collectors.toSet()`, или преобразование в массив через `toArray()`.

### 4. **Поиск и соответствие (Searching and Matching)**
- Определяет, удовлетворяют ли элементы потока определенным условиям (например, поиск первого элемента, поиск любого элемента, проверка на наличие соответствий).
- Методы: `anyMatch()`, `allMatch()`, `noneMatch()`, `findFirst()`, `findAny()`.

### 5. **Объединение (Concatenation)**
- Объединяет два потока в один.
- Метод: `Stream.concat()`.

### 6. **Лимитирование и пропуск элементов (Limiting and Skipping Elements)**
- Эти операции позволяют обрезать поток, оставляя только определенное количество элементов, или пропустить первые элементы.
- Методы: `limit()`, `skip()`.

### 7. **Параллельная обработка (Parallel Processing)**
- Позволяет обрабатывать поток данных параллельно, что может повысить производительность при работе с большими объемами данных.
- Метод: `parallelStream()` или `stream().parallel()`.

### 8. **Удаление дубликатов (Removing Duplicates)**
- С помощью `distinct()` можно убрать повторяющиеся элементы в потоке.

### 9. **Проверка данных (Peeking)**
- Метод `peek()` позволяет выполнить действие для каждого элемента, не изменяя его, что удобно для отладки или временной записи значений на промежуточных этапах.

### 10. **Преобразование данных map() и flatMap()**

Каждая из этих операций помогает более гибко и мощно работать с данными, предоставляя возможности, необходимые для различных сценариев их обработки.

</details>
