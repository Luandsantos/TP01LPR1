/* 
Nome: Luan dos Santos Sales Pinheiro
16. Entrar via teclado com o valor de um ângulo em graus, calcular e exibir as
seguintes funções trigonométricas: seno, cosseno, tangente e secante deste ângulo.
Lembre-se que uma função trigonométrica trabalha em radianos. 
*/

import java.util.Scanner; 
import java.util.Locale;  // eu não estava conseguindo receber inputs com decimais, então coloquei isso

class TP01Ex16 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite o valor do ângulo em graus: ");
        double anguloGraus = reader.nextDouble();
        double anguloRadianos = Math.toRadians(anguloGraus);

        double seno = Math.sin(anguloRadianos);
        double cosseno = Math.cos(anguloRadianos);
        double tangente = Math.tan(anguloRadianos);

        double secante = 1.0 / cosseno;

        System.out.println("Seno do ângulo: " + seno);
        System.out.println("Cosseno do ângulo: " + cosseno);
        System.out.println("Tanghente do ângulo: " + tangente);
        System.out.println("Secante do ângulo: " + secante);

        reader.close();

	}
}
