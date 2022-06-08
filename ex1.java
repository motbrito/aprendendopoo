import java.util.Scanner;


public class ex1 {

	public static void main(String[] args) {
	Scanner receber = new Scanner (System.in);
	
	int A, B, soma;
	
	System.out.printf("Informe o primeiro numero: %n");
	A = receber.nextInt();
	
	System.out.printf("Informe o segundo numero: %n");
	B = receber.nextInt();
	
	soma = A + B;
	
	System.out.printf("O resultado da soma de %d e %d e igual a %d! %n", A,B,soma);
	
	receber.close();
	} 

}
