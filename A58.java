
//58A - ЧАТ

import java.util.Scanner;

public class A58 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] chars = scanner.nextLine().toCharArray();
        char[] hello = {'h', 'e', 'l', 'l', 'o'};
        int count = 0;

        for (int i = 0; i < chars.length; i++) {
            if (count == hello.length) break;
            if (chars[i] == hello[count])
                count++;
        }

        if (count == hello.length)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
