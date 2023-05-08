package aula0508Exemplo02;

public class Personagem {
    // ATRIBUTOS
    private int vida; // Vida do personagem
    private String nome; // Nome do personagem
    private boolean atacavel = false;

    public Personagem(String nome, int vida) {
        this.nome = nome;
        this.vida = vida;
    }
    
    // MÉTODOS
    public void cumprimentar() {
        System.out.println("Ola, meu nome eh " + this.nome);
    }
}