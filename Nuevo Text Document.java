import java.awt.*;
import java.util.Scanner;
import java.util.Vector;
import java.lang.Math;
 
 
public class EcuacionCuadratica {
     public static void main(String [] args){
           //Para poder tomar datos por teclado 
	   Scanner form = new Scanner(System.in);
 
          System.out.println("\nFórmula Cuadrática");
 
	   double a, b, c, x1, x2, potencia, raiz = 0 ;
 
	   System.out.println("\nEscriba el numero 1?");
	   a = form.nextDouble();
 
	   System.out.println("\nEscriba el numero 2?");
	   b = form.nextDouble();
 
	   System.out.println("\nEscriba el numero 3?");
    /**/
	   c = form.nextDouble();
 
	   potencia = Math.pow(b,2) - (4 * a *c);
 
           x1 = (-b - Math.sqrt(potencia)/ 2*a);
 
	   x2 = (-b + Math.sqrt(potencia)/ 2*a);
 
	   System.out.println("\nX1 = " + x1);
	   System.out.println("\nX2 = " + x2);
     }
 