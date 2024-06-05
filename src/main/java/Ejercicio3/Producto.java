package Ejercicio3;

    public class Producto {
        public CalculadorDePrecios tipo;
        public double precio;
        public Producto(CalculadorDePrecios tipo, double precio) {
            this.tipo = tipo;
            this.precio = precio;
        }
        public double precioFinal() {

            tipo.calcularPrecio(precio);

            double total = precio * (1 + tipo.getImpuestos()) * (1 - tipo.getDescuentos());

            if  (tipo.isEnvioGratis()) {
                total -= 10;
            }
            return total;
        }
    }

