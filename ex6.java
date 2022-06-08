import java.util.Scanner;
public class ex6 {

	public static void main(String[] args) {
	Scanner receber = new Scanner (System.in);
	
	double A,B,C;
	
	System.out.printf("Informe o primeiro valor: %n");
	A = receber.nextDouble();
	
	System.out.printf("Informe o segundo valor: %n");
	B = receber.nextDouble();

	System.out.printf("Informe o terceiro valor: %n");
	C = receber.nextDouble();
	
	System.out.printf("A area do triangulo é: %.3f %n", (A * C) / 2);
	
	System.out.printf("A area do ciculo de raio é: %.3f %n", 3.14159 * (C * C));
	
	System.out.printf("A area do trapezio é: %.3f %n", (A + B) * C  / 2);
	
	System.out.printf("A area do quadrado que tem o lado %.1f é: %.3f %n", B, B * B);
	
	System.out.printf("A area do retangulo é: %.3f %n", A * B);
	}

}
