/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer_7;
import java.util.*;
public class Ejer_7 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("introduzca # de filas");
        int a=sc.nextInt();
        System.out.println("introduzca # de columnas");
        int b=sc.nextInt();
        int mat [][]=new int[a][b];
        matriz m1=new matriz();
        System.out.println("========== TIRO AL BLANCO ==========");
        m1.tiro_alb(mat, a, b);
        m1.mostrar(mat, a, b);
        System.out.println();
       
    }  
}
