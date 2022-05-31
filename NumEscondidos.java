import java.util.Scanner;
public class NumEscondidos {
    public static void main(String arcgs[])
    {
      String cad="",dig="",p="",subcad="";
      int n=0,a=0,b=0,y=0,z=0;
      boolean pasar;
      Scanner sc=new Scanner(System.in);
      Scanner sk=new Scanner(System.in);
      do{
      pasar=false;  
      System.out.println("NUMEROS ESCONDIDOS");
      for(int i=1;i<=40;i++)
      {
          dig=Integer.toString(i);
          cad=cad+dig;
      }
      do
      {
        System.out.print("Introduzca un numero: ");
        p=sk.nextLine();
        try
        {
        n=Integer.parseInt(p);
        pasar=true;
        }
        catch(Exception e)
        {
             System.out.println("El caracter no es valido, ingrese solo numeros enteros");
        }
       }while(pasar==false);
       pasar=false;
       a=p.length();
       b=p.length();
       for(int j=0;j<cad.length()-a;j++)
       {
           subcad=cad.substring(j,b);
          if(subcad.equals(p))
          {
              z=j+1;
              System.out.print(z+",");  
          }
        b++;
       }
       
       cad="";
       System.out.println(); 
       
       System.out.print("¿Desea probar el programa otra ves?  ");
        do{
           do{
           try
           {
           System.out.print("1(yes) 2(No): "); 
           y=sc.nextInt();
           pasar=true;
           }
           catch(Exception e)
           {
            System.out.println("El caracter no es valido");
            sc.nextLine();
            
           }
           }while(pasar==false);
           pasar=false;
              if(y>=1&&y<=2)
           {
               pasar=true;
           }
           else
           {
               System.out.println("Seleccione solo las 2 opciones");
               pasar=false;
           }
        }while(pasar==false);
        pasar=false;
        if(y==1)
        {
            pasar=false;
        }
        else
        {
            pasar=true;
        }
        }while(pasar==false);
        System.out.println("GRACIAS");
    }
}
