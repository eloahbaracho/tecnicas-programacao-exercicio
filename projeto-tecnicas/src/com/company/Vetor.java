package com.company;

import java.util.Arrays;

public class Vetor {
    private String[] elementos;
    private int tamanho;

    public Vetor(int capacidade) {
        this.elementos = new String[capacidade];
        this.tamanho = 0;
    }

    public int tamanho() {
        return this.tamanho;
    }

    public void adiciona(String elemento) throws Exception {
        this.aumentarVetor();
        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            ++this.tamanho;
        } else {
            throw new Exception("O vetor está cheio,não é possível adicionar novos elementos");
        }
    }

    public String toString() {
        return Arrays.toString(this.elementos);
    }

    public String busca(int posicao) throws Exception {
        if (posicao >= 0 && posicao < this.tamanho) {
            return this.elementos[posicao];
        } else {
            throw new Exception("Posição inválida");
        }
    }

    public int novabusca(String elemento) throws Exception {
        for(int i = 0; i < tamanho; i++) {
            if(elementos[i].equalsIgnoreCase(elemento)) {
                return i;
            }
        }
        return -1;
    }

    public boolean adicionarInicio(int posicao, String elemento) throws Exception {
        if (posicao >= 0 && posicao < tamanho) {
            for (int i = this.tamanho - 1; i > posicao - 1; i--) {
                this.elementos[i + 1] = this.elementos[i];
            }

            this.elementos[posicao] = elemento;
            this.tamanho++;
        } else {
            throw new Exception("Posição inválida");
        }
        return true;
    }
    private void aumentarVetor(){
        if (this.tamanho == this.elementos.length) {
            String[] elementosNovos = new String[this.elementos.length * 2];
            for (int i=0; i<this.elementos.length; i++) {
                elementosNovos[i] = this.elementos[i];
            }
            this.elementos = elementosNovos;
        }
    }

    public void remover (int posicao) throws Exception{
        if(posicao >=0 && posicao < tamanho) {
            for (int i = posicao; i<this.tamanho-1; i++) {
                this.elementos[i] = this.elementos[i+1];
            }
            this.tamanho--;
        } else {
            throw new Exception("Posição Inválida");
        }
    }
    
}
