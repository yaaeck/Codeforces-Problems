import java.util.Scanner;

public class A281 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        char first = s.charAt(0);
        if (Character.isUpperCase(first)) System.out.println(s);
        else {
            s = s.substring(1, s.length());
            System.out.println(Character.toString(first).toUpperCase() + s);
        }
    }
}
