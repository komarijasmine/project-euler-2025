public class problem4 {

    public static void main(String[] args) {

        System.out.println(palindrome());

    }

    public static int palindrome() {

        int p = -1;
        int answer = -1;

        for (int x = 100; x <= 999; x++) {

            for (int y = 100; y <= 999; y++) {

                p = x * y;
                String trial = Integer.toString(p);

                String a = new StringBuilder(trial).reverse().toString();

                if (trial.equals(a)) {
                    if (p > answer) {
                    answer = p;
                    }
                }

            }
        }

        return answer;
    }

}