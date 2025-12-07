<h1><span style="color:#4A90E2;"><b>CA THEORY – INTRODUCTION TO OOP</b></span></h1>

<hr>

<h2><span style="color:#FF5733;"><b>📘 Table of Contents</b></span></h2>

1. [Generations of Computer Languages](#generations)  
2. [Limitations](#limitations)  
3. [OOP Features](#oopfeatures)  
4. [Principles of OOP](#principles)  
5. [Features of Java](#javafeatures)  
6. [Compilation of Java](#compilation)  
7. [Class as Object Factory](#objectfactory)  
8. [ASCII vs Unicode](#asciiunicode)  
9. [Data Types](#datatypes)  
10. [Variables](#variables)  
11. [Type Conversion](#typeconversion)  
12. [Function Theory](#functiontheory)  
13. [Scope & Overloading](#scope)  
14. [Arrays](#arrays)  
15. [Key Terms](#keyterms)  
16. [Pattern Logic](#patternlogic)  
17. [String Pattern Logic](#stringpatternlogic)

---

<h2 id="generations"><span style="color:#E67E22;"><b>🔷 GENERATIONS OF COMPUTER LANGUAGES</b></span></h2>

- **FIRST GENERATION** – Machine language  
- **SECOND GENERATION** – Assembly  
- **THIRD GENERATION** – English-like (Java, C)  
- **FOURTH GENERATION** – Less syntax  
- **FIFTH GENERATION** – AI, GUI  

---

<h2 id="limitations"><span style="color:#C70039;"><b>⚠ LIMITATIONS</b></span></h2>

> ❗ Not suitable for highly complex system problems.

---

<h2 id="oopfeatures"><span style="color:#1ABC9C;"><b>🟦 OOP FEATURES</b></span></h2>

- Problem broken into **objects**  
- Secure (data hiding)  
- Troubleshooting is easier  
- **Class is an object factory**  
- Supports **inheritance**  

---

<h2 id="principles"><span style="color:#9B59B6;"><b>🧩 PRINCIPLES OF OOP</b></span></h2>

<h3><b>🔹 OBJECT</b></h3>
- Basic unit  
- **Object is an instance of a class**  

<h3><b>🔹 CLASS</b></h3>
- Blueprint for objects  
- Groups properties + methods  
- **Class is an object factory**  

<h3><b>🔹 ENCAPSULATION</b></h3>
- Data + methods wrapped together  

<h3><b>🔹 ABSTRACTION</b></h3>
- Shows essential details only  

<h3><b>🔹 POLYMORPHISM</b></h3>
- Same name, different forms  

<h3><b>🔹 INHERITANCE</b></h3>
- Acquire parent features  

---

<h2 id="javafeatures"><span style="color:#2471A3;"><b>☕ FEATURES OF JAVA</b></span></h2>

- Platform independent  
- Object oriented  
- Simple  
- Robust & reliable  
- Secure  
- Multithreaded  
- Portable  

---

<h2 id="compilation"><span style="color:#CB4335;"><b>⚙ COMPILATION OF JAVA</b></span></h2>

```
Source → Compiler → Bytecode → JVM → Output
```

### Compiler  
Fast, converts full program at once.

### Interpreter  
Slow, converts line-by-line.

---

<h2 id="objectfactory"><span style="color:#6C3483;"><b>🏭 CLASS AS OBJECT FACTORY</b></span></h2>

A class produces objects just like a factory creates products.

---

<h2 id="asciiunicode"><span style="color:#AF601A;"><b>🔡 ASCII vs UNICODE</b></span></h2>

| Type | Storage | Characters |
|------|---------|------------|
| ASCII | 1 byte | 256 |
| UNICODE | 2 bytes | 65,534 |

---

<h2 id="datatypes"><span style="color:#117A65;"><b>🔢 DATA TYPES</b></span></h2>

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

<h2 id="variables"><span style="color:#884EA0;"><b>🧮 TYPES OF VARIABLES</b></span></h2>

### Local  
Only inside method  

### Instance  
Unique to each object  

### Static  
Shared across objects  

---

<h2 id="typeconversion"><span style="color:#CA6F1E;"><b>🔀 TYPE CONVERSION</b></span></h2>

### Implicit  
Lower → Higher  

### Explicit  
Higher → Lower  

```java
double x = 3.14;
int y = (int)x;
```

---
<h2 id="keyterms"><span style="color:#AD1457;"><b>📝 KEY TERMS</b></span></h2>

- Escape sequences → `\n`, `\t`, etc.  
- Iteration → loops  
- Entry-controlled → for, while  
- Exit-controlled → do-while  
---
<h2 id="functiontheory"><span style="color:#D35400;"><b>🧠 FUNCTION THEORY</b></span></h2>

### Function Header  
```java
public static void main(String args[])
```

### Function Prototype
```java
void main(String args[])
```

### Function Signature  
Function name + parameters  
```java
main(String args[])
```

---

<h2 id="scope"><span style="color:#8E44AD;"><b>📏 SCOPE & OVERLOADING</b></span></h2>

### Scope  
Variables live only inside declared block  

### Overloading  
Same name, different parameters  

---

<h2 id="arrays"><span style="color:#1F618D;"><b>📚 ARRAYS</b></span></h2>

- Arrays can be either **single dimensional** or **double dimensional**

- A single dimensional array is declared by the following:

```java
int a[] = new int[10];
```
- It can be declared and initialised by
```java
int a[] = {1,2,3};
```

- A double dimensional array has multiple ways of being declared
- The way to do it using **new** keyword is by

```java
int a[][] = new int[2][2];
```

- To declare and initialise a DDA, 2 methods can be used

```java
int a[][] = {{1,2}, {3,4}};

int a[2][2] = {1,2,3,4};
```
---





<h2 id="patternlogic"><span style="color:#2E86C1;"><b>🔢 PATTERN LOGIC</b></span></h2>

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


### Floyd’s Triangle  
```
1
2 3
4 5 6
7 8 9 10
```
This uses the same logic as the initial pattern, but
- Uses **n** as a seperate variable for the value to be printed
- The third variable is required as the numbers keep on ascending in value, requiring the need of a variable that **does not** change in iterations
```java
int n = 1;
for (int i = 1; i <= n; i++) {
    for (int j = 1; j <= i; j++, n++) {
        System.out.print(n + " ");
        
    }
    System.out.println();
}
```

---

<h2 id="stringpatternlogic"><span style="color:#7D3C98;"><b>🔤 STRING PATTERN LOGIC</b></span></h2>

```
BLUEJ
BLUE
BLU
BL
B
```
A simple **substring** function can be incorprated to simplify the task of printing the pattern as follows
```java
String s = "BLUEJ";
for (int i = s.length(); i > 0; i--) {
    System.out.println(s.substring(0, i));
}
```
