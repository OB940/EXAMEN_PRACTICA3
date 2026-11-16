package controlador;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import modelo.*;

public class ListaCoches extends ArrayList<Coche>{
    // ATRIBUTO
    private int actual = 0;
    
    // CONSTRUCTOR
    public ListaCoches() { super(); }
    
    // MÉTODOS 
    // añadir/borrar, obteneractual, ordenarxmatricula
    public boolean esVacia() { return isEmpty(); }
    
    public boolean esPrimero() { return esVacia() && actual == 0; }
    public boolean esUltimo() { return esVacia() && actual == size() - 1; }
    
    public void irAlPrimero() { actual = 0; }
    public void irAlUltimo() {
        if (esVacia() == true) {
            actual = 0;
        } else {
            actual = size() - 1;
        }
    }
    
    public void avanzar() { if (!esVacia() && !esUltimo()) { actual++; } }
    public void retroceder() { if (!esVacia() && !esPrimero()) { actual--; } }
    
    public void añadirCoche(Coche c) {
        add(c);
        actual = indexOf(c);
    }
    public void borrarCoche() {
        if (esVacia() == true) { return; }
        remove(actual);
        if (actual >= size()) { irAlUltimo(); }
    }
    
    public Coche obtenerCocheActual() {
        if (!esVacia()) { return get(actual); }
        return null;
    }

    public int getActual() { return actual; }
    
}
