import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException, Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int x, y;

        while (true) {
            String input = br.readLine();
            String[] parts = input.split(" ");

            x = Integer.parseInt(parts[0]);
            y = Integer.parseInt(parts[1]);

            if (x == 0 && y == 0) {
                break;
            }

            System.out.printf("%d\n", x + y);
        }
    }
}