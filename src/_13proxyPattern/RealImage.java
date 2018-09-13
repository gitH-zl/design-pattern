package _13proxyPattern;

/**
 * @author ZL
 * @version V1.0
 * @Date 2018年8月30日 上午9:44:13
 */
public class RealImage implements Image {

	private String fileName;

	public RealImage(String fileName) {
		this.fileName = fileName;
		loadFromDisk(fileName);
	}

	@Override
	public void display() {
		System.out.println("Displaying " + fileName);
	}

	private void loadFromDisk(String fileName) {
		System.out.println("Loading " + fileName);
	}
}
