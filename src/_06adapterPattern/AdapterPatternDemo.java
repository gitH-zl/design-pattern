package _06adapterPattern;

/**
 * @author ZL
 * @version V1.0
 * @Date 2018年8月24日 上午9:40:52
 */
/**
 * 
 * @author ZL
 * @version V1.0
 * @Date 2018年8月24日 上午9:41:45
 *
 * @Description: 适配器模式，结构型模式
 * 
 *               如何解决：继承或依赖，适配器继承或依赖已有的对象，实现想要的目标接口。
 */
public class AdapterPatternDemo {
	public static void main(String[] args) {
		AudioPlayer audioPlayer = new AudioPlayer();

		audioPlayer.play("mp3", "beyond the horizon.mp3");
		audioPlayer.play("mp4", "alone.mp4");
		audioPlayer.play("vlc", "far far away.vlc");
		audioPlayer.play("avi", "mind me.avi");
	}
}
