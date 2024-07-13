package org.bbenjamin.poointerfaces.repositorio;

import java.util.List;

import org.bbenjamin.poointerfaces.modelo.Cliente;

public interface PaginableRepositorio {
    

    //Methods
    List<Cliente> listar(int desde, int hasta);

}
