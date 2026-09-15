public class LogicalOperators {
    public static void main(String[] args) {
        System.out.println("Logiska operationer");

        // kommetar som sträcker sig över en rad

        /*
        && and och
        || or eller
        ! not inte
         */

        System.out.println(true);
        System.out.println(!true);
        System.out.println(false);
        System.out.println(!false);

        System.out.println("-- AND --");
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(true && !false);

        System.out.println("-- OR --");
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(!true || false);

    }
}

