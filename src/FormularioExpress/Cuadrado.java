package FormularioExpress;
public class Cuadrado extends Figura implements Rotable, Dibujable{
double lado;
    @Override
    public double area() {
        return lado*lado;
    }

    @Override
    public void rotar(double grados) {
        System.out.println("Roto"+grados+"grados");
    }

    @Override
    public void dibujar() {
        System.out.println("El cuadrado es dibujable");
    }
    
}
