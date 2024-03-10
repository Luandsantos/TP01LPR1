/* 
Nome: Luan dos Santos Sales Pinheiro
14. Calcular e exibir o volume livre de um ambiente que contém uma esfera de raio
“r” inscrita em um cubo perfeito de aresta “a”. Os valores de “r “ e “a” serão digitados.  
*/

import java.util.Locale;  // eu não estava conseguindo receber inputs com decimais, então coloquei isso
import java.util.Scanner; 


class TP01Ex14 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in).useLocale(Locale.US);
		System.out.println("Digite o raio da esfera: ");
		double r = reader.nextDouble();
		System.out.println("Digite a aresta do cubo: ");
		double a = reader.nextDouble();

        // Volume da esfera
        double ve = ((4.0 / 3.0) * Math.PI * Math.pow(r, 3));

        // Volume do cubo
        double vc = Math.pow(a, 3);

        // Volume livre
        double vl = ve - vc; 

        // Resultado
        String resultado = String.format("%.2f", vl);
		System.out.println("O volume final é " + resultado);
		reader.close();	
        
        // vl = a^3 - (4/3 * pi * raio^3)
	}
}
