public class SistemaFrenos {

    private String tipo;
    private boolean abs;
    private String estado;

    public SistemaFrenos(String tipo, boolean abs, String estado) {
        this.tipo = tipo;
        this.abs = abs;
        this.estado = estado;
    }

    public void mostrarInfo() {
        System.out.println("=== Sistema de Frenos ===");
        System.out.println("Tipo: " + tipo);
        System.out.println("ABS: " + (abs ? "Sí" : "No"));
        System.out.println("Estado: " + estado);
    }

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    public boolean isAbs() { return abs; }
    public void setAbs(boolean abs) { this.abs = abs; }

    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }
}

