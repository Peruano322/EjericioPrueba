package ExtraForm;

public class Ave extends Animal implements Volador{
    String tipoDeAve;

    @Override
    void HacerSonido() {
        System.out.println("Trino");
    }

    @Override
    public void volar() {
        System.out.println("Volando");
    }
    void anidar(){
        System.out.println("Ave anidando");
    }
}
