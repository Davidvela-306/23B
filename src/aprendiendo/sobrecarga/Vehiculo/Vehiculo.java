package aprendiendo.sobrecarga.Vehiculo;

public class Vehiculo {
    public void acelerar(){
        System.out.println("Acelerando de manera genérica");
    }
}
class Coche extends Vehiculo{
    @Override
    public void acelerar() {
        System.out.println("Acelerando como un coche");
    }
}
class Bicicleta extends Vehiculo{
    @Override
    public void acelerar() {
        System.out.println("Acelerando como una bici");
    }
}
class Avion extends Vehiculo{
    @Override
    public void acelerar() {
        System.out.println("Acelerando como un avión");
    }
}
