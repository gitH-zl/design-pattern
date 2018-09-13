package _14chainofResponsibilityPattern;

/**
 * @author ZL
 * @version V1.0
 * @Date 2018年8月30日 上午10:08:15
 */
public class ConsoleLogger extends AbstractLogger {

	public ConsoleLogger(int level) {
		this.level = level;
	}

	@Override
	protected void write(String message) {
		System.out.println("Standard Console::Logger: " + message);
	}
}
