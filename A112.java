import java.util.Locale;
import java.util.Scanner;

public class A112 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String first = scanner.nextLine().toLowerCase();
        String second = scanner.nextLine().toLowerCase();
        int result = first.compareTo(second);
        if (result > 0) System.out.println(1);
        else if (result < 0) System.out.println(-1);
        else System.out.println(result);
    }
}
