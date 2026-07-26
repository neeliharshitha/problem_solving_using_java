public class Factorial {

    int findFactorial(int n) {

        int fact = 1;

        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }

        return fact;
    }

    public static void main(String[] args) {

        Factorial obj = new Factorial();

        int result = obj.findFactorial(5);

        System.out.println("Factorial = " + result);
    }
}
