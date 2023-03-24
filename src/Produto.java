/**
 * @author "Hemmerson Luis Barros da Rosa"
 * on date 24/03/2023
 */
public class Produto {
    String descricao;
    double valor;

    String dados() {
        return "Descrição: " + descricao + "\n" +
                "Valor: " + String.format("R$ %.2f", valor)+"\n";
    }
}
