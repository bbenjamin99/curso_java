public enum Color {
    // Declaro los enum
    ROJO("Rojo"),
    AMARILLO("Amarillo"),
    AZUL("Azul"),
    BLANCO("Blanco"),
    GRIS("Gris");
    
    // variable de tipo constante
    private final String color;

    // Constructor 
    Color(String color){
        this.color = color;
    }

    // Metodo
    public String getColor(){
        return color;
    }
    @Override
    public String toString() {
        return this.color;
    }
}
