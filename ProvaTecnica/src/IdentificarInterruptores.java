// Questão 5 - Problema das lâmpadas
public class IdentificarInterruptores {

    public static void main(String[] args) {
        boolean[] lampadas = {false, false, false};

    // Manipula os valores para referente a cada lâmpada aqui:
        lampadas[0] = true;
        esperar(10);

        lampadas[0] = false;
        lampadas[1] = true;
        esperar(2);

        lampadas[1] = false;
        verificarLampadas(lampadas);
    }

    private static void esperar(int minutos) {
        try {
            Thread.sleep(minutos * 1000);
        } catch (InterruptedException e) {
            System.out.println("Erro ao simular o tempo.");
        }
    }

    private static void verificarLampadas(boolean[] lampadas) {
        System.out.println("Verificando o estado das lâmpadas:");
        for (int i = 0; i < lampadas.length; i++) {
            if (lampadas[i]) {
                System.out.println("Lâmpada " + (i + 1) + " está acesa.");
            } else {
                System.out.println("Lâmpada " + (i + 1) + " está apagada.");
            }
        }
    }
}
