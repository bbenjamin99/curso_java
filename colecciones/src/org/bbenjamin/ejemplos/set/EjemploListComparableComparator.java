package org.bbenjamin.ejemplos.set;

import java.util.ArrayList;
import java.util.List;
import org.bbenjamin.ejemplos.models.Alumno;

public class EjemploListComparableComparator {
    public static void main(String[] args) {
     List<Alumno> setAlumno = new ArrayList<>();
     setAlumno.add(new Alumno("Ricardito", 5));
     setAlumno.add(new Alumno("Benny", 6));
     setAlumno.add(new Alumno("Benyto", 4));
     setAlumno.add(new Alumno("Benjamin", 10));
     setAlumno.add(new Alumno("Mica", 9));
     setAlumno.add(new Alumno("Rockito", 3));
     setAlumno.add(new Alumno("Rockito", 3));
    //  Collections.sort(setAlumno, (a,b) -> a.getNota().compareTo(b.getNota()));
    setAlumno.sort((a,b) -> a.getNota().compareTo(b.getNota()));
    System.out.println(setAlumno);







    }  
}
