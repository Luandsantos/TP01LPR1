/* 
Nome: Luan dos Santos Sales Pinheiro
17. Entrar via teclado com dois valores quaisquer “X” e “Y”. Calcular e exibir o
cálculo XY (“X” elevado a “Y”). Pesquisar as funções Exp e Ln.
*/

import java.util.Scanner; 
import java.util.Locale;  // eu não estava conseguindo receber inputs com decimais, então coloquei isso

class TP01Ex17 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite o valor de X: ");
        double x = reader.nextDouble();

        System.out.print("Digite o valor de Y: ");
        double y = reader.nextDouble();

        double resultado = Math.pow(x, y);
        String RESULTADO = String.format("%.2f", resultado);

        System.out.println(x + " elevado a " + y + " é igual a " + RESULTADO);
		reader.close();

	}
}
