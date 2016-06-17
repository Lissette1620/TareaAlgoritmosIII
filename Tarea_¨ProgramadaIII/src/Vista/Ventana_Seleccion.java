/*
 Clase ventana 
    Muestra de forma grafica cada cambio y movimiento del algoritmo Heapsort 
    que tiene como base 
 */
package Vista;

//import Controlador.Controlador_Seleccion;
import Controlador.Controlador_Seleccion;
import Modelo.Hilo_Seleccion;
import Modelo.Seleccion;
import java.awt.Color;
import static java.lang.Thread.sleep;
import javax.swing.JLabel;
import javax.swing.JToggleButton;
import static java.lang.Thread.sleep;
import javax.swing.JOptionPane;

/**
 *
 * @author Kevin Meza
 */
public class Ventana_Seleccion extends javax.swing.JFrame {

    /**
     * Creates new form Ventana
     */
    
    int[] numeros = new int[10];
    
    /*
    Constructor de la Clase Hilo
        Recibe a la clase Hilos para obtener las pausas para mostrar los cambios y su inicio
        Activa el metodo ingresarDatos que obtiene los elementos a ordenar por el algoritmo
        
    
    */
    Controlador_Seleccion controlador;
    
    Hilo_Seleccion hilo;
    public Ventana_Seleccion() {
        initComponents();
        setVisible(false);
        hilo= new Hilo_Seleccion(this);
        controlador= new Controlador_Seleccion(this);
        this.btnAr_Volver.addActionListener(controlador);
    }
    
    /*
    Metodo ingresarDatos:
        Recibe los datos que le ingresa el usuario al programa y los envia a la clase Tarea y Comparador 
        esta ultima mediante un arreglo
        Ademas forma los arreglos de los botones que forman el arreglo inicial y el que representa los botones
        del arbol
        Por igual envia a la clase monticulos los arreglos de botones,el tamaño del arreglos a ordenar y los valores del mismo
    
    */
    
    public void ingresarDatos_Algoritmo(int[] arreglo) throws InterruptedException {
        
        
       int[] ingresar= new int[10];
        
        ingresar[0]=arreglo[0];
        ingresar[1]=arreglo[1];
        ingresar[2]=arreglo[2];
        ingresar[3]=arreglo[3];
        ingresar[4]=arreglo[4];
        ingresar[5]=arreglo[5];       
        ingresar[6]=arreglo[6];      
        ingresar[7]=arreglo[7];     
        ingresar[8]=arreglo[8];
        ingresar[9]=arreglo[9];
       
       
      
        
       
        
        JToggleButton[] botonesArb= new JToggleButton[10];
        
        botonesArb[0]=this.btn_0;
        botonesArb[1]=this.btn_1;
        botonesArb[2]=this.btn_2;
        botonesArb[3]=this.btn_3;
        botonesArb[4]=this.btn_4;
        botonesArb[5]=this.btn_5;
        botonesArb[6]=this.btn_6;
        botonesArb[7]=this.btn_7;
        botonesArb[8]=this.btn_8;
        botonesArb[9]=this.btn_9;
        
        JLabel[] label= new JLabel[1];
        
        label[0]=this.jLabel1;
        
        
       Seleccion.ordSeleccion(numeros,botonesArb);
       Seleccion.imprimir(numeros);
       
       

        try {
          //  System.out.println(mon.eliminarMinimo());
        } catch (Exception e1) {
            System.out.println(e1);    
        }

        // TODO code application logic here
    } 
     
    
   /*
    Metodo ingresarDatos
        Devuelve un arreglo con todos los datos que ingresar el usuario para ordenar
    
    */
    
    public int[] ingresarDatos(){
        
        
        
       for(int i=0;i<10;i++){
            numeros[i]=Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
        } 
                
                                
        
        return numeros;
    }
    
    /*
    Metodo getNumeros
        Devuelve el arreglo que almacena los datos a ordenar
    
    */
    
    public int[] getNumeros(){
        return numeros;
    }
    
