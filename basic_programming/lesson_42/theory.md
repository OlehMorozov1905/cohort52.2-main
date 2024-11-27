<details>
  <summary style="cursor: pointer;"><b>English</b></summary>

# Map <K, V>

## Is the Java Map interface part of JCF?
Yes, the Map interface is part of the Java Collections Framework (JCF). Although Map does not inherit from the Collection interface, it is considered part of JCF because it provides a means to work with collections based on keys and values. In JCF, Map is a separate collection hierarchy, and there are classes like HashMap, TreeMap, LinkedHashMap that implement this interface.

Thus, Map is considered part of JCF, but it implements a different approach to organizing data compared to the Collection interface, which is used for ordered sets of elements.

## Map - in brief

Map<K, V> is an interface that defines the functionality for a data structure of the type set of key-value pairs.

Key is a key, a unique element of a set Set -> HashSet or TreeTree.
Value is a value, some value from the collection List -> ArrayList, LinkedList, ...

The main methods of the `Map` interface in Java:

1. **put(K key, V value)** — adds or updates an element (a key-value pair) to the `Map` at the given key. Returns the previous value associated with the key, or `null` if it did not exist.

2. **get(Object key)** — returns the value associated with the specified key, or `null` if the key is not in the `Map`.

3. **remove(Object key)** — removes an element at the given key. Returns the removed value, or `null` if the element is not found.

4. **containsKey(Object key)** — returns `true` if the `Map` contains the specified key.

5. **containsValue(Object value)** — returns `true` if at least one value in `Map` matches the specified one.

6. **size()** — returns the number of key-value pairs in `Map`.

7. **isEmpty()** — returns `true` if `Map` is empty.

8. **clear()** — removes all elements from `Map`.

9. **putAll(Map<? extends K, ? extends V> m)** — adds all elements from the specified `Map` to the current `Map`.

10. **keySet()** — returns a `Set` containing all keys in `Map`.

11. **values()** — returns a `Collection` containing all values ​​in `Map`.

12. **entrySet()** — returns a `Set` with elements of type `Map.Entry` representing all the key-value pairs in `Map`.

These methods allow you to work with key-value pairs, providing a convenient way to manage associative arrays in Java.

**Attention!!!**
Maps are not iterable over a Map<K, V> object, since Map does not inherit the Iterable interface.
Map objects can be iterated either over a set of keys or over a collection of values.

## What is Map<K, V> used for, for what purposes?
`Map<K, V>` in Java is used to store data in the form of **key-value pairs**. This is very convenient in situations where you need to organize access to data by a unique key. Let's look at a few common scenarios where `Map` can be useful:

