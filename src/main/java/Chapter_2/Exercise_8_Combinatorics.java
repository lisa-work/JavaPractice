package Chapter_2;

public class Exercise_8_Combinatorics {
    /* Compute all combinations of the values a, b, and c (each starting from 1 and less than 100)
for which the following formula holds: a^2 + b^2 = c^2. */
    public static void solveQuadratic() {
        for (int a = 1; a < 100; a++) {
            for (int b = 1; b < 100; b++) {
                int c = (int) Math.sqrt(a*a + b*b);
                if (c < 100 && a*a + b*b == c*c) {
                    System.out.println("a= " + a + "b= " + b + "c+ " + c);
                }
            }
        }
    }
    /* Compute all combinations of the values a, b, c, and d (each starting from 1 and less than 100)
for which the following formula holds: a^2 + b^2 = c^2 + d^2. */
    public static void solveCubicEquation() {
        for (int a = 1; a < 100; a++) {
            for (int b = 1; b < 100; b++) {
                for (int c = 1; c < 100; c++) {
                    int value = a*a + b*b - c*c;
                    if (value > 0) {
                        int d = (int) Math.sqrt(value);
                        if (d < 100 && d*d == a*a + b*b - c*c) {
                            System.out.println("a= " + a + "b= " + b + "c= " + c + "d= " + d);
                        }
                    }
                }
            }
        }
    }
}
