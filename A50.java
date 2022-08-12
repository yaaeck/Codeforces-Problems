import java.util.Scanner;

public class A50 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int M = scanner.nextInt();
        int N = scanner.nextInt();
        int S = M * N;
        System.out.println(S / 2);
    }
}
