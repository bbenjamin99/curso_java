package org.bbenjamin.ejemplos.set;

import java.util.Set;
import java.util.TreeSet;

public class EjemploTreeSet {
    public static void main(String[] args) {
        
        Set<String> ts = new TreeSet<>((a,b) ->  b.compareTo(a));
        
        ts.add("Uno");
        ts.add("Dos");
        ts.add("Tres");
        ts.add("Tres");
        ts.add("Cuatro");
        ts.add("Cinco");
        System.out.println(ts);

        Set<Integer> stNum = new TreeSet<>();
        stNum.add(4);
        stNum.add(2);
        stNum.add(1);
        stNum.add(3);
        stNum.add(3);
        stNum.add(5);   
        System.out.println(stNum);

        
    }


}
