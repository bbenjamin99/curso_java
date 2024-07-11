package org.bbenjamin.poointerfaces.repositorio;

import java.util.List;

import org.bbenjamin.poointerfaces.modelo.Cliente;

public interface OrdenableRepositorio {

    // Methods
    List<Cliente> listar(String campo, Direccion dir); 

}
