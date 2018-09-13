package _15commandPattern;

/**
 * @author ZL
 * @version V1.0
 * @Date 2018年8月30日 上午10:51:57
 */
public class CommandPatternDemo {
	public static void main(String[] args) {
		Stock abcStock = new Stock();

		BuyStock buyStockOrder = new BuyStock(abcStock);
		SellStock sellStockOrder = new SellStock(abcStock);

		Broker broker = new Broker();
		broker.takeOrder(buyStockOrder);
		broker.takeOrder(sellStockOrder);

		broker.placeOrders();
	}
}
