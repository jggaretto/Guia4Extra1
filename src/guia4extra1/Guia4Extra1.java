
package guia4extra1;

import java.time.LocalDate;
public class Guia4Extra1 {

   
    public static void main(String[] args) {
 // Ejemplo de uso
        Velero velero = new Velero("V123", 12.5, 2005, 2);
        Alquiler alquiler = new Alquiler("Juan", "12345678", LocalDate.of(2023, 5, 1), LocalDate.of(2023, 5, 7), 1, velero);
        double precioAlquiler = alquiler.calcularPrecioAlquiler();
        System.out.println("Cliente: " + alquiler.getNombreCliente());
        System.out.println("Documento: " + alquiler.getDocumentoCliente());
        System.out.println("Fecha de Alquiler: " + alquiler.getFechaAlquiler());
        System.out.println("Fecha de Devolucion: " + alquiler.getFechaDevolucion());
        System.out.println("Posicion del Amarre: " + alquiler.getPosicionAmarre());
        System.out.println("Barco alquilado: " + velero.getMatricula() + " , " + velero.getAnioFabricacion() + " , " + velero.getNumeroMastiles());
        System.out.println("Precio de alquiler: $" + precioAlquiler);
        
    }
    
}
