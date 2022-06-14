/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MIGUEL
 */
class Matriz {
    
   
public void llena_mat(int M[][],int f, int c)
{ int i,j;
for(i=0;i<f;i++)
{
for(j=0;j<c;j++)
{
M[i][j]=(int)(Math.random()*10);
}
}
}
public void mostrar_mat(int M[][], int f, int c)
{
int i,j;
for(i=0;i<f;i++)
{
for(j=0;j<c;j++)
{
System.out.print(M[i][j]+" ");
}
System.out.println();
}
}
//1.- Mostrar los elementos de la triangular superior derecha, para una matriz cuadrada.
public void triangular_sup_der(int M[][], int f, int c)
{
int i,j;
for(i=0;i<f;i++)
{
for(j=0;j<c;j++)
{
    if(i<j)
{System.out.print(M[i][j]+" ");
}
}
}
}
}


