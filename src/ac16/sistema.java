package ac16;

import java.util.ArrayList;
import java.util.Scanner;

public class sistema {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Autor a1 = new Autor();
        ArrayList<Livro> listaLivros = new ArrayList<>();

        System.out.println("Digite o nome do autor: ");
        a1.setNome(teclado.nextLine());

        System.out.println("Digite o CPF do autor: ");
        a1.setCpf(teclado.nextLine());

        System.out.println("Quantos livros deseja cadastrar? ");
        int numero = teclado.nextInt();
        teclado.nextLine(); 

        for (int x = 0; x < numero; x++) {
            Livro l = new Livro();

            System.out.printf("Qual o nome do %d° livro: ", (x + 1));
            l.setNome(teclado.nextLine());

            System.out.printf("Qual o numero de paginas do %d° livro: ", (x + 1));
            l.setPaginas(teclado.nextInt());
            teclado.nextLine(); 

            System.out.printf("Qual a descrição do %d° livro: ", (x + 1));
            l.setDescricao(teclado.nextLine());

            listaLivros.add(l);
        }

        a1.setLivros(listaLivros);

        System.out.printf("O autor %s tem os seguintes livros:\n", a1.getNome());
        for (Livro l : a1.getLivros()) {
            System.out.println("================================");
            System.out.println("Título: " + l.getNome());
            System.out.println("Número de páginas: " + l.getPaginas());
            System.out.println("Descrição: " + l.getDescricao());
        }

        
    }
}
