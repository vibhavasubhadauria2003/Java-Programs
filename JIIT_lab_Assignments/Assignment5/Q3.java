// 3.Demonstrate autoboxing and unboxing with a collection of primitive types. Use a
// List&lt;Integer&gt; to store and retrieve integers.

//package JIIT_lab_Assignments.Assignment5;

import java.util.*;

public class Q3 {
    public static void main(String args[]){
        List<Integer> n=Arrays.asList(10, 20, 30, 40, 50);

        int a=n.get(0).intValue();
        System.out.println(a);
    }
}
