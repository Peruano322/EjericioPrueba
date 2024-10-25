package ExtraForm;
public class Pato extends Ave implements Nadador{
    String tamaño;

    @Override
    public void nadar() {
        System.out.println("Nadando");
    }
    void nadarBajoAgua(){
        System.out.println("Nadando bajo el agua");
    }
    
}
