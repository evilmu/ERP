public class Soma {
    public static void main(String[] args) {
        int INDICE = 12;
        int SOMA = 0;
        int K = 0; // Inicie K com 0

        while (K < INDICE) {
            K = K + 1;
            SOMA = SOMA + K;
        }
        System.out.println(SOMA); // O valor de SOMA será 78.
    }
}
