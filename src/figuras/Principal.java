package figuras;

import javax.swing.JFrame;

public class Principal {
    Figura listado[];
    Triangulo triangulo= new Triangulo();
        Cuadrilatero cuadrilatero = new Cuadrilatero();
    public Principal() {
        listado = new Figura[2];
        
        listado[0]= triangulo;
        listado[1]= cuadrilatero;
        for(int pos=0;pos<=1;pos++){
            listado[pos].Area();
            listado[pos].Perimetro();
            
        }
        ventanaCuadrilatero();
        ventanaTriangulo();
        
        
    }
    
    public void ventanaCuadrilatero(){
        
         JFrame ventana = new JFrame("Dibujar Cuadrilatero");
            ventana.add(cuadrilatero);
            ventana.setSize(400, 400);
            ventana.setLocationRelativeTo(null);
            ventana.setVisible(true);
            ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    }
    
    public void ventanaTriangulo(){
        
         JFrame ventana = new JFrame("Dibujar Triangulo");
            ventana.add(triangulo);
            ventana.setSize(400, 400);
            ventana.setLocationRelativeTo(null);
            ventana.setVisible(true);
            ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    }
    public static void main(String args[]){
        Principal solucion= new Principal();
    }
} 