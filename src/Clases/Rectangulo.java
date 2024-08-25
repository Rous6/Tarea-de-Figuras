package Clases;

public class Rectangulo extends Figura{
    private double Base;
    private double Altura;

    public Rectangulo(double base, double altura) {
        Base = base;
        Altura = altura;
    }
    @Override
    public double Area(){
        return Base * Altura;
    }
}
