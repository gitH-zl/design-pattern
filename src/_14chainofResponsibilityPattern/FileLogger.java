package _14chainofResponsibilityPattern;

/**
 * @author ZL
 * @version V1.0
 * @Date 2018年8月30日 上午10:13:52
 */
public class FileLogger extends AbstractLogger {

	public FileLogger(int level) {
		this.level = level;
	}

	@Override
	protected void write(String message) {
		System.out.println("File::Logger: " + message);
	}
}
