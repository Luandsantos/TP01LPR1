/* 
Nome: Luan dos Santos Sales Pinheiro
18. Entrar via teclado com o valor de cinco produtos. Após as entradas, digitar um
valor referente ao pagamento da somatória destes valores. Calcular e exibir o troco
que deverá ser devolvido. 
*/

import java.util.Scanner; 
import java.util.Locale; // eu não estava conseguindo receber inputs com decimais, então coloquei isso

class TP01Ex18 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in).useLocale(Locale.US);

		System.out.println("Digite o valor do primeiro produto: ");
		double p1 = reader.nextDouble();
        System.out.println("Digite o valor do segundo produto: ");
		double p2 = reader.nextDouble();
        System.out.println("Digite o valor do terceiro produto: ");
		double p3 = reader.nextDouble();
        System.out.println("Digite o valor do quarto produto: ");
		double p4 = reader.nextDouble();
        System.out.println("Digite o valor do quinto produto: ");
		double p5 = reader.nextDouble();

        double soma = p1 + p2 + p3 + p4 + p5;
        String SOMA = String.format("%.2f", soma);

        System.out.println("Você deve pagar R$" + SOMA);
        System.out.println("Digite quanto irá pagar pelos produtos: ");
        double pagamento = reader.nextDouble();

        double troco = soma - pagamento;
        String TROCO = String.format("%.2f", troco);

        if (pagamento > soma) {
            // Remove o travessão (-) do início da saída
            TROCO = TROCO.substring(1);
        }

        System.out.println("Você receberá R$" + TROCO + " de troco.");
        reader.close();
        
        // 1 dolar = 2.5 reais
        // 2 dolar = 5.0 reais
	}
}
