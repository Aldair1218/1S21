import java.util.Scanner;

public class P9p3_1s21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, ingrese el valor de 'n': ");
        int n = scanner.nextInt();

        long factorial = calcularFactorial(n);

        long sumatoriaCubica = calcularSumatoriaCubica(n);

        long multiplicacion = sumatoriaCubica * factorial;
       
        long division = multiplicacion / factorial;

        System.out.println("La sumatoria cúbica de " + n + " es: " + sumatoriaCubica);
        System.out.println("El factorial de " + n + " es: " + factorial);
        System.out.println("La multiplicacion de " + sumatoriaCubica + " * " + factorial + " es: " + multiplicacion);
        System.out.println("La division de " +multiplicacion+ "/" + factorial + " es: " + division);

    }


    public static long calcularFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            long factorial = 1;
            for (int i = 2; i <= n; i++) {
                factorial *= i;
            }
            return factorial;
        }
    }

    public static long calcularSumatoriaCubica(int numero) {
        long sumatoriaCubica = 0;
        for (int n = 1; n <= numero; n++) {
            sumatoriaCubica = (n * n * n);
        }
        return sumatoriaCubica;
    }
}