package org.bbenjamin.pooherencia;

public class EjemploHerencia {

    public static void main(String[] args) {
        
        System.out.println("-----------Creando la instancia de alumno----------- ");
        Alumno alumno1 = new Alumno();
        alumno1.setName("Benjamin");
        alumno1.setLastname("Benitez");
        alumno1.setGradeCastilian(5.5);
        alumno1.setGradeHistory(6.3);
        alumno1.setGradeMath(4.9);  
        ((Alumno)alumno1).setSchool("Escuela Republica Argentina");

        System.out.println("-----------Creando la instancia de alumno internacional----------- ");
        AlumnoInternacional alumnoInt1 = new AlumnoInternacional();
        alumnoInt1.setName("Peter");
        alumnoInt1.setLastname("Gosling");
        alumnoInt1.setCountry("Australia");
        alumnoInt1.setAge(15);
        alumnoInt1.setSchool("National Institute");
        alumnoInt1.setGradeLanguages(6.8);
        alumnoInt1.setGradeCastilian(6.2);
        alumnoInt1.setGradeHistory(5.8);
        alumnoInt1.setGradeMath(6.5);

        System.out.println("-----------Creando la instancia de Profesor----------- ");
        Profesor profesor1 = new Profesor();
        profesor1.setName("Andres");
        profesor1.setLastname("Guzman");
        profesor1.setSubject("JAVA Programming");

        // imprimo 
        System.out.println("Nombre Alumno: " + alumno1.getName() + " - Escuela : " + ((Alumno)alumno1).getSchool());
        System.out.println("Nombre Profesor: " + profesor1.getName()+  " - Asignatura : " + profesor1.getSubject());


        Class clase = alumnoInt1.getClass();
        while(clase.getSuperclass() != null ) {
            String hija = clase.getName();
            String padre = clase.getSuperclass().getName();
            System.out.println(hija + " es una clase hija de : " + padre);
            clase = clase.getSuperclass();
        }






    }
}
