public class Principal {
    public static void main(String[] args) {
        long inicio = 1;
        long fim = 100;

        for (long i = inicio; i <= fim; i++) {
            if (i < 2) continue; // 0 e 1 não são primos

            int conta = 0;
            for (long j = i - 1; j >= 2; j--) {
                if (i % j == 0) {
                    conta = 1;   // achou divisor
                    break;       // pode parar
                }
            }

            if (conta == 0) {
                System.out.println("O número " + i + " é primo");
            }
        }
    }
}
