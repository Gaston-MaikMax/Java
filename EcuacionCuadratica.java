import java.awt.*;
import java.util.Scanner;
import java.util.Vector;
import java.lang.Math;
 
 
public class EcuacionCuadratica {
     public static void main(String [] args){
        
	   Scanner form = new Scanner(System.in);
 
          System.out.println("\nFórmula Cuadratica");
 
	   double a, b, c, x1, x2, potencia, raiz = 0 ;
 
	   System.out.println("\nvalor de a");
	   a = form.nextDouble();
 
	   System.out.println("\nvalor de b");
	   b = form.nextDouble();
 
	   System.out.println("\nvalor de c");
	   c = form.nextDouble();
 
	   potencia = Math.pow(b,2) - (4 * a *c);
 
           x1 = (-b - Math.sqrt(potencia)/ 2*a);
 
	   x2 = (-b + Math.sqrt(potencia)/ 2*a);
 
	   System.out.println("\n = " + x1);
	   System.out.println("\n = " + x2);
     }
}