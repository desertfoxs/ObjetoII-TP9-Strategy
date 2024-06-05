package ejercicio2;

import java.time.LocalDate;


public class Persona {

    private LocalDate nacimiento;
    public Persona(LocalDate nacimiento) {
        this.nacimiento = nacimiento;
    }

    public String fechaNacimiento(Formato formato){
        return formato.formatear(nacimiento);
    }

}
