# Strings in Java

In Java, String is a sequence of characters. A string value is enclosed in double quotes while a character is enclosed in single quotes.

```java
String s = "A";
char c   = 'A';

String p = "BeingZero";
Java String Functions
String Input Reading
java
Copy code
Scanner sc = new Scanner(System.in);
String s1 = sc.next();             // Reads next available word (ignores empty lines and spaces to find where the next string is)
String s2 = sc.nextLine();         // Reads complete line (including empty line)
Length of a String
java
Copy code
System.out.println(s.length());
Getting Character at a Particular Integral Index
java
Copy code
System.out.println(s.charAt(0));
String Comparison
In Java, strings should not be compared with == operator as that often leads to incorrect results.

java
Copy code
String s1 = "BeingZero";
String s2 = "BeingZero";
String s3 = "beingzero";
boolean ans1 = s1.equals(s2);   // true
boolean ans2 = s1.equals(s3);   // false
There is one more way to compare strings in Java that returns an integral value:

java
Copy code
int ans = s1.compareTo(s2); // ans will be 0 if strings are equal
Otherwise, ans will be the integral difference between the first differing character of s1 and s2.

String and Int Conversions
Convert int to String
java
Copy code
int x = 34;
String xs1 = String.valueOf(x);
String xs2 = x + "";
Convert String to int
java
Copy code
String s = "234";
int x = Integer.parseInt(s);
Converting String to Upper or Lowercase
java
Copy code
String s = "BeingZero";
System.out.println(s.toUpperCase()); // BEINGZERO
System.out.println(s.toLowerCase()); // beingzero
Substring Function
java
Copy code
String s = "BeingZero";
String sub1 = s.substring(5);        // Returns substring from startIdx = 5 to the end of string, i.e. "Zero"
String sub2 = s.substring(2, 5);     // Returns substring from startIdx = 2 to endIdx = 4 (5 - 1), i.e. "ing"
String to Character Array
java
Copy code
String s = "BeingZero";
char ca[] = s.toCharArray();         // String to charArray
s = new String(ca);                   // Char Array to String
Printing String Character by Character Using For-Each Loop
java
Copy code
for (char c : s.toCharArray()) {
    System.out.print(c + " ");
}
Print a String Containing Words, Word by Word on a Separate Line
java
Copy code
String line = sc.nextLine();
String parts[] = line.split(" ");
for (String part : parts) {
    System.out.println(part);
}
Additional Functions to Explore
Read about these functions on your own from the official Java documentation:

indexOf
lastIndexOf
startsWith
endsWith
trim()
isEmpty()
sql
Copy code

You can copy and paste this Markdown into any Markdown editor or viewer to see the formatted output.