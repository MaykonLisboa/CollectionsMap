import java.util.HashMap;
import java.util.Map;

public class EstoqueDeProdutosComPreco {
    private Map<Long, Produto> estoqueProdutos;

    public EstoqueDeProdutosComPreco() {
        this.estoqueProdutos = new HashMap<>();
    }
    public void adicionarProduto (long cod, String nome, int quantidade, double preco){
        estoqueProdutos.put(cod, new Produto(nome, quantidade, preco));
    }
    public void exibirProdutos(){
        System.out.println(estoqueProdutos);
    }
    public double calcularValorTotalEstoque(){
        double valorTotalEstoque = 0;
        if (!estoqueProdutos.isEmpty()){
            for (Produto p : estoqueProdutos.values()){
                valorTotalEstoque += p.getQuantidade() * p.getPreco();
            }
        }
        return valorTotalEstoque;
    }
    public Produto obterProdutoMaisCaro(){
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if (!estoqueProdutos.isEmpty()){
            for (Produto p : estoqueProdutos.values()){
                if (p.getPreco() > maiorPreco){
                    maiorPreco = p.getPreco();
                    produtoMaisCaro = p;
                }
            }
        }
        return produtoMaisCaro;
    }
    public Produto obteProdutoMaisBarato(){
        Produto produtoMaisBarato = null;
        double menorPreco = Double.MAX_VALUE;
        if (!estoqueProdutos.isEmpty()){
            for (Produto p : estoqueProdutos.values()){
                if (p.getPreco() < menorPreco){
                    menorPreco = p.getPreco();
                    produtoMaisBarato = p;
                }
            }
        }
        return produtoMaisBarato;        
    }
    public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque() {
        Produto produtoMaiorQuantidadeValor = null;
        double maiorValorTotal = Double.MIN_VALUE;
        
        if (!estoqueProdutos.isEmpty()) {
            for (Produto p : estoqueProdutos.values()) {
                double valorTotalProduto = p.getQuantidade() * p.getPreco();
                if (valorTotalProduto > maiorValorTotal) {
                    maiorValorTotal = valorTotalProduto;
                    produtoMaiorQuantidadeValor = p;
                }
            }
        }
        
        return produtoMaiorQuantidadeValor;
    }
    public static void main(String[] args) {
        EstoqueDeProdutosComPreco estoqueDeProdutos = new EstoqueDeProdutosComPreco();
        estoqueDeProdutos.adicionarProduto(1234, "Guarda-Chuva", 1, 15.00);
        estoqueDeProdutos.adicionarProduto(4235, "Caixa com 30 Buscapé", 3, 32.99);
        estoqueDeProdutos.adicionarProduto(6547, "Arvore de Natal 5m largura 22m altura", 1, 74.90);
        estoqueDeProdutos.adicionarProduto(3578, "Caixa de Coockies Balducco com 50 Coockies", 1, 32.50);
        
        estoqueDeProdutos.exibirProdutos();

        System.out.println("Produto mais caro: "+estoqueDeProdutos.obterProdutoMaisCaro());
        System.out.println("Produto mais barato: "+estoqueDeProdutos.obteProdutoMaisBarato());
        System.out.println("Produto maior quantidade e valor: "+estoqueDeProdutos.obterProdutoMaiorQuantidadeValorTotalNoEstoque());
        System.out.println("Valor Total do Estoque: R$ "+estoqueDeProdutos.calcularValorTotalEstoque());
    }
}
