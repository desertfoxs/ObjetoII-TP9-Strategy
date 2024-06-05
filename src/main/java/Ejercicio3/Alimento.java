package Ejercicio3;

public class Alimento implements CalculadorDePrecios{

    private double impuestos = 0.05;
    private double descuentos = 0.05;
    private boolean envioGratis;

    @Override
    public void calcularPrecio(double precio) {
        if (precio > 100) {
            descuentos = 0.15;
        }
        if (precio > 200) {
            envioGratis = true;
        }
    }
    @Override
    public boolean isEnvioGratis() {
        return envioGratis;
    }
    @Override
    public double getImpuestos() {
        return impuestos;
    }
    @Override
    public double getDescuentos() {
        return descuentos;
    }
}
