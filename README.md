## Java

Java is a high-level language which follows the object oriented
programming paradigm and was developed by Sun Microsystem during the
1991’s Green Project. Currently owned and maintained by Oracle

Java is a high-level language as it has following characteristics
- It abstracts the computer’s hardware details, making it easier for
 users to write and understand code.

- The code written in java is converted into bytecode by the java
 compiler which can be run on any device with suitable java virtual
 machine, following the “Write Once, Read Anywhere” principle.

- It has a variety of libraries and frameworks for different tasks,
 and manages the memory automatically.

- As it is a high-level language, it has human readable syntax,
 error-checking, and tools to increase productivity.

## Difference b/w High-Level and Low-Level Languages:

- High-level languages have a high level of abstraction whereas
low-level language has minimal to no abstraction from computer’s
hardware.

- High-level languages written in human readable syntax which are
easier to read whereas low-level language uses symbols and mnemonics
which are harder to read.

- Memory management in High-level language is generally done
automatically whereas in low-level languages memory management is
manual.

- High-level languages generally are platform-independent and do
strong error-checking and exception handling whereas low-level
languages are platform dependent and have less built-in error
handling, so the end user has to manage the errors.
- High-level languages are compiled into machine code via a compiler
or interpreter and so do have slower execution speed whereas low-level
languages are generally written into machine code or directly
translated which allows for faster execution.

## Object-Oriented Programming in Java:

It refers to the process where classes and objects are used to design
and develop applications for easy scalability, reusability and secure
coding.

### Key principles in OOPs:

- **Class:** It is a blueprint or a bundle of variables and
methods which is used to create objects. It defines the data and
behaviour of objects.

- **Object:** It is an instance of a class which allows it to use
the data and methods defined by their respective classes.

- **Encapsulation:** It means to bundle the variables and methods
into a single bundle which allows it to be restricted from direct
access, means it can be accessed only by the instances of that class

- **Inheritance:** It allows subclasses or child classes to
inherit methods and variables of their parent class reducing the code
redundancy.

- **Polymorphism:** The ability of OOPs to handle different tasks
by the methods of the same name depending upon the tasks based on
objects and arguments.

- **Abstraction:** It means hiding the complex implementation
details and only showing the essential features required by the user

## Key Versions of Java:

- **Java** **1.0:** Introduced to the public in 1995 with the
 “Write Once, Run Anywhere” principle allowing cross-platform
 development.

- **JDK** **1.0:** Introduced in 1996, made Java widely accessible
 by providing the essential tools for development.

- **Java** **1.1:** Introduced in 1997, and introduced features
 like inner classes, JavaBeans and JDBC ( Java Database Connectivity).

- **Java** **7:** Introduced in 2011, provided the
 try-with-resources statements, and diamond operator.

- **Java** **8:** Introduced in 2014, provided the lambda
 expressions, stream API, and new Date and Time API.

- After Java 10 they started to provide the new versions on early
 bases and currently the latest version is Java 22 which was released
 on March 19th, 2024.

## Features of Java:

- **Simple:** Java is easy to learn and use because it removes
many complex concepts like pointers, multiple inheritance, and
operator overloading.

-  **Object-Oriented:** Java follows the Object-Oriented
Programming making it modular, reusable and scalable.

-  **Secure:** It has built-in security features like bytecode
verification, classLoader, a security manager and set of APIs for
encryption and secure communication.

-  **Robust:** Java does early error-checking as well as runtime
checking. It has strong memory management due to automatic garbage
collection and exception handling mechanisms.

- **Multithreading:** Java allows multiple threads to run
simultaneously, improving performance, which is helpful in games and
web servers etc.

- **Interpreted** **and** **Compiled:** Java source code is
compiled into bytecode, which is then interpreted or compiled at
runtime by the JVM. This hybrid approach provides high performance and
portability.

## Difference b/w Compiler and Interpreter:

- Compiler compiles the java source code into bytecode all at once
whereas Interpreter executes the bytecode line-by-line into machine
code.

- Compiler works at the compile time and catches the syntax errors
before execution whereas Interpreter works at runtime and handles
errors during runtime.

- Compiler take Java Source code (.java) as input and gives
bytecode(.class) whereas Interpreter takes bytecode(.class) as input
and gives machine-specific code(binary) as output

- Compiler is faster in execution as bytecode is precompiled whereas
Interpreter is slower

- Compiler is not platform dependent and Java
has an in-built compiler known as javac whereas Interpreter is platform-dependent as JVM is platform
 dependent.

## JVM, JRE and JDK:

- **JDK:**
    Java Development Kit is a complete software development kit required
    to develop java applications.

    **Components** **of** **JDK:**
    - Java Compiler (javac)

    - Java Runtime Environment (JRE) 

    - Java Debugger (jdb)

    - Java Archive (jar)

    - Other tools like javadoc, javap and more

- **JVM:**
    Java Virtual Machine is a computing machine that enables a computer to
    run a java program

    **Components** **of** **JVM:** 
    - Class Loader

    - ByteCode Verifier

    - Interpreter

    - Just-In-Time (JIT) Compiler 
    
    - Garbage Collector

- **JRE:**
    Java Runtime Environment libraries, JVM and other components to ru
    applications written in Java.

    **Components** **of** **JRE:**
    - Java Virtual Machine (JVM) 
    
    - Core Libraries

    - Supporting Files

## Difference b/w JVM, JDK and JRE:
- JVM executes the bytecode, JDK provides the essential tools for Java
Programs and JRE provides environment for running Java programs

- JDK is used by developers to create and execute java programs, JVM
is used to convert bytecode into machine code whereas JRE used to
execute those machine code.

- JVM doesn’t contain any development tools, JDK contains tools like
javac (compiler), javadoc and javap, whereas JRE also doesn’t have any
development tools.

- JVM contains JRE and other development tools, JRE contains JVM and
other libraries whereas JVM contains some part of JRE

- JDK installed by developers manually, while JVM installed when a
Java program needs to run and JRE to run Java applications.

## Class and main method declaration:
- **Class** **Declaration:** 
    public class Solution{

    - Here public and class are keywords and Solution is Identifier

    - public is an access modifier that tells us that the class can be
    accessed anywhere

    - class is a keyword used to declare a class.

    - Solution is the name of the class, it should always match with the
    file name

- **Main** **Method:**
    public static void main(String\[\] args){

    - Here public, static and void are keywords, main is an Identifier.

    - public is an access modifier that tells us that the method can be
    accessed anywhere

    - static means that the method can be directly accessed through class
    without instantiating an object.

    - void is the return type indicates that it doesn’t return anything

    - main is the name of the method and the entry point in a java
    program.

    - String\[\] args is parameter of main method in which String\[\] is a
    class array and args are the arguments indicates that arguments will
    be passed as an array of strings
