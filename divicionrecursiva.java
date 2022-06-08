package divicionrecursiva;

import java.util.Scanner;

/**
 *
 * @author MIGUEL
 */
public class DivicionRecursiva {
     static Scanner entrada = new Scanner (System.in);
     static int divisionRecursiva(int dividendo, int divisor) {
    if (dividendo < divisor)  
    return 0;
    else
       return 1 + divisionRecursiva(dividendo-divisor, divisor);


}  
/**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int dividendo, divisor;
            System.out.print("ingresar el dividendo: ");
            dividendo = entrada.nextInt ();
            System.out.print("ingresar el divisor: ");
            divisor = entrada.nextInt ();
            System.out.print("La division entre los dos numeros es: " + divisionRecursiva(dividendo, divisor));
    }
    }
    