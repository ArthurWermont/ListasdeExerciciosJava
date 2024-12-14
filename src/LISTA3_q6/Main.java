package LISTA3_q6;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        ConjuntoDePalavras conjunto = new ConjuntoDePalavras();
        Scanner teclado = new Scanner(System.in);

        System.out.println("Coloque uma ou mais palavras para verificar se já estão no conjunto:");
        System.out.println("Para mais de uma palavra, escreva separadas por espaço!");

        String palavrasAnalisar = teclado.nextLine();
        //String palavrasAnalisar = null;//<--se a entrada for nula chama o primeiro if
        try {                               // palavrasAnalisar.isEmpty() se a string não contém nenhum caractere, ou seja, se sua largura é 0.
            if (palavrasAnalisar == null || palavrasAnalisar.equals("")) {
                throw new IllegalArgumentException("A entrada não pode ser nula ou vazia.");
            } else {
                //Chama o metodo para verificar se as palavras estão no conjunto
                boolean resultado = conjunto.contemTodas(palavrasAnalisar);
                if (resultado==true) {
                    System.out.println("Palavra(s) contida(s) no conjunto!");
                } else {
                    System.out.println("Palavra(s) não contida(s) no conjunto!");
                }
            }
            System.out.println("-----------------------------------------------");
            conjunto.ExibirPalvras();
        } catch (Exception e) {
            System.out.println("Ocorreu um Erro: "+e.getMessage());
        }
    }
}

