
package juegopla;

import java.awt.*;
import javax.swing.JFrame;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class juegopla extends JFrame {
    
        Circulo C;
        Linea L;
        int x;
        int y;
        Movimiento M ;
     
    
    public juegopla(){
        
        setVisible(true);
        setBounds(700, 300, 500,500);
        M = new Movimiento();
        addMouseMotionListener(M);
        C = new Circulo();
        L = new Linea();
        
    }
    
    
    public void dibuja(Graphics g){
          
       L.dibujaLinea(g, x, y);
       C.dibujaCirculo(g, x, y);
      
        
    }
    
    public void pain(Graphics g){
        
        C.dibujaCirculo(g, x, y);
    
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
