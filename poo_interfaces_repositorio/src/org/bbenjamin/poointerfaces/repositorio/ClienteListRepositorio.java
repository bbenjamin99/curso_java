package org.bbenjamin.poointerfaces.repositorio;

import java.util.ArrayList;
import java.util.List;
import org.bbenjamin.poointerfaces.modelo.Cliente;

public class ClienteListRepositorio extends AbstractListRepositorio<Cliente>{


// Methods
// CRUD REPOSITORIO

    @Override
    public void editar(Cliente cliente) {
        Cliente clienteEditar = this.porId(cliente.getId());
        clienteEditar.setNombre(cliente.getNombre());
        clienteEditar.setApellido(cliente.getApellido());
    }
    
    // Ordenable Repositorio
    @Override
    public List<Cliente> listar(String campo, Direccion dir) {
        List<Cliente> listaOrdenada = new ArrayList<>(this.dataSource);
        listaOrdenada.sort((a,b) -> {
                int resultado = 0;
                if(dir == Direccion.ASC){
                    switch(campo) {
                        case "id" ->
                          resultado = a.getId().compareTo(b.getId());
                        case "nombre" ->
                          resultado = a.getNombre().compareTo(b.getNombre());
                        case "apellido" ->
                          resultado = a.getApellido().compareTo(b.getApellido());

                    } } else if (dir == Direccion.DESC){
                    switch(campo) {
                        case "id" ->
                          resultado = b.getId().compareTo(a.getId());
                        case "nombre" ->
                          resultado = b.getNombre().compareTo(a.getNombre());
                        case "apellido" ->
                          resultado = b.getApellido().compareTo(a.getApellido());
                }
               
            }
            return resultado;
            
        });
    return listaOrdenada;
    }

   
}
