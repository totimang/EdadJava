import java.util.Scanner;

public class Clase5_ejemplo1_Scanner {

	public Clase5_ejemplo1_Scanner() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);//sc se usará para leer los datos
		System.out.print("Cuántos años tenes?");//Preguntar la edad
		int edad = sc.nextInt();//Leer un dato.
		System.out.println("Pareces de " + (edad-3));
	}

}
