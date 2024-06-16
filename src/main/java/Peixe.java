public class Peixe {
    private String nome;
    private double tamanho;

    public Peixe(String nome, double tamanho) {
        this.nome = nome;
        this.tamanho = tamanho;
    }

    // Getters e Setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }
}