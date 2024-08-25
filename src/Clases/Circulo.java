package Clases;

public class Circulo extends Figura {
    private double Radio;

    public Circulo(double radio) {
        Radio = radio;
    }
    @Override
    public double Area(){
        return Math.PI * Math.pow(Radio,2);
    }
}
