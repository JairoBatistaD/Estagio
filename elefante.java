import java.util.Scanner;

public class elefante {

	public static void main(String[] args) {
		int valor;
		int i=1;
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite um valor");
		valor = ler.nextInt();
		ler.close();
		while(i <= valor) {
			System.out.println(i+" Elefantes incomoda muita gente");
			i++;
		}
	}

}
