public class Produto {
    public String nome;
    public double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void calcularDesconto(double porcentagem) {
        porcentagem = (preco * (porcentagem/100));
        preco = (preco + porcentagem);
        System.out.println("O valor do produto com desconto é de:" + preco);
    }
}
