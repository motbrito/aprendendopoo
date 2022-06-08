import java.util.Scanner;

public class ex5 {

	public static void main(String[] args) {

	Scanner receber = new Scanner (System.in);
	
	int cod1, cod2, num1,num2;
	double valor1, valor2, valorfinal;
	
	System.out.printf("Informe o codigo da 1ª peça: %n");
	cod1 = receber.nextInt();
	
	System.out.printf("Informe o numero de unidades 1ª peca: %n");
	num1 = receber.nextInt();
	
	System.out.printf("Informe o valor da 1ª peca: %n");
	valor1 = receber.nextDouble();
	
	System.out.printf("Informe o codigo da 2ª peça: %n");
	cod2 = receber.nextInt();
	
	System.out.printf("Informe o numero de unidades da  2ª peca: %n");
	num2 = receber.nextInt();
	
	System.out.printf("Informe o valor da 2ª peca: %n");
	valor2 = receber.nextDouble();
	
	valorfinal = (valor1 * num1) + (valor2 * num2);
	
	
	System.out.printf("Valor total = R$%.2f", valorfinal);
	
	}

}
