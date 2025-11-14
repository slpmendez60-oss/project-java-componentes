public class Chasis {

    private String tipo;
    private double largo;
    private double ancho;
    private double peso;

    public Chasis(String tipo, double largo, double ancho, double peso) {
        this.tipo = tipo;
        this.largo = largo;
        this.ancho = ancho;
        this.peso = peso;
    }

    public void mostrarInfo() {
        System.out.println("=== Chasis ===");
        System.out.println("Tipo: " + tipo);
        System.out.println("Largo: " + largo);
        System.out.println("Ancho: " + ancho);
        System.out.println("Peso: " + peso);
    }

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    public double getLargo() { return largo; }
    public void setLargo(double largo) { this.largo = largo; }

    public double getAncho() { return ancho; }
    public void setAncho(double ancho) { this.ancho = ancho; }

    public double getPeso() { return peso; }
    public void setPeso(double peso) { this.peso = peso; }
}

