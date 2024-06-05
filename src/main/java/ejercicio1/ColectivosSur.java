package ejercicio1;

public class ColectivosSur implements Transporte{
    @Override
    public int calcularCosto(Producto producto, String destino) {
        return producto.getPrecio() + costoLocalidad(destino, producto.getPeso());
    }

    private int costoLocalidad(String destino, int peso){

        int precio = 0;

        if(destino.equals("Capital Federal")){
            precio = 1000;
        }
        else if(destino.equals("Buenos Aires")){
            precio = 1500;
        }
        else{
            precio = 3000;
        }

        if(peso >= 5 && peso <= 30){
            precio += 500;
        }
        if(peso >= 30 ){
            precio += 2000;
        }

        return precio;
    }
}