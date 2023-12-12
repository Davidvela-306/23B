package tr_grupales;
//Crea una clase Persona que tenga dos atributos, nombre y numTarjetaBanco
// en la que esté encapsulada el atributo numTarjetaBanco ya que este valor
//es muy delicado y debemos restringir el acceso. Crea los métodos set y get
//de este atributo.
public class Persona {
    public  String nombre;
    private int numTarjetaBanco;  // private = restricted access

    // Getter
    public int getNumTarjetaBanco() {
        return numTarjetaBanco;
    }

    // Setter
    public void setNumTarjetaBanco(int numTarjetaBanco) {
        this.numTarjetaBanco = numTarjetaBanco;
    }

}

