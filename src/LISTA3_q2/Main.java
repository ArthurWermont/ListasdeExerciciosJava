package LISTA3_q2;

public class Main {
    public static void main(String[] args) {
        AreaCalculavel [] testes = new AreaCalculavel[5];

        testes[0]= new Quadrado(4);
        testes[1]= new Retangulo(10,20);
        testes[2]= new Circulo(8);
        testes[3]= new Quadrado(10);
        testes[4]= new Retangulo(2,30);


        //getClass para puxar a classe e o getSimpleName para mostrar o nome(simples) da classe
        for(int i = 0; i < testes.length; i++){
            try {
                // Aqui tentamos calcular a área e imprimir
                System.out.println("Forma: " + testes[i].getClass().getSimpleName() + ". Sua área é = " + testes[i].calculaArea());
            } catch (Exception e) {
                // Se ocorrer uma exceção, imprimimos uma mensagem de erro
                //PERGUNTAR PARA O TEACHER PQ NAO CONSIGO VER??
                System.out.println("ISSO NAO PODE NAO VIUNNN");
                System.out.println("Erro: " + e.getMessage());
            }
        }
    }
}
