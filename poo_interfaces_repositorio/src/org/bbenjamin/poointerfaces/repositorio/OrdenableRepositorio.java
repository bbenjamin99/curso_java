package org.bbenjamin.poointerfaces.repositorio;

import java.util.List;

public interface OrdenableRepositorio<T> {

    // Methods
    List<T> listar(String campo, Direccion dir); 

}
