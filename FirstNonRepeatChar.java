import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatChar {

    public static Character findFirstNonRepeated(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }

        Map<Character, Integer> charCounts = new LinkedHashMap<>();

        for (char c : str.toCharArray()) {
            charCounts.put(c, charCounts.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : charCounts.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        return null; 
    }

    public static void main(String[] args) {
        String input = "hhello";
        Character result = findFirstNonRepeated(input);

        if (result != null) {
            System.out.println("First non-repeated character: " + result);
        } else {
            System.out.println("No non-repeated character found.");
        }
    }
}