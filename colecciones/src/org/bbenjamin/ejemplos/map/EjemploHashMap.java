package org.bbenjamin.ejemplos.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class EjemploHashMap {
    public static void main(String[] args) {
        
        Map<String, String> persona = new HashMap<>();
        persona.put(null, "1234");
        persona.put(null, "1234");
        persona.put("nombre", "Benja");
        persona.put("apellido", "bennito");
        persona.put("email", "bbenjamin@gmail.com");
        
        persona.remove("apellido");
        System.out.println(persona);
        // System.out.println(persona.get(null));
        
        Collection<String> valores = persona.values();
        for(String val : valores) {
            System.out.println(val);
        }
    }
}
