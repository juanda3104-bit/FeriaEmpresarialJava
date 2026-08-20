public class Visitante {
    private String identificacion;
    private String nombre;
    private String correoElectronico;

    public Visitante(String identificacion, String nombre, String correoElectronico) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.correoElectronico = correoElectronico;
    }

    public void dejarComentario(Stand stand, int calificacion, String texto) {
        if (stand.isOcupado()) {
            Comentario nuevoComentario = new Comentario(this.nombre, calificacion, texto);
            stand.agregarComentario(nuevoComentario);
            System.out.println("Comentario de " + this.nombre + " agregado al Stand #" + stand.getNumero());
        } else {
            System.out.println("Error: No se puede comentar en un stand vacio.");
        }
    }

    public String getIdentificacion() { return identificacion; }
    public void setIdentificacion(String identificacion) { this.identificacion = identificacion; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getCorreoElectronico() { return correoElectronico; }
    public void setCorreoElectronico(String correoElectronico) { this.correoElectronico = correoElectronico; }
}