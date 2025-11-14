public class Vehiculo {

    private String id;
    private String marca;
    private String modelo;
    private int año;

    public Vehiculo(String id, String marca, String modelo, int año) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
    }

    public void mostrarInfo() {
        System.out.println("=== Información del Vehículo ===");
        System.out.println("ID: " + id);
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año: " + año);
    }

    // Getters y Setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }

    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }

    public int getAño() { return año; }
    public void setAño(int año) { this.año = año; }
}

