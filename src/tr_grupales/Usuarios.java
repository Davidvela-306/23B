package tr_grupales;
//Cree una nueva Clase llamada Usuario, dentro cree un objeto, usuario_1, en el que
// establezca el nombre y numTarjetaBanco. En esta misma clase, muestre el mensaje en
// consola: “Hola, el nombre es: ” + nombre del usuario_1 + “Mi número de tarjeta es: ” + numero de la tarjeta del usuario_1
public class Usuarios {
    public static void main(String[] args) {
        Persona usuario_1 = new Persona();
        usuario_1.nombre = "David";
        //usuario_1.numTarjetaBanco = 12345678;//no puedo acceder ya que es privado
        usuario_1.setNumTarjetaBanco(87654321);
        //mostramos en consola
        System.out.println("Hola, el nombre es " + usuario_1.nombre + ", El número de tarjeta es: "+ usuario_1.getNumTarjetaBanco());
    }
}
