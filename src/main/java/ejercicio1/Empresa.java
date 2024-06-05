package ejercicio1;

public class Empresa {

    String nombre;

    public Empresa(String nombre) {
        this.nombre = nombre;
    }

    public int calculoCostoTotal(Producto producto, Transporte transporte, String destino){
        return transporte.calcularCosto(producto, destino);
    }
}