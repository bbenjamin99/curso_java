package org.bbenjamin.ejemplos.models;

public class Alumno implements Comparable<Alumno>{
    private String name;
    private Integer nota;

    public Alumno(){}
    public Alumno(String name, Integer nota) {
        this.name = name;
        this.nota = nota;
    }

    public String getName() { return name;}
    public void setName(String name) {
        this.name = name;
    }
    public Integer getNota() {return nota;}
    public void setNota(Integer nota) {
        this.nota = nota;
    }
    @Override
    public String toString() {
        return  name + ", nota=" + nota;
    }

    @Override
    public int compareTo(Alumno a) {
        // if(this.name == null) {
        //     return 0;
        // }
        // return this.name.compareTo(a.name);
        if(this.nota == null) {
            return 0;
        }
        return this.nota.compareTo(a.nota);
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((nota == null) ? 0 : nota.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Alumno other = (Alumno) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (nota == null) {
            if (other.nota != null)
                return false;
        } else if (!nota.equals(other.nota))
            return false;
        return true; 
    }

    

    
    
    
}
