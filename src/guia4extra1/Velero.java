
package guia4extra1;

class Velero extends Barco {
    private int numeroMastiles;

    public Velero(String matricula, double eslora, int anioFabricacion, int numeroMastiles) {
        super(matricula, eslora, anioFabricacion);
        this.numeroMastiles = numeroMastiles;
    }

    public int getNumeroMastiles() {
        return numeroMastiles;
    }

    @Override
    public double calcularModulo() {
        return getEslora() * 10 + numeroMastiles;
    }
}


