package ac20;

import java.util.HashSet;

public class Curso {
    private String id;
    private String nome;
    private HashSet<Aluno> alunos;

    public Curso(String id, String nome) {
        this.id = id;
        this.nome = nome;
        this.alunos = new HashSet<>();
    }

    public boolean adicionarAluno(Aluno aluno) {
        return alunos.add(aluno); 
    }

    public boolean removerAluno(String matricula) {
        return alunos.removeIf(a -> a.getMatricula().equals(matricula));
    }

    public Aluno buscarAluno(String matricula) {
        for (Aluno a : alunos) {
            if (a.getMatricula().equals(matricula)) {
                return a;
            }
        }
        return null;
    }

    public void listarAlunos() {
        if (alunos.isEmpty()) {
            System.out.println("Nenhum aluno cadastrado.");
        } else {
            for (Aluno a : alunos) {
                System.out.println(a);
            }
        }
    }
}
