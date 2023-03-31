/**
 * @author "Hemmerson Luis Barros da Rosa"
 * on date 24/03/2023
 */
public class Item {
    int quantidade;
    Produto produto;

    /**
     * Método que retorna o valor do item, de acordo com a quantidade
     * e o valor do produto
     * @return valor total do item
     */
    double total(){
        return (quantidade * produto.valor);
    }

    /**
     * Método que retorna uma String com os dados de itens cadastrados
     * @return dados da classe Produto com a quantidade e valor do item
     */
    String dados(){
        return produto.dados()+
                "Quantidade: "+quantidade+"\n"+
                "Total: "+String.format("R$ %.2f", total())+"\n" +
                "------------------------\n";
    }

}
