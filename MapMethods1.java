package MapMethods;
import java.util.*;
public class MapMethods1 {

	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<>();
		map.put("Apple", 1);
		map.put("Bananan", 2);
		map.put("Cherry", 3);
		//Retriew a value
		System.out.println("Value of apple is "+ map.get("Apple"));
		//Check if key exists
		System.out.println("Contains Banana: "+map.containsKey("Bamana"));
        //Checking if value exist
		System.out.println("Contains value 3 : "+map.containsValue(3));
	    //Printing all Keys and values
		Set s = map.entrySet();
		Iterator i = s.iterator();
		while(i.hasNext()) {
			Map.Entry m=(Map.Entry)i.next(); 
			System.out.println(m.getKey()+":"+m.getValue());}
		// Print all keys
        System.out.println("Keys:");
        for (String key : map.keySet()) {
            System.out.println(key);
        }

        // Print all values
        System.out.println("Values:");
        for (Integer value : map.values()) {
            System.out.println(value);
        }
	//Remove a key - value pair
        map.remove("Cherry");
        System.out.println("Map after removing Cherry: " + map);

        // Check if map is empty
        System.out.println("Map is empty: " + map.isEmpty());

        // Get the size of the map
        System.out.println("Map size: " + map.size());

        // Clear the map
        map.clear();
        System.out.println("Map after clearing: " + map);
	
	}

}
