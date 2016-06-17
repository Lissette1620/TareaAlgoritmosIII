/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vista.Ventana_Intercambiar;
import Vista.Ventana_Principal;
import Vista.Ventana_Quicksort;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Kevin Meza
 */
public class Controlador_Quicksort implements ActionListener {
    
    Ventana_Principal ventana;
    Ventana_Quicksort  Quicksort ;
    
    public Controlador_Quicksort(Ventana_Quicksort  Quicksort ){
        
        this.Quicksort = Quicksort ;
       
    }   

    public void actionPerformed(ActionEvent e) {
        
        if(e.getActionCommand().equals("Volver al Inicio Quicksort")){
            
            System.out.println("Escucha");
            Quicksort .setVisible(false);
            ventana= new  Ventana_Principal();
            ventana.setVisible(true);
            System.out.println("Escucha");
            
        }
    }
}
