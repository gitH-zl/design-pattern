package _08filterPattern;

/** 
 * @author         ZL
 * @version        V1.0  
 * @Date           2018年8月29日 下午3:09:17
*/
import java.util.List;

public interface Criteria {
	public List<Person> meetCriteria(List<Person> persons);
}
