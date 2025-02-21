abstract class Contribuinte {

    String nome;
    double rendaAnual;

    public Contribuinte(String nome, double rendaAnual) {
        this.nome = nome;
        this.rendaAnual = rendaAnual;
    }

    public abstract double calcularImposto();

    public String getNome() {
        return nome;
    }
}
