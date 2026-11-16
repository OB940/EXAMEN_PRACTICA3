package examenpractica3;

import controlador.*;
import modelo.*;
import vista.*;
import java.time.LocalDate;

public class ExamenPractica3 {
    public static void main(String[] args) {
        javax.swing.JPopupMenu.setDefaultLightWeightPopupEnabled(false);
        java.awt.EventQueue.invokeLater(() -> {
            // CREO UNA LISTA DE CLIENTES
            ListaCoches lista = new ListaCoches();
            // AÑADO TRES CLIENTES MEDIANTE EL MÉTODO DE LA CLASE LISTACLIENTES DEL MISMO NOMBRE
            lista.añadirCoche(new Coche("1234ABC", LocalDate.of(1998, 3, 14), 1500));

            // CREO UNA VENTANAPRINCIPAL CON LA LISTA
            new Principal(lista).setVisible(true);
        });
    }
    
}
