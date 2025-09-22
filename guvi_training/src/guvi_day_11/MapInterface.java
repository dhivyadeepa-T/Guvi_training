package guvi_day_11;
import java.util.HashMap;
public class MapInterface {
public static void main(String[]args) {
	HashMap<Integer,String>map=new  HashMap<>();
	map.put(1,"apple");
	map.put(2,"pineapple");
	map.put(3,"greenapple");
	map.put(4,"mango");
	map.put(5,"watermelon");
	map.put(6,"Jackfruit");
	map.put(1,"Custedapple");
	System.out.println(map);
	System.out.println("value of 5 "+map.get(5));
	System.out.println("Remove value of 5 "+map.remove(5));
	System.out.println("After Remove value of 5 "+map);
	System.out.println("contain value of 4 "+map.containsKey(4));
	System.out.println("contain value of 6 "+map.containsValue("Jackfruit"));
	System.out.println("After contain value of 4&6 "+map);
	System.out.println("keys "+map.keySet());
	System.out.println("size "+map.size());
	System.out.println("values "+map.values());
	System.out.println("value isEmpty "+map.isEmpty());
}
}
