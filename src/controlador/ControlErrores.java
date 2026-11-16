package controlador;

import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.LocalDate;
import java.time.format.ResolverStyle;
import modelo.Coche;

public class ControlErrores {
    // AJUSTA EL FORMATO DE LA FECHA AL TÍPICO FORMATO DE 'DD/MM/AAAA'
    public static final DateTimeFormatter FORMATO_FECHA = DateTimeFormatter.ofPattern("dd/MM/uuuu").withResolverStyle(ResolverStyle.STRICT);
    
    public static String validarMatricula(String texto) {
        try {
            String m = (texto.trim());
            m = m.toUpperCase();
            
            
            return null;
            
        // EN CASO DE QUE LOS NÚMEROS NO SEAN DE TIPO INTEGER, LANZAMOS UN ERROR.
        } catch (NumberFormatException e) { return "ERROR. EL NÚMERO DEBE DE SER DE TIPO ENTERO."; }
    }

    public static String validarPrecio(String texto) {
        try {
            float p = Float.parseFloat(texto.trim().replace(',', '.'));
            
            if (!(p >= 0 && p <= 150000)) { return "ERROR. EL PRECIO DEBE DE TENER UN VALOR DE ENTRE 0 A 150000."; }
            return null;
            
        } catch (NumberFormatException e) { return "ERROR. EL PRECIO DE SER UN NÚMERO."; }
    }

    // COMPROBAMOS QUE LA FECHA ESTÉ BIEN
    public static String validarFecha(String texto) {
        try {
            LocalDate f = LocalDate.parse(texto.trim(), FORMATO_FECHA);
            LocalDate hoy = LocalDate.now();
            if (f.getYear() < 1990) { 
                return "ERROR. LA FECHA NO PUEDE SER ANTES DEL AÑO 1990.";
            } else if (f.isAfter(hoy)){
                return "ERROR. LA FECHA NO PUEDE SER DESPUÉS DE HOY.";
            }
            return null;
        
        // ESTE ERROR ES EN CASO DE QUE EL FORMATO SEA INVÁLIDO.
        } catch (DateTimeParseException e) { return "ERROR. FECHA/FORMATO INCORRECT@ (FORMATO DD/MM/AAAA)."; }
    }
}