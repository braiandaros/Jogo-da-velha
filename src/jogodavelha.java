import java.util.Scanner;

/* criado por braian junior 
 * github: braiandaros*/

public class jogodavelha {

	   public static void main(String[] args) {
	      Scanner scanner = new Scanner(System.in);
	      char[][] tabuleiro = {{' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '}};
	      char player = 'X' ;
	      int linha, coluna;

	      while(true) {
	         System.out.println("  0  1  2");
	         System.out.println("0 "+tabuleiro[0][0]+" |"+tabuleiro[0][1]+" | "+tabuleiro[0][2]);
	         System.out.println("  --+--+--");
	         System.out.println("1 "+tabuleiro[1][0]+" |"+tabuleiro[1][1]+" | "+tabuleiro[1][2]);
	         System.out.println("  --+--+--");
	         System.out.println("2 "+tabuleiro[2][0]+" |"+tabuleiro[2][1]+" | "+tabuleiro[2][2]);

	         System.out.println("Vez do jogador "+player+".");
	         System.out.print("Digite a linha: ");
	         linha = scanner.nextInt();
	         System.out.print("Digite a coluna: ");
	         coluna = scanner.nextInt();

	         if(linha < 0 || linha > 2 || coluna < 0 || coluna > 2 || tabuleiro[linha][coluna] != ' ') {
	            System.out.println("Jogada inválida.");
	            continue;
	         }

	         tabuleiro[linha][coluna] = player;

	         if(tabuleiro[0][0] == player && tabuleiro[0][1] == player && tabuleiro[0][2] == player ||
	        	tabuleiro[1][0] == player && tabuleiro[1][1] == player && tabuleiro[1][2] == player ||
	        	tabuleiro[2][0] == player && tabuleiro[2][1] == player && tabuleiro[2][2] == player ||
	        	tabuleiro[0][0] == player && tabuleiro[1][0] == player && tabuleiro[2][0] == player ||
	        	tabuleiro[0][1] == player && tabuleiro[1][1] == player && tabuleiro[2][1] == player ||
	        	tabuleiro[0][2] == player && tabuleiro[1][2] == player && tabuleiro[2][2] == player ||
	        	tabuleiro[0][0] == player && tabuleiro[1][1] == player && tabuleiro[2][2] == player ||
	        	tabuleiro[0][2] == player && tabuleiro[1][1] == player && tabuleiro[2][0] == player) {
	        	 
	            System.out.println("Jogador "+player+" venceu!");
	            
		        System.out.println("  0  1  2");
		        System.out.println("0 "+tabuleiro[0][0]+" |"+tabuleiro[0][1]+" | "+tabuleiro[0][2]);
		        System.out.println("  --+--+--");
		        System.out.println("1 "+tabuleiro[1][0]+" |"+tabuleiro[1][1]+" | "+tabuleiro[1][2]);
		        System.out.println("  --+--+--");
		        System.out.println("2 "+tabuleiro[2][0]+" |"+tabuleiro[2][1]+" | "+tabuleiro[2][2]);
	            break;
	         }

	         if(player == 'X') {
	            player = 'O';
	         } else {
	            player = 'X';
	         }
	      }

	      scanner.close();
	   }
	}