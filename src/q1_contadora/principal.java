package q1_contadora;
import java.util.Scanner;
public class principal {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);

        Metodos valor1 = new Metodos();//criando uma nova variavel tipo Metodo

        int teste;//criando a variavel teste para ser o "prompt"

        System.out.print("coloque o valor 1: ");

        teste=teclado.nextInt();//o valor que vier aqui vai la pro set do valor1.

        System.out.println(" o valor 1 é: "+  valor1.setValor(teste));//mostra o valor que veio da variavel teste

        valor1.Incrementar();
        System.out.println("o valor incrementado é: "+valor1.getValor());//aqui vai mostar ele incrementado

        valor1.Zerar();
        System.out.println("o valor zerado é: "+valor1.getValor());//aqui vai mostrar ele zerado

    }

}