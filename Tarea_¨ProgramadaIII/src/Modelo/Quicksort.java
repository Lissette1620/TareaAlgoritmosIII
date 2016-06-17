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
public class Quicksort {
    
    public static void imprimir(int a[]){
        
        for(int i=0;i<a.length;i++){
            
            
            System.out.print(" "+a[i]+" ");
        }
        
    }
    
    public static void quicksort(int a[],int izq,int der,JToggleButton [] botones) throws InterruptedException
    {
	
         
	 
	int pivote=a[izq];
//        botones[pivote].setBackground(Color.gray);
//        botonesArb[pivote].setBackground(Color.gray);
         
	 int i=izq;
	 int d=der;
         int aux;
         String pivoteA =botones[izq].getText();
         String auxB;
         String auxA;
        
        
         
	 while(i<d){
             
             sleep(1000);
       
             
            
             
	 	while(a[d]>pivote){
                    d--;
                }
                 
	 	while ( a[i] <= pivote && i<d){
                    i++;
                }
	 	
                if(i<d)	
	 	{
                    
                    sleep(1000);
                    botones[i].setBackground(Color.red);
                    botones[d].setBackground(Color.red);
                    sleep(1000);
                    
                    auxB= botones[i].getText();
                    aux= a[i];
                    
                    sleep(1000);
                    botones[i].setText(botones[d].getText());
                    a[i]= a[d];
                    
                    sleep(1000);
                    botones[d].setText(auxB);
                    a[d]= aux;
                    
                    sleep(1000);
                    botones[i].setBackground(Color.white);
                    botones[d].setBackground(Color.white);
                    sleep(1000);
                    
                    
	 	}
	 }
         
         
            sleep(1000);
            botones[izq].setBackground(Color.red);
            botones[d].setBackground(Color.red);
            sleep(1000);
            
            botones[izq].setText(botones[d].getText());
            a[izq]=a[d];

            sleep(1000);
            botones[d].setBackground(Color.green);
            botones[d].setText(pivoteA);

            sleep(1000);
            botones[izq].setBackground(Color.white);
            botones[d].setBackground(Color.white);
            sleep(1000);
         
	 if(izq<d-1){
	 	 quicksort(a,izq,d-1,botones);	//	mismo	proceso	con	sublista	izqda
         }
	 if(d+1 < der){
	 	 quicksort(a,d+1,der,botones);	//	mismo	proceso	con	sublista	drcha
         }
    }
    
}
