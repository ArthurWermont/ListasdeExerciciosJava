package LISTA3_q6;

import java.util.HashSet;

public class ConjuntoDePalavras {
    HashSet<String>palavras = new HashSet<>();

    public ConjuntoDePalavras(){
        palavras.add("cachorro");
        palavras.add("gato");
        palavras.add("passaro");
        palavras.add("peixe");
        palavras.add("hamster");
        palavras.add("lagarto");
        palavras.add("tartaruga");
    }

    //nao entendi direiro;(
    public boolean contemTodas(String palavraTeclado) {

        String[] palavrasArray = palavraTeclado.split(" "); //PEDIR PRO TEACHER EXPLICARR PELO AMOR DE DEUS.
        for (String palavra : palavrasArray) {
            if (!palavras.contains(palavra)) {
                return false;
            }
        }
        return true;//retorna true se TODAS estiverem dentro do conjunto!
        //porque que tem que ser aqui e nao em um else ou la em cima ??
    }

    public void ExibirPalvras(){
        System.out.println("As palavras do conjunto são: ");
        for(String palavra:palavras){
            System.out.println("-"+palavra);//porque aqui puxa o palavra e nao palavras ??
        }
    }

}
