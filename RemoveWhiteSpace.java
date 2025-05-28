public class RemoveWhiteSpace {
    public static void main(String[] args) {
        String str = "  Hello World  ";
        String noSpaceStr = str.replaceAll("\\s", "");
        System.out.println("Original String: " + str);
        System.out.println("String without spaces: " + noSpaceStr);
    }
}