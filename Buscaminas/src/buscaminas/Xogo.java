package buscaminas;

import java.util.Random;
import java.util.Scanner;

public class Xogo {
    private int[][] matriz;
    
    public void iniciarMatriz() {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();

        System.out.println("De cuantas filas quieres las matriz?");
        int numeroFilas = sc.nextInt();
        System.out.println("De cuantas columnas quieres la matriz");
        int numeroColumnas = sc.nextInt();

        matriz = new int[numeroFilas][numeroColumnas];

        // Inicializar la matriz con valores aleatorios
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = rnd.nextInt(10); // Generar un número aleatorio entre 0 y 9
            }
        }
        System.out.println("\n");

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(); // Salto de línea después de cada fila
        }
    }
    
    public void encherMinas(int randomX, int randomY, int numeroMinas){
        boolean unaMina; // Nos aseguramos de que solo haya una mina
        do {
            for (int i = 0; i < matriz[0].length && numeroMinas > 0; i++) {
                unaMina=false;
                for (int j = 0; j < matriz.length && numeroMinas > 0; j++) {
                    if (unaMina == false) {
                        matriz[i][(int) (Math.random() * matriz[0].length)] = '@';
                        numeroMinas--;
                    }
                    unaMina=true;
                }
            }
        } while (numeroMinas>0);
        
         for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(); // Salto de línea después de cada fila
        }
    }
    
    

}
