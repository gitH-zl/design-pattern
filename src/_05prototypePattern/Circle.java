package _05prototypePattern;

/**
 * @author ZL
 * @version V1.0
 * @Date 2018年8月23日 下午5:28:23
 */
public class Circle extends Shape {

	public Circle() {
		this.type = "Circle";
	}

	@Override
	public void draw() {
		System.out.println("Inside Circle::draw() method.");
	}
}
