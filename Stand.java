
import java.util.ArrayList;
import java.util.List;

public class Stand {
    private int numero;
    private String ubicacion;
    private String tamano;
    private boolean ocupado;
    private Empresa empresaAsignada;
    private List<Comentario> comentarios;

    public Stand(int numero, String ubicacion, String tamano) {
        this.numero = numero;
        this.ubicacion = ubicacion;
        this.tamano = tamano;
        this.ocupado = false;
        this.comentarios = new ArrayList<>();
    }

    public void asignarEmpresa(Empresa empresa) {
        this.empresaAsignada = empresa;
        this.ocupado = true;
    }

    public void agregarComentario(Comentario comentario) {
        this.comentarios.add(comentario);
    }

    public int getNumero() { return numero; }
    public void setNumero(int numero) { this.numero = numero; }

    public String getUbicacion() { return ubicacion; }
    public void setUbicacion(String ubicacion) { this.ubicacion = ubicacion; }

    public String getTamano() { return tamano; }
    public void setTamano(String tamano) { this.tamano = tamano; }

    public boolean isOcupado() { return ocupado; }
    
    public Empresa getEmpresaAsignada() { return empresaAsignada; }

    public List<Comentario> getComentarios() { return comentarios; }

    @Override
    public String toString() {
        String infoEmpresa = ocupado ? "Ocupado por: " + empresaAsignada.getNombre() : "Disponible";
        return "Stand #" + numero + " [" + ubicacion + ", " + tamano + "] - " + infoEmpresa;
    }
}