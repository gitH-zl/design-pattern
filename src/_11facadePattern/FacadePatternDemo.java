package _11facadePattern;

/**
 * @author ZL
 * @version V1.0
 * @Date 2018年8月29日 下午5:21:47
 */
public class FacadePatternDemo {
	public static void main(String[] args) {
		ShapeMaker shapeMaker = new ShapeMaker();

		shapeMaker.drawCircle();
		shapeMaker.drawRectangle();
		shapeMaker.drawSquare();
	}
}
