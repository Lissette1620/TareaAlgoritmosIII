/*
    Clase Hilo
    Permite dormir los procesos que lleva acabo el programa para observar
    cada cambio que se produce en el momento de ejecucion del mismo.
 */
package Modelo;

import Vista.Ventana_Intercambiar;



/**
 *
 * @author Kevin Meza
 */
public class Hilo_Intercambiar extends Thread{
    
    Ventana_Intercambiar ventana;
    
    /*
    Constructor de la Clase Hilo
    Recibe a la clase Ventana 
    
    */
    public Hilo_Intercambiar(Ventana_Intercambiar ventana)
    {
        this.ventana=ventana;
    }
    
    /*
    Metodo run 
    
    Permite establecer el tiempo de ejecucion para los cambios en la Clase Ventana 
    ,que muestra los cambios por medio de JFrame
    */
    public void run()
    {
        ventana.ingresarDatos();
       while(true)
       {
           try
           {
               //1000 es un segundo
             sleep(2000);//tiempo en el que mando a dormir el hilo
             
             ventana.llenarVector(ventana.getNumeros());
             ventana.ingresarDatos_Algoritmo(ventana.getNumeros());
             //ventana.cambiarIcon();
             
             break;
           }
           catch(Exception e)
           {
               System.out.println("Hubo un error en el hilo de ejecución"+e);
           }
       }
    }//esto ya es un hilo
    
}
