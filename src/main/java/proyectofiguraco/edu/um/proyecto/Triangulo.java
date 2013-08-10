package proyectofiguraco.edu.um.proyecto;

/**
 * Created with IntelliJ IDEA.
 * User: OSCAR
 * Date: 10/08/13
 * Time: 02:10 PM
 * To change this template use File | Settings | File Templates.
 */
public class Triangulo extends Figura
{

    private double base, altura, lado;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public double perimetro() {
        return lado + lado + lado;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public double area() {
        return (base * altura)/2;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
