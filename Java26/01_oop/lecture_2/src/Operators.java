public class Operators {
    public static void main(String[] args) {
        System.out.println("Operatorer");

        System.out.println(10 + 5); // addition
        System.out.println(10 - 5); // subtraktion
        System.out.println(10 * 5); // multiplikation
        System.out.println(10 / 5); // Division
        System.out.println("Modulus");
        System.out.println(10 % 5); // Modulus
        System.out.println(10 % 3);
        System.out.println(11 % 3);
        System.out.println(12 % 3);


        /*
        == lika med
        != inte lika med
        > större än
        < mindre än
        >= större eller lika med
        <= mindre eller lika med
         */

        System.out.println("Jämförelseoperationer");
        boolean isEqual = (5 == 5);
        boolean isNotEqual = (5 != 4);
        boolean isGreaterThan = (5 > 3);
        boolean isLesser = (3 < 5);
        boolean isGreatOrEqual = (5 >= 5);
        boolean isLesserOrEqual = (3 <= 5);

        System.out.println(isEqual);
        System.out.println(isNotEqual);
        System.out.println(isGreaterThan);
        System.out.println(isLesser);
        System.out.println(isGreatOrEqual);
        System.out.println(!isLesserOrEqual);
        System.out.println("----");
        System.out.println(isEqual);
        isEqual = (5 == 4);
        System.out.println(isEqual);

    }
}
