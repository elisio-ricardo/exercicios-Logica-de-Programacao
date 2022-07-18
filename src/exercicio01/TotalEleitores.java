package exercicio01;

public class TotalEleitores {

    public double percentualEleitoresValidos(double totalEleitores, double eleitoresValidos) {
        return (eleitoresValidos / totalEleitores) * 100;
    }

    public double percentualEleitoresEmBranco(double totalEleitores, double eleitoresEmBranco) {
        return (eleitoresEmBranco / totalEleitores) * 100;
    }

    public double percentualVotosNulos(double totalEleitores, double votosNulos) {
        return (votosNulos / totalEleitores) * 100;
    }

}
