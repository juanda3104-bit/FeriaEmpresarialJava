
import java.time.LocalDate;

public class Comentario {
    private String nombreVisitante;
    private LocalDate fecha;
    private int calificacion;
    private String texto;

    public Comentario(String nombreVisitante, int calificacion, String texto) {
        this.nombreVisitante = nombreVisitante;
        this.fecha = LocalDate.now();
        this.calificacion = calificacion;
        this.texto = texto;
    }

    public String getNombreVisitante() { return nombreVisitante; }
    public void setNombreVisitante(String nombreVisitante) { this.nombreVisitante = nombreVisitante; }

    public LocalDate getFecha() { return fecha; }
    public void setFecha(LocalDate fecha) { this.fecha = fecha; }

    public int getCalificacion() { return calificacion; }
    public void setCalificacion(int calificacion) { this.calificacion = calificacion; }

    public String getTexto() { return texto; }
    public void setTexto(String texto) { this.texto = texto; }

    @Override
    public String toString() {
        return "[" + fecha + "] " + nombreVisitante + " (Calificacion: " + calificacion + "/5): " + texto;
    }
}