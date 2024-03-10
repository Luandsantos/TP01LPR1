/* 
Nome: Luan dos Santos Sales Pinheiro
Enunciado: 2. Calcular e exibir a área de um quadrado, a partir do valor de sua aresta que será digitado.
*/

import java.util.Scanner; 

class TP01Ex02 {
    public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);  
		System.out.println("Digite a aresta do quadrado: ");
		int a = reader.nextInt();
		System.out.println(a * a);
		reader.close();		
	}
}
