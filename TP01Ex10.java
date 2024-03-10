/* 
Nome: Luan dos Santos Sales Pinheiro
10. Entrar via teclado com o valor de uma temperatura em graus Celsius, calcular e exibir sua temperatura equivalente em Fahrenheit. 
*/

import java.util.Locale;  // eu não estava conseguindo receber inputs com decimais, então coloquei isso
import java.util.Scanner; 

class TP01Ex10 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in).useLocale(Locale.US);
		System.out.println("Digite um valor de temperatura em celsius: ");
		double c = reader.nextDouble();
        double f = (c  * 1.8) + 32;
		System.out.println("Esse valor convertido para Fahrenheit equivale a " + f + "  °F"); // o resultado parece em milhares mas é decimal
		reader.close();			
	

	}
}
