package modelo;
import java.time.LocalDate;

public class Coche {
    // ATRIBUTOS
    private String matricula;
    private LocalDate fechaMatriculacion;
    private float precio;
    
    /* 
     * CONSTRUCTURES:
     *   [1]. VACÍO.
     *   [2]. COMPLETO.
    */
    
    public Coche(String matricula, LocalDate fechaMatriculacion, float precio) {
        this.matricula = matricula;
        this.fechaMatriculacion = fechaMatriculacion;
        this.precio = precio;
    }
    
    // MÉTODOS
    public String getMatricula() { return matricula; }
    public void setMatricula(String matricula) { this.matricula = matricula; }

    public LocalDate getFechaMatriculacion() { return fechaMatriculacion; }
    public void setFechaMatriculacion(LocalDate fechaMatriculacion) { this.fechaMatriculacion = fechaMatriculacion; }

    public float getPrecio() { return precio; }
    public void setPrecio(float precio) { this.precio = precio; }

    @Override
    public String toString() { return "Coche{" + "matricula=" + matricula + ", fechaMatriculacion=" + fechaMatriculacion + ", precio=" + precio + '}'; }
}
