package aula0419;
    
import java.util.Scanner;

public class Exemplo01 {
    
public static void limparTabuleiro(char[][] tabuleiro){
        for(int i = 0; i < tabuleiro.length; i++){
            for(int j = 0; j < tabuleiro.length; j++){
                tabuleiro[i][j] = '-';
            }
        }
    } 
    
    public static void mostrarTabuleiro(char [][] tabuleiro){
        for(int i = 0; i < tabuleiro.length; i++){
            for(int j = 0; j < tabuleiro.length; j++){
                System.out.print(tabuleiro[i][j] + " ");
            }
            System.out.println("");
        }
    }
    
    public static boolean testaJogada(char[][] tabuleiro, int linha, int coluna){
        if((linha < 3 && linha >= 0) && (coluna < 3 && coluna >= 0) && (tabuleiro[linha][coluna] == '-')){
            return true;
        } else {
            return false;
        }
    }  
    
    public static void jogador1(char[][] tabuleiro) {
        var tc = new Scanner(System.in);
        int linha;
        int coluna;
        do {
            System.out.println("Primeiro Jogador");
            System.out.println("Digite a posição linha (de 0 a 2)");
            linha = tc.nextInt();
            System.out.println("Digite a posição ooluna (de 0 a 2)");
            coluna = tc.nextInt();
            System.out.println("Sua rodada terminou");
        } while (!testaJogada(tabuleiro, linha, coluna));
        tabuleiro[linha][coluna] = 'x';
        mostrarTabuleiro(tabuleiro);
    }
    
    public static void jogador2(char [][] tabuleiro) {
        var tc = new Scanner(System.in);
        int linha;
        int coluna;
        do {
            System.out.println("Segundo jogador");
            System.out.println("Digite a posição linha (de 0 a 2)");
            linha = tc.nextInt();
            System.out.println("Digite a posição ooluna (de 0 a 2)");
            coluna = tc.nextInt();
            System.out.println("Sua rodada terminou");
        } while (!testaJogada(tabuleiro, linha, coluna));
        tabuleiro[linha][coluna] = 'o';
        mostrarTabuleiro(tabuleiro);
    }
    
    public static boolean tabuleiroCompleto(char[][] tabuleiro){
        for(int linha=0 ; linha<3 ; linha++)
            for(int coluna=0 ; coluna<3 ; coluna++)
                if(tabuleiro[linha][coluna] == 0)
                    return false;
        return true;
    }
    
    public static void main(String[] args) {
        char[][] tabuleiro = new char[3][3];
        limparTabuleiro(tabuleiro);
        mostrarTabuleiro(tabuleiro);
        do{
        jogador1(tabuleiro);
        jogador2(tabuleiro);
        } while (tabuleiroCompleto(tabuleiro));
    }

}
