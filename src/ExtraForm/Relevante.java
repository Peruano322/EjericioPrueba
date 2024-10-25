package ExtraForm;

public class Relevante {
    public static void main(String[] args) {
        //Funcionamiento con clase perro
        Perro perro=new Perro();
        perro.nombre="Tobi";
        perro.raza="Chiguagua";
        perro.HacerSonido();
        perro.jugar();
        //gato
        System.out.println("-----------------------------");
        Gato gato=new Gato();
        gato.nombre="negro";
        gato.color="Naranjado";
        gato.HacerSonido();
        gato.domir();
        //Ave
        System.out.println("----------------------------");
        Ave ave=new Ave();
        ave.nombre="Lucas";
        ave.tipoDeAve="Cotorra";
        ave.HacerSonido();
        ave.volar();
        ave.anidar();
        //
    }
}
