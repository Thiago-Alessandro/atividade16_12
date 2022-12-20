package atividade16_12;

import java.util.Scanner;

public class questao2 {
	
	public static void main(String[] args) {
		
		int linhas, colunas;
		
		String valor = new String();
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Insira o número de linhas da tabela: ");
		linhas = teclado.nextInt();
		
		System.out.println("Insira o número de colunas da tabela: ");
		colunas = teclado.nextInt();
		
		System.out.println("Digite um valor: ");
		valor = teclado.next();
		
		imprimirTabela(linhas,colunas,montarTabela(valor,linhas,colunas));
	}
	
	public static String[][] montarTabela (String valor, int linhas, int colunas) {
		
		System.out.println(colunas);
		String tabelaPronta[][]= new String [linhas][colunas];
		
		for(int c = 0; c < colunas; c++) {
			
			for(int l = 0; l < linhas; l++) {
				
				if(tabelaPronta[l][c] == null) {
					
					tabelaPronta[l][c] = " ";
					
				}
			}
		}

		
		tabelaPronta[0][0] = valor;
		tabelaPronta[0][colunas - 1] = valor;
		tabelaPronta[linhas - 1][0] = valor;
		tabelaPronta[linhas - 1][colunas - 1] = valor;
		
		int meioColunaImpar = 0, meioLinhaImpar = 0;
		
		if (colunas % 2 != 0) {
			
			for(int c1 = 0, c2 = colunas - 1;c1 != c2; c1++, c2--) {
				
				meioColunaImpar++;;
				
			}
			
		}
		if (linhas % 2 != 0) {

			for(int c1 = 0, c2 = linhas - 1;c1 != c2;c1++, c2--) {
				
				meioLinhaImpar++;
				
			}
		}
		if (colunas > 2 && linhas > 2) {
			
			if (linhas % 2 == 0 && colunas % 2 == 0) {
				
				if (colunas > 2 || linhas > 2) {
						
					tabelaPronta[linhas / 2][colunas / 2] = valor;
					tabelaPronta[linhas / 2][(colunas / 2) - 1] = valor;
					tabelaPronta[(linhas / 2) - 1][colunas / 2] = valor;	
					tabelaPronta[(linhas / 2) - 1][(colunas / 2) - 1] = valor;	
						
				} 
				
			}else if (colunas % 2 != 0 && colunas > 2 || colunas % 2 != 0 && linhas > 2) {
				  
				if(linhas % 2 == 0) {
					  
				tabelaPronta[linhas / 2][meioColunaImpar] = valor;
				tabelaPronta[(linhas / 2) - 1][meioColunaImpar] = valor;
					  
				} if (linhas % 2 != 0){
					  
				tabelaPronta[meioLinhaImpar][meioColunaImpar] = valor; 
					  
				}
	
			} else if (linhas % 2 != 0 && colunas > 2 ||linhas % 2 != 0 && linhas > 2) {
				
				if (colunas % 2 == 0) {
						  
					tabelaPronta[meioLinhaImpar][colunas / 2] = valor;
					tabelaPronta[meioLinhaImpar][(colunas / 2) - 1] = valor;
						  
				 }
						 
			}
			
		} else if (colunas == 2 && linhas > 4) {
			
			if(linhas % 2 == 0) {
				
				tabelaPronta[linhas / 2][0] = valor;
				tabelaPronta[linhas / 2][1] = valor;
				tabelaPronta[(linhas / 2) - 1][0] = valor;
				tabelaPronta[(linhas / 2) - 1][1] = valor;
				
			} else {
				
				tabelaPronta[meioLinhaImpar][0] = valor;
				tabelaPronta[meioLinhaImpar][1] = valor;
				
			}
			
		} else if (linhas == 2 && colunas > 4) {
			
			if(colunas % 2 == 0) {
				
				tabelaPronta[0][colunas / 2] = valor;
				tabelaPronta[1][colunas / 2] = valor;
				tabelaPronta[0][(colunas / 2) - 1] = valor;
				tabelaPronta[1][(colunas / 2) - 1] = valor;
				
			} else {
				
				tabelaPronta[0][meioColunaImpar] = valor;
				tabelaPronta[1][meioColunaImpar] = valor;
				
			}

		} else if (colunas == 1 && linhas > 4) {
			
			if(linhas % 2 == 0) {
				
				tabelaPronta[linhas / 2][0] = valor;
				tabelaPronta[(linhas / 2) - 1][0] = valor;
				
			} else {
				
				tabelaPronta[meioLinhaImpar][0] = valor;
				
			}
			
		} else if (linhas == 1 && colunas > 4) {
			
			if(colunas % 2 == 0) {
				
				tabelaPronta[0][colunas / 2] = valor;
				tabelaPronta[0][(colunas / 2) - 1] = valor;
				
			} else {
				
				tabelaPronta[0][meioColunaImpar] = valor;
				
			}

		}
		
		return tabelaPronta;
		
	}
	
	public static void imprimirTabela(int linhas, int colunas, String tabela[][]) {
		
		for (int  l = 0;l <= linhas - 1; l++) {
			
			System.out.print("\n\t");
			
			for(int c = 0;c <= colunas - 1;c++) {
				
				System.out.print("|  " + tabela[l][c] + "  |");
			}
		}
		
	}

}