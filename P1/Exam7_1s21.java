import java.util.Scanner;

public class Exam7_1s21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingresa lo que vale A: ");
        double a = input.nextDouble();
        System.out.print("Ingresa lo que vale B: ");
        double b = input.nextDouble();
        System.out.print("Ingresa lo que vale C: ");
        double c = input.nextDouble();
        System.out.print("Ingresa lo que vale D: ");
        double d = input.nextDouble();
        System.out.print("Ingresa lo que vale E: ");
        double e = input.nextDouble();
        System.out.print("Ingresa lo que vale F: ");
        double f = input.nextDouble();
        double divisor = a * e - b * d;

        if (divisor == 0) {
            System.out.println("No tiene solucion por que da cero.");
        } else {
      
            double x = (c * e - b * f) / divisor;
            double y = (a * f - c * d) / divisor;

            System.out.println("La solucion es :");
            System.out.println("x = " + x);
            System.out.println("y = " + y);
        }

        input.close();
    }
}
