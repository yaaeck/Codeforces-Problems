import java.util.Scanner;

public class A69 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arrayX = new int[n];
        int[] arrayY = new int[n];
        int[] arrayZ = new int[n];
        int current = 0;
        for (int i = 0; i < n; i++) {
            arrayX[current] = scanner.nextInt();
            arrayY[current] = scanner.nextInt();
            arrayZ[current] = scanner.nextInt();
            current++;
        }

        int resultX = 0;
        for (int i : arrayX)
            resultX += i;

        int resultY = 0;
        for (int i : arrayY)
            resultY += i;

        int resultZ = 0;
        for (int i : arrayZ)
            resultZ += i;

        if (resultX == 0 && resultY == 0 && resultZ == 0)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
