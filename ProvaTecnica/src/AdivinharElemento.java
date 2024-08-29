// Questão 4 - Adivinhar próximo elemento
public class AdivinharElemento {
    public static void main(String[] args) {
        int[] sequencia = {1, 3, 5, 7};
        int proximo = sequencia[sequencia.length - 1] + 2;
        System.out.println("Próximo elemento: " + proximo);

        // Segunda sequência
        int[] sequencia2 = {2, 4, 8, 16, 32, 64};
        int proximo2 = sequencia2[sequencia2.length - 1] * 2;
        System.out.println("Próximo elemento: " + proximo2);

        // Terceira sequência
        int[] sequencia3 = {0, 1, 4, 9, 16, 25, 36};
        int proximo3 = (int) Math.pow(Math.sqrt(sequencia3[sequencia3.length - 1]) + 1, 2);
        System.out.println("Próximo elemento: " + proximo3);

        // Quarta sequência
        int[] sequencia4 = {4, 16, 36, 64};
        int ultimoPar = (int) Math.sqrt(sequencia4[sequencia4.length - 1]);
        int proximoPar = ultimoPar + 2;
        int proximo4 = (int) Math.pow(proximoPar, 2);
        System.out.println("Próximo elemento: " + proximo4);

        // Quinta sequência
        int[] sequencia5 = {1, 1, 2, 3, 5, 8};
        int proximo5 = sequencia5[sequencia5.length - 1] + sequencia5[sequencia5.length - 2];
        System.out.println("Próximo elemento: " + proximo5);

        // Sexta sequência
        int[] sequencia6 = {2, 10, 12, 16, 17, 18, 19};
        int proximo6 = sequencia6[sequencia6.length - 1] + 1;
        System.out.println("Próximo elemento: " + proximo6);
    }
}


