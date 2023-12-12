package aprendiendo;
//SOBRECARGA DE MÉTODOS
public class ProductoSobreCargaMetodo {
    String nombre;
    int precio;
    int cantidad;
    //constructor 1
    public ProductoSobreCargaMetodo() {}
    public ProductoSobreCargaMetodo(String nombre, int precio) {
        this.nombre = nombre;
        this.precio = precio;

    }
    //constructor 3
    public ProductoSobreCargaMetodo(String nombre, int precio, int cantidad) {
        this.precio = precio;
        this.nombre = nombre;
        this.cantidad = cantidad;
    }
    public void imprimir(String nombre, int precio){

    }
    public void imprimir(String nombre, int precio, int cantidad){
        System.out.println("Mi nombre es " + nombre + ", precio: " + precio + "cantidad: " + cantidad);
    }

    public static void main(String[] args) {
        ProductoSobreCargaMetodo objeto1 = new ProductoSobreCargaMetodo("Maleta",12,3);
        ProductoSobreCargaMetodo objeto2 = new ProductoSobreCargaMetodo("Maleta",12);
        System.out.println("Holaa ");
        System.out.println("Nombre: " +objeto1.nombre + ", Precio: " + objeto1.precio + ", cantidad: " + objeto1.cantidad);
        System.out.println("Nombre: " +objeto2.nombre + ", Precio: " + objeto2.precio + ", cantidad: " + objeto2.cantidad); //como no existe cantidad para objeto 2 se muestra como 0
        System.out.println("\nLLAMADA CON MÉTODOS \n");

        objeto1.imprimir(objeto1.nombre, objeto1.precio, objeto1.cantidad);
        objeto2.imprimir(objeto2.nombre, objeto2.precio, objeto2.cantidad);

        //
    }
}
