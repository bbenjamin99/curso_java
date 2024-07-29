package org.bbenjamin.ejemplos.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class EjemploTreeMap {
    public static void main(String[] args) {
        
        Map<String, Object> persona = new HashMap<>();
        // persona.put(null, "1234");
        // persona.put(null, "1234");
        persona.put("nombre", "Benja");
        persona.put("apellido", "bennito");
        persona.put("email", "bbenjamin@gmail.com");
        
        Map<String, String> direccion = new TreeMap<>();
        direccion.put("pais", "USA");
        direccion.put("estado", "California");
        direccion.put("ciudad", "Santa Barbara");
        direccion.put("calle", "One Street");
        direccion.put("numero", "120");

        persona.put("direccion", direccion);

        Map<String,String> direccionPersona = (Map<String, String>) persona.get("direccion");
        String pais = direccionPersona.get("pais");
        String ciudad = direccionPersona.get("ciudad"); 
        String barrio = direccionPersona.getOrDefault("ciudad", ciudad);


        System.out.println("pais:" + pais);
        System.out.println("ciudad:" + ciudad);
        System.out.println("barrio:" + barrio);
        



        persona.remove("apellido");
        System.out.println(persona);
        // System.out.println(persona.get(null));
        
        Collection<Object> valores = persona.values();
        for(Object val : valores) {
            System.out.println(val);
        }
    }
}
