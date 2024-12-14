package LISTA3_q7;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
       /* Aluno aluno1 = new Aluno("00004", "Arthur", 9.4, "Ciências da Computação");
        Aluno aluno2 = new Aluno("00001", "Leon", 10.0, "Jornalismo");
        Aluno aluno3 = new Aluno("00009", "Roberto", 7.8, "Direito");
        Aluno aluno4 = new Aluno("00002", "Maria", 8.5, "Engenharia Civil");
        Aluno aluno5 = new Aluno("00007", "José", 9.0, "Arquitetura");
        Aluno aluno6 = new Aluno("00006", "Fernanda", 7.2, "Biomedicina");
        Aluno aluno7 = new Aluno("00008", "Carlos", 8.8, "Física");
        Aluno aluno8 = new Aluno("00010", "Luana", 9.5, "Matemática");
        Aluno aluno9 = new Aluno("00003", "Paulo", 6.5, "História");
        Aluno aluno10 = new Aluno("00005", "Tânia", 9.3, "Psicologia");*/

        CadastroAluno listaDeCadastros = new CadastroAluno();

        for(int i=0; i<10;i++){
            System.out.print("Digite a matrícula do aluno " + (i + 1) + ": ");
            String matricula = teclado.nextLine();

            System.out.print("\nDigite o nome do aluno " + (i + 1) + ": ");
            String nome = teclado.nextLine();

            double ira = 0.0; // Inicializa o IRA em 0.
            boolean entradaValida = false; // Controle de entrada válida

            // Loop até obter um IRA válido
            while (entradaValida==false) {
                try {
                    System.out.print("\nDigite o IRA do aluno " + (i + 1) + ": ");
                    ira = Double.parseDouble(teclado.nextLine()); // Tenta converter a entrada
                    entradaValida = true; // Sai do loop se a conversão for bem-sucedida
                } catch (NumberFormatException e) {
                    System.out.println("Erro: Valor inválido para IRA. Tente novamente.");
                } catch (Exception e) {
                    System.out.println("Ocorreu um erro inesperado: "+e.getMessage() );
                }
            }

            /*// Consome a nova linha deixada pelo nextDouble()
            teclado.nextLine();*/

            System.out.println("\nDigite o curso do aluno " + (i + 1) + ": ");
            String curso = teclado.nextLine();

            Aluno aluno = new Aluno(matricula,nome,ira,curso);
            listaDeCadastros.addAluno(aluno);
        }

        listaDeCadastros.imprimirTodosAlunos();
        System.out.println("---------------------------------------------------");
        System.out.println("A seguir os alunos estarão ordenados por matricula:");
        System.out.println(" ");

        listaDeCadastros.ordenarPorMatricula();

        listaDeCadastros.imprimirTodosAlunos();


    }
}
