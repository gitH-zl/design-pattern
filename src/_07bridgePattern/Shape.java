package _07bridgePattern;

/**
 * @author ZL
 * @version V1.0
 * @Date 2018年8月29日 下午2:54:05
 */
public abstract class Shape {
	protected DrawAPI drawAPI;

	protected Shape(DrawAPI drawAPI) {
		this.drawAPI = drawAPI;
	}

	public abstract void draw();
}
