
import java.util.Scanner;
public class Fibonacci{
  static Scanner entrada=new Scanner(System.in);
static boolean esFibonacci(int numero){
 int pre=0,pos=1,suma;
 boolean bandera=false;
 while(pre<=numero){
  if(pre==numero)
  bandera=true;
 suma=pre+pos;
 pre=pos;
 pos=suma;

 }
 return bandera;
}
public static void main(String []args){
 int numero;
 System.out.print("ingresar un numero: ");
 numero = int.Parse(Console.ReadLine());
 if( esFibonacci(numero))
 System.out.print("el numero si pertenece a la serie fibonacci");
 else
 System.out.print("el numero no pertenece a la serie fibonacci");
}

  
  
  }