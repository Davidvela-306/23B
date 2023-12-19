package aprendiendo.sobrecarga.Vehiculo;

public class Main {
    public static void main(String[] args) {
        Vehiculo obVehiculo = new Vehiculo();
        Coche obCoche = new Coche();
        Bicicleta obBicicleta = new Bicicleta();
        Avion obAvion = new Avion();

        obVehiculo.acelerar();
        obCoche.acelerar();
        obBicicleta.acelerar();
        obAvion.acelerar();
    }
}
