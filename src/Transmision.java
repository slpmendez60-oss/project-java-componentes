public class Transmision {

    private String tipo;
    private int marchas;
    private String traccion;

    public Transmision(String tipo, int marchas, String traccion) {
        this.tipo = tipo;
        this.marchas = marchas;
        this.traccion = traccion;
    }

    public void mostrarInfo() {
        System.out.println("=== Transmisión ===");
        System.out.println("Tipo: " + tipo);
        System.out.println("Marchas: " + marchas);
        System.out.println("Tracción: " + traccion);
    }

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    public int getMarchas() { return marchas; }
    public void setMarchas(int marchas) { this.marchas = marchas; }

    public String getTraccion() { return traccion; }
    public void setTraccion(String traccion) { this.traccion = traccion; }
}
