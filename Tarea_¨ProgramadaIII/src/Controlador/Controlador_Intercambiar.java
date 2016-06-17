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
public class Controlador_Intercambiar implements ActionListener {
    
    Ventana_Principal ventana;
    Ventana_Intercambiar intercambiar;
    
    public Controlador_Intercambiar(Ventana_Intercambiar intercambiar){
        
        this.intercambiar= intercambiar;
       
    }   

    public void actionPerformed(ActionEvent e) {
        
        if(e.getActionCommand().equals("Volver al Inicio Intercambiar")){
            
            System.out.println("Escucha");
            intercambiar.setVisible(false);
            ventana= new  Ventana_Principal();
            ventana.setVisible(true);
            System.out.println("Escucha");
            
        }
    }
}
