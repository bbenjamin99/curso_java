package org.bbenjamin.poointerfaces.repositorio;

import java.util.List;

public interface PaginableRepositorio {
    

    //Methods
    List<Cliente> listar(int desde, int hasta);

}
