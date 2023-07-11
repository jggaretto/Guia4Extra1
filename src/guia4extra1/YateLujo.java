
package guia4extra1;


class YateLujo extends Barco {
    private int potenciaCV;
    private int numeroCamarotes;

    public YateLujo(String matricula, double eslora, int anioFabricacion, int potenciaCV, int numeroCamarotes) {
        super(matricula, eslora, anioFabricacion);
        this.potenciaCV = potenciaCV;
        this.numeroCamarotes = numeroCamarotes;
    }

   

    public int getPotenciaCV() {
        return potenciaCV;
    }

    public int getNumeroCamarotes() {
        return numeroCamarotes;
    }

    @Override
    public double calcularModulo() {
        return getEslora() * 10 + potenciaCV + numeroCamarotes;
    }
}