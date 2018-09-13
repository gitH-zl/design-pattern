package _12flyweightPattern;

/** 
 * @author         ZL
 * @version        V1.0  
 * @Date           2018年8月29日 下午5:31:27
*/
import java.util.HashMap;

public class ShapeFactory {
	private static final HashMap<String, Shape> circleMap = new HashMap<>();

	public static Shape getCircle(String color) {
		Circle circle = (Circle) circleMap.get(color);

		if (circle == null) {
			circle = new Circle(color);
			circleMap.put(color, circle);
			System.out.println("Creating circle of color : " + color);
		}
		return circle;
	}
}
