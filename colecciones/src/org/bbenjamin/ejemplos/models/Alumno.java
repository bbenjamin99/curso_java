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
        if(this.nota == a.nota){ return 0;
        }else if(this.nota > a.nota){
            return 1;
        }else{
            return -1;
        }
    }

    

    
}
