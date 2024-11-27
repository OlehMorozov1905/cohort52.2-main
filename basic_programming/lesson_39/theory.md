<details>
  <summary style="cursor: pointer;"><b>English</b></summary>

# JCF

## Set, HashSet

Of the interfaces that extend the Collection interface, we looked at the List interface, on which
ArrayList and LinkedList are implemented.

Now we will look at the Set interface and its implementations **HashSet** and **TreeSet**.
Set in English means "set", a set of some **objects** in the context of Java.
The peculiarity of this set is that it can store **only unique values**,
elements of this set.

Set<T> is an **interface** with methods for working with a set:
- add an element to a set,
- remove an element from a set,
- check for the presence of an element in a set.

The Set interface extends the Collection interface, and defines collections that
**do not contain two identical elements**.

Examples of useful and necessary HashSet:
- email lists
- phone numbers
- banking accounts
- identification numbers
- tax numbers
- passport number
- car numbers
- IP address
- Bar/Barcodes
- serial number of the product
- IMEI of the SIM card
- ...

===================================================================

**So, what is HashSet?**
Answer: it is a class that implements the Set, Collection, Iterable interfaces.
There are no indices in this structure, the collection element is saved and found using an algorithm involving the calculation of hashCode - see below.

Let's give some examples of useful Sets from life:
- alphabet
- language dictionary
- postal address indexes
- car VIN
- product serial number
- barcode
- Internet links
- from the financial sector: customer account, SWIFT code, ...
- banknote numbers
- Tax ID
- e-mail within the registrar
- IP address

**_Syntax for initializing HashSet:_**
`Set<Type> myHashSet = new HashSet<>();`

### How is hashCode calculated?
The hashCode() method returns the hash code for a given string (character set).
The hash value of an empty string is zero.
hashCode(string) = s[0]*31^(n-1) + s[1]*31^(n-2) + ... + s[n-1], ^ is exponentiation
s[0] is the 1st element of the string (character), s[1] is the 2nd element, etc.
The prime number 31 is chosen empirically.

### Algorithm for adding an element to a HashSet:

1. **Calculating the hash code**:
   When you add an element to a `HashSet`, Java first calculates its hash code using the `hashCode()` method of the element. This hash code is a numeric value that depends on the state of the object, which determines where in the `HashSet` the element will be placed.

2. **Determining the "bucket index" by hash code**:
   `HashSet` uses the hash code to calculate the **bucket index** where the element will be stored. For example, if `HashSet` has an initial value of inicialCapacity = 16 buckets, then the index will be obtained based on the hash code taking into account the existing number of buckets. This is done using the bitwise shift operation OR the remainder of dividing the calculated hash code by 16 is calculated. The "bucket" is actually a LinkedList<T>(), or more precisely their array LinkedList[initialCapacity] <T> ().

3. **Saving the element in the "bucket" (linked list)**:
   After determining the bucket index, an attempt is made to save the element. If there is nothing at this index yet, then a new linked list is created and the element is placed in the first place. If there is already a "bucket" with the same hash code, the element will be placed in the linked list at the index of this bucket. The element is added to the linked list only if there is no such element in the list yet, otherwise false is returned and the duplicate is not added!

4. **Searching for an element**:
   When you search for an element in `HashSet`, Java again calculates its hash code and determines the index of the "bucket" - the linked list. Then Java looks through all the elements in this linked list and finds the desired element using the `equals()` method.

### Why is a linked list chosen for HashSet and not a simple list?
`HashSet` chooses a **linked list** over a simple array list (like `ArrayList`) because a linked list provides more efficient collision management and has advantages when performing element deletion operations.
Deleting an element in a linked list is simpler and faster:
- When an element needs to be deleted, `HashSet` simply finds it in the linked list and deletes it, forwarding pointers to the next element.
- In an array list (like `ArrayList`), deleting an element requires shifting all subsequent elements, which increases the operation time.
  A linked list has more flexibility in terms of memory management. When adding a new element, the array does not need to grow, as `ArrayList` does when it overflows. This simplifies memory management and improves performance in the presence of frequent collisions.
  When `HashSet` grows its capacity and redistributes elements into new buckets (rehashing), having linked lists for elements with collisions makes this process more flexible and simpler.
- Rehashing just requires iterating over the linked list and distributing the elements into new buckets.
- For a massive list, this would require significant copying, moving, and redistributing operations.

### HashSet (summary)
* It is fundamentally impossible to repeat elements of a set (collection);
* HashSet methods:
* Add element(s): `add()`, `addAll()`
* Remove element(s): `remove()`, `removeAll()`
* Clear the set (remove all elements): `clear()`
* Check if element(s) exists: `contains()`, `containsAll()`
* Find out the size: `size()`
* HashSet has **no indices**, and it cannot be **"sorted"**!


</details>

<hr>

<details style="padding-top: 18px">
  <summary style="cursor: pointer;"><b>На русском</b></summary>

# JCF

## Set, HashSet

Из интерфейсов расширяющих интерфейс Collection, мы рассмотрели интерфейс List, на котором реализованы
ArrayList и LinkedList.

Теперь мы рассмотрим интерфейс **Set** и его реализации **HashSet** и **TreeSet**.
Set в переводе с английского - это "множество", множество каких-то **объектов** в контексте Java.
Особенность этого множества в том, что оно может хранить **только уникальные значения**,
элементы этого множества.

