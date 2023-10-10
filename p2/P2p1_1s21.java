public class P2p1_1s21{
	public static void main(String[] args) {
		int a=12;
		if (a<10){
			System.out.println("Si ingreso porque es verdadero");
		}

		if (a>10){
			System.out.println("este segmento si se ejecuta porque se cumple la condicion");
		}

		if (true){
			System.out.println("aqui se ejecuta porque es verdadero");
		}

		if (false){
			System.out.println("esto no se ejecuta porque es falso");
		}

		if ((a>10) == true){
			System.out.println("se ejecutara?");
		}
		System.out.println("continuamos con el codigo");

		System.out.println("");

		a= 18;

		if (a>17){
			System.out.println("Eres mayor de edad");
		} else {
			System.out.println("Eres menor de edad");
		}

		a=3;

		if (a == 1){
			System.out.println("se evalua a 1");
		} else if (a == 2){
			System.out.println("se evalua a 2");
		} else if (a == 3){
			System.out.println("Se evalua a 3");
		} else if (a == 4){
			System.out.println("Se evalua a 4");
		} else if (a == 5){
			System.out.println("Se evalua a 5");
		}else{
			System.out.println("se evalua los demas digitos");
		}
	}
}