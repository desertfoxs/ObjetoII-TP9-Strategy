package Ejercicio3;

public class Libro implements CalculadorDePrecios{

    private double impuestos = 0.1;
    private double descuentos = 0.1;
    private boolean envioGratis;

    @Override
    public void calcularPrecio(double precio) {
        if (precio > 100) {
            this.envioGratis = true;

        }
    }
    @Override
    public boolean isEnvioGratis() {
        return envioGratis;
    }

    public double getImpuestos() {
        return impuestos;
    }

    public double getDescuentos() {
        return descuentos;
    }
}
