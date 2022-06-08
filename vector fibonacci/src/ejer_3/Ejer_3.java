/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer_3;
import java.util.*;
public class Ejer_3 
{
    public static void main(String[] args) 
    {
        int fibo[]=new int[20];
        int ve[]=new int[20];
        int vec[]=new int[20];
        vector v1=new vector();
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduzca la dimencion del vector");
        int a=sc.nextInt();
        v1.fibo(fibo);
        v1.leer(vec, a);
        System.out.println("======================================");
        System.out.println("obteniendo los numeros de la serie");
        System.out.println("fibonacci del vector dado");
        System.out.print("vector original : ");
        v1.mostrar(vec, a);
        System.out.print("vector fobonacci: ");
        v1.mostrar(fibo, a);
        System.out.println("resultado"); 
        v1.obteniendo(ve, vec, fibo, a);
    }  
}
