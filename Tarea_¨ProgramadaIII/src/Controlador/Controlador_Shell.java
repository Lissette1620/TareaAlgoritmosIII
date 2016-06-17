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
public class Controlador_Shell implements ActionListener {
    
    Ventana_Principal ventana;
    Ventana_Shell Shell;
    
    public Controlador_Shell(Ventana_Shell Shell){
        
        this.Shell= Shell;
       
    }   

    public void actionPerformed(ActionEvent e) {
        
        if(e.getActionCommand().equals("Volver al Inicio Shell")){
            
            System.out.println("Escucha");
            Shell.setVisible(false);
            ventana= new  Ventana_Principal();
            ventana.setVisible(true);
            System.out.println("Escucha");
            
        }
    }
}
