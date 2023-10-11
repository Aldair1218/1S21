import java.util.Scanner;

public class P2p6_1s21 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        char opc;
        int a = 1;

        do {
            System.out.println("Aqui nos repetimos");
            a++;
        } while (a < 10);

        a = 10;

        do {
            System.out.println("Acaso se ejecutara esta linea");
            a++;
        } while (a < 10);

        do {
            System.out.println("Presiona S para salir: ");
            opc = teclado.next().charAt(0);
            opc = Character.toLowerCase(opc);
        } while (opc != 's');
        teclado.close();
    }
}