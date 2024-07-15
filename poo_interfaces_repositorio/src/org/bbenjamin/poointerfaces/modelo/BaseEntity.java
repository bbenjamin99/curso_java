
package org.bbenjamin.poointerfaces.modelo;

public class BaseEntity {
    // Attributes
    protected Integer id;

    private static int ultimoId;
    
    //Constructor
    public BaseEntity() {
        this.id = ++ultimoId;
    }

    // Getters & Setters
    public Integer getId() {
        return id;
    }
    public void setId(Integer id){
        this.id = id;
    }

}
