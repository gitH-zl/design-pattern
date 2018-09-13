package _07bridgePattern;

/**
 * @author ZL
 * @version V1.0
 * @Date 2018年8月29日 下午2:52:59
 */
public class RedCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: red, radius: " + radius + ", x: " + x + ", " + y + "]");
    }

    public void gg() {
        String string1 = new String("zhangliang");
        if (string1.isEmpty()) {
            System.out.println("nizhenshige");
        } else {
            System.out.println("nizhenhao");
        }
    }
}
