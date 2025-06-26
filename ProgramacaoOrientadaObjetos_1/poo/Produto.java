import java.util.ArrayList;
import java.util.List;

// Depois de um ano com ótimos resultados, uma empresa de comércio de produtos alimentícios decidiu que era hora de expandir e optou por iniciar a construção de um sistema para controle de seus produtos e emissão de nota fiscal. Para atendermos a necessidade deste cliente, será necessário:

// Criar uma classe chamada Produto com as propriedades:
// codigo: público do tipo string, que será usado para armazenar o identificador único dos produtos;
// precoUnitario: público do tipo double, que armazenará o valor unitário do produto com até duas casas decimais;
// quantidade: público do tipo inteiro, que terá a informação de quantidade do produto que está sendo comprado;
// Criar um construtor que receba o valor das propriedades acima, respeitando a sequência: codigo, precoUnitario e quantidade.

// Criar uma classe chamada NotaFiscal com as propriedades:

// Produtos: privado do tipo List<Produto>, que armazenará os produtos vendidos em uma determinada compra;
// Agora que definimos quais entidades serão necessárias para essa versão, precisamos atribuir alguns comportamentos para elas. Para isso, considere as premissas a seguir:

// Na classe NotaFiscal deverá existir um método chamado adicionarProduto que receba como parâmetro um objeto Produto. O método deve adicionar o produto recebido na lista de produtos da nota fiscal. Este método não deve ter retorno.
// Também deverá ser possível remover um produto adicionado na lista de produtos. Para isso, crie o método removerProdutos que receba como parâmetro o código do produto a ser removido. Este método não deve ter retorno.
// Para facilitar o trabalho do caixa da empresa, precisamos disponibilizar um método chamado calcularValorProduto. Este método deverá retornar o valor total do produto recebido via parâmetro. Para chegar ao resultado do valor, considere a equação: precoUnitario * quantidade. O retorno do método deverá ser o resultado do cálculo apresentado anteriormente (o resultado poderá ser decimal).
// Para concluir a compra e apresentar o valor final para o cliente, precisaremos criar um método chamado calcularValorNotaFiscal, que deverá retornar o valor total de todos os itens da nota.

class Produto {
    public String codigo;
    public double precoUnitario;
    public int quantidade;

    public Produto(String codigo, double precoUnitario, int quantidade) {
        if (quantidade < 0) {
            throw new IllegalArgumentException("Quantidade não pode ser menor que zero");
        }
        this.codigo = codigo;
        this.precoUnitario = precoUnitario;
        this.quantidade = quantidade;
    }
}

class NotaFiscal {
    private List<Produto> produtos;

    public NotaFiscal() {
        this.produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        this.produtos.add(produto);
    }

    public void removerProdutos(String codigo) {
        this.produtos.removeIf(produto -> produto.codigo.equals(codigo));
    }

    public double calcularValorProduto(Produto produto) {
        return produto.precoUnitario * produto.quantidade;
    }

    public double calcularValorNotaFiscal() {
        double total = 0;
        for (Produto produto : produtos) {
            total += calcularValorProduto(produto);
        }
        return total;
    }
}