import java.util.Arrays;

public class Vetor {
    private String[] elementos;
    private int tamanho;

    public Vetor (int capacidade) {
        this.elementos = new String[capacidade];
        this.tamanho = 0;
    }

    public int tamanho() {
        return this.tamanho;
    }

    public void adiciona(String elemento)throws Exception{
        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
        } else {
            throw new Exception("O vetor está cheio," + "não é possível adicionar novos elementos");
        }

    }
    public String toString() {
        return Arrays.toString(elementos);
    }
    public String busca(int posicao) throws Exception {
        if (posicao >= 0 && posicao < tamanho) {
            return elementos[posicao];
        } else throw new Exception("Posição inválida");
    }
}
