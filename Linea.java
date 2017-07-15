package juegopla;

import java.awt.*;

public class Linea {

    int x, y;
    
    public void dibujaLinea(Graphics g, int x, int y){
        
        g.setColor(new Color(0,0,0)); //se escoje el color negro
        g.drawLine(x+120+10, y+50+10, x+50+10, y+120+10); //se dibuja una linea del color escojido
        
    }
    
}
