package exercicio01;

public class TestesMain {

    public static void main(String[] args) {
        double totalDeEleitores = 1000;
        double votosValidos = 800;
        double votosBrancos = 150;
        double votosNulos = 50;

        TotalEleitores percentual = new TotalEleitores();

        System.out.println("votos validos " + percentual.percentualEleitoresValidos(totalDeEleitores, votosValidos) + "%");
        System.out.println("Votos em Branco " + percentual.percentualEleitoresEmBranco(totalDeEleitores, votosBrancos) + "%");
        System.out.println("Votos Nulos " + percentual.percentualVotosNulos(totalDeEleitores, votosNulos) + "%");
    }
}
