/*
Nome: Luan dos Santos Sales Pinheiro
Enunciado: 1. Entrar via teclado com a base e a altura de um retângulo, calcular e exibir sua área. 
*/

import java.util.Scanner; 

class TP01Ex01 {
    public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);  
		System.out.println("Digite a base do retângulo: ");
		int b = reader.nextInt();
		System.out.println("Digite a altura do retângulo: ");
		int a = reader.nextInt();
		System.out.println("A área do retângulo é " + a * b);
		reader.close();		
	}
}
