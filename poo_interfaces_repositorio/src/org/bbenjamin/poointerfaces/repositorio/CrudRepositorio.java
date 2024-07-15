package org.bbenjamin.poointerfaces.repositorio;

import java.util.List;

public interface CrudRepositorio<T> {

    // methods
    List<T> listar();
    T porId(Integer id);
    void crear(T cliente);
    void editar(T cliente);
    void eliminar(Integer id);
}
