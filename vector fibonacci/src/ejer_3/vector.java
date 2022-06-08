/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer_3;
import java.util.*;
public class vector 
{
    public void fibo(int fibo[])
    {
        fibo[0]=0;
        fibo[1]=1;
        for(int i=2;i<20;i++)
        {
            fibo[i]=fibo[i-1]+fibo[i-2];
        }
    }
    public void leer(int vec[],int a)
    {
        System.out.println("Llene el vector");
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<a;i++)
        {
            vec[i]=sc.nextInt();
        }
        System.out.println();
    }
    public void mostrar(int vec[],int a)
    {
     
        for(int i=0;i<a;i++)
        {
            System.out.print(vec[i]+"|");
        }
        System.out.println();
    }
    public void obteniendo(int ve[],int vec[],int fibo[],int a)
    {
        int cont=0;
        for(int i=0;i<a;i++)
        {
            for(int k=2;k<20;k++)
            {
                if(vec[i]==fibo[k])
                {
                    ve[cont]=vec[i];
                    cont++;
                }
            }
        }
        for(int i=0;i<a;i++)
        {
            if(ve[i]!=0)
            {
                System.out.print(ve[i]+"|");
            }
        }
    }
}
