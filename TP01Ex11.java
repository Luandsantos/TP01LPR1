/* 
Nome: Luan dos Santos Sales Pinheiro
11. A partir do diâmetro de um círculo que será digitado, calcular e exibir sua área. 
*/

import java.util.Scanner; 

class TP01Ex11 {
    public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);  
		System.out.println("Digite o diâmetro da esfera: ");
		int d = reader.nextInt();
		double a = Math.round(Math.PI * Math.pow(d * 2, 2)); 
		System.out.println("A área da esfera é" + a);
		reader.close();			
	}
}
