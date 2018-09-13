package _04builderPattern;

/**
 * @author ZL
 * @version V1.0
 * @Date 2018年8月23日 下午4:59:33
 */
public class VegBurger extends Burger {

	@Override
	public float price() {
		return 25.0f;
	}

	@Override
	public String name() {
		return "Veg Burger";
	}
}
