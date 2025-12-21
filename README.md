# README

# **CA THEORY – INTRODUCTION TO OOP**

---
## 📘 Table of Contents

1. [Generations of Computer Languages](#-generations-of-computer-languages)
2. [Limitations](#-limitations)
3. [Principles of OOP](#-principles-of-oop)
   - [Object](#-object)
   - [Class](#-class)
   - [Encapsulation](#-encapsulation)
   - [Abstraction](#-abstraction)
   - [Polymorphism](#-polymorphism)
   - [Inheritance](#-inheritance)
4. [Features of Java](#-features-of-java)
5. [Compilation of Java](#-compilation-of-java)
   - [Compiler](#compiler)
   - [Interpreter](#interpreter)
6. [Class as Object Factory](#-class-as-object-factory)
7. [ASCII vs Unicode](#-ascii-vs-unicode)
8. [Data Types](#-data-types)
   - [Primitive](#primitive)
   - [Non-Primitive](#non-primitive)
9. [Types of Variables](#-types-of-variables)
   - [Local](#local)
   - [Instance](#instance)
   - [Static](#static)
10. [Type Conversion and Precedence of Operators](#-type-conversion-and-precedence-of-operators)
11. [Operators](#operators)
12. [Scanner Class](#scanner-class)
13. [User Defined Functions](#user-defined-functions)
14. [Class as a Basis of All Computations](#class-as-a-basis-of-all-computations)
15. [Constructors](#constructors)
16. [String Handling](#string-handling)
17. [Scope](#scope)
18. [Patter]()

---

## **🔷 GENERATIONS OF COMPUTER LANGUAGES**

- **FIRST GENERATION** – Machine language
- **SECOND GENERATION** – Assembly
- **THIRD GENERATION** – English-like (Java, C)
- **FOURTH GENERATION** – Less syntax
- **FIFTH GENERATION** – AI, GUI

---

## **⚠ LIMITATIONS**

> ❗ Not suitable for highly complex system problems.
> 

---

## **🧩 PRINCIPLES OF OOP**



### **🔹 OBJECT**

- Basic unit
- **Object is an instance of a class**

### **🔹 CLASS**

- Blueprint for objects
- Groups properties + methods
- **Class is an object factory**

### **🔹 ENCAPSULATION**

- Data + methods wrapped together

### **🔹 ABSTRACTION**

- Shows essential details only

### **🔹 POLYMORPHISM**

- Same name, different forms

### **🔹 INHERITANCE**

- Acquire parent features

---

## **☕ FEATURES OF JAVA**

- Platform independent
- Object oriented
- Simple
- Robust & reliable
- Secure
- Multithreaded
- Portable

---

## **⚙ COMPILATION OF JAVA**

```
Source → Compiler → Bytecode → JVM → Output
```

### Compiler

Fast, converts full program at once.

> The compiler of java is **javac**
> 

### Interpreter

Slow, converts line-by-line.

> The interpreter of java is **Java Virtual Machine (JVM)**
> 

A **Just-In-Time (JIT) Compiler** also works with the JVM to speed up execution by compiling the byte code into machine code

---

## **🏭 CLASS AS OBJECT FACTORY**

A class produces objects just like a factory creates products.

---

## **🔡 ASCII vs UNICODE**

Java uses **Unicode** text.

| Type | Storage | Characters |
| --- | --- | --- |
| ASCII | 1 byte | 256 |
| UNICODE | 2 bytes | 65,534 |

---

## **🔢 DATA TYPES**

### Primitive

- byte, short, int, long
- float, double
- char
- boolean

### Non-Primitive

- Class
- Array
- Interface

---

## **🧮 TYPES OF VARIABLES**

### Local

Only inside method

### Instance

Unique to each object

### Static

A **class variable**, that is shared across all objects

---

## **🔀 TYPE CONVERSION AND PRECEDENCE OF OPERATORS**

### Implicit

Lower → Higher

### Explicit

Higher → Lower

```java
double x = 3; //this is implicit type conversion, converting int 3 to double 3.0 
int y = (int)(7.9); //this is explicit type conversion, converting double 7.9 to int 7
```

### Precedence of Data types

| **Data type** | **Size** |
| --- | --- |
| Double | 8 |
| Float | 4 |
| Long | 8 |
| Int | 4 |
| Short | 2 |
| Char | 2 |
| Byte | 1 |

---

## **🔢**OPERATORS

**Unary Operators**: Types of operators which require only *one* operand

**Binary Operators**: Types of operators which require *at least two* operands

**Ternary Operators**: An operator which uses *three* operands to replace an if-else statement:

```java
int x=3, y=0;
System.out.println(x>y?"X is greater":"Y is greater");
```

Here, if x>y, then the condition after **?** is displayed 
Else, condition after **:** is displayed

This is written in if-else form as:

```java
int x=3, y=0;
if(x>y)
	System.out.println("X is greater");
else
	System.out.println("Y is greater");
```

Ternary Operators may be **nested** by using:

```java
int x=3, y=2,z=1;
System.out.println(x>y?(x>z?"X is the greatest":"Z is the greatest"):(y>z?"Y is the greatest":"Z is the greatest");
```

This can be written in if-else form as:

```java
int x=3,y=2,z=1;
if(x>y)
{
	if(x>z)
		System.out.println("X is the greatest");
	else
		System.out.println("Z is the greatest");
}
else
{
	if(y>z)
		System.out.println("Y is the greatest");
	else
		System.out.println("Z is the greatest");
}
```

### Precedence of Operators

| **Operator group** | **Associativity** |
| --- | --- |
| [], {}, () | Left to Right |
| ++, - -, +, -, ! | Right to Left |
| (Type Cast) | Right to Left |
| *, /, % | Left to Right |
| +, -, + 
(Plus, minus and concatenation) | Left to Right |
| <, ≤, >, ≥ | Left to Right |
| ==, ≠ (! =) | Left to Right |
| && (Logical AND) | Left to Right |
| || (Logical OR) | Left to Right |
| ?: (Conditional Operator) | Left to Right |
| =, +=, -=, *=, /=, %= | Left to Right |

Brackets have **highest precedence** as in BODMAS and, assignment and shorthand operators have the **least precedence** (as it is meant to run after **all other** operations)

---

## 📒SCANNER CLASS

> Scanner class is present in the **java.util** package
> 

It has the following functions:

- .next() - Gets the first word
- .nextLine() - Gets the entire sentence, including spaces
- .nextInt() - Gets the integers
- Similarly, it is applicable for the remaining data types

---

## 📌USER DEFINED FUNCTIONS

**Function Header:** 

> Access specifier + Object Modifier + Return type + Function name + Parameters
> 

**Function Prototype**:

> Return type + Function name + Parameters
> 

**Function Signature**:

> Function name + parameters
> 

### Types of Parameters

```java
static void test(int x, int y)
{
//x and y are formal parameters
}

public static void main(String args[])
{
	int a = 10;
	int b = 20;
	test(a,b);
	//a and b are actual parameters
}
```

---

## 📌CLASS AS A BASIS OF ALL COMPUTATIONS

```java
class SampleClass
{
	int x = 10, y = 20;
	
	void firstMethod()
	{
		System.out.println(x);
	}
	
	void secondMethod()
	{
		System.out.println(y);
	}
	
	public static void main(String args[])
	{
		SampleClass ob = new SampleClass();
		ob.firstMethod();
		ob.secondMethod();
	}
}
```

Here, **firstMethod** and **secondMethod** are methods that are run by the main method.

- Since they are non-static, an object is created
- To create an object, the following syntax is used

> **Class-Name object-name = new Class-Name(Parameters for Constructor);**
> 

---

## 📌CONSTRUCTORS

### Why Constructors?

Constructors automatically initialize object variables when an object is created, ensuring no variable is left uninitialized.

### Default Constructors

```java
class Student
{
    String name;
    int age;
    
    Student() //default constructor - no parameters
    {
        name = "Unknown";
        age = 0;
    }
    
    public static void main(String args[])
    {
        Student s1 = new Student();
        System.out.println(s1.name); //prints "Unknown"
        System.out.println(s1.age); //prints 0
    }
}
```

### User Defined Constructors

```java
class Calculate
{
	int x;
	int y;
	int z;
	
	Calculate(int a, int b) //this is the constructor
	{
		//gives default values
		x = a;
		y = b;
		//z must have a value
		z = 0;
	}
	
	public static void main(String args[])
	{
		Calculate ob = new Calculate(1,2);
	}
```

> A default constructor is automatically created, so, if another constructor is created on top of that, as in a user-defined constructor is created, the constructor is automatically **overloaded**
> 

---

## **🔤**STRING HANDLING

### Extraction of words

```java
String str = "HELLO WORLD";
char ch;
String word = "";

for(int i=0; i<str.length(); i++)
{
	ch = str.charAt(i);
	if(ch == ' ')
	{
		System.out.println(word);
		word = "";
	}
	else
	{
		word += ch;
	}
}
```

---

## **📏 SCOPE**

### Scope

Variables live only inside declared block

```java
if(2>1)
{
	int x = 10;
	System.out.println(x);
}
System.out.println(x);
```

This results in a **syntax-error** as x is not declared

---

## **🔢 PATTERN LOGIC**

### Simple Pattern

```
1
12
123
```

For this program, we must carefully consider i and j, the counts of outer and inner loops

- **i** will be the number of rows, going from 1-3 as followed by the diagonal lines
- **j** will be the elements in the rows, going from left to right.
- As observed, j goes from 1 to i in this case
- Both i and j are ascending by 1, meaning a **++** operator will be used

### Code

```java
for (int i = 1; i <= n; i++) {
    for (int j = 1; j <= i; j++) {
        System.out.print(j);
    }
    System.out.println();
}
```

### Reversed Pattern

```
123
12
1
```

For this program, we use the following for i and j

- i is from 3 to 1, decreasing by 1 (- -)
- j is from 1 to i, increasing by 1 (++)

```java
for(int i=3; i>=1; i--)
{
	for(int j=1; j<=i; j++)
	{
		System.out.print(j);
	}
	System.out.println();
}
```

### Floyd’s Triangle

```
1
2 3
4 5 6
7 8 9 10
```

This uses the same logic as the initial pattern, but

- Uses **n** as a separate variable for the value to be printed
- The third variable is required as the numbers keep on ascending in value, requiring the need of a variable that **does not** change in iterations

```java
int n = 1; //can also be declared inside the outer loop
for (int i = 1; i <= n; i++) {
    for (int j = 1; j <= i; j++, n++) {
        System.out.print(n + " ");

    }
    System.out.println();
}
```

---

## **🔤 STRING PATTERN LOGIC (USING SUBSTRINGS)**

```
BLUEJ
BLUE
BLU
BL
B
```

A simple **substring** function can be incorporated to simplify the task of printing the pattern as follows

```java
String s = "BLUEJ";
for (int i = s.length(); i > 0; i--) 
{
    System.out.println(s.substring(0, i));
}
```

## **🔤**STRING PATTERN LOGIC (USING ASCII VALUES)

```
A
AB
ABC
ABCD
ABCDE
```

For this program we use:

- Outer loop (i) from 1-5 (++)
- Inner loop (j) from 1-i (++)
- The item to be printed is the ascii value of:
(j+64) as ASCII value of ‘A’ is **65**

```java
for(int i=1; i<=5; i++)
{
	for(int j=1; j<=i; j++)
	{
		System.out.print((char)(j+64));
	}
	System.out.println();
}
```

```
ABCDE
ABCD
ABC
AB
A

```

For this program, we use 2 loops, as used in basic patterns

- Outer loop (i) goes from 5-1
- Inner loop (j) goes from 1-i
- The item to be printed is the ascii value of:
(j+64) as ASCII value of ‘A’ is **65**

```java
for(int i=5; i>=1; i--)
{
	for(int j=1; j<=i; j++)
	{
		System.out.print((char)(j+64));
	}
	System.out.println();
}
```

---

## **📚 ARRAYS**

- Arrays can be either **single dimensional** or **double dimensional**
- A single dimensional array is declared by the following:

```java
int a[] = new int[10];
```

- It can be declared and initialized by

```java
int a[] = {1,2,3};
```

- A double dimensional array has multiple ways of being declared
- The way to do it using **new** keyword is by

```java
int a[][] = new int[2][2];
```

- To declare and initialize a 2D array, 2 methods can be used

```java
int a[][] = {{1,2}, {3,4}};

int a[2][2] = {1,2,3,4};
```

### Printing an array

```java
int ar[] = {1,2,3,4};
for(int i=0; i<ar.length(); i++)
{
	System.out.println(ar[i]);
}
```

### Linear Search

We use linear search to find an element of any data type within an array. Each element is searched through to find the desired element

```java

int ar[] = {3,5,7,2,4,1};
int search = 5; //for example
for(int i=0; i<ar.length; i++)
{
	if(ar[i] == search)
	{
		System.out.println("The desired element is at "+i);
		System.exit(0);
	}
}
```

### Binary Searching

We use binary search to search through a **sorted array**

A sorted array is required to be either ascending or descending

```java
int ar[] = {1,2,3,4,5,6,7,8,9,10};
int search = 5;

int l = 0;
int u = ar.length-1;
int m;

while(l<=u)
{
	m = (l+u)/2;
	
	if(ar[l] < search)
		l = m+1;
	else if(ar[u] > search)
		u = m-1;
	else
	{
		System.out.println("The element is at element "+m);
		System.exit(0);
	}
}
```

So for binary search:

- l is the lower limit
- u is the upper limit
- m is the middle element

m is the average of l and u,

> Remember, m, l and u are **index values** not values itself
> 

### Selection Sorting

Selection sorting checks every element with the *selected element*. When an element is smaller than the selected element it switches with the position of the selected element.

```java
int ar[] = {2,3,6,1,7};
int temp;
for(int i=0; i<ar.length-1; i++)
{
	min = i;
	for(int j=i; j<ar.length; j++)
	{
		if(ar[min] > ar[i])
			min = j;
	}
	temp = ar[i];
	ar[i] = ar[min];
	ar[min] = temp;
}
//ar must be printed after to see the execution
```

### Bubble Sorting

Bubble sorting compares each element with its **next** one, swapping values as it moved. The *last* element will be sorted first and then moves on.

```java
int ar[] = {2,3,6,1,7};
int temp;
for(int i=0; i<ar.length; i++)
{
	for(int j=0; j<ar.length-1-i; i++)
	{
		if(ar[j] > ar[j+1])
		{
			temp = ar[j];
			ar[j] = ar[j+1];
			ar[j+1] = temp;
		}
	}
}
//ar must be printed after to see the execution
```

- ar.length-1 is required as ar[j] is compared to ar[j+1]. Without -1, there is index out of bounds
