<details>
  <summary style="cursor: pointer;"><b>English</b></summary>

# Test driven development concept

1. Previously, we checked the correctness of the methods we created by running the application several times, with different sets of initial data, and comparing the result obtained in the console with the expected one. This is very inconvenient. For example, any change in the code requires repeating the entire

above procedure again. There are special libraries that make this process easier and more automated. One of the most popular for Java is JUnit

Using tests:
**Case 1** - this is checking the developed code (methods) for correct operation.
**Case 2** - refactoring (improvement, reworking) of the code, the tests must pass successfully after refactoring the code.

2. Working with JUnit consists of creating a separate (relatively speaking, parallel) class with tests and filling it with methods that test the developed methods.
   In the class, as fields, we can specify objects for testing and call the methods being tested on them.

In the method marked with the @BeforeEach annotation, we give the initial settings to the object under test.

In the methods marked with the @Test annotation, we write the code that checks the object under test.

Checks are performed using methods that begin with the word assert... (of which there are a large number for all cases), and accept the obtained result and the expected one for comparison.

**IMPORTANT!**
All the specified methods and annotations are provided by the JUnit library.
Each method marked with the @Test annotation is essentially a separate **"main"**.

---------------------------------------------

# TDD - test driven development, Unit tests

Why is this necessary? - Answer: for testing methods in a more intensive way than running applications.
You can run each individual method and different cases of its operation.
Testing simplifies writing code (**test driven development**)!

The **TDD** approach involves writing tests "strictly BEFORE" developing methods, then writing methods and checking their operation using tests.

**Unit Testing Algorithm**
1. Select/create a directory for Unit testing (usually in the directory where the class under test is located, and in it - the methods under test)

2. Create a new class (java file) in this directory called ClassNameTest

3. Import libraries into this Class (file):
   import org.junit.jupiter.api.Assertions;
   import org.junit.jupiter.api.BeforeEach;
   import org.junit.jupiter.api.Test;

4. Connect the object of the class under test:
   ClassName ClassName; // this is a new field in the ClassNameTest class, in which the object of the class under test is connected.

5. Directive
   @BeforeEach
   void setUp(){
   className = new className(); // create a new instance of the tested class object before each test
   }

6. Directives
   @Test
   @DisplayName("In this text we describe what we are testing")

void methodNameTest(){
// call the method being tested on the object
className.testMethod();
// check if the expected and received results match using assert() methods
assert... (estimated: expected value, actual: call the method being tested, "Message (explanation) about ...")
}

Example:
void testMultiply(){
assertEquals(20, calculator.multiply(4,5),"4*5 should be 20");
}

7. Run the test

</details>

<hr>

<details style="padding-top: 18px">
  <summary style="cursor: pointer;"><b>На русском</b></summary>

# CRUD - операции 

C - Create (создать новый объект)
R - Read (find) (прочитать, найти)
U - Update (change) (обновить)
D - Delete (удалить) 

# Test driven development concept

1. Ранее мы проверяли правильность работы созданных нами методов, выполняя несколько раз
   аппликацию, с различными наборами исходных данных, и сравнивая результат полученный в консоли
   с ожидаемым. Это очень не удобно. Например, любое изменение кода, требует повторения всей
   вышеописанной процедуры заново. Существуют специальные библиотеки, которые позволяют облегчить
   и автоматизировать этот процесс. Одна из самых популярных для Java, это JUnit

Применение тестов:
**Случай 1** - это проверка разработанного кода (методов) на корректную работу.
**Случай 2** - рефакторинг (улучшение, переработка) кода, тесты должны успешно проходить после рефакторинга кода. 

2. Работа с JUnit заключается в создании отдельного (условно говоря, параллельного) класса с тестами и его наполнении методами, которые выполняют тестирование разработанных методов.
   В классе в качестве полей мы можем указать объекты для тестирования и вызвать на них тестируемые методы.

В методе помеченном аннотацией @BeforeEach мы даем начальные настройки тестируемому объекту.
   
В методах помеченных аннотацией @Test мы пишем код проверяющий тестируемый объект.
   
Проверки осуществляются при помощи методов начинающихся со слова assert... (которых существует
   большое количество на все случаи), и принимающих для сравнения полученный результат и ожидаемый.
   
**ВАЖНО!**
Все указанные методы и аннотации предоставляются библиотекой JUnit.
   Каждый метод помеченный аннотацией @Test, по сути является отдельным **"мейном"**.

---------------------------------------------

# TDD - test driven development, Unit tests

Зачем это нужно? - Ответ: для тестирования методов более интенсивным путем, чем ручной многократный запуск приложений. 
С помощью библиотеки JUnit можно запускать каждый отдельный метод и проверять разные случаи его работы.

Тестирование упрощает написание кода (**test driven development**)!

Подход **TDD** предполагает написание тестов "строго ДО" разработки методов, потом написание методов и проверки их работы с помощью тестов.

**Алгоритм проведения Unit тестов**
1. Выбрать/создать директорию для проведения Unit-тестирования (обычно - в директории где
   находится тестируемый класс, а в нем - тестируемые методы)

2. Создать в этой директории новый класс (java-файл) с наименованием ИмяКлассаTest

3. Выполнить в этот Класс (файл) импорт библиотек:
   import org.junit.jupiter.api.Assertions;
   import org.junit.jupiter.api.BeforeEach;
   import org.junit.jupiter.api.Test;

4. Подключаем объект тестируемого класса:
   ИмяКласса имяКласса; // это новое поле в классе ИмяКлассаTest, в котором подключается объект тестируемого класса.

5. Директива
   @BeforeEach
   void setUp(){
     имяКласа = new имяKласса(); // создаем новый экземпляр объекта тестируемого класса перед каждым тестом
   }

6. Директивы
   @Test
   @DisplayName("В этом тексте описываем то, что мы тестируем")

   void имяМетодаTest(){
      // вызвать на объекте тестируемый метод
      имяKласса.тестируемыйМетод();
      // проверить совпадение ожидаемого и получаемого результата с помощью методов assert()
      assert... (estimated: ожидаемое значение, actual: вызов тестируемого метода, "Сообщение(пояснение) о ...")
   }

   Пример:   
   void testMultiply(){
       assertEquals(20, calculator.multiply(4,5),"4*5 should be 20");
   }

7. Запустить тест


</details>
