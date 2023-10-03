import java.util.Scanner;

public class Exam3_1s21 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in); 
        double a;
        double b = 
        double resultado;
        System.out.println("Calcular el volumen");
        System.out.println("Escriba un radio");
        a = teclado.nextDouble(); 
        resultado = b * Math.PI * Math.pow(a, 3);
        System.out.println("El valor del volumen es: " + resultado);

    }
}