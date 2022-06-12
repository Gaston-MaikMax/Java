/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication12;


import java.util.Scanner;

public class Operaciones {


            public static  float  Q (float D, float Cp, float Cmi){
                        float resultado, a;
                                   double b;
                                  
                        b=        2*(D*Cp)/Cmi;
                        resultado=(float) Math.sqrt(b);                    
                                                                                     
                                     
                        return resultado;
            }
           
            public static float TdPedidos(float Q, float D){
                        float T=Q/D;
                        return T;
            }
           
            public static float NdPedidos(float Q, float D){
                        float N=D/Q;
                        return N;
            }
           
            public static float CTAnual(float Q, float D, float Cu, float Cmi, float Cp){
           
                        float CTA=(Cu*D)+(Cp*D/Q)+(Cmi*Q/2);
                        return CTA;
            }
           
           
  public static void main (String[] args) {

           
           
 Scanner teclado= new Scanner(System.in);

 System.out.print(" La demanda \n");
 float  D=teclado.nextFloat();

   System.out.print("costo unitario del producto\n");
  float  Cu=teclado.nextFloat();


  System.out.print("costo del pedido o de ordenar una compra\n");
  float  Cp=teclado.nextFloat();

   System.out.print("costo de mantenerlo en almacen o en inventario\n");
   float  Cmi=teclado.nextFloat();     
  
double resultado1,resultado2, resultado3, resultado4 ;

 resultado1=Q(D,Cp,Cmi);
 resultado2=NdPedidos((float) resultado1,D);
 resultado3=TdPedidos((float )resultado1, D);
 resultado4=CTAnual((float ) resultado1,D,Cu,Cmi,Cp);
                       
 System.out.print("\nLa cantidad optima es "+resultado1);
 System.out.print("\nEL no. de pedidos es  "+resultado2);
 System.out.print("\nEL tiempo de pedidos es  "+resultado3);
 System.out.print("\nEL costo total anual es  "+resultado4);
           
               }

}
