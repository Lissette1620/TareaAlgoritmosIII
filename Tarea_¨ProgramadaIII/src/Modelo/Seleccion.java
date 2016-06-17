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
public class Seleccion {
    
    
    
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
             
    }
    
    public static void ordSeleccion(int a[],JToggleButton[] botones) throws InterruptedException
    {
             int indiceMenor,i,j,n;
             n=a.length;	
             
             for(i=0;i<n-1;i++)
             {
                     //	comienzo	de	la	exploración	en	índice	i	
                indiceMenor=i;
                     //	j	explora	la	sublista	a[i+1]..a[n-1]
                for(j=i+1;j<n;j++){
                    
                    if	(a[j]<a[indiceMenor]){
                        indiceMenor=j;
                    }
                
                }	 	 //	sitúa	el	elemento	mas	pequeño	en	a[i]	
	 	 if(i!=indiceMenor){
                     
                    sleep(1000);
                    botones[i].setBackground(Color.red);
                    botones[indiceMenor].setBackground(Color.red);
                    sleep(1000);
                 
                    intercambiar(a,i,indiceMenor,botones);
                }
            }
             
            for(int k=0;k<botones.length;k++){
             
                botones[k].setBackground(Color.green);
             
            }
    }
    
    public static void imprimir(int a[]){
        
        for(int i=0;i<a.length;i++){
            
            System.out.println("Imprime"+a[i]);
        }
        
    }
   
    }