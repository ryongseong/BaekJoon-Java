import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String m = br.readLine();
        String[] parts = m.split("");

        int a, b, c, d;
        a = n * Integer.parseInt(parts[2]);
        b = n * Integer.parseInt(parts[1]);
        c = n * Integer.parseInt(parts[0]);
        d = n * Integer.parseInt(m);

        StringBuilder sb = new StringBuilder();
        sb.append(a).append("\n");
        sb.append(b).append("\n");
        sb.append(c).append("\n");
        sb.append(d).append("\n");
        System.out.print(sb.toString());
    }
}