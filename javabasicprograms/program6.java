public class Largest {

    int findLargest(int a, int b) {

        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {

        Largest obj = new Largest();

        int largest = obj.findLargest(30, 45);

        System.out.println("Largest = " + largest);
    }
}
