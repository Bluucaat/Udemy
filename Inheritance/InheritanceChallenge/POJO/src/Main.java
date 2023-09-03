public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            Student s = new Student("592300" + i,
                    switch (i) {
                        case 1 -> "Mary";
                        case 2 -> "Carol";
                        case 3 -> "Tim";
                        case 4 -> "Harry";
                        case 5 -> "Lisa";
                        default -> "Anonymus";
                    }, "05.11.1985",
                    "Java masterclass"
            );
            System.out.println(s);
        }

        //downside of record: they're final, can not be modified.
        for (int i = 0; i < 5; i++) {
            LPAStudent s = new LPAStudent("592300" + i,
                    switch (i) {
                        case 1 -> "Mary";
                        case 2 -> "Carol";
                        case 3 -> "Tim";
                        case 4 -> "Harry";
                        case 5 -> "Lisa";
                        default -> "Anonymus";
                    }, "05.11.1985",
                    "Java masterclass"
            );
            System.out.println(s);
        }

        Student pojoStudent = new Student("5923006", "Ann", "05/11/1985", "Java Masterclass");
        LPAStudent recordStudent = new LPAStudent("5923007", "Bill", "05/11/1985", "Java Masterclass");
        System.out.println(pojoStudent);
        System.out.println(recordStudent);

        System.out.println(pojoStudent.getName() + " is taking " + pojoStudent.getClassList());
        System.out.println(recordStudent.name() + " is taking " + recordStudent.classList());
    }
}