### 1. **Associative data storage**
- `Map` is often used to create directories and dictionaries, where the key is a unique identifier, and the value is the information associated with it.
- Examples:
- Phone book (key is a person's name, value is a phone number).
- Employee directory (key is an employee ID, value is information about the employee).
- Product inventory (key is a product SKU, value is information about the product).

### 2. **Counting element frequencies**
- In tasks where you need to count the number of occurrences of each element, `Map` can be used to store the element as the key and its quantity as the value.
- Examples:
- Counting the frequency of words in a text (key is a word, value is frequency).
- Counting the number of each type of product in a store (key is a type of product, value is quantity).

### 3. **Data Caching**
- `Map` is ideal for creating a cache (temporary storage of data for quick access).
- Example:
- Storing the results of complex calculations, where the key is the parameters used in the calculation, and the value is the result. This speeds up program execution, since it allows you to reuse already calculated results.

### 4. **Storing Settings and Configurations**
- System configuration parameters can be conveniently organized in `Map`, where the keys are the parameter names, and the values ​​are their values.
- Example:
- Application configuration (the key is the parameter name, the value is its setting).

### 5. **Processing Data with Unique Identifiers**
- In applications where data is associated with unique identifiers, such as in a database or API, `Map` can serve as an intermediate storage.
- Example:
- Storing user data in a system, where the key is a unique user identifier (such as an ID or email), and the value is an object with information about the user.

### 6. **Grouping data by category**
- `Map` can be used to store data grouped by category, where the key is a category, and the value is a collection of items in that category.
- Example:
- Movies grouped by genre, where the key is the genre and the value is a list of movies of this genre.

### 7. **Implementing complex data structures**
- `Map` can serve as a basis for implementing other data structures.
- Example:
- Graphs (for example, using `Map`, where the key is a node and the value is a list of adjacent nodes).

### Conclusion
`Map<K, V>` is useful in tasks that require fast access to data by a unique key, simplified caching, organizing reference books, counting element frequencies, and grouping.


</details>

<hr>

<details style="padding-top: 18px">
  <summary style="cursor: pointer;"><b>На русском</b></summary>

# Map <K, V>

## Является ли интерфейс Map в Java частью JCF?
Да, интерфейс Map является частью Java Collections Framework (JCF). Хотя Map и не наследуется от интерфейса Collection, он считается частью JCF, так как предоставляет средства для работы с коллекциями, основанными на ключах и значениях. В JCF Map представляет собой отдельную иерархию коллекций, и с ним связаны такие классы, как HashMap, TreeMap, LinkedHashMap, которые реализуют данный интерфейс.

Таким образом, Map считается частью JCF, но реализует другой подход к организации данных по сравнению с интерфейсом Collection, который используется для упорядоченных наборов элементов.

## Map - кратко

Map<K, V> это интерфейс определяющий функциональность для структуры данных типа множество пар ключ-значение.

Key - это ключ, уникальный элемент множества Set -> HashSet либо TreeTree.
Value - это значение, какое-то значение из коллекции List -> ArrayList, LinkedList, ...

Основные методы интерфейса `Map` в Java:

1. **put(K key, V value)** — добавляет или обновляет элемент (пару "ключ-значение") в `Map` по заданному ключу. Возвращает предыдущее значение, связанное с ключом, или `null`, если его не было.

2. **get(Object key)** — возвращает значение, связанное с указанным ключом, или `null`, если ключ отсутствует в `Map`.

3. **remove(Object key)** — удаляет элемент по заданному ключу. Возвращает удалённое значение, или `null`, если элемент не найден.

4. **containsKey(Object key)** — возвращает `true`, если `Map` содержит указанный ключ.

5. **containsValue(Object value)** — возвращает `true`, если хотя бы одно значение в `Map` соответствует указанному.

6. **size()** — возвращает количество пар "ключ-значение" в `Map`.

7. **isEmpty()** — возвращает `true`, если `Map` пуст.

8. **clear()** — удаляет все элементы из `Map`.

9. **putAll(Map<? extends K, ? extends V> m)** — добавляет все элементы из указанного `Map` в текущий `Map`.

10. **keySet()** — возвращает `Set`, содержащий все ключи в `Map`.

11. **values()** — возвращает `Collection`, содержащую все значения в `Map`.

12. **entrySet()** — возвращает `Set` с элементами типа `Map.Entry`, представляющими все пары "ключ-значение" в `Map`.

Эти методы позволяют работать с парами ключ-значение, предоставляя удобный способ управления ассоциативными массивами в Java.

**Внимание!!!**
Мапы не итерируемы по объекту типа Map<K, V>, так как Map не наследует интерфейс Iterable.
Объекты типа Map можно итерировать или по множеству ключей, или по коллекции значений.

## Для чего, для каких задач используют Map<K, V> ?
`Map<K, V>` в Java используется для хранения данных в виде **пар "ключ-значение"**. Это очень удобно в ситуациях, когда нужно организовать доступ к данным по уникальному ключу. Рассмотрим несколько распространённых сценариев, где `Map` будет полезен:

### 1. **Ассоциативное хранение данных**
- `Map` часто используют для создания справочников и словарей, где ключом является уникальный идентификатор, а значением — связанная с ним информация.
- Примеры:
    - Телефонная книга (ключ — имя человека, значение — номер телефона).
    - Справочник сотрудников (ключ — идентификационный номер сотрудника, значение — информация о сотруднике).
    - Инвентаризация товаров (ключ — артикул товара, значение — информация о товаре).

### 2. **Подсчёт частоты элементов**
- В задачах, где нужно подсчитать количество вхождений каждого элемента, `Map` может использоваться для хранения элемента как ключа и его количества как значения.
- Примеры:
    - Подсчёт частоты слов в тексте (ключ — слово, значение — частота).
    - Подсчёт количества каждого типа товаров в магазине (ключ — тип товара, значение — количество).

При добавлении пары Ключ - Значение:
1. Случай Map - пустая. Создается новый ключ, значение - 1.
2. Случай, когда в Map такой ключ уже есть. Ключ остается, значение ++.


### 3. **Кэширование данных**
- `Map` идеально подходит для создания кэша (временного хранения данных для быстрого доступа).
- Пример:
    - Хранение результатов сложных вычислений, где ключ — параметры, использованные в вычислении, а значение — результат. Это ускоряет выполнение программы, так как позволяет повторно использовать уже рассчитанные результаты.

### 4. **Хранение настроек и конфигураций**
- Конфигурационные параметры системы могут быть удобно организованы в `Map`, где ключами являются имена параметров, а значениями — их значения.
- Пример:
    - Конфигурация приложения (ключ — название параметра, значение — его настройка).

### 5. **Обработка данных с уникальными идентификаторами**
- В приложениях, где данные связаны с уникальными идентификаторами, например, в базе данных или API, `Map` может служить промежуточным хранилищем.
- Пример:
    - Хранение данных о пользователях в системе, где ключом является уникальный идентификатор пользователя (например, ID или email), а значением — объект с информацией о пользователе.

### 6. **Группировка данных по категориям**
- `Map` можно использовать для хранения данных, сгруппированных по категориям, где ключом является категория, а значением — коллекция элементов этой категории.
- Пример:
    - Сгруппированные по жанру фильмы, где ключ — жанр, а значение — список фильмов этого жанра.

### 7. **Реализация сложных структур данных**
- `Map` может служить основой для реализации других структур данных.
- Пример:
    - Графы (например, с использованием `Map`, где ключ — вершина, а значение — список смежных вершин).

### Вывод
`Map<K, V>` полезен в задачах, где требуется быстрый доступ к данным по уникальному ключу, упрощённое кэширование, организация справочников, подсчёт частоты элементов и группировка.

--------------------------------------------------------------

## Map - подробно

Внутри структуры Map данные хранятся в формате "ключ" - "значение", то есть по парам.
И в качестве ключей, и в качестве значений могут выступать любые сложные(?) типы
— числа, строки или даже объекты других классов.
НО, ключ должен быть **уникален**!

**Примеры Map(мапов) (полезные пары ключ - значение):**
адрес - все жильцы по этому адресу
артикул - количество этого на складе
имя - кол-во таких имен в группе
слово - кол-во повторений в предложении или речи
что ищется в поиске - кол-во результатов поиска
...

### Операции с элементами HashMap

Задаем Map<K, V> nameMap = new HashMap<K, V>();

**Синтаксис методов:**
nameMap.put (key, value) - добавление и **обновление** элемента
nameMap.get (key) - получение значения по ключу
nameMap.remove (key) - удаление значения по ключу
nameMap.size () - получение размера (количества) элементов


#### Синтаксис создания новой Map

Map<String, Integer> nameMap = new HashMap<String, Integer>(); // управляют методы hashCode() и equals()

Map<String, Integer> nameMap = new TreeMap<String, Integer>(); // управляют бинарнное дерево и методы compareTo()/compare()

#### Цикл по элементам HashMap
// Print keys - проход по всем ключам
for (String key : nameMap.keySet()) {
System.out.println(key); // print keys
}

// Print values - проход по всем значениям
for (Integer value : nameMap.values()) {
System.out.println(value);
}

// Print keys and values - проход по всем ключам и их значениям
for (String key : nameMap.keySet()) {
System.out.println("key: " + key + " value: " + nameHashMap.get(key));
}

Номерных индексов, как в массивах или списках, в HashMap нет — доступ к элементу
коллекции осуществляется по **ключу** (напоминаю, что он должен быть уникальным).

</details>
