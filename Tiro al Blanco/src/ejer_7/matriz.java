/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer_7;
import java.util.*;
public class matriz 
{
    public void tiro_alb(int m[][],int a,int b)
    {
        int d=1;
        int e=1;
        int f=a-2;
        for(int i=0;i<a/3;i++)
        {
            for(int j=e;j<a;j=j+2)
            {
                for(int k=d;k<b-d;k++)
                {
                    m[j][k]=1;
                    m[k][j]=1;
                    m[f][k]=1;
                    m[k][f]=1;
                }
                f=f-2;
                d=d+2;
            }
        }
    }
   
    public void mostrar(int m[][],int a,int b)
    {
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<b;j++)
            {
                System.out.print("|"+m[i][j]+"|");
            }
            System.out.println();
        }
    }
}
