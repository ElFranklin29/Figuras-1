package figuras;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public abstract class Figura extends JPanel {

    

    public abstract int Area();

    public abstract int Perimetro();

    public abstract void reDibujar();

}
