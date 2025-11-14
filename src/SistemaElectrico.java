public class SistemaElectrico {

    private int bateria;
    private boolean luces;
    private boolean sensores;

    public SistemaElectrico(int bateria, boolean luces, boolean sensores) {
        this.bateria = bateria;
        this.luces = luces;
        this.sensores = sensores;
    }

    public void mostrarInfo() {
        System.out.println("=== Sistema Eléctrico ===");
        System.out.println("Batería: " + bateria + " Ah");
        System.out.println("Luces: " + (luces ? "Sí" : "No"));
        System.out.println("Sensores: " + (sensores ? "Sí" : "No"));
    }

    public int getBateria() { return bateria; }
    public void setBateria(int bateria) { this.bateria = bateria; }

    public boolean isLuces() { return luces; }
    public void setLuces(boolean luces) { this.luces = luces; }

    public boolean isSensores() { return sensores; }
    public void setSensores(boolean sensores) { this.sensores = sensores; }
}

