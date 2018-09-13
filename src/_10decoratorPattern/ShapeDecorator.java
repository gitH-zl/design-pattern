package _10decoratorPattern;

/**
 * @author ZL
 * @version V1.0
 * @Date 2018年8月29日 下午5:04:17
 */
public abstract class ShapeDecorator implements Shape {
	protected Shape decoratedShape;

	public ShapeDecorator(Shape decoratedShape) {
		this.decoratedShape = decoratedShape;
	}

	@Override
	public void draw() {
		decoratedShape.draw();
	}
}
