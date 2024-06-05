package ejercicio2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormatoCorto implements Formato{
    @Override
    public String formatear(LocalDate nacimiento) {
        return nacimiento.format(DateTimeFormatter.ofPattern("d-MM-yyyy"));
    }
}
