
package buscaminas;


public class Buscaminas {
    public static void main(String[] args) {
        Xogo xogo = new Xogo();
        
        xogo.iniciarMatriz();
        System.out.println("\n");
        xogo.encherMinas(5, 3, 8);
    }
}
