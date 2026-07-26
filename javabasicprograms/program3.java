public class Addition {

    // Function with return value
    int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {

        Addition obj = new Addition();

        int result = obj.add(15, 25);

        System.out.println("Result = " + result);
    }
}
