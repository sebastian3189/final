public class TabletaGrafica extends Equipo {
    private String almacenamiento;
    private float peso;

    public TabletaGrafica(String serial, String marca, float tamano, float precio, String almacenamiento, float peso) {
        super(serial, marca, tamano, precio);
        this.almacenamiento = almacenamiento;
        this.peso = peso;
    }

    public String getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(String almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    @Override
    public String mostrarDetalles() {
        return "Tableta Gráfica: " + getMarca() + "\n" +
               "Serial: " + getSerial() + "\n" +
               "Tamaño: " + getTamano() + " pulgadas\n" +
               "Precio: $" + getPrecio() + "\n" +
               "Almacenamiento: " + almacenamiento + "\n" +
               "Peso: " + peso + " kg";
    }
}
