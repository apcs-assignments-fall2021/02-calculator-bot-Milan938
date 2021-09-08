import java.util.Scanner;

public class MyMain {

    // Calculates the median of the three inputs
    public static int median(int a, int b, int c) {
        if (a > b && a > c || a < b && a > c) {
            return a;
        }
        else if (b > a && b < c || b > c && b < a) {
            return b;
        }
        else if (c > a && c < b || c < a && c > b) {
            return c;
        }
        return 0;
    }

    // Returns the input with the larger absolute value
    public static int magnitude(int a, int b) {
        if (Math.abs(a) > Math.abs(b)) {
            return a;
        }
        else if (Math.abs(b) > Math.abs(a)) {
            return b;
        }
        return 0;
    }


    // Returns the "c" value from the Pythagorean theorem "a^2 + b^2 = c^2",
    // where "a" and "b" are the inputs to the method
    public static double pythagoras(int a, int b) {
        double y = a*a;
        double z = b*b;
        double k = (y + z);
        double u = (Math.sqrt(k));
        return u;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Which command would you like to carry out? ");
        String answer = scan.next();
        if (answer.equals("median")) {
            System.out.print("What's the first number? ");
            int h = scan.nextInt();
            System.out.print("What's the second number? ");
            int j = scan.nextInt();
            System.out.print("What's the third number? ");
            int k = scan.nextInt();
            System.out.print(median(h, j, k));
        }
        if (answer.equals("magnitude")) {
            System.out.print("What's the first number? ");
            int z = scan.nextInt();
            System.out.print("What's the second number? ");
            int x = scan.nextInt();
            System.out.print(magnitude(z, x));
        }
        if (answer.equals("pythagoras")) {
            System.out.print("What's the first number? ");
            int i = scan.nextInt();
            System.out.print("What's the second number? ");
            int o = scan.nextInt();
            System.out.print(pythagoras(i, o));
        }
    }
}
