package _16interpreterPattern;

/**
 * @author ZL
 * @version V1.0
 * @Date 2018年8月30日 上午11:02:14
 */
public class TerminalExpression implements Expression {

	private String data;

	public TerminalExpression(String data) {
		this.data = data;
	}

	@Override
	public boolean interpret(String context) {
		if (context.contains(data)) {
			return true;
		}
		return false;
	}
}
