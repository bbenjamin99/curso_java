package org.bbenjamin.ejemplos.set;

import java.util.Set;
import java.util.TreeSet;
import org.bbenjamin.ejemplos.models.Alumno;

public class EjemploTreeSetComparable {
    public static void main(String[] args) {
     Set<Alumno> setAlumno = new TreeSet<>();
     setAlumno.add(new Alumno("Ricardito", 5));
     setAlumno.add(new Alumno("Benny", 6));
     setAlumno.add(new Alumno("Benyto", 4));
     setAlumno.add(new Alumno("Benjamin", 10));
     setAlumno.add(new Alumno("Mica", 9));
     setAlumno.add(new Alumno("Rockito", 3));

    System.out.println(setAlumno);



    }

}
