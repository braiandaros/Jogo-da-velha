import java.util.Scanner;

/* criado por braian junior 
 * github: braiandaros*/

public class jogodavelha {

	   public static void main(String[] args) {
	      Scanner scanner = new Scanner(System.in);
	      char[][] tabuleiro = {{' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '}};
	      String player = "a";
	      char ponto;
	      int linha, coluna, contador = 0;
	      
	      System.out.println("Digite o nome do jogador 1: ");
	      String nomep1 = scanner.nextLine();
	      System.out.println("Digite o nome do jogador 2: ");
	      String nomep2 = scanner.nextLine();
	      player = nomep1;
	      
	      while(true) {
	         System.out.println("  0    1   2");
	         System.out.println("0 "+tabuleiro[0][0]+"  | "+tabuleiro[0][1]+" |  "+tabuleiro[0][2]);
	         System.out.println("  ---+---+---");
	         System.out.println("1 "+tabuleiro[1][0]+"  | "+tabuleiro[1][1]+" |  "+tabuleiro[1][2]);
	         System.out.println("  ---+---+---");
	         System.out.println("2 "+tabuleiro[2][0]+"  | "+tabuleiro[2][1]+" |  "+tabuleiro[2][2]);

	         
	         System.out.println("Vez do jogador "+player+".");
	         System.out.print("Digite a linha: ");
	         linha = scanner.nextInt();
	         System.out.print("Digite a coluna: ");
	         coluna = scanner.nextInt();

	         if(linha < 0 || linha > 2 || coluna < 0 || coluna > 2 || tabuleiro[linha][coluna] != ' ') {
	            System.out.println("Jogada inválida.");
	            continue;
	         }

	         if(player == nomep1) {
	        	 ponto = 'X';
	        	 tabuleiro[linha][coluna] = ponto;
	        	 
	         }else {
	        	ponto = 'O';
	        	tabuleiro[linha][coluna] = ponto;
	         }
	         if(tabuleiro[0][0] == ponto && tabuleiro[0][1] == ponto && tabuleiro[0][2] == ponto ||
	        	tabuleiro[1][0] == ponto && tabuleiro[1][1] == ponto && tabuleiro[1][2] == ponto ||
	        	tabuleiro[2][0] == ponto && tabuleiro[2][1] == ponto && tabuleiro[2][2] == ponto ||
	        	tabuleiro[0][0] == ponto && tabuleiro[1][0] == ponto && tabuleiro[2][0] == ponto ||
	        	tabuleiro[0][1] == ponto && tabuleiro[1][1] == ponto && tabuleiro[2][1] == ponto ||
	        	tabuleiro[0][2] == ponto && tabuleiro[1][2] == ponto && tabuleiro[2][2] == ponto ||
	        	tabuleiro[0][0] == ponto && tabuleiro[1][1] == ponto && tabuleiro[2][2] == ponto ||
	        	tabuleiro[0][2] == ponto && tabuleiro[1][1] == ponto && tabuleiro[2][0] == ponto) {
	        	 
	        	System.out.println("--------------------------");
	            System.out.println("Jogador "+player+" venceu!");
	            
		        System.out.println("  0  1  2");
		        System.out.println("0 "+tabuleiro[0][0]+" |"+tabuleiro[0][1]+" | "+tabuleiro[0][2]);
		        System.out.println("  --+--+--");
		        System.out.println("1 "+tabuleiro[1][0]+" |"+tabuleiro[1][1]+" | "+tabuleiro[1][2]);
		        System.out.println("  --+--+--");
		        System.out.println("2 "+tabuleiro[2][0]+" |"+tabuleiro[2][1]+" | "+tabuleiro[2][2]);
		        System.out.println("--------------------------");
		        
	            break;
	         
	         }
	         
	         if(contador%2 == 0) {
	            player = nomep2;
	         } else {
	            player = nomep1;
	         }
	         contador += 1;
	         System.out.println(contador);
	      }

	      scanner.close();
	   }
	}