Set<T> - это **интерфейс** с методами для работы со множеством:
- добавить элемент во множество,
- удалить элемент из множества,
- проверить наличие элемента во множестве.

Интерфейс Set расширяет интерфейс Collection, и определяет коллекции, которые
**не содержат двух одинаковых элементов**.

Примеры полезных и нужных HashSet:
- коллекции e-mail в рамках домена и далее (выше по иерархии)
- номера телефонов
- аккаунты в банковских системах (IBAN)
- идентификационные номера
- налоговые номера
- номер паспорта
- автомобильные номера
- IP-адрес
- Bar/Штрих-коды
- серийный номер изделия
- IMEI у SIM - карты
- номера на денежных купюрах
- индексы городов
- номера сертификатов ISO
- ISBN
- IMDB
- ...

=============================================================

**Итак, что такое HashSet?**
Ответ: это класс, который реализует(implements) интерфейсы Set, Collection, Iterable.  
Индексов в этой структуре нет, элемент коллекции сохраняется и находится по алгоритму с участием рассчета hashCode - см. ниже.

Давайте приведем примеры полезных Set из жизни:
- буквенный алфавит
- словарь языка
- индексы для почтовых адресов
- VIN автомобилей
- серийный номер изделия
- штрих-код
- ссылки в Интернете
- из финансовой сферы: счет клиента, SWIFT-код, ...
- номера купюр
- Tax ID
- e-mail в пределах регистратора
- IP - адрес

**_Синтаксис для инициализации HashSet:_**
`Set<Type> myHashSet = new HashSet<>();`

### Как вычисляется hashCode ?
Метод hashCode() – возвращает хэш-код для данной строки (набор символов).
Хэш-значение пустой строки равно нулю.

"5 789" - это число или строка?
1963 => 1 + 9 + 6 + 3 = 19 = > 1 + 9 = 10 => 1 + 0 = 1

hashCode(строка) = s[0]*31^(n-1) + s[1]*31^(n-2) + ... + s[n-1], ^ - это возведение в степень
s[0] - это 1-й элемент строки (символ), s[1] - 2-й элемент и т.д.
Простое число 31 подобрано опытным путем.

### Алгоритм помещения элемента в HashSet:

1. **Вычисление хеш-кода**:
   Когда вы добавляете элемент в `HashSet`, Java сначала вычисляет его хеш-код с помощью метода `hashCode()` элемента. Этот хеш-код — это числовое значение, зависящее от состояния объекта, который определяет, куда в `HashSet` будет помещён элемент.

2. **Определение "индекса корзины" по хеш-коду**:
   `HashSet` использует хеш-код для вычисления **индекса корзины**, в которой элемент будет храниться. Например, если у `HashSet` начальное значение inicialCapacity = 16 корзин, то индекс будет получен на основе хеш-кода с учётом имеющегося количества корзин. Это делают с помощью операции побитового сдвига ИЛИ вычисляется остаток от деления значения вычисленного хеш-код на 16. "Корзиной" на самом деле является LinkedList<T>(), а точнее их массив LinkedList[initialCapacity] <T> ().

3. **Сохранение элемента в "корзине" (связном листе)**:
   После определения индекса корзины элемент пытаются сохранить. Если по такому индексу еще ничего нет, то создают новый связный список и элемент помещают в него на первое место. Если "корзина" с таким хеш-кодом уже есть, то элемент будет размещен в связном списке по индексу этой корзины. Элемент попадает в связный список только при условии, что такого элемента в списке еше нет, иначе - возвращается false и дубликат не добавляется!

4. **Поиск элемента**:
   Когда вы ищете элемент в `HashSet`, Java снова вычисляет его хеш-код и определяет индекс "корзины" - связного списка. Затем Java просматривает все элементы в этой связном списке и находит нужный элемент с использованием метода `equals()`.

### Почему для HashSet выбран связный список, а не простой список?
Для `HashSet` выбран именно **связный список**, а не простой массивный список (например, `ArrayList`), потому что связный список обеспечивает более эффективное управление коллизиями и обладает преимуществами при выполнении операций удаления элементов.
**Удаление элемента в связном списке проще и быстрее**:
- Если требуется удалить элемент, `HashSet` просто находит его в связном списке и удаляет, перенаправляя указатели на следующий элемент.
- В массивном списке (например, `ArrayList`) **удаление элемента требует сдвига всех последующих** элементов, что увеличивает время операции.
Связный список более гибок в плане управления памятью. При добавлении нового элемента не требуется увеличивать массив, как это происходит с `ArrayList`, когда он переполняется. Это упрощает управление памятью и улучшает производительность в условиях частых коллизий.
Когда `HashSet` увеличивает свою ёмкость и перераспределяет элементы по новым корзинам (рехеширование), наличие связных списков для элементов с коллизиями делает этот процесс более гибким и простым.
- При рехешировании нужно лишь перебрать связанный список и распределить элементы по новым корзинам.
- Для массивного списка это потребовало бы значительных операций по копированию, перемещению и перераспределению.

### HashSet (summary)
* Принципиальная невозможность повторений элементов множества (коллекции);
* Методы HashSet:
  * Добавить элемент(ы): `add()`, `addAll()`
  * Удалить элемент(ы): `remove()`, `removeAll()`
  * Очистить множество (удалить все элементы): `clear()`
  * Проверить, есть ли элемент(ы): `contains()`, `containsAll()`
  * Узнать размер: `size()`
* В HashSet **нет индексов**, и его нельзя **"отсортировать"**!

</details>
