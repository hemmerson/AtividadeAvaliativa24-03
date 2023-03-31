/**
 * @author "Hemmerson Luis Barros da Rosa"
 * on date 24/03/2023
 */
public class Item {
    int quantidade;
    Produto produto;

    double total(){
        return (quantidade * produto.valor);
    }

    String dados(){
        return produto.dados()+
                "Quantidade: "+quantidade+"\n"+
                "Total: "+String.format("R$ %.2f", total())+"\n" +
                "------------------------\n";
    }

}
