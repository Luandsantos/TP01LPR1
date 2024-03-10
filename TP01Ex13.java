/* 
Nome: Luan dos Santos Sales Pinheiro
3. Calcular e exibir a velocidade final (em km/h) de um automóvel, a partir dos
valores da velocidade inicial (em m/s), da aceleração (m/s²) e do tempo de percurso
(em s) que serão digitados. 
*/

import java.util.Locale;  // eu não estava conseguindo receber inputs com decimais, então coloquei isso
import java.util.Scanner; 

class TP01Ex13 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in).useLocale(Locale.US);
		System.out.println("Digite a velocidade inicial (em m/s) do automóvel: ");
		double vi = reader.nextDouble();
		System.out.println("Digite o valor da aceleração (em m/s²) do automóvel: ");
		double a = reader.nextDouble();
        System.out.println("Digite o tempo de percurso: ");
		double t = reader.nextDouble();
        double vf = (vi + (a * t)) * 3.6; 
		System.out.println("A velocidade final do automóvel é " + vf + " km/h");
		reader.close();			
	}
}
