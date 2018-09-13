package _05prototypePattern;

/**
 * @author ZL
 * @version V1.0
 * @Date 2018年8月23日 下午5:27:57
 */
public class Square extends Shape {

	public Square() {
		this.type = "Square";
	}

	@Override
	public void draw() {
		System.out.println("Inside Square::draw() method.");
	}
}
