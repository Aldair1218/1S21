public class P2p2_1s21{
	public static void main(String[] args) {
		int val=4;
		switch(val){
		case 1: System.out.println("se evaluo a 1"); break;
		case 2: System.out.println("se evaluo a 2"); break;
		case 3: System.out.println("se evaluo a 3"); break;
		case 4: System.out.println("se evaluo a 4"); break;
		case 5: System.out.println("se evaluo a 5"); break;
		default: System.out.println("Valor fuera del rango");
		}

		Character opc='a';
		switch(opc){
		case 'a': System.out.println("Se evaluo A");
		case 'b': System.out.println("se evaluo B");
		case 'c': System.out.println("se evaluo C");
		case 'd': System.out.println("se evaluo D");
		case 'e': System.out.println("se evaluo E");
		case 'f': System.out.println("se evaluo F");
		default: System.out.println("opcion no existe");
		}

		String cadena ="uno";
		switch (cadena) {
		case "uno" : System.out.println("Uno");
		case "dos" : System.out.println("dos");
		case "tres" : System.out.println("tres");
		case "cuatro" : System.out.println("cuatro");
		default: System.out.println("no existe la opcion");
		}
	}
}