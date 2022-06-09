/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer_5;
import java.util.*;
public class Ejer_5 
{
    public static void main(String[] args) 
    {
        int mat[][]=new int[50][50];
        matriz m1=new matriz();
        Scanner sc=new Scanner(System.in);
        System.out.println("======== MATRIZ EN L ========");
        System.out.println("introduzca matriz nxn impar");
        System.out.println("introduzca # de filas");
        int a=sc.nextInt();
        System.out.println("introduzca # de columnas");
        int b=sc.nextInt();
        System.out.println("======== RESULTADO ========");
        m1.llenando(mat, a, b);
        m1.mostrar(mat, a, b);
    } 
}
