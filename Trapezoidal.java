import java.util.*;

public class Trapezoidal {
    public static float f1(float a) {
        float x;
        x = 1 / (1 + a * a);
        return x;
    }

    public static void main(String args[]) {
        System.out.println("Enter n ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        float a = 0, b = 1, h, sum = 0, total;
        // Memory allocation of array x and y;
        float x[] = new float[n + 1];
        float y[] = new float[n + 1];
        h = (b - a) / n;
        for (int i = 0; i <= n; i++) {
            x[i] = a + h * i;
            y[i] = f1(x[i]);
        }
        for (int i = 1; i < n; i++) {
            sum = sum + y[i];
        }
        total = (h / 2) * ((y[0] + y[n]) + 2 * sum);
        System.out.println("Value is " + total);
    }
}
