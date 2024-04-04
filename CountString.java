import java.util.HashMap;
import java.util.Map;
public class CountString {
	public static void main(String[] args)
	{

		// Declaring the String
		String str = "This is a count string program";
		// Declaring a HashMap of <String, Integer>
		Map<String, Integer> hashMap = new HashMap<>();

		String[] words = str.split(" ");

		for (String word : words) {
			Integer integer = hashMap.get(word);

			if (integer == null)
				// Storing the word as key and its
				// occurrence as value in the HashMap.
				hashMap.put(word, 1);

			else {
				// Incrementing the value if the word
				// is already present in the HashMap.
				hashMap.put(word, integer + 1);
			}
		}
		System.out.println(hashMap);
	}
	

}
