package org.bbenjamin.ejemplos.set;


import java.util.LinkedList;
import java.util.ListIterator;
import org.bbenjamin.ejemplos.models.Alumno;

public class EjemploLinkedList {
    public static void main(String[] args) {
     LinkedList<Alumno> enlazada = new LinkedList<>();
     System.out.println(enlazada + ", Size = " + enlazada.size());
     System.out.println("Esta vacia? = " + enlazada.isEmpty());
     enlazada.add(new Alumno("Ricardito", 5));
     enlazada.add(new Alumno("Benny", 6));
     enlazada.add(new Alumno("Benyto", 4));
     enlazada.add(2, new Alumno("Benjamin", 10));
     enlazada.add(new Alumno("Mica", 9));
     enlazada.add(new Alumno("Rockito", 3));

     enlazada.addFirst(new Alumno("Zeus", 9));
     enlazada.addLast(new Alumno("Kratos", 8));
    System.out.println(enlazada);
        

    ListIterator<Alumno> li = enlazada.listIterator();
        while(li.hasNext()) {
            System.out.println(li.next());
        }

        System.out.println("----------------------------");
        while(li.hasPrevious()) {
            Alumno alumno = li.previous();
            System.out.println(alumno);
        }
    }  
}
