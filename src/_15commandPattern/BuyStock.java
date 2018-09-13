package _15commandPattern;

/**
 * @author ZL
 * @version V1.0
 * @Date 2018年8月30日 上午10:48:28
 */
public class BuyStock implements Order {
	private Stock abcStock;

	public BuyStock(Stock abcStock) {
		this.abcStock = abcStock;
	}

	public void execute() {
		abcStock.buy();
	}
}
