import java.util.Scanner;
import java.util.Locale;

public class ex2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner recebe = new Scanner (System.in);
		
		int raio;
		double area;
		
		System.out.printf("Calculo da area do circulo!%n");
		
		System.out.printf("Insira o valor do raio:%n");
		raio = recebe.nextInt();
		
		area = 3.14159 * (raio * raio);
		
		System.out.printf("A area e igual a: %.4f%n", area);
		
		recebe.close();
	}

}
