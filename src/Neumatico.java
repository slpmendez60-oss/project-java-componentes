public class Neumatico {

    private String marca;
    private int tamaño;
    private double presion;

    public Neumatico(String marca, int tamaño, double presion) {
        this.marca = marca;
        this.tamaño = tamaño;
        this.presion = presion;
    }

    public void mostrarInfo() {
        System.out.println("=== Neumático ===");
        System.out.println("Marca: " + marca);
        System.out.println("Tamaño: " + tamaño);
        System.out.println("Presión: " + presion + " PSI");
    }

    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }

    public int getTamaño() { return tamaño; }
    public void setTamaño(int tamaño) { this.tamaño = tamaño; }

    public double getPresion() { return presion; }
    public void setPresion(double presion) { this.presion = presion; }
}

