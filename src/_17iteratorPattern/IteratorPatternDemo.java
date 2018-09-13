package _17iteratorPattern;

import java.util.HashSet;
import java.util.Set;

/**
 * @author ZL
 * @version V1.0
 * @Date 2018年8月30日 上午11:17:50
 */
public class IteratorPatternDemo {

	public static void main(String[] args) {
		NameRepository namesRepository = new NameRepository();
		Set<String> ss = new HashSet<String>();
		for (Iterator iter = namesRepository.getIterator(); iter.hasNext();) {
			String name = (String) iter.next();
			System.out.println("Name : " + name);
		}
	}
}
