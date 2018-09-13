package _04builderPattern;

/**
 * @author ZL
 * @version V1.0
 * @Date 2018年8月23日 下午4:55:21
 */
public abstract class Burger implements Item {

	@Override
	public Packing packing() {
		return new Wrapper();
	}

	@Override
	public abstract float price();
}
