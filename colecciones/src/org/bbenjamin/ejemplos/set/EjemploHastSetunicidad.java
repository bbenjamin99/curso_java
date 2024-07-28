package org.bbenjamin.ejemplos.set;

import java.util.HashSet;
import java.util.Set;
import org.bbenjamin.ejemplos.models.Alumno;

public class EjemploHastSetunicidad {
    public static void main(String[] args) {
     Set<Alumno> setAlumno = new HashSet<>();
     setAlumno.add(new Alumno("Ricardito", 5));
     setAlumno.add(new Alumno("Benny", 6));
     setAlumno.add(new Alumno("Benyto", 4));
     setAlumno.add(new Alumno("Benjamin", 10));
     setAlumno.add(new Alumno("Mica", 9));
     setAlumno.add(new Alumno("Rockito", 3));
     setAlumno.add(new Alumno("Rockito", 3));

    System.out.println(setAlumno);


    for(Alumno al : setAlumno) {
        System.out.println(al.getName());
    }

    System.out.println("Iterando usando While / Iterator");

    // Iterator<Alumno> alumnoIT = setAlumno.iterator();
    // while(alumnoIT.hasNext()) {
    //     Alumno a = alumnoIT.next();
    //     System.out.println(a);
    // } 

    }
}
