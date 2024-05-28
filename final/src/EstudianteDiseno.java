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

        throw new UnsupportedOperationException("Unimplemented method 'mostrarDetalles'");
    }
}
