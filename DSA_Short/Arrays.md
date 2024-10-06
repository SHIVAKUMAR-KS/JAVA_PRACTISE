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