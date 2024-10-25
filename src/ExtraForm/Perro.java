package ExtraForm;
public class Perro extends Animal{
    String raza;

    @Override
    void HacerSonido() {
        System.out.println("Guaof....");
    }
    void jugar(){
        System.out.println("Jugando");
    }
}
