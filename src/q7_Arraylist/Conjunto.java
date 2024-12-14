package q7_Arraylist;
import java.util.ArrayList;
public class Conjunto {

    private ArrayList<String> elementos = new ArrayList<>();

//adiciona um novo elemento
    public void addElemento(String elemento) {
        if (elementos.contains(elemento)) {
        } else {
            elementos.add(elemento);
        }
    }
//pega o elemento para a verificação e ve se ele ja foi inserido
    //equals pega o objeto como inteiro(lista toda),e o certo é  ver se aquele objeto esta dentro do array e nao verifivar a lista toda!(contains)
    public void conferirElemento(String elemento) {
        if (elementos.contains(elemento)) {
            System.out.println("elemento presente no conjunto");
        }

    }
//mostra os elementos juntos dos dois conjuntos
    public Conjunto uniao(Conjunto outroConjunto) {
        Conjunto NovoConjunto = new Conjunto();
        for (String elemento : this.elementos) {
            NovoConjunto.addElemento(elemento);
        }
        for (String elemento : outroConjunto.elementos) {
            NovoConjunto.addElemento(elemento);
        }
        return NovoConjunto;
    }

//exibe um conjunto
    public void exibir() {
        System.out.println("Conjunto : " + elementos);
    }

//exibe o que tem de IGUAL nos dois conjuntos
    public Conjunto inter(Conjunto outroConjunto) {
        Conjunto novoConjunto = new Conjunto();
        for (String elemento : this.elementos) {
            //verifica se oq tem no conjunto 1 tem no conjunto 2 e adiciona ao um novoConjunto
            if (outroConjunto.elementos.contains(elemento)) {
                novoConjunto.addElemento(elemento);
            }
        }
        return novoConjunto;
    }

//exibe o que tem no primeiro conjunto e NAO tem no segundo(A-B)
    public Conjunto menos(Conjunto outroConjunto) {
        Conjunto novoConjunto = new Conjunto();
        for (String elemento : this.elementos) {
            //verifica se oq tem no conjunto 1 é diferente do que tem no conjunto 2 e adiciona ao um novoConjunto
            if (!outroConjunto.elementos.contains(elemento)) {
                novoConjunto.addElemento(elemento);
            }
        }
        return novoConjunto;
    }

}
