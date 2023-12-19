package aprendiendo.sobrecarga;

class Animal {
    public void hacerSonido() {
        System.out.println("Haciendo sonido genérico");
    }
}
class Perro extends Animal {
    @Override
    public void hacerSonido() {
        System.out.println("Gua, guaf");
    }
}
class Gato extends Animal{
    @Override
    public void hacerSonido() {
        System.out.println("Miau, miau");
    }
}

