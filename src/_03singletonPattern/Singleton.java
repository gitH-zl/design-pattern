package _03singletonPattern;

/**
 * 
 * @ClassName: Singleton.java
 * @Description: 一般情况下，不建议使用第 1 种和第 2 种懒汉方式，建议使用第 3 种饿汉方式。
 * 
 * @author ZL
 * @version V1.0
 * @Date 2018年8月23日 下午4:11:49
 */
public class Singleton {
	private static Singleton instance;

	private Singleton() {
	}

	/**
	 * 
	 * @author ZL
	 * @Date 2018年8月23日 下午4:21:39
	 * @Description: 懒汉式，线程不安全
	 * @throws @param:
	 * @return: Singleton
	 */
	public static Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}

	/**
	 * 
	 * @author ZL
	 * @Date 2018年8月23日 下午4:19:46
	 * @Description: 懒汉式，线程安全
	 * @throws @param:
	 * @return: Singleton
	 */
	public static synchronized Singleton getInstance1() {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}

	/**
	 * 
	 * @author ZL
	 * @Date 2018年8月23日 下午4:23:58
	 * @Description: 饿汉式，线程安全
	 * @throws @param:
	 * @return
	 * @return: Singleton
	 */
	public static Singleton getInstance2() {
		return instance;
	}

	/**
	 * 
	 * @author ZL
	 * @Date 2018年8月23日 下午4:27:16
	 * @Description: 双检锁/双重校验锁（DCL，即 double-checked locking）
	 * @throws @param:
	 * @return
	 * @return: Singleton
	 */
	private volatile static Singleton singleton;

	public static Singleton getSingleton() {
		if (singleton == null) {
			synchronized (Singleton.class) {
				if (singleton == null) {
					singleton = new Singleton();
				}
			}
		}
		return singleton;
	}
	/**
	 * 
	 * @author         ZL
	 * @version        V1.0  
	 * @Date           2018年8月23日 下午4:31:21 
	 *
	 * @Description:   登记式/静态内部类
	 */
	private static class SingletonHolder {
		private static final Singleton INSTANCE = new Singleton();
	}

	public static final Singleton getInstance3() {
		return SingletonHolder.INSTANCE;
	}
}
