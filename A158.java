import java.util.Scanner;

public class A158 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] ints = new int[n];
        for (int i = 0; i < n; i++) {
            ints[i] = scanner.nextInt();
        }
        int minPoints = ints[k - 1];
        int result = 0;
        for (int i = 0; i < ints.length; i++)
            if (ints[i] >= minPoints && ints[i] > 0) result++;
        System.out.println(result);
    }
}
