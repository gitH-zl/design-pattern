package _15commandPattern;

/** 
 * @author         ZL
 * @version        V1.0  
 * @Date           2018年8月30日 上午10:50:53
*/
import java.util.ArrayList;
import java.util.List;

public class Broker {
	private List<Order> orderList = new ArrayList<Order>();

	public void takeOrder(Order order) {
		orderList.add(order);
	}

	public void placeOrders() {
		for (Order order : orderList) {
			order.execute();
		}
		orderList.clear();
	}
}
