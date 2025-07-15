public class problem9 {

        // Change MAX to whatever value required
    private static final int MAX = 1000;

    public static void main(String[] args) {
        triplet();
    }

    public static void triplet() {
        int a, b, c;

        for (a = 1; a < MAX; a++) {
            for (b = a; b < MAX; b++) {
                for (c = b; c < MAX; c++) {
                    if((Math.pow(a, 2) + Math.pow(b, 2)) == Math.pow(c, 2)) {
                        if (a + b + c == 1000) {
                            System.out.println("A = " + a + " B = " + b + " C = " + c);
                            System.out.println("product: " + a * b * c);
                        }

                    }
                }
            }
        }
    }

}

