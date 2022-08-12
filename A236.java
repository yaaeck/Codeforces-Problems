import java.util.*;

public class A236 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        Set<Character> set = new TreeSet<>();
        for (char ch : s.toCharArray()) {
            set.add(ch);
        }
        if (set.size() % 2 == 1) {
            System.out.println("IGNORE HIM!");
        } else {
            System.out.println("CHAT WITH HER!");
        }
    }
}
