
package guia4extra1;


class BarcoMotor extends Barco {
    private int potenciaCV;

    public BarcoMotor(String matricula, double eslora, int anioFabricacion, int potenciaCV) {
        super(matricula, eslora, anioFabricacion);
        this.potenciaCV = potenciaCV;
    }

    public int getPotenciaCV() {
        return potenciaCV;
    }

    @Override
    public double calcularModulo() {
        return getEslora() * 10 + potenciaCV;
    }
}
