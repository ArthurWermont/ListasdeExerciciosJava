package LISTA3_q3;
import java.util.Scanner;
public class TestaTributavel {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

         ContaCorrente contaCorrente = new ContaCorrente(1000);
         SeguroDeVida SegurodeVida = new SeguroDeVida();
         ContaPoupanca contaPoupanca = new ContaPoupanca(2000);


        System.out.println("quanto voce quer depositar na conta corrente? ");
        double add=teclado.nextDouble();
        contaCorrente.depositar(add);
        if(add>0) {
            System.out.println("o saldo agora da conta depois de adicionar " + add + " reais é: " + contaCorrente.obterSaldo());
        }else{
            System.out.println("A conta continua com o valor anterior: "+contaCorrente.obterSaldo()+"\n");
        }

        System.out.println("quanto voce quer sacar na conta corrente? ");
        double tirar=teclado.nextDouble();
        contaCorrente.sacar(tirar);
        System.out.println("o saldo agora da conta depois de sacar "+tirar+" reais é: "+contaCorrente.obterSaldo());
        System.out.println("os tributos da conta corrente é: "+ contaCorrente.calculaTributos());

        double contacorrentecomTRIBUTOS = contaCorrente.obterSaldo()-contaCorrente.calculaTributos();
        System.out.println("o saldo da conta apos tirar os tributos da conta corrente é: "+(contacorrentecomTRIBUTOS));

        System.out.println("---------------------------------------");
        System.out.println("---------------------------------------");

        System.out.println("o tributo do seguro de vida (uma taixa fixa): "+ SegurodeVida.calculaTributos());
        double saldcomTRIBUTOSdescontados=contacorrentecomTRIBUTOS-SegurodeVida.calculaTributos();
        System.out.println("o saldo da conta apos a retirada da taixa fixa do seguro de vida: "+saldcomTRIBUTOSdescontados);

        System.out.println("---------------------------------------");
        System.out.println("---------------------------------------");

        System.out.println("O saldo da poupança é: "+contaPoupanca.obterSaldo());

        System.out.println("quanto voce quer sacar da poupança? ");
        double saldoAntes = contaPoupanca.obterSaldo();
        double tirarPoup=teclado.nextDouble();
        contaPoupanca.sacar(tirarPoup);
        if(tirarPoup<saldoAntes && tirarPoup>=0) {//corrigir
            System.out.println("O saldo da poupança apos sacar " + tirarPoup + " reais é: " + contaPoupanca.obterSaldo());
        }else{
            System.out.println("O saldo continua o mesmo: "+contaPoupanca.obterSaldo());
        }
    }

}