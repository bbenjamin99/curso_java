package org.bbenjamin.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.bbenjamin.poointerfaces.modelo.Cliente;
import org.bbenjamin.poointerfaces.modelo.ClientePremium;

public class EjemploGenericos {

    public static void main(String[] args) {
        
        List<Cliente> clientes = new ArrayList<>();
        
        clientes.add(new Cliente("Benja", "Benitez"));

        Cliente benja = clientes.get(0);

        Cliente[] clientesArray = {new Cliente("Benja", "Benitez"), new Cliente("Lionel", "Meci")}; 
        Integer[] enteros = {1,2,3};
        
        List<Cliente>  clientes2 = fromArrayToList(clientesArray);
        List<Integer> enteros2 = fromArrayToList(enteros);
        List<String> nombres = fromArrayToList(new String[]{"Benja", "Pepe", "Meci", "Dieguinho"}, enteros);


        clientes2.forEach(System.out::println);
        enteros2.forEach(System.out::println);
        nombres.forEach(System.out::println);

        List<ClientePremium> clientesPremium = fromArrayToList(
            new ClientePremium[]{ new ClientePremium("CLIENTE", "PREMIUM 2")});



    } 
            
    public static <T> List<T> fromArrayToList(T[] c) {
        
        return Arrays.asList(c);
    }

    
    public static <T extends Number> List<T> fromArrayToList(T[] c) {
        
        return Arrays.asList(c);
    }

        public static <T extends Cliente & Comparable<T> > List<T> fromArrayToList(T[] c) {
            
        return Arrays.asList(c);
    }

    public static <T, G> List<T> fromArrayToList(T[] c, G[] g) {
        for(G argumento : g) {
            System.out.println(argumento);
        }
        return Arrays.asList(c);
    }
}
