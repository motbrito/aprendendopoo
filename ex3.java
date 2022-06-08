import java.util.Scanner;
public class ex3 {

	public static void main(String[] args) {
	Scanner receber = new Scanner (System.in);
	
	int A,B,C,D, resultado;
	
	System.out.printf("Informe o primeiro numero: %n");
	A = receber.nextInt();
	
	System.out.printf("Informe o segundo numero: %n");
	B = receber.nextInt();
	
	System.out.printf("Informe o terceiro numero: %n");
	C = receber.nextInt();
	
	System.out.printf("Informe o quarto numero: %n");
	D = receber.nextInt();
	
	resultado = (A * B ) - (C * D);
	
	System.out.printf("O resultado da diferença entre os produtos é: %d %n", resultado);
			
			
			
	}

}
