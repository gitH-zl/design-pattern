package _06adapterPattern;

/**
 * @author ZL
 * @version V1.0
 * @Date 2018年8月24日 上午9:31:22
 */
public class VlcPlayer implements AdvancedMediaPlayer {
	@Override
	public void playVlc(String fileName) {
		System.out.println("Playing vlc file. Name: " + fileName);
	}

	@Override
	public void playMp4(String fileName) {
		// 什么也不做
	}
}
