
### HASHSET : 
```
 ->  This class implements the Set interface.
 ->  It makes no guarantees as to the iteration order of the set; in particular, it does not guarantee that 
     the order will remain constant over time. 
 ->  HashSet Contains unique elements, it doesn’t allow duplicates.
 ->  This class permits the null elements.

Syntax :  
HashSet<Data_type> set_name = new HashSet<Data_type(optional)>();  (or)
Set<Data_type> set_name = new HashSet<Data_type(optional)>();

Eg : Set<Integer> set_name = new HashSet<>(); 

METHODS : 
1. add() :- It add elements to the set.
Eg : 
import java.util.*;
public class Main
{
    public static void main(String[] args) {
        Set<Integer> st = new HashSet<>();
        st.add(1);
        st.add(2);
        st.add(3);
        st.add(4);
        st.add(5);
        
       System.out.println(st);
    }
}
output :
[1,2,3,4,5]

2. clear() :- It remove all the elements from set makes set as empty.
Eg :
import java.util.*;
public class Main
{
    public static void main(String[] args) {
        Set<Integer> st = new HashSet<>();
        st.add(1);
        st.add(2);
        st.add(3);
        st.add(4);
        st.add(5);
        
       System.out.println("Before clearing the set :"+st);
       st.clear();
       System.out.println("After clearing the set"+st);
    }
}
output : 
Before clearing the set : [1, 2, 3, 4, 5]
After clearing the set : []

3. contains() :- It gives boolean values true/false, If the element is present in set it gives true    otherwise false.
Eg:
import java.util.*;
public class Main
{
    public static void main(String[] args) {
        Set<Integer> st = new HashSet<>();
        st.add(1);
        st.add(2);
        st.add(3);
        st.add(4);
        st.add(5);
        System.out.println(st.contains(3));
        System.out.println(st.contains(6));
    }
}
output : 
true
false

4. remove(element) :-  It remove a particular element from set.
Eg : 
import java.util.*;
public class Main
{
    public static void main(String[] args) {
        Set<Integer> st = new HashSet<>();
        st.add(1);
        st.add(2);
        st.add(3);
        st.add(4);
        st.add(5);
        
       System.out.println("before removing element : "+st);
       st.remove(3);
       System.out.println("After removing element : "+st);
     }
}
output:
before removing element : [1, 2, 3, 4, 5]
After removing element : [1, 2, 4, 5]

5. size():- It gives count of no.of elements in the set.
Eg:
import java.util.*;
public class Main
{
    public static void main(String[] args) {
        Set<Integer> st = new HashSet<>();
        st.add(1);
        st.add(2);
        st.add(3);
        st.add(4);
        st.add(5);
        System.out.println("Set size : "+st.size());
    }
}
output : 
Set size : 5

6. isEmpty() : Returns true if this set contains no elements.
Eg1:
import java.util.*;
public class Main
{
    public static void main(String[] args) {
        Set<Integer> st = new HashSet<>();
        
        System.out.println(st.isEmpty());
    }
}
output:
true

Eg2: 
import java.util.*;
public class Main
{
    public static void main(String[] args) {
        Set<Integer> st = new HashSet<>();
        st.add(3);
        st.add(5);
        st.add(6);
        st.add(2);
        st.add(1);
        
        System.out.println(st.isEmpty());
    }
}
output:
false
```

```
TIME COMPLEXITY : 
add() - O(1)
clear() - O(n)
contains() - O(1)
remove(element) - O(1)
size()     - O(1)
isEmpty()  - O(1)
```