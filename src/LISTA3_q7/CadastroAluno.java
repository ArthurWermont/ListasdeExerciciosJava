package LISTA3_q7;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;

public class CadastroAluno {
    private List<Aluno>alunos;

    public CadastroAluno(){
        alunos = new ArrayList<>();
    }

    public void addAluno(Aluno aluno){
        alunos.add(aluno);
        System.out.println("\nAluno "+ aluno.getNome()+" cadastrado com sucesso! ");
    }


    //dificil! falta fazer isso-->
    /*public int[] PosiçaoMatricula(Aluno aluno) {
        int  [] receberMat = new int[alunos.size()];
        for(int i = 0; i < alunos.size(); i++) {
            String Matricula = aluno.getMatricula(); // Certifique-se de que Aluno é um objeto ou está acessando corretamente.
            receberMat[i] = Integer.parseInt(Matricula); // Corrigido para usar "parseInt" em minúsculo.

        }
        return receberMat;
    }

    public void OrdenarporMatricula() {
        for(Aluno aluno:alunos ){
            aluno.ExibirasInformçoes();
        }
    }*/

    public void ordenarPorMatricula() {
        Collections.sort(alunos, new Comparator<Aluno>() {
            @Override
            public int compare(Aluno a1, Aluno a2) {
                return a1.getMatricula().compareTo(a2.getMatricula());
            }
        });
        System.out.println("Alunos ordenados por matrícula com sucesso!");
    }


    public void imprimirTodosAlunos(){
        System.out.println("Aqui segue os alunos cadastrados: ");
        for(Aluno aluno:alunos ){
            aluno.ExibirasInformçoes();
        }
    }

}
