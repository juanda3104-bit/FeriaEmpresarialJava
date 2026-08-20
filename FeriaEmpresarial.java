import java.util.ArrayList;
import java.util.List;

public class FeriaEmpresarial {
    private String nombreFeria;
    private List<Empresa> empresas;
    private List<Stand> stands;
    private List<Visitante> visitantes;

    public FeriaEmpresarial(String nombreFeria) {
        this.nombreFeria = nombreFeria;
        this.empresas = new ArrayList<>();
        this.stands = new ArrayList<>();
        this.visitantes = new ArrayList<>();
    }

    public void registrarEmpresa(Empresa empresa) {
        empresas.add(empresa);
        System.out.println("Empresa registrada: " + empresa.getNombre());
    }

    public void registrarStand(Stand stand) {
        stands.add(stand);
        System.out.println("Stand registrado: #" + stand.getNumero());
    }

    public void registrarVisitante(Visitante visitante) {
        visitantes.add(visitante);
        System.out.println("Visitante registrado: " + visitante.getNombre());
    }

    public Empresa buscarEmpresaPorId(String id) {
        for (Empresa e : empresas) {
            if (e.getId().equals(id)) return e;
        }
        return null;
    }

    public Stand buscarStandPorNumero(int numero) {
        for (Stand s : stands) {
            if (s.getNumero() == numero) return s;
        }
        return null;
    }

    public boolean asignarStandAEmpresa(int numeroStand, String idEmpresa) {
        Stand stand = buscarStandPorNumero(numeroStand);
        Empresa empresa = buscarEmpresaPorId(idEmpresa);

        if (stand != null && empresa != null) {
            if (!stand.isOcupado()) {
                stand.asignarEmpresa(empresa);
                System.out.println("Asignacion exitosa: Stand #" + numeroStand + " asignado a " + empresa.getNombre());
                return true;
            } else {
                System.out.println("Error: El Stand #" + numeroStand + " ya se encuentra ocupado.");
            }
        } else {
            System.out.println("Error: No se encontro el stand o la empresa en los registros.");
        }
        return false;
    }

    public void generarReporteStands() {
        System.out.println("\n--- Reporte de Stands - " + nombreFeria + " ---");
        for (Stand s : stands) {
            System.out.println(s.toString());
        }
    }

    public void generarReporteComentarios(int numeroStand) {
        Stand stand = buscarStandPorNumero(numeroStand);
        if (stand != null) {
            System.out.println("\n--- Comentarios del Stand #" + numeroStand + " ---");
            if (stand.getComentarios().isEmpty()) {
                System.out.println("No hay comentarios registrados.");
            } else {
                for (Comentario c : stand.getComentarios()) {
                    System.out.println(c.toString());
                }
            }
        } else {
            System.out.println("El stand indicado no existe.");
        }
    }
}