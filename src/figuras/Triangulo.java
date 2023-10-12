package figuras;
import java.awt.Graphics;
import javax.swing.JOptionPane;
public class Triangulo extends Figura {
    Punto2D vertices[];
    int aux,px,py;
    public Triangulo(){
        vertices = new Punto2D[3];
        for(int conta=0;conta<3;conta++){
            aux =conta+1;
            px = Integer.parseInt(JOptionPane.showInputDialog("Triangulo - Digite coordenada X del vertice "+aux));
            py = Integer.parseInt(JOptionPane.showInputDialog("Triangulo- Digite coordenada Y del vertice "+aux));
            vertices[conta]= new Punto2D(px,py);
        }
    } 
    
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

    public Triangulo(Punto2D[] vertices, int aux, int px, int py) {
        this.vertices = vertices;
        this.aux = aux;
        this.px = px;
        this.py = py;
    }
    
    @Override
    public int Area() {
       double area, A,B,C,S; 
       A= (float) Math.sqrt((Math.pow((vertices[1].getX()-vertices[0].getX()),2))
               +(Math.pow((vertices[1].getY()-vertices[0].getY()),2)));
       B= (float) Math.sqrt((Math.pow((vertices[2].getX()-vertices[1].getX()),2))
               +(Math.pow((vertices[2].getY()-vertices[1].getY()),2)));
       C= (float) Math.sqrt((Math.pow((vertices[0].getX()-vertices[2].getX()),2))
               +(Math.pow((vertices[0].getY()-vertices[2].getY()),2)));
       S=(A+B+C)/2;
       area=Math.sqrt(S*(S-A)*(S-B)*(S-C));
       System.out.println("Area del triangulo ="+area);
       return (int)area;
    }

    @Override
    public int Perimetro() {
       double A,B,C,S; 
       A= (float) Math.sqrt((Math.pow((vertices[1].getX()-vertices[0].getX()),2))
               +(Math.pow((vertices[1].getY()-vertices[0].getY()),2)));
       B= (float) Math.sqrt((Math.pow((vertices[2].getX()-vertices[1].getX()),2))
               +(Math.pow((vertices[2].getY()-vertices[1].getY()),2)));
       C= (float) Math.sqrt((Math.pow((vertices[0].getX()-vertices[2].getX()),2))
               +(Math.pow((vertices[0].getY()-vertices[2].getY()),2)));
       S=(A+B+C);
       System.out.println("Perimetro del triangulo ="+S);
       return (int)S;
    }
    
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        
        int verticeX[]={vertices[0].getX()*60,vertices[1].getX()*60, vertices[2].getX()*60};
        int verticeY[]={vertices[0].getY()*60,vertices[1].getY()*60, vertices[2].getY()*60};
        g.drawPolygon(verticeX, verticeY, 3);
        

    }

    @Override
    public void reDibujar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
