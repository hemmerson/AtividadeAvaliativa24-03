/**
 * @author "Hemmerson Luis Barros da Rosa"
 * on date 24/03/2023
 */
public class Item {
    double quantidade;
    Produto produto;

    double total(){
        return (quantidade * produto.valor);
    }

    String dados(){
        return produto.dados()+
                "Quantidade: "+quantidade+"\n"+
                "Total: "+total()+"\n";
    }

}
