public class Main {
    public static void main(String[] args) {

        String bulletIt = "Print a Bulleted List:\n" +
                "\t\u2022 First Point\n" +
                "\t\t\u2022 Sub Point\n";

        System.out.println(bulletIt);

        String textBlock = """
                Print a Bulleted List:
                    \u2022 First Point
                        \u2022 Sub Point""";

        System.out.println(textBlock);

        int age = 35;
        System.out.printf("Your age is %d%n", age);

        int yearOfBirth = 2023 - age;

        System.out.printf("Age = %d, Birth year = %d%n", age, yearOfBirth);

        System.out.printf("Your age is %.2f%n", (float) age);

        for (int i = 1; i <= 100000; i *= 10) {
            System.out.printf("Printing %6d %n", i);
        }
        String formattedString = String.format("Your age is %d", age);
        System.out.println(formattedString);

        formattedString = "Your age is %d".formatted(age);
        System.out.println(formattedString);

        String helloworld = "Hello World";
        System.out.printf("Index of r = %d %n", helloworld.indexOf('r'));
        System.out.printf("Index of World = %d %n", helloworld.indexOf("World"));

        System.out.printf("Index of l = %d %n", helloworld.indexOf('l'));
        System.out.printf("Index of l = %d %n", helloworld.lastIndexOf('l'));

        System.out.printf("Index of l = %d %n", helloworld.indexOf('l', 3));
        System.out.printf("Index of l = %d %n", helloworld.lastIndexOf('l', 8));

        String helloWorldLower = helloworld.toLowerCase();

        if (helloworld.equals(helloWorldLower)) {
            System.out.println("Values match exactly.");
        } else if (helloworld.equalsIgnoreCase(helloWorldLower)) {
            System.out.println("Values match, but cases don't.");
        } else {
            System.out.println("Values don't match.");
        }

        if (helloworld.startsWith("Hello")) {
            System.out.println("String starts with Hello");
        }

        if (helloworld.endsWith("World")) {
            System.out.println("String ends with World.");
        }

        if (helloworld.contains("World")) {
            System.out.println("String contains World.");
        }

        //not just limited to strings, can compare stringBuilders.
        if(helloworld.contentEquals("Hello World")){
            System.out.println("Values match exactly");
        }

    }
}
