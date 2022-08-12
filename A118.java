import java.util.Scanner;

public class A118 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String regex = "[AOYEUIaoyeui]";
        s = s.replaceAll(regex, "").toLowerCase();
        char[] chars = s.toCharArray();
        StringBuilder result = new StringBuilder();
        for (char ch : chars) {
            result.append(".").append(ch);
        }
        System.out.println(result.toString());
    }
}
