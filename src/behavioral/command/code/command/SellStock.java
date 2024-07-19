package behavioral.command.code.command;

import behavioral.command.code.command.abstract_order.Order;
import behavioral.command.code.receiver.Stock;

public class SellStock implements Order {

    private Stock stock;

    public SellStock(Stock stock) {
        this.stock = stock;
    }

    public void execute() {
        stock.sell();
    }

}
