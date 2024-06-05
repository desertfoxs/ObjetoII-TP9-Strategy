package ejercicio1;

public class CorreoArgentino implements Transporte{
    @Override
    public int calcularCosto(Producto producto, String destino) {
        return producto.getPrecio() + costoLocalidad(destino, producto.getPeso());
    }

    private int costoLocalidad(String destino, int peso){

        int precio = 0;

        if(destino.equals("Capital Federal")){
            precio = 500;
        }
        else{
            precio = 800 + calculoDistancia(destino);
        }

        if(peso >= 5 && peso <= 30){
            precio += 500;
        }
        if(peso >= 30 ){
            precio += 2000;
        }

        return precio;
    }

    private int calculoDistancia(String destino) {
        return 500;
    }
}
