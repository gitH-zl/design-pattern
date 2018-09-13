package _10decoratorPattern;

/**
 * @author ZL
 * @version V1.0
 * @Date 2018年8月29日 下午5:02:33
 */
public class Circle implements Shape {

	@Override
	public void draw() {
		System.out.println("Shape: Circle");
	}
}
