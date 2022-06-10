/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer_6;
import java.util.*;
public class matriz 
{
    public void llenado(int m[][],int a,int b)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("introduzca los datos en la matriz");
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<a;j++)
            {
                System.out.print("posicion"+i+""+j+":");
                m[i][j]=sc.nextInt();
                System.out.println();
            }
        } 
    }
    public void mostrar(int m[][],int a,int b)
    {
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<a;j++)
            {
                System.out.print("|"+m[i][j]);
            }
            System.out.println();
        }
    }
    public void ascendente(int m[][],int a,int b)
    {
        int alm;
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<b;j++)
            {
                for(int k=0;k<a;k++)
                {
                    for(int l=0;l<b;l++)
                    {
                        alm=m[i][j];
                        if(m[i][j]<m[k][l])
                        {
                            m[i][j]=m[k][l];
                            m[k][l]=alm;
                        }
                    }
                }
            }
        }
    }
    public void descendente(int m[][],int a,int b)
    {
        int alm;
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<b;j++)
            {
                for(int k=0;k<a;k++)
                {
                    for(int l=0;l<b;l++)
                    {
                        alm=m[i][j];
                        if(m[i][j]>m[k][l])
                        {
                            m[i][j]=m[k][l];
                            m[k][l]=alm;
                        }
                    }
                }
            }
        }
    }
    public void suma(int m[][],int a,int b,int c)
    {
        System.out.println("RESULTADO DE LA MATRIZ SUMADA");
        System.out.println("fue sumada por: "+c);
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<a;j++)
            {
                m[i][j]=m[i][j]+c;
                System.out.print("|"+m[i][j]+"|");
            }
            System.out.println();
        }
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<a;j++)
            {
                m[i][j]=m[i][j]-c;
            }
        }
    }
    public void resta(int m[][],int a,int b,int c)
    {
        System.out.println("RESULTADO DE LA MATRIZ RESTADA");
        System.out.println("fue restada por: "+c);
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<a;j++)
            {
                m[i][j]=m[i][j]-c;
                System.out.print("|"+m[i][j]+"|");
            }
            System.out.println();
        }
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<a;j++)
            {
                m[i][j]=m[i][j]+c;
            }
        }
    }
    public void multiplicacion(int m[][],int a,int b,int c)
    {
        System.out.println("RESULTADO DE LA MATRIZ MULTIPLICADA");
        System.out.println("fue multiplicada por: "+c);
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<a;j++)
            {
                m[i][j]=m[i][j]*c;
                System.out.print("|"+m[i][j]+"|");
            }
            System.out.println();
        }
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<a;j++)
            {
                m[i][j]=m[i][j]/c;
            }
        }
    }
    public void dividida(int m[][],int a,int b,int c)
    {
        System.out.println("RESULTADO DE LA MATRIZ DIVIDIDA");
        System.out.println("fue dividida por: "+c);
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<a;j++)
            {
                m[i][j]=m[i][j]/c;
                System.out.print("|"+m[i][j]+"|");
            }
            System.out.println();
        }
    }
}
