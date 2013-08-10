package proyectofiguraco.edu.um.proyecto;

/**
 * Created with IntelliJ IDEA.
 * User: OSCAR
 * Date: 10/08/13
 * Time: 02:14 PM
 * To change this template use File | Settings | File Templates.
 */
public class Circulo extends Figura
{
    private double radio;
    private  double diametro;

    double getRadio() {
        return radio;
    }

    void setRadio(double radio) {
        this.radio = radio;
    }

    double getDiametro() {
        return diametro;
    }

    void setDiametro(double diametro) {
        this.diametro = diametro;
    }

    @Override
    public double perimetro() {
        return 3.1416 * diametro;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public double area(  ) {
        return 3.1416 * (radio*radio);  //To change body of implemented methods use File | Settings | File Templates.
    }


}
