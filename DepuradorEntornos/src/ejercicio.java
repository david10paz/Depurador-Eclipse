import java.util.Scanner;

public class ejercicio {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int numeroleido;
		
		for(int i = 0; i<5; i++) {
			System.out.println("Introduce un numero");
			numeroleido = input.nextInt();
			
			if (esPar(numeroleido)) {
				
				System.out.println("El numero leido es par: " + numeroleido);
			}else {
				System.out.println("El numero leido es impar: " + numeroleido);
			}
			
			
		}
		
		System.out.println("El programa ha terminado");
		
		input.close();

	}
	
	static boolean esPar(int numero) {
		System.out.println("Voy a evaluar el numero");
		if(numero % 2 == 0) {
			return true;
		}
		return false;
	}

}
