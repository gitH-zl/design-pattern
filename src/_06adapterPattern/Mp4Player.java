package _06adapterPattern;

/**
 * @author ZL
 * @version V1.0
 * @Date 2018年8月24日 上午9:31:50
 */
public class Mp4Player implements AdvancedMediaPlayer {

	@Override
	public void playVlc(String fileName) {
		// 什么也不做
	}

	@Override
	public void playMp4(String fileName) {
		System.out.println("Playing mp4 file. Name: " + fileName);
	}
}
