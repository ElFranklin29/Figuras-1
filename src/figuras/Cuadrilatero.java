package figuras;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JOptionPane;

public class Cuadrilatero extends Figura{

    Punto2D vertices[];
    int aux, px, py;
    String titulo;

    public Punto2D[] getVertices() {
        return vertices;
    }

    public void setVertices(Punto2D[] vertices) {
        this.vertices = vertices;
    }

    public int getAux() {
        return aux;
    }

    public void setAux(int aux) {
        this.aux = aux;
    }

    public int getPx() {
        return px;
    }

    public void setPx(int px) {
        this.px = px;
    }

    public int getPy() {
        return py;
    }

    public void setPy(int py) {
        this.py = py;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;

    }

    public Cuadrilatero(Punto2D[] vertices, int aux, int px, int py, String titulo) {
        this.vertices = vertices;
        this.aux = aux;
        this.px = px;
        this.py = py;
        this.titulo = titulo;
    }
    
    
    public Cuadrilatero() {
        vertices = new Punto2D[4];
        for (int conta = 0; conta < 4; conta++) {
            aux = conta + 1;
            px = Integer.parseInt(JOptionPane.showInputDialog("Cuadrilatero - Digite coordenada X del vertice " + aux));
            py = Integer.parseInt(JOptionPane.showInputDialog("Cuadrilatero - Digite coordenada Y del vertice " + aux));
            vertices[conta] = new Punto2D(px, py);
        }
    }

    @Override
    public int Area() {
        double area, A, B, C, D, S;
        A = (float) Math.sqrt((Math.pow((vertices[1].getX() - vertices[0].getX()), 2))
                + (Math.pow((vertices[1].getY() - vertices[0].getY()), 2)));
        B = (float) Math.sqrt((Math.pow((vertices[2].getX() - vertices[1].getX()), 2))
                + (Math.pow((vertices[2].getY() - vertices[1].getY()), 2)));
        C = (float) Math.sqrt((Math.pow((vertices[3].getX() - vertices[2].getX()), 2))
                + (Math.pow((vertices[3].getY() - vertices[2].getY()), 2)));
        D = (float) Math.sqrt((Math.pow((vertices[0].getX() - vertices[3].getX()), 2))
                + (Math.pow((vertices[0].getY() - vertices[3].getY()), 2)));
        S = (A * B);
//        area =;
        System.out.println("Area del cuadrilatero =" + S);
        return (int) S;
    }

    @Override
    public int Perimetro() {
        double A, B, C, D, S;
        A = (float) Math.sqrt((Math.pow((vertices[1].getX() - vertices[0].getX()), 2))
                + (Math.pow((vertices[1].getY() - vertices[0].getY()), 2)));
        B = (float) Math.sqrt((Math.pow((vertices[2].getX() - vertices[1].getX()), 2))
                + (Math.pow((vertices[2].getY() - vertices[1].getY()), 2)));
        C = (float) Math.sqrt((Math.pow((vertices[3].getX() - vertices[2].getX()), 2))
                + (Math.pow((vertices[3].getY() - vertices[2].getY()), 2)));
        D = (float) Math.sqrt((Math.pow((vertices[0].getX() - vertices[3].getX()), 2))
                + (Math.pow((vertices[0].getY() - vertices[3].getY()), 2)));

        S = (A + B + C + D);
        System.out.println("Perimetro del cuadrilatero =" + S);
        return (int) S;
    }
    
      @Override
    public void reDibujar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.ORANGE);
        g.drawLine(vertices[1].getX() * 60, vertices[1].getY() * 60,
                vertices[0].getX() * 60, vertices[0].getY() * 60);
        g.drawLine(vertices[2].getX() * 60, vertices[2].getY() * 60,
                vertices[1].getX() * 60, vertices[1].getY() * 60);
        g.drawLine(vertices[3].getX() * 60, vertices[3].getY() * 60,
                vertices[2].getX() * 60, vertices[2].getY() * 60);
        g.drawLine(vertices[0].getX() * 60, vertices[0].getY() * 60,
                vertices[3].getX() * 60, vertices[3].getY() * 60);

    }
    

   
}
