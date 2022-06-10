/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer_6;
import java.util.*;
public class Ejer_6 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("introduzca el # de filas");
        int a=sc.nextInt();
        System.out.println("introduzca el # de filas");
        int b=sc.nextInt();
        int mat[][]=new int[a][b];
        matriz m1=new matriz();
        System.out.println("===============================");
        m1.llenado(mat, a, b);
        System.out.println("===============================");
        System.out.println("matriz resultante");
        m1.mostrar(mat, a, b);
        m1.ascendente(mat, a, b);
        System.out.println("===============================");
        System.out.println("======== MATRIZ ASCENDENTE ========");
        m1.mostrar(mat, a, b);
        System.out.println("===============================");
        m1.descendente(mat, a, b);
        System.out.println("======== MATRIZ DESCENDENTE ========");
        m1.mostrar(mat, a, b);
        System.out.println("introduzca el # a sumar");
        int w=sc.nextInt();
        System.out.println("introduzca el # a restar");
        int x=sc.nextInt();
        System.out.println("introduzca el # a multiplicar");
        int y=sc.nextInt();
        System.out.println("introduzca el # a dividir");
        int z=sc.nextInt();
        m1.ascendente(mat, a, b);
        System.out.println("===============================");
        System.out.println("======== MATRIZ ORIGINAL ========");
        m1.mostrar(mat, a, b);
        m1.suma(mat, a, b, w);
        m1.resta(mat, a, b, x);
        m1.multiplicacion(mat, a, b, y);
        m1.dividida(mat, a, b, z);
    }
}
