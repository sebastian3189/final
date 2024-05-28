import java.util.ArrayList;
import java.util.List;

public class GestionPrestamos {
    private List<Estudiante> estudiantes = new ArrayList<>();
    private List<Equipo> equipos = new ArrayList<>();

    public void agregarEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }

    public void agregarEquipo(Equipo equipo) {
        equipos.add(equipo);
    }

    public Estudiante buscarEstudiantePorCedula(String cedula) {
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getCedula().equals(cedula)) {
                return estudiante;
            }
        }
        return null;
    }

    public boolean eliminarEstudiantePorCedula(String cedula) {
        Estudiante estudiante = buscarEstudiantePorCedula(cedula);
        if (estudiante != null) {
            estudiantes.remove(estudiante);
            return true;
        }
        return false;
    }

    public List<String> mostrarEstudiantes() {
        List<String> detalles = new ArrayList<>();
        for (Estudiante estudiante : estudiantes) {
            detalles.add(estudiante.mostrarDetalles());
        }
        return detalles;
    }

    public List<String> mostrarEquipos() {
        List<String> detalles = new ArrayList<>();
        for (Equipo equipo : equipos) {
            detalles.add(equipo.mostrarDetalles());
        }
        return detalles;
    }
}
