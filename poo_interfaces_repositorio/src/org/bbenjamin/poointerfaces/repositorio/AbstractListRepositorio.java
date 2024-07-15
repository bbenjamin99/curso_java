package org.bbenjamin.poointerfaces.repositorio;

import java.util.ArrayList;
import java.util.List;
import org.bbenjamin.poointerfaces.modelo.BaseEntity;

public abstract class AbstractListRepositorio<T extends BaseEntity> implements OrdenablePaginableCrudRepositorio<T>{

// Atributes
protected List<T> dataSource;

// Constructor
    public AbstractListRepositorio() {
        this.dataSource = new ArrayList<>();
    }

// Methods
// CRUD REPOSITORIO
    @Override
    public List<T> listar(){return dataSource;}
         
    public T porId(Integer id) {
        T resultado = null;
        for(T cli : dataSource) {
            if(cli.getId() != null && cli.getId().equals(id)){
                resultado = cli;
                break;
            }
        }
        return resultado;
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
