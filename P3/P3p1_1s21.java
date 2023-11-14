import java.util.Scanner;

public class P3p1_1s21{
    static Scanner teclado=new Scanner (System.in);
    

    public static void suma (){
    System.out.println("Suma de dos numeros");
    System.out.println("Ingresa el primer numero");
    int a= teclado.nextInt();
    System.out.println("Ingresa el segundo numero");
    int b= teclado.nextInt();
    int c=a+b;
    System.out.println("La suma es: " + c);
}
    public static void resta (){
           
    System.out.println("Resta de dos numeros");
    System.out.println("Ingresa el primer numero");
    int a= teclado.nextInt();
    System.out.println("Ingresa el segundo numero");
    int b= teclado.nextInt();
    int c=a-b;
    System.out.println("La resta es: " + c);
}
    public static void menu (){
    System.out.println("\n Operaciones Basicas ");
    System.out.println("\n   Que operacion Deseas?");
    System.out.println("   A Suma");
    System.out.println("   B Resta ");
    System.out.println("   C Division");
    System.out.println("   D Multiplicacion");
    }
    public static void main(String[] args) {
        menu();
        String opc=teclado.nextLine();
        if (opc.equals( "A" ))suma();
        if (opc.equals( "B" ))resta();
    }
    }