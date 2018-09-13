package _07bridgePattern;

/**
 * @author ZL
 * @version V1.0
 * @Date 2018年8月29日 下午2:56:18
 */
public class BridgePatternDemo {
	public static void main(String[] args) {
		Shape redCircle = new Circle(100, 100, 10, new RedCircle());
		Shape greenCircle = new Circle(100, 100, 10, new GreenCircle());

		redCircle.draw();
		greenCircle.draw();
	}
}
