

public class Produto {
    private String nome;
    private int preco;
    private Data dataValidade;

    public Produto(String nome, int preco, Data dataValidade) {
        this.nome = nome;
        this.preco = preco;
        this.dataValidade = dataValidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    public Data getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(Data validade) {
        this.dataValidade = validade;
    }

    public String toString() {
        return "Produto: " + nome + "Preço: " + preco;
    }

    public boolean estaVencido(Data dataAtual) {
        return dataValidade.compareTo(dataAtual) < 0;

    }
}
