import java.util.Scanner;
public class Ordenar {
    
    public static void main(String args[])
    {
     int n=0,q=0,l=0,aux=0,b=0,c=0,x=0,y=0;
        boolean pasar;
        Scanner sc=new Scanner(System.in);
        do{
         pasar=false;  
        System.out.println("Ordenando Hotcakes");
        do{
        do
        {
        try
        {
        System.out.print("Introduzca la cantidad de hotcakes: ");
        n=sc.nextInt();
        pasar=true;
        }
        catch(Exception e)
        {
             System.out.println("El caracter no es valido, ingrese solo numeros enteros");
             sc.nextLine();
        }
        }while(pasar==false);
        pasar=false;
        if(n>=1&&n<=100)
        {
            pasar=true;
        }
        else
        {
            System.out.println("Los numeros deben ser entre el 1 y el 100");
        }
        
        }while(pasar==false);
        pasar=false;
        int Hot[]=new int[n];
        System.out.println("Introduzca el tamaño de cada Hotcakes");
        for(int i=0;i<n;i++)
        {
        do
        {
        try
        {
        System.out.print("Tamaño del Hotcakes "+(i+1)+" :");
        Hot[i]=sc.nextInt();
        pasar=true;
        }
        catch(Exception e)
        {
             System.out.println("El caracter no es valido, ingrese solo numeros enteros");
             sc.nextLine();
        }
        }while(pasar==false);
        pasar=false;
        }
        pasar=false;
        for(int i=0;i<n;i++)
            for(int j=0;j<n-1;j++)
            {
                if(Hot[j]>Hot[j+1])
                {
                    aux=Hot[j+1];
                    Hot[j+1]=Hot[j];
                    Hot[j]=aux;        
                }
            }
        
        
        System.out.println("Los Hotcakes ordenados serian:");
        for(int i=0;i<n;i++)
        {
            System.out.print(Hot[i]+",");
        }
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
        System.out.println("arigato...!!!!!!!");
    }
}
