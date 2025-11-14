public class Mantenimiento {

    private String fecha;
    private String tipo;
    private double costo;

    public Mantenimiento(String fecha, String tipo, double costo) {
        this.fecha = fecha;
        this.tipo = tipo;
        this.costo = costo;
    }

    public void mostrarInfo() {
        System.out.println("=== Mantenimiento ===");
        System.out.println("Fecha: " + fecha);
        System.out.println("Tipo: " + tipo);
        System.out.println("Costo: $" + costo);
    }

    public String getFecha() { return fecha; }
    public void setFecha(String fecha) { this.fecha = fecha; }

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    public double getCosto() { return costo; }
    public void setCosto(double costo) { this.costo = costo; }
}

