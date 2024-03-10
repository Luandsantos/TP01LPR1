/* 
Nome: Luan dos Santos Sales Pinheiro
15. Entrar via teclado com o valor da cotação do dólar e uma certa quantidade de dólares. 
Calcular e exibir o valor correspondente em Reais (R$)
*/

import java.util.Scanner; 
import java.util.Locale;  // eu não estava conseguindo receber inputs com decimais, então coloquei isso

class TP01Ex15 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in).useLocale(Locale.US);

		System.out.println("Digite a cotação do dólar: ");
		double c = reader.nextDouble();
        System.out.println("Digite qualquer quantidade de dólar: ");
		double d = reader.nextDouble();
        String D = String.format("%.2f", d);

		double r = c * d; 
        String R = String.format("%.2f", r);
		System.out.println("$" + D + " em reais é equivalente a R$" + R);
		reader.close();
        
        // 1 dolar = 2.5 reais
        // 2 dolar = 5.0 reais
	}
}
