package exercicio02;

public class testeBoubleSort {

    public static void main(String[] args) {

        int[] vetor = {5, 3, 2, 4, 7, 1, 0, 6};
        int aux;


        for (int i = 0; i < vetor.length - 1; i++) {
            for (int j = i + 1; j < vetor.length; j++) {
                if (vetor[i] > vetor[j]) {
                    aux = vetor[i];
                    vetor[i] = vetor[j];
                    vetor[j] = aux;
                }
            }
        }

        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ~ ");
        }

    }
}
