<details>
  <summary style="cursor: pointer;"><b>English</b></summary>

## ArrayList

Filling an ArrayList is done in the following ways:
- adding elements one by one using the .add() method
- for loop
- Arrays.asList()
- Collections.addAll()
- List.of()
- ...

**Advantages of ArrayList:**

1. Dynamic size: Unlike regular arrays, ArrayList can automatically increase or decrease its size depending on the number of elements that are added or removed from it.

2. Random access: ArrayList provides fast access to elements by index, since it is internally an array.

3. ArrayList implements the List interface, which means that it inherits from List all the methods typical for list data structures, including add, remove, get, set, and others.

4. Allows null values ​​(elements in ArrayList can have a null value), as well as duplicate elements.

5. Performance of operations:
   Addition and access operations (get and set by index) are performed in constant time (O(1)).
   Insertion and deletion operations may require more time (O(n)), since they may require shifting part of the array.

6. ArrayList has its own sort() method, which was added in Java 8. This method provides a convenient way to sort the elements of the list without having to use the Collections class.
   The sort() method of ArrayList uses Merge Sort or sorting with a temporary table, which provide time complexity of
   O(n log(n)) in the average and worst cases.

ArrayList is often used in Java programs because of its flexibility and ease of use, making it suitable for situations where a dynamically changing collection of elements is required.

## What if you need an ordered list in which it would be "easy" to insert elements exactly in the middle?

LinkedList is really suitable for tasks such as frequent insertions and deletions of elements in the middle of a list, since its insertion and deletion operations to the middle have a constant complexity of O(1).

## LinkedList

Another implementation of the List interface is the LinkedList class.

To implement the functionality of the List interface, LinkedList is represented as a doubly linked list.

To create a LinkedList, you need a **special type Node<E> (node)**, which contains references to the previous and next nodes, as well as the value of the element.

LinkedList stores a reference to the first and last node, as well as the current number of elements in the list.

All manipulations inside LinkedList are manipulations with references to the corresponding nodes (Node) of the list.

It is very useful to read the documentation:
LinkedList: https://docs.oracle.com/javase/8/docs/api/java/util/LinkedList.html

ArrayList: https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html

Why is LinkedList needed and where is it used:
https://www.geeksforgeeks.org/applications-of-linked-list-data-structure/


</details>

<hr>

<details style="padding-top: 18px">
  <summary style="cursor: pointer;"><b>На русском</b></summary>

# JCF 


## ArrayList

Заполнение ArrayList делается следующими способами:
- добавляем элементы по одному методом .add()
- цикл for
- Arrays.asList()
- Collections.addAll()
- List.of()
- ...

**Преимущества ArrayList:**

1. Динамический размер: В отличие от обычных массивов, ArrayList может автоматически увеличивать и уменьшать свой размер в зависимости от количества элементов, которые в него добавляются или удаляются.

2. Произвольный доступ: ArrayList предоставляет быстрый доступ к элементам по индексу, так как внутренне он представляет собой массив.

3. ArrayList реализует интерфейс List, что означает, что он наследует от List все методы, типичные для списочных структур данных, включая add, remove, get, set и другие.

4. Допускает null-значения (элементы в ArrayList могут иметь значение null), а так же элементы-дубликаты.

5. Производительность операций: 
Операции добавления и доступа к элементу (get и set по индексу) выполняются за константное время (O(1)).
Операции вставки и удаления элементов могут потребовать больше времени (O(n)), так как при этом может потребоваться сдвиг части массива.

6. ArrayList имеет собственный метод sort(), который был добавлен в версии Java 8. Этот метод предоставляет удобный способ сортировки элементов списка без необходимости использовать класс Collections.
Метод sort() у ArrayList использует сортировку слиянием (Merge Sort) или сортировку с помощью временной таблицы, которая обеспечивают временную сложность
O(n log(n)) в среднем и в худшем случае.

ArrayList часто используется в Java-программах из-за своей гибкости и простоты использования, делая его подходящим для ситуаций, когда требуется динамически изменяемая коллекция для хранения элементов.

## Что делать, если нужен нумерованный список, в который было бы "легко" вставлять элементы именно в его середину?

LinkedList действительно подходит для таких задач, как частые вставки и удаления элементов в середине списка, поскольку в нем операции вставки и удаления в середину имеют
константную сложность O(1).


## LinkedList

Еще одной из имплементаций интерфейса List является класс LinkedList.

Для реализации функциональности интерфейса List, LinkedList представлен как двунаправленный связанный список.

Для создания LinkedList нужен **специальный тип Node<E> (узел)**, содержащий ссылки на предыдущий и
последующий узлы, а также значение элемента.

LinkedList хранит в себе ссылку на первый и последний узел, а также текущее количество элементов в листе.

Все манипуляции внутри LinkedList, суть манипуляции со ссылками на соответствующие узлы (Node) списка.

Очень полезно читать документацию:
LinkedList: https://docs.oracle.com/javase/8/docs/api/java/util/LinkedList.html

ArrayList: https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html

Зачем нужен и где применяется LinkedList:
https://www.geeksforgeeks.org/applications-of-linked-list-data-structure/

</details>
