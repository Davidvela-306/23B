package pruebas.prueba1;

public class Prueba1 {
    public static class Persona{
        public int cedula;
        public String nombre;
        public int edad;

        public Persona ( int cedula, String nombre, int edad) {
            this.cedula = cedula;
            this.nombre = nombre;
            this.edad = edad;
        }


        public void setCedula(int cedula) {
            this.cedula = cedula;
        }

        public int getCedula() {
            return cedula;
        }

        public static void main(String[] args) {
            Persona persona1 = new Persona(1754690905, "David", 20);
            persona1.setCedula(12345678);
            System.out.println("Cédula: " + persona1.getCedula());
        }
    }


}
