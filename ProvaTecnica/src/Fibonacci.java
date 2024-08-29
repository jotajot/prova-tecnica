import java.util.Scanner;

//Preferi colocar cada questão em uma classe para serem melhor analisados os códigos e executados um por um.
// Questão 1 - Sequência de Fibonacci
public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um número: ");
        int numero = scanner.nextInt();

        if (Fibonaccivalida(numero)) {
            System.out.println("O número " + numero + " é da sequência de Fibonacci.");
        } else {
            System.out.println("O número " + numero + " não é da sequência de Fibonacci.");
        }

        scanner.close();
    }

    public static boolean Fibonaccivalida(int n) {
        if (n < 0) {
            return false;
        }
        int a = 0, b = 1;
        while (b < n) {
            int temporaria = a;
            a = b;
            b = a + temporaria;
        }
        return (b == n || a == n);
    }
}
