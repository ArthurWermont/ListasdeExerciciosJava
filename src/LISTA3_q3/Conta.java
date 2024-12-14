package LISTA3_q3;

public abstract class Conta {

    protected double saldo;

    public Conta(double saldo){
        this.saldo=saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


    //PODE TER MAIS DE UM TRY CATCH
    public void sacar(double pegar) {
        try {
            if (pegar < 0) {
                throw new IllegalArgumentException("Valor de saque deve ser positivo.");
            }
            if (pegar > saldo) {
                throw new IllegalArgumentException("Saque inválido: saldo insuficiente.");
            }
            saldo -= pegar; // Subtrai o valor do saldo
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage()); // Exibe a mensagem de erro
        }
    }


    public void depositar(double adicionar) {
        //USANDO TRY CATCH
        try {
            if (adicionar <= 0) {
                throw new IllegalArgumentException("Valor de depósito deve ser positivo e diferente de zero!"); // Lança uma exceção se o valor não for positivo que EU criei.
            }
            saldo += adicionar; // Adiciona o valor ao saldo atual
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage()); // Exibe a mensagem de erro
        }
    }


    public double obterSaldo(){
        return saldo;
    }

}