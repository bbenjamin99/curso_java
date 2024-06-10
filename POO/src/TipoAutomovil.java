public enum TipoAutomovil {
    //"Variables"
    SEDAN("Sedan",4,"Es un auto mediano"),
    STATION_WAGON("Station Wagon", 4, "Es un auto grande"),
    HATCHBACK("Hatchback", 4, "Es un auto compacto"),
    PICKUP("Pickup", 4, "Es una camioneta"),
    COUPE("Coupe", 2, "Auto chico"),
    CONVERTIBLE("Convertible",2, "Auto deportivo"),
    FURGON("Furgon", 5, "Auto utilitario");

    //variables
    private final String nombre;
    private final int numPuertas;
    private final String descripcion;
    
    //Constructor
    TipoAutomovil(String nombre, int numPuertas, String descripcion) {
        this.nombre = nombre;
        this.numPuertas = numPuertas;
        this.descripcion = descripcion;
    }
    
    //Getters & Setters
    public String getNombre(){
        return this.nombre;
    }

    public int getNumPuertas(){
        return this.numPuertas;
    }

    public String getDescripcion() {
        return this.getDescripcion();
    }



}
