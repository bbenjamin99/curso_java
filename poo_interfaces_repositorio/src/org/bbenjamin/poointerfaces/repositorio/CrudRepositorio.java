package org.bbenjamin.poointerfaces.repositorio;

import java.util.List;
import org.bbenjamin.poointerfaces.modelo.Cliente;

public interface CrudRepositorio {

    // methods
    List<Cliente> listar();
    Cliente porId(Integer id);
    void crear(Cliente cliente);
    void editar(Cliente cliente);
    void eliminar(Integer id);
}
