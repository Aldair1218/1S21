import java.util.Scanner;

public class Exam2_1s21CMA{
	public static void main(String[] args) {
		int[] a = new int[10];
		int[] calif = new int[10];
		Scanner teclado = new Scanner(System.in);
		int ma, b, c, d, e;
		a[0]=1;
		a[1]=2;
		a[2]=3;
		a[3]=4;
	    a[4]=5;

		for (int c=0; c<4;c++){
			System.out.println("Ingrese el valor: " +(c+1)+ ": ");
			calif[c] = teclado.nextInt();
		}
		ma=0;
		for (int s=0; s<4;s++){
		  ma+=calif[s];
		}
		ma=ma/4;
		System.out.println("La media aritmetica es : " + ma);
	
        // Sacar desviacion media 
       b=0;
       for (int i=0; i<1; i++){
        b=a[1]-ma;
        System.out.println("La resta del primer valor es : " + b);
      
      c=0;
       for (int i=0; i<1; i++){
        c=a[2]-ma;
        System.out.println("La resta del primer valor es : " + c);

      d=0;
       for (int i=0; i<1; i++){
        d=a[3]-ma;
        System.out.println("La resta del primer valor es : " + d);

      e=0;
       for (int i=0; i<1; i++){
        e=a[4]-ma;
        System.out.println("La resta del primer valor es : " + e);
       } 
	 }
  }
