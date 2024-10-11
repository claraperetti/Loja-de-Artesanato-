public class Tinta extends Produto {

    public Tinta(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public void calcularDesconto(double porcentagem) {
        super.calcularDesconto(porcentagem);
        porcentagem = (preco * (porcentagem/100));
        preco = (preco + porcentagem);
    }
}
