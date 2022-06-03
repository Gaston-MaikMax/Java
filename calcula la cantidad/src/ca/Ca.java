/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ca;
import javax.swing.JOptionPane;
/**
 *
 * @author maik
 */
public class Ca {

    /**

     */
    public static void main(String[] args) {
        // TODO code application logic here
        int A,B,i=1,op1,cont,C,D;
        cont=0;
        do
            {
                cont=cont+1;i=1;
	String cad="";
	A=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de hijos a la derecha"));
        B=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de hijas a la izquierda"));
	if (A>0&B>0&A<=5&B<=5)
	{
	while (i<=1)
        {
         C=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de hijos a la derecha"));
        D=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de hijas a la izquierda")); 
        if (C>0&D>0&C<=5&D<=5)
                {
           if (A == 0 && B == 0) break;
           A=A+C;
           B=B+D;
        cad=cad+ A +" hijos a la Derecha "+ B +" hijas A la Izquierda "+"\n";
	i=i+1;
            }
            }
        //JOptionPane.showMessageDialog(null, cad);
        }
        else
           JOptionPane.showMessageDialog(null, "Error de ingreso..!! El Numero debe ser mayor a cero");
        JOptionPane.showMessageDialog(null, cad);
        op1=Integer.parseInt(JOptionPane.showInputDialog("Desea continua[si=1 , no=2]"));
        }while (op1==1);
    
    }
}
