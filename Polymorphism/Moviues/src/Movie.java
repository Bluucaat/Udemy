public class Movie {

    private String title;

    public Movie(String title) {
        this.title = title;
    }

    public void watchMovie() {
        String instanceType = this.getClass().getSimpleName();
        System.out.println(title + " is a " + instanceType + " film");
    }

    public static Movie getMovie(String type, String title) {

        return switch (type.toUpperCase().charAt(0)) {
            case 'A' -> new Adventure(title);
            case 'C' -> new Comedy(title);
            case 'S' -> new Sciencefiction(title);
            default -> new Movie(title);
        };

    }
}

class Adventure extends Movie {

    public Adventure(String title) {
        super(title);
    }

    public void watchMovie() {
        super.watchMovie();
        System.out.printf(".. %s%n".repeat(3),
                "Pleasant Scene",
                "Scary Music",
                "Something Bad Happens");
    }

    public void watchAdventure(){
        System.out.println("Watching an adventure.");
    }

}

class Comedy extends Movie {

    public Comedy(String title) {
        super(title);
    }

    public void watchMovie() {
        super.watchMovie();
        System.out.printf(".. %s%n".repeat(2),
                "Something funny happens",
                "Happy ending");
    }

    public void watchComedy(){
        System.out.println("Watching a Comedy.");
    }

}

class Sciencefiction extends Movie {

    public Sciencefiction(String title) {
        super(title);
    }

    public void watchMovie() {
        super.watchMovie();
        System.out.printf(".. %s%n".repeat(3),
                "Bad aliens do bad stuff",
                "Space guys chase aliens",
                "Plant blows up");
    }
    public void watchScience(){
        System.out.println("Watching a Sciencefiction.");
    }

}
