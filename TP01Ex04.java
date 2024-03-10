/* 
Nome: Luan dos Santos Sales Pinheiro
4. A partir dos valores da base e altura de um triângulo, calcular e exibir sua área.
*/

import java.util.Scanner; 

class TP01Ex04 {
    public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);  
		System.out.println("Digite a base do triângulo: ");
		int b = reader.nextInt();
		System.out.println("Digite a altura do triângulo: ");
		int a = reader.nextInt();
		System.out.println("A área do triângulo é " + (a * b) / 2);
		reader.close();			
	}
}
