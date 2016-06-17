/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.awt.Color;
import static java.lang.Thread.sleep;
import javax.swing.JToggleButton;


/**
 *
 * @author Kevin Meza
 */
public class Intercambiar {

    /**
     * @param args the command line arguments
     */
    
   
    
    public	static	void	intercambiar(int[]a,int	i,int j,JToggleButton[] botones) throws InterruptedException
    {
             int aux=a[i];
             String auxB=botones[i].getText();
             
             sleep(1000);
             botones[i].setText(botones[j].getText());
             a[i]=a[j];
             
             sleep(1000);
             botones[j].setText(auxB);
             a[j]=aux;
             
             sleep(1000);
             botones[i].setBackground(Color.green);
             botones[j].setBackground(Color.white);
             sleep(1000);
             
            
    }
    
    public static void	ordIntercambio	(int	a[], JToggleButton[] botones) throws InterruptedException
    {
	 int i,j;
	 for(i=	0;i<a.length-1;i++)
	 
	 	 
                    for(j=i+1;j<a.length;j++)
	 	 	 

                        if(a[i]>a[j])
	 	 	 {      
                                sleep(1000);
                                botones[i].setBackground(Color.red);
                                botones[j].setBackground(Color.red);
                                sleep(1000);
                                
	 	 	 	intercambiar(a,	i,j,botones);
                                
	 	 	 }
                         
}
    
    public static void imprimir(int a[]){
        
        for(int i=0;i<a.length;i++){
            
            System.out.println("Imprime"+a[i]);
        }
        
    }
    
    
}
