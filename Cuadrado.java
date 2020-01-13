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

    public boolean Verificar(){
        ArrayList<Integer> lista = new ArrayList<Integer>();
        lista = sumar();
        int n =lista.get(0);
        boolean var = true;
            for(int i=1; i<=lista.size()-1; i++){
                if(n != lista.get(i)){
                    var = false;
                }
                n = lista.get(i);
            }
        return var;
    }
     
    
    private ArrayList<Integer> sumar(){
        int suma2=0,suma=0,suma3=0,suma4=0;
        int d = this.cuadro.length-1;
        ArrayList<Integer> lista = new ArrayList<Integer>();
        for(int i=0; i<this.cuadro.length; i++){
            suma2 = suma2 + this.cuadro[i][d];
            d--;
            for(int j=0; j<this.cuadro[i].length; j++)
            {
                if(i==j){
                    suma = suma + this.cuadro[i][j];
                }
                suma3 = suma3 + this.cuadro[i][j];
                suma4 = suma4 + this.cuadro[j][i];
            }
            lista.add(suma3);
            lista.add(suma4);
            suma4 =0;
            suma3=0;
        }
        lista.add(suma);
        lista.add(suma2);
        return lista;
    }

}
