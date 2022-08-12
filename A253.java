import java.util.Scanner;

public class A253 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrix = new int[5][5];
        int startI = 0;
        int startJ = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = scanner.nextInt();
                if (matrix[i][j] == 1) {
                    startI = i;
                    startJ = j;
                }
            }
        }
        int result = 0;
        while (startI != 2 || startJ != 2) {
            if (startI < 2) {
                startI++;
                result++;
            } else if (startI > 2) {
                startI--;
                result++;
            }
            if (startJ < 2) {
                startJ++;
                result++;
            } else if (startJ > 2) {
                startJ--;
                result++;
            }
        }
        System.out.println(result);
    }
}
