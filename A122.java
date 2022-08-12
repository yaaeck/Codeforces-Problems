
//122A - Счастливое деление 1000
//799

import java.util.Scanner;

public class A122 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int copy = n;
        int count = 0;
        while (copy > 0) {
            int digit = copy % 10;
            if (digit == 4 || digit == 7)
                count++;
            copy /= 10;
        }
        boolean happy = (count == String.valueOf(n).length());
        if (n % 4 == 0 || n % 7 == 0 || n % 47 == 0
                || (happy && n % n == 0))
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
