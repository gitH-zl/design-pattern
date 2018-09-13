package _15commandPattern;

/**
 * @author ZL
 * @version V1.0
 * @Date 2018年8月30日 上午10:48:52
 */
public class SellStock implements Order {
	private Stock abcStock;

	public SellStock(Stock abcStock) {
		this.abcStock = abcStock;
	}

	public void execute() {
		abcStock.sell();
	}
}
