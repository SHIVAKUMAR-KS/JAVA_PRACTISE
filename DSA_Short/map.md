### Map - Java Code Template
20
```
Map in JAVA

import java.util.*;
import java.lang.*;
import java.io.*;

class Test {
    public static void main (String[] args) throws java.lang.Exception{
        Scanner sc = new Scanner(System.in);
        
        Map<Integer, Integer> mp = new HashMap<>();         // 1.  DECLARING AND INSTANTIATING
        
        for(int i = 1; i <= 10; i++)
            mp.put(i, 1);                                   // 2.  PUTTING Key, Value in MAP

        for(int i = 1; i <= 10; i++)
            mp.put(i, mp.getOrDefault(i, 0) + 1);           // 3.  UPDATE VALUE OF A KEY

        for(int i = 1; i <= 10; i++)
            System.out.println(mp.get(i));                  // 4.  Getting value for a key, throws exception of key not found

        for(int i = 1; i <= 20; i++)
            System.out.println(mp.getOrDefault(i, 10));     // 5.  Getting value for a key, returns default if key not found

        System.out.println(mp.size());                      // 6.  Count of Keys in Map
        
        for(Integer k : mp.keySet()){
            System.out.println(k + " " + mp.get(k));        // 7.  Print Key value Pair
        }

        if(mp.containsKey(5)){
            System.out.println("Found");                    // 8.  Checks if key exists or not
        }

        mp.remove(10);                                      // 9.  Removes a Key and its value

        mp.clear();                                         // 10.  Removes all keys and values
    } 
}
```