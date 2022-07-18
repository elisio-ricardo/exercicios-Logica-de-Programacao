package exercicio04;

public class mainSomaMultiplosTresECinco {

    public static void main(String[] args) {

        //Usando Do/while
        int aux;
        int totalSoma = 0;
        int num = 10;

        do {
            if (num % 3 == 0 | num % 5 == 0) {
                totalSoma += num;
            }

            num -= 1;
        } while (num != 0);

        System.out.println("Usando Do/While " + totalSoma);



        //Usando Fatorial
        int soma = SomandoPares(10);
        System.out.println("Usando Fatorial " + soma);

    }

    private static int SomandoPares(int num) {

        if (num == 0) {
            return 0;
        }
        if (num % 3 == 0 || num % 5 == 0) {
            return num + SomandoPares(num - 1);
        }
        return SomandoPares(num - 1);
    }
}
