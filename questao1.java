package atividade16_12;

import java.util.Scanner;

public class questao1 {

	static String tabela[][] = new String [5][5];
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite um valor: ");
		tabela[0][0] = teclado.next();
		tabela[0][4] = tabela[0][0];
		tabela[4][0] = tabela[0][0];
		tabela[4][4] = tabela[0][0];
		tabela[2][2] = tabela[0][0];
		
		for(int c = 0; c < 5; c++) {
			
			for(int l = 0; l < 5; l++) {
				
				if(tabela[l][c] == null) {
					
					tabela[l][c] = " ";
					
				}
			}
		}
		imprimirTabela();
	}
	
	public static void imprimirTabela() {
		
		System.out.println("  " + tabela[0][0] + "  |  " + tabela [0][1] + "  |  " + tabela[0][2] + "  |  " + tabela[0][3] + "  |  " + tabela[0][4] + "  ");
		System.out.println("-----------------------------");
		System.out.println("  " + tabela[1][0] + "  |  " + tabela [1][1] + "  |  " + tabela[1][2] + "  |  " + tabela[1][3] + "  |  " + tabela[1][4] + "  ");
		System.out.println("-----------------------------");
		System.out.println("  " + tabela[2][0] + "  |  " + tabela [2][1] + "  |  " + tabela[2][2] + "  |  " + tabela[2][3] + "  |  " + tabela[2][4] + "  ");
		System.out.println("-----------------------------");
		System.out.println("  " + tabela[3][0] + "  |  " + tabela [3][1] + "  |  " + tabela[3][2] + "  |  " + tabela[3][3] + "  |  " + tabela[3][4] + "  ");
		System.out.println("-----------------------------");
		System.out.println("  " + tabela[4][0] + "  |  " + tabela [4][1] + "  |  " + tabela[4][2] + "  |  " + tabela[4][3] + "  |  " + tabela[4][4] + "  ");
	}

}
