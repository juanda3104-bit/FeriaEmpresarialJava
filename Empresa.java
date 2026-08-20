
public class Empresa {
    private String id;
    private String nombre;
    private String sector;
    private String correoElectronico;

    public Empresa(String id, String nombre, String sector, String correoElectronico) {
        this.id = id;
        this.nombre = nombre;
        this.sector = sector;
        this.correoElectronico = correoElectronico;
    }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getSector() { return sector; }
    public void setSector(String sector) { this.sector = sector; }

    public String getCorreoElectronico() { return correoElectronico; }
    public void setCorreoElectronico(String correoElectronico) { this.correoElectronico = correoElectronico; }

    @Override
    public String toString() {
        return nombre + " (Sector: " + sector + ")";
    }
}