import java.util.Scanner;
public class ReverseString {
    public static void main(String[] args) {
    String s ="vishranti";
    StringBuilder sb = new StringBuilder();
    sb.append(s);
    System.out.println( "String is : "+sb);
    sb.reverse();
   System.out.println("Reversed string is : "+sb);
  }
}