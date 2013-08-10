package proyectofiguraco.edu.um.proyecto;

/**
 * Created with IntelliJ IDEA.
 * User: OSCAR
 * Date: 10/08/13
 * Time: 02:10 PM
 * To change this template use File | Settings | File Templates.
 */
public class Cuadrado extends Figura
{
    private double lado;


    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public double perimetro() {
        return 4 * lado;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public double area() {
        return lado*lado;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
