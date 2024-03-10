/* 
Nome: Luan dos Santos Sales Pinheiro
12. Calcular e exibir o volume de um cone a partir dos valores da altura e do raio da base que serão digitados. 
*/

import java.util.Locale;  // eu não estava conseguindo receber inputs com decimais, então coloquei isso
import java.util.Scanner; 

class TP01Ex12 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in).useLocale(Locale.US);
		System.out.println("Digite a altura do cone: ");
		double a = reader.nextDouble();
		System.out.println("Digite o raio do cone: ");
		double r = reader.nextDouble();
        double v = Math.round((1.0 / 3.0) * a * Math.PI * Math.pow(r, 2)); 
		System.out.println("O volume do cone é igual a " + v);
		reader.close();			

        // V=1/3hπr².
	}
}
