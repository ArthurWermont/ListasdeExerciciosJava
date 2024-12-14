package LISTA3_q8;

import LISTA3_q7.Aluno;

import java.util.HashMap;
import java.util.Scanner;
public class TesteMapaAluno {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        HashMap<String, Aluno> mapaDealunos = new HashMap<>();

        System.out.println("Coloque a matricula do aluno 1:");
        String mat1=teclado.nextLine();
        Aluno aluno1 = new Aluno(mat1,"Arthur",8.5,"Ciencias da Computação");

        System.out.println("Coloque a matricula do aluno 2:");
        String mat2=teclado.nextLine();
        Aluno aluno2 = new Aluno(mat2, "Maria", 8.5, "Engenharia Civil");

        System.out.println("Coloque a matricula do aluno 3:");
        String mat3=teclado.nextLine();
        Aluno aluno3 = new Aluno(mat3, "Paulo", 6.5, "História");

        System.out.println("Coloque a matricula do aluno 4:");
        String mat4=teclado.nextLine();
        Aluno aluno4 = new Aluno(mat4, "Leon", 10.0, "Jornalismo");

        System.out.println("Coloque a matricula do aluno 5:");
        String mat5=teclado.nextLine();
        Aluno aluno5 = new Aluno(mat5, "Tânia", 9.3, "Psicologia");

        mapaDealunos.put(aluno1.getMatricula(),aluno1);
        mapaDealunos.put(aluno2.getMatricula(),aluno2);
        mapaDealunos.put(aluno3.getMatricula(),aluno3);
        mapaDealunos.put(aluno4.getMatricula(),aluno4);
        mapaDealunos.put(aluno5.getMatricula(),aluno5);

        for(String matricula:mapaDealunos.keySet()){
            Aluno aluno = mapaDealunos.get(matricula);
            aluno.ExibirasInformçoes();
        }

        System.out.println("\nDigite a matricula do aluno que voce deseja achar: ");
        String MatriculaBuscar  = teclado.nextLine();

        Aluno alunoBuscar = mapaDealunos.get(MatriculaBuscar);
        try {
            if (alunoBuscar != null) {
                alunoBuscar.ExibirasInformçoes();
            } else {
                throw new IllegalArgumentException("Aluno nao encontrado!");
            }
        } catch (Exception e) {//O catch (Exception e) ainda está presente para capturar quaisquer outras exceções que possam ocorrer.
            System.out.println("Ocorreu um erro: "+e.getMessage());
        }

    }
}
