//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");  // sträng
        System.out.println(7);               // heltal
        System.out.println(8);               // heltal
        System.out.println(3.1415);          // decimaltal
        System.out.println('A');             // char eller ett tecken
        System.out.println(true);            // boolean
        System.out.println(false);           // boolean
        System.out.println("false");         // sträng

        System.out.println();
        System.out.println("============");
        System.out.println("Variabler");

        int age = 25;
        double price = 19.99;
        char grade = 'A';
        String name = "Kalle";
        boolean isStudent = true;
        System.out.println("============");
        System.out.println(age);
        System.out.println(price);
        System.out.println(grade);
        System.out.println(name);
        System.out.println(isStudent);

        System.out.println("============");
        System.out.println("old age: " + age);
        age = 29;
        System.out.println("new age: " + age);

        System.out.println("============");
        System.out.println("Typer");
        System.out.println("============");

        System.out.println("Name innehåller: " + name);
        System.out.println(((Object) name));
        System.out.println(((Object) name).getClass());
        System.out.println(((Object) name).getClass().getName());

        System.out.println("============");

        System.out.println(((Object) age).getClass().getName());
        System.out.println(((Object) price).getClass().getName());
        System.out.println(((Object) grade).getClass().getName());
        System.out.println(((Object) isStudent).getClass().getName());


        System.out.println("============");


    }
}
