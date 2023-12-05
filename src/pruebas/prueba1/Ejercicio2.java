package pruebas.prueba1;

public class Ejercicio2 {
    //(Realizar ( Implemente un programa en java en el cual cree
    // una clase denominada "comidasTipicas" y 4 instancias de la misma.
    public static class ComidasTipicas{
        //atributos
        String plato;
        double precio;

        //METODO CONSTRUCTOR:
        public ComidasTipicas ( String plato, double precio) {
            this.plato = plato;
            this.precio = precio;
        }
        /*metodos...*/
        public static void main(String[] args) {
            //CREACION DE 4 INSTANCIAS
            ComidasTipicas plato1 = new ComidasTipicas("Arroz relleno", 2.5);
            ComidasTipicas plato2 = new ComidasTipicas("Apanado de pollo", 3.5);
            ComidasTipicas plato3 = new ComidasTipicas("Cangrejo", 10);
            ComidasTipicas plato4 = new ComidasTipicas("Parrillada", 8.5);
            System.out.println("Plato1: "+ plato1.plato+ ", precio: "+plato1.precio);
            System.out.println("Plato2: "+ plato2.plato+ ", precio: "+plato2.precio);
            System.out.println("Plato3: "+ plato3.plato+ ", precio: "+plato3.precio);
            System.out.println("Plato4: "+ plato4.plato+ ", precio: "+plato4.precio);
        }



    }
}
