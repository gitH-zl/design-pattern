package _15commandPattern;

/**
 * @author ZL
 * @version V1.0
 * @Date 2018年8月30日 上午10:46:52
 */
public class Stock {

	private String name = "ABC";
	private int quantity = 10;

	public void buy() {
		System.out.println("Stock [ Name: " + name + ", Quantity: " + quantity + " ] bought");
	}

	public void sell() {
		System.out.println("Stock [ Name: " + name + ", Quantity: " + quantity + " ] sold");
	}
}
