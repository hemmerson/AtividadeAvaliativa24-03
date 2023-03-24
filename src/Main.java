import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 * @author "Hemmerson Luis Barros da Rosa"
 * on date 24/03/2023
 */
public class Main {
    public static void main(String[] args) {
        Venda venda1 = new Venda();
        Item item1 = new Item();
        Item item2 = new Item();
        Item item3 = new Item();
        Item item4 = new Item();
        Item item5 = new Item();

        Produto produto1 = new Produto();
        Produto produto2 = new Produto();
        Produto produto3 = new Produto();
        Produto produto4 = new Produto();
        Produto produto5 = new Produto();

        produto1.descricao = "Caneta";
        produto1.valor = 2.90;
        produto2.descricao = "Lápis";
        produto2.valor = 1.10;
        produto3.descricao = "Caderno";
        produto3.valor = 30.00;
        produto4.descricao = "Livro";
        produto4.valor = 112.90;
        produto5.descricao = "Mochila";
        produto5.valor = 79.99;

        item1.quantidade = 20;
        item1.produto = produto1;
        item2.quantidade = 20;
        item2.produto = produto2;
        item3.quantidade = 20;
        item3.produto = produto3;
        item4.quantidade = 20;
        item4.produto = produto4;
        item5.quantidade = 20;
        item5.produto = produto5;

        venda1.data = LocalDateTime.now();
        venda1.item = new ArrayList<Item>();
        venda1.item.add(item1);
        venda1.item.add(item2);
        venda1.item.add(item3);
        venda1.item.add(item4);
        venda1.item.add(item5);
        System.out.println(venda1.dados());

    }
}
