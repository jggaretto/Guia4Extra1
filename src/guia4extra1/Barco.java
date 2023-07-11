
package guia4extra1;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

abstract class Barco {
    private String matricula;
    private double eslora;
    private int anioFabricacion;

    public Barco(String matricula, double eslora, int anioFabricacion) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.anioFabricacion = anioFabricacion;
    }

    public String getMatricula() {
        return matricula;
    }

    public double getEslora() {
        return eslora;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    // Método abstracto para calcular el módulo del barco
    public abstract double calcularModulo();

    // Método para calcular el número de días de ocupación
    public int calcularDiasOcupacion(LocalDate fechaAlquiler, LocalDate fechaDevolucion) {
        return (int) ChronoUnit.DAYS.between(fechaAlquiler, fechaDevolucion);
    }

   
}

