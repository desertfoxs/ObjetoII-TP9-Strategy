package Ejercicio3;

public class Medicina implements CalculadorDePrecios{

    private double impuestos = 0;
    private double descuentos;
    private boolean envioGratis;

    @Override
    public void calcularPrecio(double precio) {
        if (precio > 50) {
            descuentos = 0.1;
        }
        if (precio > 100) {
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
