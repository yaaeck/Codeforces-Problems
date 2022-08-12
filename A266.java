import java.util.Scanner;

public class A266 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String colors = scanner.next();
        int result = 0;
        for (int i = 0; i < n; i++) {
            if (i + 1 >= colors.length()) break;
            if (colors.charAt(i) == colors.charAt(i + 1)) result++;
        }
        System.out.println(result);
    }
}
