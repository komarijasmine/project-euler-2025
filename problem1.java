public class problem1 {

    public static void main(String[] args) {
        int finalSum = findSum();
        System.out.println(finalSum);
    }

    public static int findSum() {
        int sum = 0;
        for (int i = 1; i < 1000; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }
        return sum;
    }
}