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
public class Shell {
    
    public static void ordenacionShell(int a[],JToggleButton [] botones) throws InterruptedException
{
	 int intervalo,	i,j,k;
	 int n=a.length;
	 intervalo=n/2;
	 
         while	(intervalo>0)
	 {  
            botones[intervalo].setBackground(Color.yellow);
            
	 	 for(i=intervalo;i<n;i++)
	 	 {  
	 	 	 j=i-intervalo;
                         
	 	 	 while	(j>=0)	
	 	 	 {
	 	 	 	 k=j+intervalo;
                                
                                
                                
                                if(a[j]<=a[k]){
                                    
                                     j=-1;	//	par	de	elementos	ordenado
                                
	 	 	 	 
                                }else
	 	 	 	 {
                                        sleep(1000);
                                        botones[j].setBackground(Color.red);
                                        botones[k].setBackground(Color.red);
                                        sleep(1000);
                                        
                                     
	 	 	 	 	 int temp;
                                         String aux;
                                         
                                         sleep(1000);
                                         aux=botones[j].getText();
                                         temp = a[j];
                                         
                                         sleep(1000);
                                         botones[j].setText(botones[k].getText());
                                         a[j]=a[k];
                                         
                                         sleep(1000);
                                         botones[k].setText(aux);
                                         a[k]=temp;
                                         
                                         sleep(1000);
                                         botones[i].setBackground(Color.white);
                                         botones[j].setBackground(Color.white);
                                         j-=intervalo;
	 	 	 	 }
	 	 	 }
                      
	 	 }
	 	 intervalo=intervalo/2;
                 
                 
	 }
         for(int l=0;l<botones.length;l++)
         {
              
            botones[l].setBackground(Color.green); 
                     
         }
}

    
    public static void imprimir(int a[]){
        
        for(int i=0;i<a.length;i++){
            
            System.out.println("Imprime"+a[i]);
        }
        
    }
}
