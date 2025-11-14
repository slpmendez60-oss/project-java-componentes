public class RegistroVehicular {

    private String matricula;
    private String propietario;
    private String fechaRegistro;

    public RegistroVehicular(String matricula, String propietario, String fechaRegistro) {
        this.matricula = matricula;
        this.propietario = propietario;
        this.fechaRegistro = fechaRegistro;
    }

    public void mostrarInfo() {
        System.out.println("=== Registro Vehicular ===");
        System.out.println("Matrícula: " + matricula);
        System.out.println("Propietario: " + propietario);
        System.out.println("Fecha Registro: " + fechaRegistro);
    }

    public String getMatricula() { return matricula; }
    public void setMatricula(String matricula) { this.matricula = matricula; }

    public String getPropietario() { return propietario; }
    public void setPropietario(String propietario) { this.propietario = propietario; }

    public String getFechaRegistro() { return fechaRegistro; }
    public void setFechaRegistro(String fechaRegistro) { this.fechaRegistro = fechaRegistro; }
}

