import java.util.Arrays;
import java.util.Scanner;
import java.util.StringJoiner;

public class A339 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] strings = s.split("\\+");
        int[] ints = new int[strings.length];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = Integer.parseInt(strings[i]);
        }
        Arrays.sort(ints);
        StringJoiner joiner = new StringJoiner("+");
        for (int i : ints) {
            joiner.add(String.valueOf(i));
        }
        System.out.println(joiner.toString());
    }
}
