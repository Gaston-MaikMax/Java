/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer_5;
import java.util.*;
public class matriz 
{
    public void llenando(int m[][],int a,int b)
    {
        int d=a;
        int c=0;
        int x=1;
        for(int i=0;i<=a;i++)
        {
            for(int j=0;j<=b-x;j++)
            {
                m[c][d]=1;
                c++;
            }
            x=x+2;
            c=0;
            d=d-2;
        }
        int f=1;
        int g=2;

        for(int i=0;i<=a;i++)
        {
            for(int j=0;j<g;j++)
            {
                m[f][j]=1;

            }
            f=f+2;
            g=g+2;
        }
    }
    public void mostrar(int m[][],int a,int b)
    {
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<b;j++)
            {
                System.out.print(m[i][j]+"|");
            }
            System.out.println();
        }
    }
}
