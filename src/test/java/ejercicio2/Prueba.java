package ejercicio2;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class Prueba {

    @Test
    public void formatearFechaCorta(){
        Persona persona = new Persona(LocalDate.of(2003,4,8));
        assertEquals("8-04-2003", persona.fechaNacimiento(new FormatoCorto()));
    }

    @Test
    public void formatearFechaLarga(){
        Persona persona = new Persona(LocalDate.of(2003,4,8));
        assertEquals(8 + " de abril de " + 2003 ,persona.fechaNacimiento(new FormatoLargo()));
    }

}
