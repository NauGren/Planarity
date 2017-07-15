
package juegopla;

import java.awt.*;

public class Circulo {
    
    int x, y;
    
    public void dibujaCirculo(Graphics g, int x, int y){
    
        g.setColor(new Color(250,0,0)); //se dio un color (rojo) a lo siguiente que se dibuje
        g.fillOval(x+120, y+50, 20, 20); //se dibuja un circulo relleno
        
        g.setColor(new Color(0,0,0)); //se dio un color (negro) a lo siguiente que se dibuje
        g.drawOval(x+120, y+50, 20, 20); //se dibuja el contorno de un circulo
    
    }
}
