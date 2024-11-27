<details>
  <summary style="cursor: pointer;"><b>English</b></summary>

# Java IO API

In Java IO, streams represent a sequence of data used to transfer information. An I/O stream points to an input source or an output destination, and can represent many different types of sources and destinations, such as disk files, devices, other programs, and memory arrays.

In Java, streams support many different types of data, including:
* bytes,
* primitive data types,
* objects.

### Basic Stream Classes
* **InputStream** — reads data from a source one element at a time.
* **OutputStream** — writes data to a destination one element at a time.

### Abstract Classes
* **OutputStream** — an abstract class for outputting data. Contains the `abstract void write(int b)` method, which is used to write a single byte to the stream.
* **FileOutputStream** — extends `OutputStream` and implements the `write` method, allowing bytes to be written directly to a file.

* **InputStream** — an abstract class for input data. Contains the `abstract int read()` method, which allows you to read a single byte from the stream.
* **FileInputStream** — extends `InputStream` and implements the `read` method, allowing you to read bytes from a file. If `read` returns `-1`, it means that all data from the stream has already been read.

These base classes and their methods form the basis for working with input and output streams in Java, providing convenient tools for working with files, devices, and other data sources.


</details>

<hr>

<details style="padding-top: 18px">
  <summary style="cursor: pointer;"><b>На русском</b></summary>

# Java IO API

В Java IO потоки представляют собой последовательность данных, используемую для передачи информации. Поток ввода/вывода указывает на источник ввода или пункт назначения вывода, и может быть представлен различными типами источников и направлений, такими как дисковые файлы, устройства, другие программы и массивы памяти.

В Java потоки поддерживают работу с разными типами данных, включая:
* байты (8 бит),
* примитивные типы данных,
* объекты.

### Основные классы потоков
* **InputStream** — читает данные из источника (source) по одному элементу за раз.
* **OutputStream** — записывает данные в пункт назначения (destination) по одному элементу за раз.

Oracle, javadoc

### Абстрактные классы
* **OutputStream** — абстрактный класс для вывода данных. Содержит метод `abstract void write(int b)`, который предназначен для записи одного байта в поток.
* **FileOutputStream** — расширяет `OutputStream` и реализует метод `write`, позволяя записывать байты непосредственно в файл.

* **InputStream** — абстрактный класс для ввода данных. Содержит метод `abstract int read()`, который позволяет читать один байт из потока.
* **FileInputStream** — расширяет `InputStream` и реализует метод `read`, позволяя считывать байты из файла. Если `read` возвращает `-1`, это означает, что все данные из потока уже считаны.

Эти базовые классы и их методы составляют основу для работы с потоками ввода и вывода данных в Java, обеспечивая удобные инструменты для работы с файлами, устройствами и другими источниками данных.

**Exceptions** 
try ... catch()

</details>
