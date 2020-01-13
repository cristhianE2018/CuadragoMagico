package Git.CuadradoMagico;
import java.util.Scanner;
import Git.CuadradoMagico.Cuadrado;
public class Juego{
    public static void main(String[] args){
        Scanner lee = new Scanner(System.in);
        Cuadrado nuevo = new Cuadrado(3,3);
        nuevo.mostrarCuadrado();
        int f,c;
        int valor=0;
        for(int i=1; i<=9;){
                System.out.println("Ingresa fila y columna a la cual quieres agregar: ");
                f = lee.nextInt(); c = lee.nextInt();
                System.out.println("Ingresa valor :");
                valor = lee.nextInt();
                if(nuevo.llenarCuadrado(f, c, valor)){
                    i++;
                    nuevo.mostrarCuadrado();
                }       
        }

        if(nuevo.Verificar()){
            System.out.println("Has ganado!!");
        }
        else{
            System.out.println("Has perdido :( !!");
        }
    }
}