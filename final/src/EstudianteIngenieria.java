public class EstudianteIngenieria extends Estudiante {
    private int numeroSemestre;
    private float promedioAcumulado;

    public EstudianteIngenieria(String cedula, String nombre, String apellido, String telefono, int numeroSemestre, float promedioAcumulado, String serial) {
        super(cedula, nombre, apellido, telefono, serial);
        this.numeroSemestre = numeroSemestre;
        this.promedioAcumulado = promedioAcumulado;
    }

    public int getNumeroSemestre() {
        return numeroSemestre;
    }

    public void setNumeroSemestre(int numeroSemestre) {
        this.numeroSemestre = numeroSemestre;
    }

    public float getPromedioAcumulado() {
        return promedioAcumulado;
    }

    public void setPromedioAcumulado(float promedioAcumulado) {
        this.promedioAcumulado = promedioAcumulado;
    }

    @Override
    public String mostrarDetalles() {
        return "Estudiante de Ingeniería: " + getNombre() + " " + getApellido() + "\n" +
               "Cédula: " + getCedula() + "\n" +
               "Teléfono: " + getTelefono() + "\n" +
               "Semestre: " + numeroSemestre + "\n" +
               "Promedio Acumulado: " + promedioAcumulado + "\n" +
               "Serial del equipo: " + getSerial();
    }
}
