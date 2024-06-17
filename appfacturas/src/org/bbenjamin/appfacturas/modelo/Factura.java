package org.bbenjamin.appfacturas.modelo;

import java.util.Date;

public class Factura {
    // Attributes
    private Cliente cliente;
    private ItemFactura[] item;
    private int folio;
    private String descripcion;
    private Date fecha;




    // Methods
    public double calcularTotal() {
        return 2.23f;
    }

    public String verDetalle() {
        return "detalle";
    }
}
