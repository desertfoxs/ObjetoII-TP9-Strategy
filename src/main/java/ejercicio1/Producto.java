package ejercicio1;

public class Producto {

    private int peso;
    private int precio;
    private String nombre;

    public Producto(int precio, String nombre, int peso) {
        this.precio = precio;
        this.nombre = nombre;
        this.peso = peso;
    }

    public int getPrecio() {
        return precio;
    }

    public int getPeso() {
        return peso;
    }
}
