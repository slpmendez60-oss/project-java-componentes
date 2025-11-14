public class Main {
    public static void main(String[] args) {

        Vehiculo v = new Vehiculo("001", "Toyota", "Corolla", 2022);
        Motor m = new Motor("Gasolina", 1.8, 140);
        Transmision t = new Transmision("Automática", 6, "FWD");
        Chasis c = new Chasis("Monocasco", 4.5, 1.8, 1200);
        Neumatico n = new Neumatico("Michelin", 16, 32);
        SistemaElectrico se = new SistemaElectrico(60, true, true);
        SistemaFrenos sf = new SistemaFrenos("Disco", true, "Excelente");
        RegistroVehicular rv = new RegistroVehicular("ABC123", "Luis Mendez", "2025-11-13");
        Mantenimiento mt = new Mantenimiento("2025-10-01", "Cambio de aceite", 120000);
        Sensor s = new Sensor("Temperatura", 85.5);

        v.mostrarInfo();
        m.mostrarInfo();
        t.mostrarInfo();
        c.mostrarInfo();
        n.mostrarInfo();
        se.mostrarInfo();
        sf.mostrarInfo();
        rv.mostrarInfo();
        mt.mostrarInfo();
        s.mostrarInfo();
    }
}

