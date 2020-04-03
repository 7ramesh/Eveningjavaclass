package collection;
import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {
		Map map=new HashMap();
		map.put(1, "Ram");
		map.put(3,"Hari");//3 is dublicate value
		map.put(3,"Binup");
		//System.out.println(map.isEmpty());
		
		if(!map.isEmpty()) {
			for(int i=1; i<=map.size();i++) {
				System.out.println(map.get(3));//map is accessed through key
			}
		}
		if(!map.containsKey(0)) {
			for(int i=0;i<=map.size();i++) {
				System.out.println(map.get(i));
			}
		}
		System.out.println(map.containsKey(0));

	}

}
