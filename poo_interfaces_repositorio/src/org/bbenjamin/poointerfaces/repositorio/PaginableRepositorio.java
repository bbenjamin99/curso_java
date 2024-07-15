package org.bbenjamin.poointerfaces.repositorio;

import java.util.List;

public interface PaginableRepositorio<T> {
    

    //Methods
    List<T> listar(int desde, int hasta);
    
}
