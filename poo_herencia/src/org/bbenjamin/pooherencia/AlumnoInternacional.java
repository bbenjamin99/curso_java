package org.bbenjamin.pooherencia;

public class AlumnoInternacional extends Alumno{
    // Attributes
    private String country;
    private double gradeLanguages;
    
    // Constructor
    public AlumnoInternacional(){
    }

    public AlumnoInternacional(String name, String lastname) {
        super(name, lastname);
    }

    public AlumnoInternacional(String name, String lastname, String country) {
        this(name, lastname);
        this.country = country;
    }
    // getters & Setters
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public double getGradeLanguages() {
        return gradeLanguages;
    }
    public void setGradeLanguages(double gradeLanguages) {
        this.gradeLanguages = gradeLanguages;
    }

    @Override
    public String saludar() {


        return "Hello! im a Stranger Student, im from " + getCountry();
    }

    // Methods
    @Override   
    public double calcularPromedio() {
        System.out.println("Calcular promedio de : " + AlumnoInternacional.class.getCanonicalName().toString());
       return ((super.calcularPromedio() * 3) + gradeLanguages) / 4;
    }

    @Override
    public String toString() {
        return super.toString()+"[\ncountry=" + country + ", gradeLanguages=" + gradeLanguages +
        ", calcularPromedio= " + calcularPromedio() + "]";
    }
    
    
    
}
