public class VowelConsonantCount {
    public static void main(String[] args) {
        String sentence = "Welcome to Java";
        int vowels = 0, consonants = 0;
        String lowerSentence = sentence.toLowerCase();

        for (int i = 0; i < lowerSentence.length(); i++) {
            char ch = lowerSentence.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels++;
            } else if ((ch >= 'a' && ch <= 'z')) {
                consonants++;
            }
        }

        System.out.println("Number of vowels: " + vowels);
        System.out.println("Number of consonants: " + consonants);
    }
}