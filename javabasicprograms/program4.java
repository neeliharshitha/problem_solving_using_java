public class Square {

    int findSquare(int number) {
        return number * number;
    }

    public static void main(String[] args) {

        Square obj = new Square();

        int square = obj.findSquare(5);

        System.out.println("Square = " + square);
    }
}
