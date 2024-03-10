/* 
Nome: Luan dos Santos Sales Pinheiro
8. Sabendo que uma milha marítima equivale a um mil, oitocentos e cinquenta e
dois metros e que um quilômetro possui mil metros, fazer um programa para
converter milhas marítimas em quilômetros.
*/

import java.util.Scanner; 

class TP01Ex08 {
    public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Digite uma distância em milhas marítimas: ");
		int a = reader.nextInt();
        double b = a * 1.852;
		System.out.println("Esse valor em quilômetros equivale a " + b + " km"); // o resultado parece em milhares mas é decimal
		reader.close();			

        // milha maritima = 1852 m
        // m = 0,001 km
        // km = 1000 m
        // milha maritima em km = 1.852
	}
}
