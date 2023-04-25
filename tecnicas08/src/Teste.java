public class Teste {
    public static void main(String... args) throws Exception {
        Vetor vetor = new Vetor(5);
        try {
            vetor.adiciona("item 1");
            vetor.adiciona("item 2");
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(vetor.tamanho());

        System.out.println(vetor.busca(1));
    }
}
