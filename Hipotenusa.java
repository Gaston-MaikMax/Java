import java.util.Scanner;
public class Hipotenusa
{

  public static void  main(String args[])
{
double cat1,cat2 ,hipo ;
Scanner ent = new Scanner (System.in);
System.out.println("Hipotenusa");
System.out.println();
do{
  System.out.print("Cateto 1: ");
  cat1=ent.nextDouble();
  System.out.print("Cateto 2: "); 
  cat2= ent.nextDouble();
}
while(cat1<=0||cat2<=0);
hipo = Math.sqrt(Math.pow(cat1, 2)+Math.pow(cat2, 2));
System.out.println("La hipotenusa es  " + hipo );
}
}



