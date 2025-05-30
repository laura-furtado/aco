package ac20;

public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso("101", "Programação Orientada a Objetos");

        Aluno a1 = new Aluno("2023001", "Alice");
        Aluno a2 = new Aluno("2023002", "Bruno");
        Aluno a3 = new Aluno("2023001", "Carlos"); 

        curso.adicionarAluno(a1);
        curso.adicionarAluno(a2);
        boolean added = curso.adicionarAluno(a3); 

        System.out.println("Alunos no curso:");
        curso.listarAlunos();

        System.out.println("\nBuscando aluno com matrícula 2023001:");
        Aluno encontrado = curso.buscarAluno("2023001");
        System.out.println(encontrado != null ? encontrado : "Aluno não encontrado");

        System.out.println("\nRemovendo aluno 2023002:");
        curso.removerAluno("2023002");

        System.out.println("\nLista atualizada de alunos:");
        curso.listarAlunos();

        System.out.println("\nTentando adicionar Carlos (matrícula duplicada): " + (added ? "Adicionado" : "Já existe"));
    }
}
