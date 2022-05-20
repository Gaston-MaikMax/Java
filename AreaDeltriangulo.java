import java.util.Scanner;
public class AreaDeltriangulo
{

  public static void  main(String args[])
{
float b, h ,area ;
Scanner ent = new Scanner (System.in);
System.out.println("area del triangulo");
System.out.println();
do{
  System.out.print("Base: ");
  b=ent.nextFloat();
  System.out.print("Altura: "); 
  h= ent.nextFloat();
}
while(b<=0||h<=0);
area = (b*h)/2;
System.out.println("El area es " + area );
}
}

