public class Relaceoccurance {
    public static void main(String[] args) {
        String str = "Hello World";
        char oldChar = 'l';
        char newChar = 'a';

        String newStr = str.replace(oldChar, newChar);
        System.out.println("Original String: " + str);
        System.out.println("Modified String: " + newStr);
    }
}