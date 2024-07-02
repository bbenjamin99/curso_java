package ejemplos;

import org.bbenjamin.pooherencia.*;

public class EjemploHerenciaToString {

    public static void main(String[] args) {
        
        System.out.println("-----------Creando la instancia de alumno----------- ");
        System.out.println();
        Alumno alumno1 = new Alumno("Benjamin", "Benitez", 24);
        alumno1.setGradeCastilian(5.5);
        alumno1.setGradeHistory(6.3);
        alumno1.setGradeMath(4.9);  
        alumno1.setEmail("bbenjamin@balanceados-sa.com.ar");
        ((Alumno)alumno1).setSchool("Escuela Republica Argentina");
        imprimir(alumno1);
        System.out.println();

        System.out.println("-----------Creando la instancia de alumno internacional----------- ");
        System.out.println();

        AlumnoInternacional alumnoInt1 = new AlumnoInternacional("Peter", "Gosling", "Australia");
        alumnoInt1.setAge(15);
        alumnoInt1.setSchool("National Institute");
        alumnoInt1.setGradeLanguages(6.8);
        alumnoInt1.setGradeCastilian(6.2);
        alumnoInt1.setGradeHistory(5.8);
        alumnoInt1.setGradeMath(6.5);
        imprimir(alumnoInt1);
        System.out.println();
        System.out.println("-----------Creando la instancia de Profesor----------- ");
        System.out.println();
        Profesor profesor1 = new Profesor("Andres", "Guzman", "JAVA Programming");
        profesor1.setAge(41);
        imprimir(profesor1);
        System.out.println();
        System.out.println("##################Sobreescritura saludar()#######################");

        System.out.println(alumno1.saludar());  
        System.out.println(alumnoInt1.saludar());
        System.out.println(profesor1.saludar());
        
        System.out.println("##################Sobreescritura calcularPromedio()################");
        System.out.println("Alumno: " + alumno1.calcularPromedio());
        System.out.println("Alumno Internacional: " + alumnoInt1.calcularPromedio());
    }

    public static void imprimir(Persona persona) {

        System.out.println(persona.toString());
    }   
    
}
