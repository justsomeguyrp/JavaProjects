# _CA THEORY – INTRODUCTION TO OOP_

## _GENERATIONS OF COMPUTER LANGUAGES_
- **FIRST GENERATION** – Uses machine (binary) language; called low level language.  
- **SECOND GENERATION** – Uses assembly language with mnemonic codes.  
- **THIRD GENERATION** – Uses words in English language. Eg: Java, C.  
- **FOURTH GENERATION** – Has less syntax requirements; easy to learn.  
- **FIFTH GENERATION** – Used for GUI development and AI applications. Eg: Prolog.  

## _LIMITATIONS_
- **Not suitable for very complex problems.**

## _OBJECT ORIENTED PROGRAMMING – FEATURES_
- **Breaks down** a problem into objects.  
- **Easy troubleshooting.**  
- **Emphasizes objects.**  
- **Secure** due to data hiding.  
- **Supports INHERITANCE** (extension of classes).  

## _PRINCIPLES OF OOP_

### _OBJECT_
- **Basic unit of OOP.**

### _CLASS_
- **Group of objects** with same characteristics & behaviour.  
- **Blueprint** for object creation.  

### _ENCAPSULATION_
- **Wrapping data + functions** into one unit (class).  
- Improves **maintainability & flexibility**.  

### _ABSTRACTION_
- Shows **only essential components**.  
- **Hides unnecessary details.**

### _POLYMORPHISM_
- “Poly” = many, “morph” = form.  
- **Same function name**, different behaviours.  

### _INHERITANCE_
- Child class **acquires features** of parent class.  
- Uses keyword **extends**.

## _FEATURES OF JAVA_
- **Platform independent**  
- **Object oriented**  
- **Simple**  
- **Robust & reliable**  
- **Secure**  
- **Supports multithreading**  
- **Portable**

## _COMPILATION OF JAVA_

### _COMPILER_
- Converts HLL → LLL **at once**, fast.

### _INTERPRETER_
- Converts HLL → LLL **line-by-line**, slower.

### _COMPILATION STAGES_
- Source code → **Compiler** → Bytecode → **Interpreter** → Executable code.

## _CLASS AS OBJECT FACTORY_
- CLASS acts as **factory producing objects**.

## _ASCII VS UNICODE_
### ASCII
- **1 byte**, supports 256 characters.  
### UNICODE
- **2 bytes**, supports 65,534 characters.

## _DATA TYPES – PRIMITIVE_

### INTEGER TYPES
- **byte** – 1 byte  
- **short** – 2 bytes  
- **int** – 4 bytes  
- **long** – 8 bytes  

### FLOATING TYPES
- **float** – 4 bytes  
- **double** – 8 bytes  

### CHARACTER
- **char** – 2 bytes  

### BOOLEAN
- **true / false**

## _NON–PRIMITIVE DATA TYPES_
- Formed using **primitive** types  
- Eg: **Class, Array, Interface**

## _TYPES OF VARIABLES_

### _LOCAL_
- Accessible **only** inside its method.

### _INSTANCE_
- Declared **inside class**, outside methods.

### _STATIC_
- **Shared** among all objects.

## _TYPE CONVERSION_

### _IMPLICIT (COERCION)_
- Lower → higher data type.

### _EXPLICIT (TYPECASTING)_
- Manual conversion using `(type)`.

## _FUNCTION THEORIES_

### _FUNCTION HEADER_
- Contains **modifiers, return type, name, parameters**

### _FUNCTION PROTOTYPE_
- Specifies **return type, name, parameters**

### _FUNCTION SIGNATURE_
- Only **function name + parameters**

## _USER DEFINED FUNCTIONS & SCOPE OF VARIABLES_
- Scope defines **accessibility** of variables.

## _OVERLOADING_
- Same function name, **different parameters**.

## _ARRAYS_
- `int arr[] = {1,2,3,4};`  
- `int m[][] = {{1,2},{3,4}};`

## _KEY TERMS_
- **Escape sequences** – special meaning (\n, \t)

## _ITERATION_
- Entry-controlled: **while, for**  
- Exit-controlled: **do-while**

## _PATTERN LOGIC_
### Simple pattern:
```
1
12
123
```

### Floyd’s Triangle:
```
1
2 3
4 5 6
7 8 9 10
```


## _STRING PATTERN LOGIC_

- **substring() method is used for generating decreasing string patterns.**

### Example Pattern:
```
BLUEJ
BLUE
BLU
BL
B
```

### Code Example (Java):
```java
String s = "BLUEJ";

for (int i = s.length(); i > 0; i--) {
    System.out.println(s.substring(0, i));
}
```


## _KEY TERMS (DETAILED)_

- **Escape sequences** – Non-graphic characters that have a special meaning to the compiler or JVM.  
  - Examples: `\n` (new line), `\t` (tab), `\"` (double quote), `\\` (backslash).  
- **Iteration** – Repeating a set of statements multiple times using loops.  
- **Entry-controlled loop** – The condition is checked **before** entering the loop body.  
  - Examples in Java: `for`, `while`.  
- **Exit-controlled loop** – The condition is checked **after** executing the loop body at least once.  
  - Example in Java: `do-while`.  
- **Pattern** – A specific visual arrangement of numbers, characters or symbols printed using loops.  
- **Logic of a pattern** – The step-by-step reasoning that decides:  
  - How many **rows** the pattern has.  
  - What each **column** inside a row prints.  
  - How variables like `i`, `j`, `k` change in each iteration.  

## _PATTERN LOGIC – SIMPLE NUMBER PATTERN_

Example pattern:
```text
1
12
123
1234
...
```

### Logic:
- Take an integer `n` for the number of rows.  
- Use an **outer loop** (`i`) to control the **row number** from `1` to `n`.  
- Use an **inner loop** (`j`) to control the **numbers printed in each row**.  
- In each row, print values from `1` to `i`.  
- After the inner loop finishes, print a new line.

### Code:
```java
int n = 5; // number of rows

for (int i = 1; i <= n; i++) {
    for (int j = 1; j <= i; j++) {
        System.out.print(j);
    }
    System.out.println();
}
```

## _PATTERN LOGIC – FLOYD'S TRIANGLE_

Floyd’s Triangle:
```text
1
2 3
4 5 6
7 8 9 10
...
```

### Logic:
- Take an integer `n` for the number of rows.  
- Maintain a counter variable `k` starting from `1`.  
- Use an **outer loop** (`i`) from `1` to `n` for rows.  
- Use an **inner loop** (`j`) from `1` to `i` for columns in that row.  
- In each inner iteration:  
  - Print the current value of `k`.  
  - Increment `k` by `1`.  
- After each row, move to the next line using `System.out.println();`.

### Code:
```java
int n = 4; // number of rows
int k = 1;

for (int i = 1; i <= n; i++) {
    for (int j = 1; j <= i; j++) {
        System.out.print(k + " ");
        k++;
    }
    System.out.println();
}
```
