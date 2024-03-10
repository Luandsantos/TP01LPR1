/* 
Nome: Luan dos Santos Sales Pinheiro
5. Calcular e exibir o volume de uma esfera a partir do valor de seu diâmetro que será digitado.  
*/

import java.util.Scanner; 

class TP01Ex05 {
    public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);  
		System.out.println("Digite o diâmetro da esfera: ");
		int d = reader.nextInt();
		double v = Math.round((4.0 /3.0) * Math.PI * Math.pow(d * 2, 2)); // arrendodei para não dar um valor muito alto
		System.out.println("O volume da esfera é " + v);
		reader.close();			
	}
}
