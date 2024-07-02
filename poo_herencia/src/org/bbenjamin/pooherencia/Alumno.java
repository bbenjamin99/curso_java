package org.bbenjamin.pooherencia;

public class Alumno extends Persona{

    // Attributes
    private String school;
    private double gradeMath;
    private double gradeCastilian;
    private double gradeHistory;
    
    // Constructor
    public Alumno(){}

    public Alumno(String name, String lastname){
        super(name, lastname);
    }

    public Alumno(String name, String lastname, int age){
        super(name, lastname,age);
    }

    public Alumno(String name, String lastname, int age, String school){
        this(name, lastname,age);
        this.school = school;
    }
    public Alumno(String name, String lastname, int age, String school, double gradeMath, double gradeCastilian, double gradeHistory){

        this(name, lastname, age, school);
        this.gradeMath = gradeMath;
        this.gradeCastilian = gradeCastilian;
        this.gradeHistory =  gradeHistory;
    }

    // Getters & Setters

    public String getSchool() {
        return school;
    }
    public void setSchool(String school) {                  
        this.school = school;
    }
    public double getGradeMath() {
        return gradeMath;
    }
    public void setGradeMath(double gradeMath) {
        this.gradeMath = gradeMath;
    }
    public double getGradeCastilian() {
        return gradeCastilian;
    }
    public void setGradeCastilian(double gradeCastilian) {
        this.gradeCastilian = gradeCastilian;
    }
    public double getGradeHistory() {
        return gradeHistory;
    }
    public void setGradeHistory(double gradeHistory) {
        this.gradeHistory = gradeHistory;
    }

    // Methods
    @Override
    public String saludar(){
        String saludar = super.saludar();
        return saludar + " soy alumno y mi nombre es : " + getName();
    }


    public double calcularPromedio() {
        System.out.println("Calcular promedio de : " + Alumno.class.getCanonicalName());
        return (gradeMath + gradeCastilian + gradeHistory) / 3;
    }

    @Override
    public String toString() {
        return super.toString()+"\n[school=" + school + ", gradeMath=" + gradeMath + ", gradeCastilian=" + gradeCastilian
                + ", gradeHistory=" + gradeHistory +
                ", calcularPromedio=" + this.calcularPromedio() + "]";
    }

   
    
}
