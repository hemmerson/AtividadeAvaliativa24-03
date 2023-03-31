import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 * @author "Hemmerson Luis Barros da Rosa"
 * on date 24/03/2023
 */
public class Venda {
    LocalDateTime data;
    ArrayList<Item> item;

    double total(){
        double total = 0;
        for (Item i:item) {
            total += i.total();
        }
        return total;
    }

    String dados(){
        String itens="";
        for (Item i:item) {
            itens = itens+i.dados();
        }
        return "Data: "+data.getDayOfMonth()+"/"+data.getMonthValue()+"/"+data.getYear()+"\n"+
                "Hora: "+data.getHour()+":"+data.getMinute()+"\n" +
                "------------------------\n"+
                itens+"\n"+
                "Total Venda: "+String.format("R$ %.2f",total());
    }
}
