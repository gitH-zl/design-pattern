package _05prototypePattern;

/**
 * @author ZL
 * @version V1.0
 * @Date 2018年8月23日 下午5:26:14
 */
public class Rectangle extends Shape {

	public Rectangle() {
		this.type = "Rectangle";
	}

	@Override
	public void draw() {
		System.out.println("Inside Rectangle::draw() method.");
	}
}
