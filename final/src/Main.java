import javax.swing.JOptionPane;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        GestionPrestamos gestion = new GestionPrestamos();
        while (true) {
            String menu = "1. ESTUDIANTES DE INGENIERIA\n"
                        + "1.1 Registrar préstamo de equipo.\n"
                        + "1.2 Modificar préstamo de equipo. (Por serial o cedula).\n"
                        + "1.3 Devolución de equipo (se elimina el registro). (Por serial o cedula).\n"
                        + "1.4 Buscar equipo (Por serial o cedula).\n"
                        + "1.5 Volver al menú principal.\n"
                        + "2. ESTUDIANTES DE DISEÑO.\n"
                        + "2.1 Registrar préstamo de equipo.\n"
                        + "2.2 Modificar préstamo de equipo. (Por serial o cedula).\n"
                        + "2.3 Devolución de equipo (se elimina el registro). (Por serial o cedula).\n"
                        + "2.4 Buscar equipo (Por serial o cedula).\n"
                        + "2.5 Volver al menú principal.\n"
                        + "3. IMPRIMIR INVENTARIO TOTAL.\n"
                        + "4. SALIR DEL PROGRAMA.";

            String option = JOptionPane.showInputDialog(menu);
            switch (option) {
                case "1.1":
                    registrarPrestamoIngenieria(gestion);
                    break;
                case "1.2":
                    modificarPrestamoIngenieria(gestion);
                    break;
                case "1.3":
                    devolucionEquipoIngenieria(gestion);
                    break;
                case "1.4":
                    buscarEquipoIngenieria(gestion);
                    break;
                case "1.5":
                    break;
                case "2.1":
                    registrarPrestamoDiseno(gestion);
                    break;
                case "2.2":
                    modificarPrestamoDiseno(gestion);
                    break;
                case "2.3":
                    devolucionEquipoDiseno(gestion);
                    break;
                case "2.4":
                    buscarEquipoDiseno(gestion);
                    break;
                case "2.5":
                    break;
                case "3":
                    imprimirInventario(gestion);
                    break;
                case "4":
                    System.exit(0);
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida.");
            }
        }
    }

    private static void registrarPrestamoIngenieria(GestionPrestamos gestion) {
        String cedula = InputUtils.inputString("Ingrese la cédula del estudiante:");
        String nombre = InputUtils.inputString("Ingrese el nombre del estudiante:");
        String apellido = InputUtils.inputString("Ingrese el apellido del estudiante:");
        String telefono = InputUtils.inputString("Ingrese el teléfono del estudiante:");
        int semestre = InputUtils.inputInt("Ingrese el número de semestre:");
        float promedio = InputUtils.inputFloat("Ingrese el promedio acumulado:");
        String serial = InputUtils.inputString("Ingrese el serial del equipo:");

        Estudiante estudiante = new EstudianteIngenieria(cedula, nombre, apellido, telefono, semestre, promedio, serial);
        gestion.agregarEstudiante(estudiante);

        String marca = InputUtils.inputString("Ingrese la marca del equipo:");
        float tamano = InputUtils.inputFloat("Ingrese el tamaño del equipo en pulgadas:");
        float precio = InputUtils.inputFloat("Ingrese el precio del equipo:");
        String sistemaOperativo = InputUtils.inputString("Ingrese el sistema operativo del equipo:");
        String procesador = InputUtils.inputString("Ingrese el procesador del equipo:");

        Equipo equipo = new ComputadorPortatil(serial, marca, tamano, precio, sistemaOperativo, procesador);
        gestion.agregarEquipo(equipo);
    }

    private static void modificarPrestamoIngenieria(GestionPrestamos gestion) {
        String cedula = InputUtils.inputString("Ingrese la cédula del estudiante para modificar:");
        Estudiante estudiante = gestion.buscarEstudiantePorCedula(cedula);
        if (estudiante != null && estudiante instanceof EstudianteIngenieria) {
            int semestre = InputUtils.inputInt("Ingrese el nuevo número de semestre:");
            float promedio = InputUtils.inputFloat("Ingrese el nuevo promedio acumulado:");
            String serial = InputUtils.inputString("Ingrese el nuevo serial del equipo:");

            ((EstudianteIngenieria) estudiante).setNumeroSemestre(semestre);
            ((EstudianteIngenieria) estudiante).setPromedioAcumulado(promedio);
            ((EstudianteIngenieria) estudiante).setSerial(serial);
        } else {
            JOptionPane.showMessageDialog(null, "Estudiante no encontrado o no es de ingeniería.");
        }
    }

    private static void devolucionEquipoIngenieria(GestionPrestamos gestion) {
        String cedula = InputUtils.inputString("Ingrese la cédula del estudiante para devolución:");
        boolean eliminado = gestion.eliminarEstudiantePorCedula(cedula);
        if (eliminado) {
            JOptionPane.showMessageDialog(null, "Equipo devuelto y registro eliminado.");
        } else {
            JOptionPane.showMessageDialog(null, "Estudiante no encontrado.");
        }
    }

    private static void buscarEquipoIngenieria(GestionPrestamos gestion) {
        String cedula = InputUtils.inputString("Ingrese la cédula del estudiante:");
        Estudiante estudiante = gestion.buscarEstudiantePorCedula(cedula);
        if (estudiante != null) {
            JOptionPane.showMessageDialog(null, estudiante.mostrarDetalles());
        } else {
            JOptionPane.showMessageDialog(null, "Estudiante no encontrado.");
        }
    }

    private static void registrarPrestamoDiseno(GestionPrestamos gestion) {
        String cedula = InputUtils.inputString("Ingrese la cédula del estudiante:");
        String nombre = InputUtils.inputString("Ingrese el nombre del estudiante:");
        String apellido = InputUtils.inputString("Ingrese el apellido del estudiante:");
        String telefono = InputUtils.inputString("Ingrese el teléfono del estudiante:");
        String modalidad = InputUtils.inputString("Ingrese la modalidad de estudio:");
        int asignaturas = InputUtils.inputInt("Ingrese la cantidad de asignaturas:");
        String serial = InputUtils.inputString("Ingrese el serial del equipo:");

        Estudiante estudiante = new EstudianteDiseno(cedula, nombre, apellido, telefono, modalidad, asignaturas, serial);
        gestion.agregarEstudiante(estudiante);

        String marca = InputUtils.inputString("Ingrese la marca del equipo:");
        float tamano = InputUtils.inputFloat("Ingrese el tamaño del equipo en pulgadas:");
        float precio = InputUtils.inputFloat("Ingrese el precio del equipo:");
        String almacenamiento = InputUtils.inputString("Ingrese el almacenamiento del equipo:");
        float peso = InputUtils.inputFloat("Ingrese el peso del equipo en kg:");

        Equipo equipo = new TabletaGrafica(serial, marca, tamano, precio, almacenamiento, peso);
        gestion.agregarEquipo(equipo);
    }

    private static void modificarPrestamoDiseno(GestionPrestamos gestion) {
        String cedula = InputUtils.inputString("Ingrese la cédula del estudiante para modificar:");
        Estudiante estudiante = gestion.buscarEstudiantePorCedula(cedula);
        if (estudiante != null && estudiante instanceof EstudianteDiseno) {
            String modalidad = InputUtils.inputString("Ingrese la nueva modalidad de estudio:");
            int asignaturas = InputUtils.inputInt("Ingrese la nueva cantidad de asignaturas:");
            String serial = InputUtils.inputString("Ingrese el nuevo serial del equipo:");

            ((EstudianteDiseno) estudiante).setModalidad(modalidad);
            ((EstudianteDiseno) estudiante).setAsignaturas(asignaturas);
            ((EstudianteDiseno) estudiante).setSerial(serial);
        } else {
            JOptionPane.showMessageDialog(null, "Estudiante no encontrado o no es de diseño.");
        }
    }

    private static void devolucionEquipoDiseno(GestionPrestamos gestion) {
        String cedula = InputUtils.inputString("Ingrese la cédula del estudiante para devolución:");
        boolean eliminado = gestion.eliminarEstudiantePorCedula(cedula);
        if (eliminado) {
            JOptionPane.showMessageDialog(null, "Equipo devuelto y registro eliminado.");
        } else {
            JOptionPane.showMessageDialog(null, "Estudiante no encontrado.");
        }
    }

    private static void buscarEquipoDiseno(GestionPrestamos gestion) {
        String cedula = InputUtils.inputString("Ingrese la cédula del estudiante:");
        Estudiante estudiante = gestion.buscarEstudiantePorCedula(cedula);
        if (estudiante != null) JOptionPane.showMessageDialog(null, estudiante.mostrarDetalles());
        else {
            JOptionPane.showMessageDialog(null, "Estudiante no encontrado.");
        }
    }

    private static void imprimirInventario(GestionPrestamos gestion) {
        List<String> estudiantes = gestion.mostrarEstudiantes();
        List<String> equipos = gestion.mostrarEquipos();


        StringBuilder inventario = new StringBuilder();
        inventario.append("Listado de Estudiantes:\n");
        for (String estudiante : estudiantes) {
            inventario.append(estudiante).append("\n");
        }

        inventario.append("\nListado de Equipos:\n");
        for (String equipo : equipos) {
            inventario.append(equipo).append("\n");
        }

        JOptionPane.showMessageDialog(null, inventario.toString());
    }
}
