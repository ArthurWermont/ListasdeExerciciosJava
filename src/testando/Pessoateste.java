package testando;
import java.util.Scanner;
public class Pessoateste {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Pessoa pessoa1 = new Pessoa();
        Irmaomaisnovo novo =new Irmaomaisnovo();
        //implememtação de Dados
        System.out.println("coloque a idade do irmao mais novo de arthur: ");
        novo.setIdade(teclado.nextInt());

        System.out.println("coloque a altura do irmao mais novo de arthur: ");
        novo.setAltura(teclado.nextDouble());

        System.out.println("coloque a matricula na creche do irmao mais novo de arthur: ");
        novo.setMatriculacreche(teclado.nextDouble());
        //mostrando
        novo.mamar();

        System.out.println("a matricula do pivete: "+ novo.getMatriculacreche());
        System.out.println("a altura do pivete: "+ novo.getAltura());
        System.out.println("a altura do pivete: "+ novo.getIdade());

        pessoa1.setAltura(1.70);
        pessoa1.setNome("Arthur Wermont");
        pessoa1.setEndereço("Rua Salvador correia de sa, 615.");
        pessoa1.setIdade(18);
        pessoa1.comer();
    }
}
