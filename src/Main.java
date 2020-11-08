import java.util.Scanner;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Enter the string: ");

        letterCount(s);
        chekPalindrom(s);
    }

    private static void letterCount(Scanner s) {
        String text = s.next();
        HashMap<Character, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            int cnt = 0;
            if (map.get(ch) != null) {
                cnt = map.get(ch);
            }

            cnt++;
            map.put(ch, cnt);
        }
        for (Iterator<Character> it = map.keySet().iterator(); it.hasNext(); ) {
            Character key = it.next();
            System.out.print(key + "" + map.get(key));
        }
    }

    private static void chekPalindrom(Scanner s) {
        String a, b = "";

        a = s.nextLine();
        int n = a.length();
        for (int i = n - 1; i >= 0; i--) {
            b = b + a.charAt(i);
        }
        if (a.equalsIgnoreCase(b)) {
            System.out.println("The string is palindrome.");
        } else {
            System.out.println("The string is not palindrome.");
        }
    }
}
