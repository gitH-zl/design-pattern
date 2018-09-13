package _13proxyPattern;

/**
 * @author ZL
 * @version V1.0
 * @Date 2018年8月30日 上午9:45:04
 */
public class ProxyImage implements Image {

	private RealImage realImage;
	private String fileName;

	public ProxyImage(String fileName) {
		this.fileName = fileName;
	}

	@Override
	public void display() {
		if (realImage == null) {
			realImage = new RealImage(fileName);
		}
		realImage.display();
	}
}
