package org.bbenjamin.poointerfaces;

import java.util.List;
import org.bbenjamin.poointerfaces.modelo.Cliente;
import org.bbenjamin.poointerfaces.repositorio.ClienteListRepositorio;
import org.bbenjamin.poointerfaces.repositorio.CrudRepositorio;
import org.bbenjamin.poointerfaces.repositorio.Direccion;
import org.bbenjamin.poointerfaces.repositorio.OrdenableRepositorio;
import org.bbenjamin.poointerfaces.repositorio.PaginableRepositorio;

public class EjemploRepositorio {
    public static void main(String[] args) {

        CrudRepositorio<Cliente> repo = new ClienteListRepositorio();
        repo.crear( new Cliente("Benjamin", "Benitez"));
        repo.crear( new Cliente("Ricardo", "Ioirio"));
        repo.crear(new Cliente("Lionel", "Messi"));
        repo.crear(new Cliente("Andres", "Guzman"));

        List<Cliente> clientes = repo.listar();
        clientes.forEach(System.out::println);
        System.out.println("===== Paginable =====");
        List<Cliente> paginar = ((PaginableRepositorio)repo).listar(2,4);  
        paginar.forEach(System.out::println);
        System.out.println("\n");
        System.out.println("===== Ordenable =====");
        List<Cliente> ordenar = ((OrdenableRepositorio)repo).listar("id", Direccion.DESC);
        ordenar.forEach(System.out::println);
        System.out.println("\n");

        System.out.println("===== Editar =====");
        Cliente editarSegundo = new Cliente("Kylian", "Mbappe");
        editarSegundo.setId(2);
        repo.editar(editarSegundo);
        System.out.println("\n");

        System.out.println("Una vez editado el segundo:");
        clientes.forEach(System.out::println);
        System.out.println("\n");

        System.out.println("===== Eliminar ====");
        repo.eliminar(2);
        
        clientes.forEach(System.out::println);
    }   
}
