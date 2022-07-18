package exercicio03;

public class mainFatorial {

    public static void main(String[] args) {

        int calcFatorial = fatorial(5);
        System.out.println(calcFatorial);
    }

    private static int fatorial(int num) {
        if (num == 0) {
            return 1;
        }
        return num * fatorial(num - 1);
    }

}
