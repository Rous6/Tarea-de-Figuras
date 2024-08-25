import Clases.Circulo;
import Clases.Figura;
import Clases.Rectangulo;
import Clases.Triangulo;

public class Main {
    public static void main(String[] args) {
        System.out.println("te amo");
        Figura Tri=new Triangulo(5,4);
        System.out.println("El area del triangulo es: "+Tri.Area());
        Figura Rec=new Rectangulo(5,6);
        System.out.println("El area del Rectangulo es:"+Rec.Area());
        Figura Cir=new Circulo(5);
        System.out.println("El area del Circulo es:"+Cir.Area());
    }

}