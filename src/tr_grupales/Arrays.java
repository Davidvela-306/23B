package tr_grupales;

public class Arrays {

    public static void main(String[] args) {
        // definimos array no dinámico (DECLARACIÓN)
        int[] arrayNoDinamico = new int[1];

        //ACCESO A UN ARRAY Y MODIFICAR ELEMENTOS
        arrayNoDinamico[0] = 10;

        // definimos array dinámico (INICIALIZACIÓN)
        String[] nombres = {"Juan", "María", "Pedro","David"};


        //Los array admiten solo un tipo de dato
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        int[] myNum = {10, 20, 30, 40};

        //Obtener el tamaño de un array
        int tamaño = cars.length;

        //Recorrer un array
        for(int i = 0; i < cars.length; i++){
            System.out.println(cars[i]);
        }



    }

}
