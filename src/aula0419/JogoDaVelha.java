package aula0419;

import java.util.Scanner;

public class JogoDaVelha {
    
    public static boolean ganhaColuna(char[][] tabuleiro) {
        boolean ganha = false;
        for (int i = 0; i < 3; i++) {
            if ((tabuleiro[0][i] == tabuleiro[1][i]) && 
                (tabuleiro[1][i] == tabuleiro[2][i]) && 
                (tabuleiro[0][i] != '-') &&
                (tabuleiro[1][i] != '-') &&
                (tabuleiro[2][i] != '-')) {
                ganha = ganha || true;
            }
            else {
                ganha = ganha || false;
            }
        }
        return ganha;
    }
    
    public static boolean ganhaDiag(char[][] tabuleiro) {
        boolean ganha = false;
        if ((tabuleiro[0][0] == tabuleiro[1][1]) && 
            (tabuleiro[1][1] == tabuleiro[2][2])) {
            ganha = ganha || true;
        } 
        if ((tabuleiro[2][0] == tabuleiro[1][1]) && 
            (tabuleiro[1][1] == tabuleiro[0][2])) {
            ganha = ganha || true;
        }
        return ganha;
    }
    
     public static boolean ganhaLinha(char[][] tabuleiro) {
        boolean ganha = false;
        for (int i = 0; i < 3; i++) {
            if ((tabuleiro[i][0] == tabuleiro[i][1]) && 
                (tabuleiro[i][1] == tabuleiro[i][2]) && 
                (tabuleiro[i][0] != '-') &&
                (tabuleiro[i][1] != '-') &&
                (tabuleiro[i][2] != '-')) {
                ganha = ganha || true;
            }
            else {
                ganha = ganha || false;
            }
        }
        return ganha;
    }
    

    public static void mostraTabuleiro(char[][] tabuleiro) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("%c", tabuleiro[i][j]);
            }
            System.out.println("");
        }
    }
    
    
    
    public static void limpaTabuleiro (char[][] tabuleiro) {
        for (int i = 0; i < tabuleiro.length; i++ ) {
            for (int j = 0; j < tabuleiro[0].length; j++) {
                tabuleiro[i][j] = '-';
            }
        }
    }
    
    public static boolean testaJogada(char[][] tabuleiro, int linha, int coluna ){
        if ((linha >= 0) && (coluna >= 0) && 
            (linha < 3)  && (coluna < 3)  && 
            (tabuleiro[linha][coluna] == '-')) {
            return true;
        } else {
            return false;
        }               
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        char[][] tabuleiro = new char[3][3];
        
        Scanner sc = new Scanner(System.in);
        
        //nome: jogador1 e jogador2,
        //simbolos: x o
        // posições de 0 a 2
        
        limpaTabuleiro(tabuleiro);
        mostraTabuleiro(tabuleiro);
        
        //teste de jogo sem vitorias
        /*
        int linha = 0;
        int coluna = 0;
        do {
            System.out.println("Digite a linha do jogador 1 - x");
            linha = sc.nextInt();
            System.out.println("Digite a coluna do jogador 1 - x");
            coluna = sc.nextInt();       
        } while (!testaJogada(tabuleiro, linha, coluna));
        tabuleiro[linha][coluna] = 'x';
        
        mostraTabuleiro(tabuleiro);
        */
        
        tabuleiro[0][0] = 'x';
        tabuleiro[0][1] = 'x';    
        tabuleiro[0][2] = 'x';
        System.out.println(ganhaColuna(tabuleiro) || 
                           ganhaLinha(tabuleiro) || 
                           ganhaDiag(tabuleiro));
        

        
        
    }
    
}
