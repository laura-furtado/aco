package ac17;

import java.util.ArrayList;
import java.util.Scanner;

public class Ac17 {
    public static void main(String[] args) {
        String nome, nomeEquipe, cor;
        int idade;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o nome do jogador: ");
        nome = teclado.nextLine();

        System.out.println("Digite a idade do jogador: ");
        idade = teclado.nextInt();
        teclado.nextLine(); 

        System.out.println("Digite o nome da equipe: ");
        nomeEquipe = teclado.nextLine();

        System.out.println("Digite a cor da equipe: ");
        cor = teclado.nextLine();

        Jogador j1 = new Jogador(nome, idade);
        Equipe e1 = new Equipe(nomeEquipe, cor);
        e1.addJogador(j1);
        j1.addEquipe(e1); 
        ArrayList<Equipe> equipes = new ArrayList<>();
        equipes.add(e1);

        System.out.println("\n=== Equipes e seus jogadores ===");
        for (Equipe e : equipes) {
            System.out.println(e.getNome() + " --------------");
            for (Jogador j : e.getJogadores()) {
                System.out.println(j.getNome() + ": " + j.getIdade() + " anos");
            }
        }

        ArrayList<Jogador> jogadores = new ArrayList<>();
        jogadores.add(j1);

        System.out.println("\n=== Jogadores e suas equipes ===");
        for (Jogador j : jogadores) {
            System.out.println(j.getNome() + " --------------");
            for (Equipe e : j.getEquipes()) {
                System.out.println(e.getNome());
            }
        }

    }
}
