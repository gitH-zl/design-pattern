package _07bridgePattern;

/**
 * @author ZL
 * @version V1.0
 * @Date 2018年8月29日 下午2:53:34
 */
public class GreenCircle implements DrawAPI {
	@Override
	public void drawCircle(int radius, int x, int y) {
		System.out.println("Drawing Circle[ color: green, radius: " + radius + ", x: " + x + ", " + y + "]");
	}
}
