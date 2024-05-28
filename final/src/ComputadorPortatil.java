public class ComputadorPortatil extends Equipo {
    private String sistemaOperativo;
    private String procesador;

    public ComputadorPortatil(String serial, String marca, float tamano, float precio, String sistemaOperativo, String procesador) {
        super(serial, marca, tamano, precio);
        this.sistemaOperativo = sistemaOperativo;
        this.procesador = procesador;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    @Override
    public String mostrarDetalles() {
        return "Computador Portátil: " + getMarca() + "\n" +
               "Serial: " + getSerial() + "\n" +
               "Tamaño: " + getTamano() + " pulgadas\n" +
               "Precio: $" + getPrecio() + "\n" +
               "Sistema Operativo: " + sistemaOperativo + "\n" +
               "Procesador: " + procesador;
    }
}
