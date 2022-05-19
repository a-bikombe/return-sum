package ReturnSumTest;

public class ReturnSumTest {

    public static void main(String[] args) {
        int one = 5, two = 10;
        int total = sum(one, two);
        printStatement(one, two);
        System.out.println(total);
    }

    public static int sum(int one, int two) {
        int result;
        result = one + two;
        return result;
    }

    public static void printStatement(int one, int two) {
        System.out.printf("one %d and two %d\n", one, two);    // printf prints in this format

    }
}
