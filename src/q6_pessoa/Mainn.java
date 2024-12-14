
package q6_pessoa;

import java.util.Scanner;

public class Mainn {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Criar mãe
        System.out.print("Digite o nome da mãe: ");
        String nomeMae = teclado.nextLine();
        Pessoa mae = new Pessoa(nomeMae);

        // Criar pai
        System.out.print("Digite o nome do pai: ");
        String nomePai = teclado.nextLine();
        Pessoa pai = new Pessoa(nomePai);

        // Criar filho 1
        System.out.print("Digite o nome do primeiro filho: ");
        String nomeFilho1 = teclado.nextLine();
        Pessoa filho1 = new Pessoa(nomeFilho1, pai, mae);

        // Criar filho 2
        System.out.print("Digite o nome do segundo filho: ");
        String nomeFilho2 = teclado.nextLine();

        System.out.print("Digite o nome da mae do segundo filho: ");
        String nomemaeFilho2 = teclado.nextLine();
        Pessoa maeFilho2 = new Pessoa(nomemaeFilho2);

        Pessoa filho2 = new Pessoa(nomeFilho2, pai, maeFilho2);

        // Verificar igualdade
        boolean saoIguais = filho1.Igualdade(filho2);
        System.out.println("Os filhos são iguais? ");
        if(saoIguais==true){
            System.out.println("Sim!");
        }else{
            System.out.println("Não!");
        }

    }
}
