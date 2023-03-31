/**
 * @author "Hemmerson Luis Barros da Rosa"
 * on date 24/03/2023
 */
public class Produto {
    String descricao;
    double valor;

    /**
     * Método que retorna uma String com os dados de produtos cadastrados
     * @return descricao e valor do produto
     */
    String dados() {
        return "Descrição: " + descricao + "\n" +
                "Valor: " + String.format("R$ %.2f", valor)+"\n";
    }
}
