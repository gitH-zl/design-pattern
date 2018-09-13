package _03singletonPattern;

/**
 * 单例类必须给所有其他对象提供 自己创建自己的唯一实例.
 * 
 * 主要解决：一个全局使用的类频繁地创建与销毁
 * 
 * 关键代码：构造函数是私有的
 * 
 * @author ZL
 * 
 *         懒汉式，线程不安全
 */
public class SingletonPatternDemo {
	public static void main(String[] args) {

		// 不合法的构造函数
		// 编译时错误：构造函数 SingleObject() 是不可见的
		// SingleObject object = new SingleObject();

		// 获取唯一可用的对象
		SingleObject object = SingleObject.getInstance();

		// 显示消息
		object.showMessage();
	}
}