# Array in Java

## Problem Description
Typical programming contest questions that involve array reading use the following format of INPUT:

- **Line 1:** Integer `T` - Number of test cases.
- Each test case consists of the following two lines:
  - **Test Case Line 1:** Integer `N` - size of the array.
  - **Test Case Line 2:** `N` space-separated integers, representing array elements.

We need to read the array and print all array elements first from left to right and then from right to left.

## Java Code

```java
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt(); // Read Number of test cases

        while(t-- != 0) { // Loop t times
            int n = sc.nextInt(); // Read size of the array

            int a[] = new int[n]; // Declare and instantiate an array of size n

            // Read array elements
            for(int i = 0; i < n; i++) {
                a[i] = sc.nextInt(); // Populate the array
            }

            // Print array elements left to right
            for(int i = 0; i < n; i++) {
                System.out.print(a[i] + " ");
            }
            System.out.println();

            // Print array elements right to left
            for(int i = n - 1; i >= 0; i--) {
                System.out.print(a[i] + " ");
            }
            System.out.println();         
        }

        sc.close(); // Close the scanner
    }
}

# Key Points About Arrays in Java

## Declaration and Instantiation
You can declare and instantiate an array in Java using the following syntax:
```java
dataType a[] = new dataType[size];
Length of Array
To find the length of the array, use the length property:

java
Copy code
int n = a.length;

First and Last Element
Array elements are accessed using an integer index:

java
Copy code
int x = a[idx];  
The first element of an array is at index 0:
java
Copy code
int f = a[0];
The last element of an array is at index a.length - 1:
java
Copy code
int l = a[a.length - 1];
Using long Data Type as Size or Index
Java does not allow a long variable to be used as an array index. Typecasting is necessary:

java
Copy code
long n = 10;
long idx = 2;
int a[] = new int[(int)n]; // Typecasting n to int
int x = a[(int)idx];       // Typecasting idx to int
Array Initialization and For Each Loop
You can initialize an array with fixed elements and use a for-each loop to iterate through it:

java
Copy code
int a[] = {10, 5, 2, 34, 6}; // Initializing array

for(int x: a) { // For each loop
    System.out.print(x + " ");
}
Sorting and Filling the Array
Java provides a built-in class Arrays to sort or fill an array easily:

java
Copy code
Arrays.sort(a);       // Sorts array elements in ASCENDING ORDER
Arrays.fill(a, -1);   // Fills the array with all values as -1
sql
Copy code

You can copy and paste this entire block into a `.md` file, and it will be formatted correctly when viewed in
```

```
Array in Java
200
Typical programming contest questions that involve array reading use following format of INPUT.

 

Line 1:  Integer T - Number of test cases.  
Each test case consists of following two lines:
Test Case Line 1:  Integer N - size of the array.
Test Case Line 2:  N space separated integers, representing array elements.
 

Lets say we need to read the array and print all array elements first from left to right and then from right to left.

 

import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();                    // Read Number of test cases

        while(t-- != 0){                         // Loop t times
            int n = sc.nextInt();                // Read size of the array

            int a[] = new int[n];                // Declare and instantiate an array of size n

            for(int i = 0; i < n; i++){          // Print array elements left to right
                System.out.print(a[i] + " ");
            }
            System.out.println();

            for(int i = n - 1; i >= 0; i--){     // Print array elements right to left
                System.out.print(a[i] + " ");
            }
            System.out.println();         
        }
    }
}
 

Key Points About Arrays
Declaration and Instantiation
dataType a[] = new dataType[size];
dataType can be any
Primitive data type - int, char, float, boolean etc
Type Wrapper class - Integer, Character, Float, Boolean etc
Built-In class type - String etc
User Defined Class - Student etc
Length of Array
Array has a length property using which we can find length of the array
int n = a.length;
First and Last Element
Array elements are accessed using an integer index written in square bracket
int x = a[idx];  
First Element of an array is at index 0.
int f = a[0];
Last Element of an array is at index a.length - 1
int l = a[a.length - 1];
Using long data type as size or index
Java does not allow a long variable to be used as an array index, as it leads to compilation error.
We must typecast, a long variable to int, in case we are using it as an index.
long n = 10;
long idx = 2;
int a[] = new int[(int)n];         // Typecasting n to int using (int)
int x = a[(int)idx];                   // Typecasting idx to int using (int)
 

Array Initialization and For Each Loop 
We can use index based for loop (as seen earlier) to access elements of the array.  Java provides one more way to easily work with arrays, using for-each loop.  This loop is useful and very convenient to write if we aren't in need of indices of the array.

 

import java.util.*;

class Main {
    public static void main(String[] args) {
        int a[] = {10, 5, 2, 34, 6};        // Initializing array with fixed set of elements

        for(int x: a){                      // For each loop that assigns elements of array a into x one by one.
            System.out.print(x+" ");
        }
    }
}
 

Sorting and Filling the Array
Java has a built-in class named Arrays that makes it convenient to sort or fill a given array.

 

Arrays.sort(a);       // Sorts array elements in ASCENDING ORDER
Arrays.fill(a, -1);   // Fills the given array with all values as -1
```