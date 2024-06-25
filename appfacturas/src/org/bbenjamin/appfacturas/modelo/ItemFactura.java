package org.bbenjamin.appfacturas.modelo;

public class ItemFactura {
    // Attributes
    private Producto producto;
    private int cantidad;

    // Constructor
    public ItemFactura(int cantidad, Producto producto){
        this.cantidad = cantidad;
        this.producto = producto;
    }

    // getter & Setter
    public int getCantidad(){
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Producto getProducto(){
        return producto;
    }
    public void setProducto(Producto producto){
        this.producto = producto;
    }


    // methods
    public float calcularImporte(){
        return (this.cantidad * this.producto.getPrecio());
    }

}
