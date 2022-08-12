import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class A282 {
    static StringBuilder incrementX = new StringBuilder("++X");
    static StringBuilder decrementX = new StringBuilder("--X");

    public static void main(String[] args) {
        int result = 0;
        try (BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in))) {
            int N = Integer.parseInt(consoleReader.readLine());
            for (int i = 0; i < N; i++) {
                String operation = consoleReader.readLine();
                if (operation.equals(incrementX.toString()) ||
                        operation.equals(incrementX.reverse().toString()))
                    result++;
                if (operation.equals(decrementX.toString()) ||
                        operation.equals(decrementX.reverse().toString()))
                    result--;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(result);
    }
}
