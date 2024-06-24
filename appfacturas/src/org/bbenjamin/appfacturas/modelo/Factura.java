package org.bbenjamin.appfacturas.modelo;

import java.util.Date;

public class Factura {
    // Attributes

    private int folio;
    private String descripcion;
    private Date fecha;
    private Cliente cliente; 

    public static final int MAX_ITEMS = 12;
    private static int ultimoFolio;
    private ItemFactura[] items;
    private int indiceItems;

    // Constructros
    public Factura(String descripcion, Cliente cliente,Date fecha){
        this.descripcion = descripcion;
        this.cliente = cliente;
        this.items = new ItemFactura[MAX_ITEMS ];
        this.folio = ++ultimoFolio;
        this.fecha = fecha;

    }

    // Getter & Setter
    public int getFolio() {
        return folio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Cliente getCliente(){
        return this.cliente;
    }   

    public void setCliente(Cliente cliente){
        this.cliente = cliente;
    }
 
    public ItemFactura[] getItems(){
        return items;
    }

    public void addItemFactura(ItemFactura item){
        if(indiceItems < MAX_ITEMS){
            this.items[indiceItems++] = item;     
        }
    }


    // Methods
    public float calcularTotal() {
        float total = 0.0f; 

        for(ItemFactura item : this.items) {
            if(item == null) {
                continue;
            }
            total += item.calcularImporte();    
        } 
        return total;
    }

    public String verDetalle() {
        StringBuilder sb = new StringBuilder("Factura N°: ").append(folio).
         append("\nCliente: ").append(this.cliente.getNombre())
        .append("\tNIF: ").append(this.cliente.getNif())
        .append("\nDescripción: ").append(this.getDescripcion()+"\n")
        .append("\n#\t Nombre\t $\tCant.\tTotal\n"); 
        return sb.toString();
    }

    
}
