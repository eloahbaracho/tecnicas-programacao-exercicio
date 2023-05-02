package com.company;

public class Teste {
    public Teste() {
    }
    public static void main(String... args) throws Exception {
        Vetor vetor = new Vetor(5);

        try {
            vetor.adiciona("item 1");
            vetor.adiciona("item 2");
        } catch (Exception var3) {
            var3.printStackTrace();
        }

        System.out.println(vetor.tamanho());
        System.out.println(vetor.busca(1));

        System.out.println(vetor.novabusca("item 1"));
    }
}


