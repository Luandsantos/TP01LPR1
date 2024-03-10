/* 
Nome: Luan dos Santos Sales Pinheiro
3. Calcular e exibir a área de um quadrado a partir do valor de sua diagonal que será digitado.
*/

import java.util.Scanner; 

class TP01Ex03 {
    public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);  
		System.out.println("Digite a diagonal do quadrado: ");
		int d = reader.nextInt();
		double a = (d * d) / 2;
		System.out.println(a);
		reader.close();		
	}
}
