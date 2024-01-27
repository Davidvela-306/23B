package intefaces;

public class Cuadrado extends  Abstraccion{
    public int number;

    //método abstacto hereda de Abstraccion
    @Override
    public int obtenerNumero(int number) {
        return number;
    }

    public  int cuadradoNumero(int number){
        return number * number;
    }
}
