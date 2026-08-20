public class Main {
    public static void main(String[] args) {
        FeriaEmpresarial feria = new FeriaEmpresarial("Feria Universitaria 2026");

        // Datos de prueba iniciales
        Empresa e1 = new Empresa("NIT-111", "TechSolutions", "Desarrollo de Software", "contacto@techsol.com");
        Empresa e2 = new Empresa("NIT-222", "Galias Construcciones", "Inmobiliario", "ventas@galias.com");
        
        feria.registrarEmpresa(e1);
        feria.registrarEmpresa(e2);

        Stand s1 = new Stand(10, "Pabellon A", "3x3m");
        Stand s2 = new Stand(11, "Pabellon A", "4x4m");
        Stand s3 = new Stand(20, "Pasillo Central", "2x2m");
        
        feria.registrarStand(s1);
        feria.registrarStand(s2);
        feria.registrarStand(s3);

        Visitante v1 = new Visitante("1001", "Juan", "juan@correo.com");
        Visitante v2 = new Visitante("1002", "Kevin", "kevin@correo.com");

        feria.registrarVisitante(v1);
        feria.registrarVisitante(v2);

        System.out.println("\n--- Proceso de Asignacion ---");
        feria.asignarStandAEmpresa(10, "NIT-111");
        feria.asignarStandAEmpresa(20, "NIT-222");
        feria.asignarStandAEmpresa(20, "NIT-111"); // Prueba de stand ocupado

        System.out.println("\n--- Interaccion de Visitantes ---");
        v1.dejarComentario(s1, 5, "Muy buena atencion y explicacion del software.");
        v2.dejarComentario(s1, 4, "Interesante portafolio.");
        v1.dejarComentario(s3, 1, "Intentando comentar en stand vacio.");

        // Reportes finales
        feria.generarReporteStands();
        feria.generarReporteComentarios(10);
    }
}