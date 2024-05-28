public class EstudianteDiseno extends Estudiante {
    private String modalidad;
    private int asignaturas;
    private String serial;

    public EstudianteDiseno(String cedula, String nombre, String apellido, String telefono, String modalidad, int asignaturas, String serial) {
        super(cedula, nombre, apellido, telefono, serial);
        this.modalidad = modalidad;
        this.asignaturas = asignaturas;
        this.serial = serial;
    }

    public String getModalidad() {
        return modalidad;
    }

    public void setModalidad(String modalidad) {
        this.modalidad = modalidad;
    }

    public int getAsignaturas() {
        return asignaturas;
    }

    public void setAsignaturas(int asignaturas) {
        this.asignaturas = asignaturas;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    @Override
    public String mostrarDetalles() {

        return "Estudiante de diseño: " + getNombre() + " " + getApellido() + "\n" +
                "Cédula: " + getCedula() + "\n" +
                "Teléfono: " + getTelefono() + "\n" +
                "modalidad de estudio : " + getModalidad() + "\n" +
                "cantidad de asignaturas del estudiante: " + getAsignaturas()+ "\n" +
                "Serial del equipo: " + getSerial();
    }
}
