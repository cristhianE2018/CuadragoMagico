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

    public boolean llenarCuadrado(int f,int c,int valor){
        if(this.cuadro[f][c] == 0){
            if(!this.existe(valor)){
                this.cuadro[f][c] = valor;
                return true;
            }
            else{
                System.out.println("El valor ya existe en el cuadro o esta ocupada la posición");
                return false;
            }
        }
        else{ 
            System.out.println("La casilla esta ocupada");
            return false; 
        }
    }

    public boolean existe(int n){
        boolean variable = false;
            for(int i=0; i<=this.cuadro.length-1; i++){
                for(int j=0; j<=this.cuadro[i].length-1; j++){
                    if(this.cuadro[i][j] == n){
                        variable = true;
                    }
                }
            }
        return variable;
    }

}
