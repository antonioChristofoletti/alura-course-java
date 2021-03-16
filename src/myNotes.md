# Java 8

## Interface Changes

### Default methods

It Allows editing interfaces without changing already implemented class. 
The implemented classes will inherited theses default methods as usual methods.

```
public interface myInterface {
    default void doSomething(params) {
        // Work..........
    } 
}
```

### Static Methods

Static methods are also allowed in Interface.

```
public interface myInterface {
    static void doSomething(params) {
        // Work..........
    } 
}

//Use
myInterface.doSomething(params)
```

### @FunctionInterfaces

Annotation for interface with just a unique abstract method, which means that interface can be used replace with lambada expression. Example

## Lamba Expression

Similar to `Kotlin`, Examples:

```
someList.foreach(v -> dosomething)

someList.foreach(v -> {
    dosomething
})
```

## Method Reference

The ideia is allow the developers pass functions in a way more understandable and clear.

Method Reference just works in situations in which the params in right and left are the same.

Examples:

```
someList.foreach(System.out::print)

someList.foreach(Someclass::someMethod)
```

## Stream and Collectors

Stream: It is a new language resource for work with a list of data in a simple and clear code.
Standardizing the control list methods and allowing the developers focusing on the logic for control the list

Example:
```
list.stream()
       .mapToInt(ClassSomething::getSomeAttribute)
       .average()
       .ifPresent(System.out::println);
```

Collectors: Came to help the stream, grouping a lot of helpful of function that can be used in the end of a stream operation,
such as:

- toList;
- toSet;
- toMap;
- toCollection;
- joining;
- collectingAndThen;
- groupingBy
- reducing

Example:

```
clientes.stream().collect(groupingBy(Cliente::getTipo, reducing(maxBy(comparing(Cliente::getLimite)))));
```

## New API Data

New approach created in order to make easier work and interact with Dates and Times in Java.

New Class:

- LocalDate;
- LocalTime;
- LocalDateTime;
- Period;
- DateTimeFormatter;
- Year;
- YearMonth.
