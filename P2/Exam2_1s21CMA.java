import java.util.Scanner;

public class Exam2_1s21CMA {
    public static void main(String[] args) {
        int[] calif = new int[4];
        Scanner teclado = new Scanner(System.in);
        int ma = 0;

        for (int i = 0; i < 4; i++) {
            System.out.println("Ingrese el valor " + (i + 1) + ": ");
            calif[i] = teclado.nextInt();
            ma += calif[i];
        }

        ma = ma / 4;
        System.out.println("La media aritmética es: " + ma);

        int[] d = new int[4];
        for (int i = 0; i < 4; i++) {
            d[i] = calif[i] - ma;
            System.out.println("La resta del valor " + (i + 1) + " es: " + d[i]);
        }

        int s = 0;
        for (int i = 0; i < 4; i++) {
            s += Math.abs(d[i]);
        }

        int desviacion = (int) s / 4;
        System.out.println("La desviación media es: " + desviacion);

    }
}