
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MIGUEL
 */
public class Main {

public static void main(String[] args) {
int A[][]=new int[30][30];
int n,m;
n=Integer.parseInt(JOptionPane.showInputDialog("INgrese el número de filas:"));
m=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el nro. de columnas: "));
Matriz ma=new Matriz();
ma.llena_mat(A, n, m);
System.out.println("Los elementos de la matriz son:");
ma.mostrar_mat(A, n, m);
System.out.println("Los elementos de la triangular superior derecha son:");
ma.triangular_sup_der(A, n, m);
System.out.println();
}
}
    
