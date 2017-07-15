package juegopla;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;


public class Movimiento implements MouseMotionListener {

    juegopla JP;
    
    public Movimiento(){
        JP = new juegopla();
    }
    
    
    @Override
    public void mouseDragged(MouseEvent e) { //aqui es cuando preciono el cursor
      
       if(e.getX()== JP.getX() && e.getY()==JP.getY()){
           
       }
       
      
        
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        
         if(e.getX() == JP.getX() && e.getY() == JP.getY()){
             mouseDragged(e);
        }
    }
    
}
