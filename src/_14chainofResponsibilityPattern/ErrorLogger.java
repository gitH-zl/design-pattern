package _14chainofResponsibilityPattern;

/**
 * @author ZL
 * @version V1.0
 * @Date 2018年8月30日 上午10:08:46
 */
public class ErrorLogger extends AbstractLogger {

	public ErrorLogger(int level) {
		this.level = level;
	}

	@Override
	protected void write(String message) {
		System.out.println("Error Console::Logger: " + message);
	}
}
