public class Main {
    public static void main(String[] args) {

        Estoque estoque =  new Estoque();

        Produto tintaRosa = new Tinta("Tinta Rosa", 10.00);
        Produto tintaAzul= new Tinta("Tinta Azul", 12.00);
        Produto pincelGrande = new Pincel("Pincel tamanho grande", 8.00);
        Produto pincelPequeno = new Pincel("Pincel tamanho pequeno", 5.00);

        estoque.adicionarProduto(tintaRosa);
        estoque.adicionarProduto(tintaAzul);
        estoque.adicionarProduto(pincelGrande);
        estoque.adicionarProduto(pincelPequeno);

        System.out.println("Preço das tintas com desconto: R$");
        estoque.exibirPrecosComDesconto(5);

        System.out.println("Preço dos pincéis com desconto: R$");
        estoque.exibirPrecosComDesconto(10);
    }
}