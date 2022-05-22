import java.util.Scanner;
public class Factorial{

public static void main (String [] args)
{
  Scanner leer=new Scanner(System.in);
  int fact=1,n,i=1;

  for(; ;)
  {

  System.out.println("escribir un numero" );
  n=leer.nextInt();
  if(n>=1 && n<=10)
  break;

  }
  for(i=1;i<=n;i++){
   fact=fact*i;
  }
  System.out.println("el factorial es "+fact);
  }
 
}

//factorial.java
// Language: java
// Path: Factorial.java
import java.util.Scanner;
public class Factorial{
public static void main(String[] args) {
  Scanner leer=new Scanner(System.in);
  int fact=1,n,i=1;
  for(; ;)
  {
  System.out.println("escribir un numero" );
  n=leer.nextInt();
  if(n>=1 && n<=10)
  break;
  }
  for(i=1;i<=n;i++){
  fact=fact*i;
  }
  Sy