package Git.CuadradoMagico;
import java.util.ArrayList;

public class Cuadrado{
    public int filas;
    public int columnas;
    public int[][] cuadro;

    public Cuadrado(int f,int c) {
        this.filas = f;
        this.columnas = c;
        this.cuadro = new int[filas][columnas]; 
    }

    public void mostrarCuadrado(){
        for(int i=0; i<=this.cuadro.length-1; i++)
        {
            for(int j=0; j<=this.cuadro[i].length-1; j++){
                System.out.print(this.cuadro[i][j] + " ");
            }
            System.out.println();
        }
    }

}
