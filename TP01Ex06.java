/* 
Nome: Luan dos Santos Sales Pinheiro
6. Calcular e exibir a média aritmética de quatro valores quaisquer que serão digitados. 
*/

import java.util.Locale;
import java.util.Scanner; 

class TP01Ex06 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in).useLocale(Locale.US);
		System.out.println("Digite o primeiro valor: ");
		double a = reader.nextDouble();
		System.out.println("Digite o segundo valor: ");
		double b = reader.nextDouble();
		System.out.println("Digite o terceiro valor: ");
		double c = reader.nextDouble();
		System.out.println("Digite o quarto valor: ");
		double d = reader.nextDouble();
		double m = (a + b + c + d) / 2;
		System.out.println("A media aritmética é " + m);
		reader.close();			
	}
}
