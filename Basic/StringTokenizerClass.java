import java.util.*;
public class StringTokenizerClass {
	public static void main(String[] args) {
	StringTokenizer str1 =
             new StringTokenizer("Hello Geeks How are you", " ");
        while (str1.hasMoreTokens())
            System.out.println(str1.nextToken());
	}
}