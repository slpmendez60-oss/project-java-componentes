public class Motor {

    private String tipo;
    private double cilindrada;
    private int potencia;

    public Motor(String tipo, double cilindrada, int potencia) {
        this.tipo = tipo;
        this.cilindrada = cilindrada;
        this.potencia = potencia;
    }

    public void mostrarInfo() {
        System.out.println("=== Motor ===");
        System.out.println("Tipo: " + tipo);
        System.out.println("Cilindrada: " + cilindrada);
        System.out.println("Potencia: " + potencia + " HP");
    }

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    public double getCilindrada() { return cilindrada; }
    public void setCilindrada(double cilindrada) { this.cilindrada = cilindrada; }

    public int getPotencia() { return potencia; }
    public void setPotencia(int potencia) { this.potencia = potencia; }
}
