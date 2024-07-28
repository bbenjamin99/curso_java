package org.bbenjamin.ejemplos.list;

import java.util.ArrayList;
import java.util.List;
import org.bbenjamin.ejemplos.models.Alumno;

public class EjemploArrayList {
    public static void main(String[] args) {
     List<Alumno> al = new ArrayList<>();
     System.out.println(al + ", Size = " + al.size());
     System.out.println("Esta vacia? = " + al.isEmpty());
     al.add(new Alumno("Ricardito", 5));
     al.add(new Alumno("Benny", 6));
     al.add(new Alumno("Benyto", 4));
     al.add(2, new Alumno("Benjamin", 10));
     al.add(new Alumno("Mica", 9));
     al.add(new Alumno("Rockito", 3));
     al.set(5,new Alumno("Rockito", 3));
    

     System.out.println(al + ", Size = " + al.size());
     System.out.println("Esta vacia? =" + al.isEmpty());

     al.remove(new Alumno("Ricardito", 5));
      
    System.out.println("---------------------------------");
     System.out.println(al + ", Size = " + al.size());
     System.out.println("Esta vacia? =" + al.isEmpty());






    }  
}
