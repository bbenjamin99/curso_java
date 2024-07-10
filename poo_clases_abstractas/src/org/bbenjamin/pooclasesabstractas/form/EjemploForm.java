package org.bbenjamin.pooclasesabstractas.form;

// import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.bbenjamin.pooclasesabstractas.form.elementos.*;
import org.bbenjamin.pooclasesabstractas.form.elementos.select.Opcion;  

public class EjemploForm {  
    public static void main(String[] args) {
        
        InputForm username = new InputForm("username", "text");
        InputForm password = new InputForm("password", "password");
        InputForm email = new InputForm("email", "email");
        InputForm edad = new InputForm("edad", "number");

        TextareaForm textarea = new TextareaForm("mensaje", 20, 20);


        SelectForm lenguaje  = new SelectForm("lenguaje de programacion");

         ElementoForm saludar = new ElementoForm("saludo!") {   
            

            public String dibujarHtml() {

                return "<input disabled name='"+this.nombre+"' value=\""+this.valor+"\" />";
            }
         };

        Opcion java = new Opcion("1", "JAVA");
        lenguaje.addOpcion(java)
        .addOpcion(new Opcion("2", "Python"))
        .addOpcion(new Opcion("3", "Javascript"))
        .addOpcion(new Opcion("4", "C#").setSelected(true))
        .addOpcion(new Opcion("5", "PHP"));

        // java.setSelected(true);

        saludar.setValor("Hello from abstract class: ElementoForm. This field has been disabled ");
        username.setValor("bbenjamin99");
        password.setValor("123456");
        email.setValor("bbenjamin4253@gmail.com");
        edad.setValor("24");
        textarea.setValor("Hola, mi nombre es Benjamín y estoy escribiendo desde un textarea!");

        List<ElementoForm> formulario = Arrays.asList(username,password, email,edad,textarea,lenguaje,saludar);

        // for(ElementoForm campo : formulario) {
        //    System.out.println( campo.dibujarHtml()); 
        // }   

        formulario.forEach( e -> {
            System.out.println(e.dibujarHtml());
        });
        

    }
}
