/* 
Nome: Luan dos Santos Sales Pinheiro
9. Calcular e exibir a tensão de um determinado circuito eletrônico a partir dos
valores da resistência e corrente elétrica que serão digitados. Utilize a lei de Ohm.
*/

import java.util.Locale; // eu não estava conseguindo receber inputs com decimais, então coloquei isso
import java.util.Scanner; 

class TP01Ex09 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in).useLocale(Locale.US);
		System.out.println("Digite o valor da corrente elétrica em ampares: ");
		double i = reader.nextDouble();
        System.out.println("Digite o valor da resistência elétrica em ohms: ");
		double r = reader.nextDouble();
        double v = i * r;
		System.out.println("A tensão elétrica desse circuito elétrico, segundo a Lei de Ohmn, é " + v + " volts."); // o resultado parece em milhares mas é decimal
		reader.close();			

	}
}
