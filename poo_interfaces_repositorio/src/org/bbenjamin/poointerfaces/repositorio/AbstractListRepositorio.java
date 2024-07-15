package org.bbenjamin.poointerfaces.repositorio;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractListRepositorio<T> implements OrdenablePaginableCrudRepositorio<T>{

// Atributes
protected List<T> dataSource;

// Constructor
    public AbstractListRepositorio() {
        this.dataSource = new ArrayList<>();
    }

// Methods
// CRUD REPOSITORIO
    @Override
    public List<T> listar(){
        return dataSource;
    }
     
    @Override
    public void crear(T t) {
        this.dataSource.add(t);
    }


    @Override
    public void eliminar(Integer id) {
        this.dataSource.remove(this.porId(id));
    }
    

    @Override
    public List<T> listar(int desde, int hasta) {
        return dataSource.subList(desde, hasta);
    }   

   
}
