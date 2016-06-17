/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vista.Ventana_Intercambiar;
import Vista.Ventana_Principal;
import Vista.Ventana_Quicksort;
import Vista.Ventana_Seleccion;
import Vista.Ventana_Shell;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author Kevin Meza
 */
public class Controlador_Principal implements ActionListener {
    
    Ventana_Principal ventana;
    Ventana_Shell shell;
    Ventana_Intercambiar intercambiar;
    Ventana_Seleccion seleccion;
    Ventana_Quicksort quicksort;
    
    public Controlador_Principal(Ventana_Principal ventana){
        
        this.ventana= ventana;
        shell= new Ventana_Shell ();
        intercambiar= new Ventana_Intercambiar();
        seleccion= new Ventana_Seleccion();
        quicksort= new Ventana_Quicksort();
    }

    public void actionPerformed(ActionEvent e) {
        
        if(e.getActionCommand().equals("Comenzar")){
            
            
            if(ventana.devolverOpcion()=="Metodo Intercambiar"){
                System.out.print("Intercambiar");
                ventana.setVisible(false);
                intercambiar.setVisible(true);
                intercambiar.start();
                
                
                
                
            }
            if(ventana.devolverOpcion()=="Metodo Shell"){
                System.out.print("Shell");
                ventana.setVisible(false);
                shell.setVisible(true);
                shell.start();
                
                
                
            }
            if(ventana.devolverOpcion()=="Metodo Seleccion"){
                System.out.print("Seleccion");
                ventana.setVisible(false);
                seleccion.setVisible(true);
                seleccion.start();
                
               
            }
            if(ventana.devolverOpcion()=="Metodo Quicksort"){
                System.out.print("Quicksort");
                ventana.setVisible(false);
                quicksort.setVisible(true);
                quicksort.start();
                
                
            }
            
            
            
        }
    }
    
}
