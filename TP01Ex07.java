/* 
Nome: Luan dos Santos Sales Pinheiro
7. Calcular e exibir a média geométrica de dois valores quaisquer que serão digitados. 
*/

import java.util.Scanner; 

class TP01Ex07 {
    public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);   
		System.out.println("Digite o primeiro valor: ");
		int a = reader.nextInt();
		System.out.println("Digite o segundo valor: ");
		int b = reader.nextInt();
		double m = Math.sqrt(a * b);
        String resultado = String.format("%.2f", m);
		System.out.println("A media geométrica é " + resultado);
		reader.close();			
	}
}
