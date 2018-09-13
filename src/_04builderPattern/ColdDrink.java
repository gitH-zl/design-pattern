package _04builderPattern;

/**
 * @author ZL
 * @version V1.0
 * @Date 2018年8月23日 下午4:58:27
 */
public abstract class ColdDrink implements Item {

	@Override
	public Packing packing() {
		return new Bottle();
	}

	@Override
	public abstract float price();
}
