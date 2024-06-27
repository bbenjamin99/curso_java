package org.bbenjamin.appfacturas;


import java.util.Scanner;

import org.bbenjamin.appfacturas.modelo.*;



public class EjemploFactura {
    public static void main(String[] args) {
        
        

        // Cliente de ejemplo
        Cliente cliente1 = new Cliente();
        cliente1.setNif("42536814");
        cliente1.setNombre("Benjamin");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa la descripcion de la fac tura:");
        String descripcion = scanner.nextLine();

         Factura factura1 = new Factura(descripcion, cliente1);

         Producto producto;
 
         System.out.println();
         for(int i = 0; i < 5; i++) {
            producto = new Producto();
            System.out.print("Nombre del producto: " + producto.getCodigo() + " :" ); 
            producto.setNombre(scanner.nextLine());
            
            System.out.print("Precio del producto: " + producto.getNombre());
            producto.setPrecio(scanner.nextFloat());

            System.out.print("Cantidad del producto: " + producto.getNombre());
            

            factura1.addItemFactura(new ItemFactura(scanner.nextInt(), producto));
            System.out.println();


         }

         System.out.println(factura1.verDetalle() );
    }

}
