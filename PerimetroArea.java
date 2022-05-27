
import java.util.Scanner;
public class PerimetroArea
|{
    public static void main(String args[])
{
        double radio, peri, area;
        final double Pi = 3.141592;
        Scanner ent = new Scanner(System.in);
        System.out.println("PERIMETRO Y AREA DE CIRCULO");
        System.out.println();
        do
        {
            System.out.print("Radio: ");
            radio = ent.nextDouble();
        } while (radio <= 0);
        peri = 2 * Pi * radio;
        area = Pi * Math.pow(radio, 2);
        System.out.println("El perimetro es " + peri);
        System.out.println("El area es " + area);
    }
}