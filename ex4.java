import java.util.Scanner;
import java.util.Locale;
public class ex4 {

	public static void main(String[] args) {
	Locale.setDefault(Locale.US);
	Scanner receber = new Scanner (System.in);
	
	int numero, horas;
	double valor, salario;
	
	System.out.printf("Informe o numero do funcionario: %n");
	numero = receber.nextInt();
	
	System.out.printf("Informe o numero de horas trabalhadas: %n");
	horas = receber.nextInt();
	
	System.out.printf("Informe o valor da hora trabalhada: %n");
	valor = receber.nextDouble();
	
	salario = valor * horas;
	
	System.out.printf("Numero: %d | Salario: %.2f %n", numero, salario);
	
	}

}
