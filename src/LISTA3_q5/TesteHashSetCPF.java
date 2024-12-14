package LISTA3_q5;

import java.util.HashSet;
import java.util.Scanner;
public class TesteHashSetCPF {
    public static void main(String[] args) {
        HashSet<String>CPFS=new HashSet<>();
        Scanner teclado = new Scanner(System.in);

        System.out.println("coloque até 10 CPFS para serem apresentados! ");
        System.out.println("--------------------------------------------------------------- ");
        while (CPFS.size()<10) {
            System.out.println("Adicione o CPF(somente numeros)");
            String colocar = teclado.nextLine();


            try {
            	/*if (!colocar.matches("\\d{11}")) {
                    throw new IllegalArgumentException("CPF deve conter 11 dígitos numéricos.");
                }*/

                if (CPFS.contains(colocar)) {
                    System.out.println("cpf ja inserido! pode nao viunnn,tente novamente! ");
                } else {
                    CPFS.add(colocar);
                    System.out.println("CPF adionado com SUCESSO!");

                }
            } catch (Exception e) {
                System.out.println("Ocorreu um erro: "+e.getMessage());
                System.out.println("Tente novamente");
            }
        }
        System.out.println("------------------");
        System.out.println("CPFS A SEGUIR: ");

        //esse "colocar" nao é o mesmo de la de cima;
        //perguntar sobre esse elemento colocar,cpf e tal desse for.
        for(String colocar:CPFS){
            System.out.println("CPF:"+colocar);
        }

    }
}
