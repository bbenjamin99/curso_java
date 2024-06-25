import java.text.SimpleDateFormat;
import java.util.Date;

import org.bbenjamin.appfacturas.modelo.Cliente;
import org.bbenjamin.appfacturas.modelo.Factura;

public class App {
    public static void main(String[] args) throws Exception {

        Cliente c1 = new Cliente();
        c1.setNombre("Benjamin");
        c1.setNif("42536814");


        Factura factura1 = new Factura("Descripcion", c1,new Date()) ;

        System.out.println(factura1.verDetalle());
    }}
