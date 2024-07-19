package behavioral.command.code;

import behavioral.command.code.command.BuyStock;
import behavioral.command.code.command.SellStock;
import behavioral.command.code.invoker.Broker;
import behavioral.command.code.receiver.Stock;

public class CommandPatternDemo {
    public static void main(String[] args) {
        Stock stock = new Stock();

        BuyStock buyStockOrder = new BuyStock(stock);
        SellStock sellStockOrder = new SellStock(stock);

        Broker broker = new Broker();
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(sellStockOrder);

        broker.placeOrders();
    }
}