    /*
    Metodo llenarVector:
        Recibe el arreglo con los datos a ordenar y  ubica estos valores
        en cada boton del arreglo inicial segun el orden de entrada al metodo
        Ademas determina el fondo de cada boton 
    */
    public void llenarVector(int []arreglo) throws InterruptedException{
        
        
        
        
        for(int i=0;i<arreglo.length;i++){
            sleep(200);
            
            if(i==0){
                this.btn_0.setBackground(Color.white);
                this.btn_0.setText(""+arreglo[i]);
            }
            if(i==1){
                this.btn_1.setBackground(Color.white);
                this.btn_1.setText(""+arreglo[i]);
            }
            if(i==2){
                this.btn_2.setBackground(Color.white);
                this.btn_2.setText(""+arreglo[i]);
            }
            if(i==3){
                this.btn_3.setBackground(Color.white);
                this.btn_3.setText(""+arreglo[i]);
            }
            if(i==4){
                this.btn_4.setBackground(Color.white);
                this.btn_4.setText(""+arreglo[i]);
            }
            if(i==5){
                this.btn_5.setBackground(Color.white);
                this.btn_5.setText(""+arreglo[i]);
            }
            if(i==6){
                this.btn_6.setBackground(Color.white);
                this.btn_6.setText(""+arreglo[i]);
            }
            if(i==7){
                this.btn_7.setBackground(Color.white);
                this.btn_7.setText(""+arreglo[i]);
            }
            if(i==8){
               this.btn_8.setBackground(Color.white);
               this.btn_8.setText(""+arreglo[i]); 
            }
            if(i==9){
                this.btn_9.setBackground(Color.white);
                this.btn_9.setText(""+arreglo[i]);
            }
            
        }
        
    }
    
    /*
    Metodo llenarVector:
        Recibe el arreglo con los datos a ordenar y  ubica estos valores
        en cada boton del arreglo del arbol segun el orden de entrada al metodo
        Ademas determina el fondo de cada boton 
    */
    
    
    public void start() {
        hilo.start();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_1 = new javax.swing.JToggleButton();
        btn_2 = new javax.swing.JToggleButton();
        btn_3 = new javax.swing.JToggleButton();
        btn_5 = new javax.swing.JToggleButton();
        btn_0 = new javax.swing.JToggleButton();
        btn_4 = new javax.swing.JToggleButton();
        btn_8 = new javax.swing.JToggleButton();
        btn_9 = new javax.swing.JToggleButton();
        btn_6 = new javax.swing.JToggleButton();
        btn_7 = new javax.swing.JToggleButton();
        btnAr_Volver = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(btn_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(142, 17, 61, 44));
        getContentPane().add(btn_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 17, 61, 44));
        getContentPane().add(btn_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(276, 17, 61, 44));
        getContentPane().add(btn_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(416, 17, 61, 44));
        getContentPane().add(btn_0, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 17, 61, 44));
        getContentPane().add(btn_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(343, 17, 61, 44));
        getContentPane().add(btn_8, new org.netbeans.lib.awtextra.AbsoluteConstraints(617, 17, 61, 44));
        getContentPane().add(btn_9, new org.netbeans.lib.awtextra.AbsoluteConstraints(688, 17, 61, 44));
        getContentPane().add(btn_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(483, 17, 61, 44));
        getContentPane().add(btn_7, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 17, 61, 44));

        btnAr_Volver.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        btnAr_Volver.setText("Volver al Inicio");
        btnAr_Volver.setToolTipText("");
        btnAr_Volver.setActionCommand("Volver al Inicio Seleccion");
        getContentPane().add(btnAr_Volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(276, 100, 250, 44));

        jLabel1.setToolTipText("");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(296, 88, 264, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iindice.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 170));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Ventana_Seleccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Ventana_Seleccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Ventana_Seleccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Ventana_Seleccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//       
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Ventana_Seleccion().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnAr_Volver;
    private javax.swing.JToggleButton btn_0;
    private javax.swing.JToggleButton btn_1;
    private javax.swing.JToggleButton btn_2;
    private javax.swing.JToggleButton btn_3;
    private javax.swing.JToggleButton btn_4;
    private javax.swing.JToggleButton btn_5;
    private javax.swing.JToggleButton btn_6;
    private javax.swing.JToggleButton btn_7;
    private javax.swing.JToggleButton btn_8;
    private javax.swing.JToggleButton btn_9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
