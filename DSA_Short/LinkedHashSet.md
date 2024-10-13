# LinkedHashSet

- **Hash table and linked list implementation of the Set interface.**
- It maintains a linked list of entries of the set, in the order in which they were inserted. It doesn't allow duplicates.
- Note that the insertion order is not affected if an element is re-inserted into the set.

## Syntax

```java
LinkedHashSet<Data_type> set_name = new LinkedHashSet<Data_type(optional)>();
Example:

java
Copy code
LinkedHashSet<Integer> st = new LinkedHashSet<>();
Methods
add(): It adds elements to the set.

Example:

java
Copy code
import java.util.*;
public class Main {
    public static void main(String[] args) {
        LinkedHashSet<Integer> st = new LinkedHashSet<>();
        st.add(3);
        st.add(1);
        st.add(5);
        st.add(4);
        st.add(2);
        st.add(8);
        
        System.out.println(st);
    }
}
Output:

csharp
Copy code
[3, 1, 5, 4, 2, 8]
clear(): It removes all the elements from the set, making it empty.

Example:

java
Copy code
import java.util.*;
public class Main {
    public static void main(String[] args) {
        LinkedHashSet<Integer> st = new LinkedHashSet<>();
        st.add(3);
        st.add(1);
        st.add(5);
        st.add(4);
        st.add(2);
        st.add(8);
        
        System.out.println("Before clearing the LinkedHashSet: " + st);
        st.clear();
        System.out.println("After clearing the LinkedHashSet: " + st);
    }
}
Output:

less
Copy code
Before clearing the LinkedHashSet: [3, 1, 5, 4, 2, 8]
After clearing the LinkedHashSet: []
contains(): Returns a boolean value (true/false). If the element is present in the set, it returns true; otherwise, false.

Example:

java
Copy code
import java.util.*;
public class Main {
    public static void main(String[] args) {
        LinkedHashSet<Integer> st = new LinkedHashSet<>();
        st.add(3);
        st.add(1);
        st.add(5);
        st.add(4);
        st.add(2);
        st.add(8);
        
        System.out.println(st.contains(10));
        System.out.println(st.contains(5));
    }
}
Output:

arduino
Copy code
false
true
remove(element): Removes a particular element from the set.

Example:

java
Copy code
import java.util.*;
public class Main {
    public static void main(String[] args) {
        LinkedHashSet<Integer> st = new LinkedHashSet<>();
        st.add(3);
        st.add(1);
        st.add(5);
        st.add(4);
        st.add(2);
        st.add(8);

        System.out.println("Before removing the element in LinkedHashSet: " + st);
        st.remove(3);
        System.out.println("After removing the element in LinkedHashSet: " + st);
    }
}
Output:

less
Copy code
Before removing the element in LinkedHashSet: [3, 1, 5, 4, 2, 8]
After removing the element in LinkedHashSet: [1, 5, 4, 2, 8]
size(): Returns the count of the number of elements in the set.

Example:

java
Copy code
import java.util.*;
public class Main {
    public static void main(String[] args) {
        LinkedHashSet<Integer> st = new LinkedHashSet<>();
        st.add(3);
        st.add(1);
        st.add(5);
        st.add(4);
        st.add(2);
        st.add(8);
        st.add(11);
        
        System.out.println(st.size());
    }
}
Output:

Copy code
7
isEmpty(): Returns true if this set contains no elements.

Example 1:

java
Copy code
import java.util.*;
public class Main {
    public static void main(String[] args) {
        LinkedHashSet<Integer> st = new LinkedHashSet<>();
        System.out.println(st.isEmpty());
    }
}
Output:

arduino
Copy code
true
Example 2:

java
Copy code
import java.util.*;
public class Main {
    public static void main(String[] args) {
        LinkedHashSet<Integer> st = new LinkedHashSet<>();
        st.add(3);
        st.add(5);
        st.add(6);
        st.add(2);
        st.add(1);
        
        System.out.println(st.isEmpty());
    }
}
Output:

arduino
Copy code
false
Time Complexity
Method	Time Complexity
add()	O(1)
clear()	O(n)
contains()	O(log n)
remove(element)	O(1)
size()	O(1)
isEmpty()	O(1)
Overall Time Complexities:
Methods	HashSet	TreeSet	LinkedHashSet
add()	O(1)	O(log n)	O(1)
clear()	O(n)	O(n)	O(n)
contains()	O(1)	O(log n)	O(log n)
remove(element)	O(1)	O(log n)	O(1)
size()	O(1)	O(1)	O(1)
isEmpty()	O(1)	O(1)	O(1)