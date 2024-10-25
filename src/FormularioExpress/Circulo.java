package FormularioExpress;
public class Circulo extends Figura implements Dibujable{
 double radio;
    @Override
    public double area() {
        return 3.14*radio*radio;
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujo de circulo");
    }


    
}
