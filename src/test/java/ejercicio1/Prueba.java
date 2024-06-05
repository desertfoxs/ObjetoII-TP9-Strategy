package ejercicio1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Prueba {

    Transporte colectivosSur = new ColectivosSur();
    Transporte correoArgentino = new CorreoArgentino();

    @Test
    public void PruebaCalculandoCostoTotalColectivosSur(){

        Producto producto1 = new Producto(50000, "bici", 150);
        Empresa empresa = new Empresa("CompanyInc");
        assertEquals(53000, empresa.calculoCostoTotal(producto1, colectivosSur, "Capital Federal"));

    }

    @Test
    public void PruebaCalculandoCostoTotalCorreoArgentino(){

        Producto producto1 = new Producto(50000, "bici", 150);
        Empresa empresa = new Empresa("CompanyInc");
        assertEquals(52500, empresa.calculoCostoTotal(producto1, correoArgentino, "Capital Federal"));

    }

}
