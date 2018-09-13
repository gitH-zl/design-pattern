package _04builderPattern;

/**
 * @author ZL
 * @version V1.0
 * @Date 2018年8月23日 下午5:00:37
 */
public class ChickenBurger extends Burger {

	@Override
	public float price() {
		return 50.5f;
	}

	@Override
	public String name() {
		return "Chicken Burger";
	}
}
