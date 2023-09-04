
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        Movie theMovie = Movie.getMovie("Science", "Star Wars");
//        theMovie.watchMovie();

        Scanner inp = new Scanner(System.in);

        while (true) {
            System.out.println("""
                    -------------------------------------
                    Chose a movie type from the following;
                    A for Adventure
                    C for Comedy
                    S for Sciencefiction
                    Q to quit the menu
                    -------------------------------------
                    """);
            String type = inp.nextLine();
            if ("Qq.".contains(type)) break;

            System.out.println("Enter movie Title: ");
            String title = inp.nextLine();

            Movie userGeneratedMovie = Movie.getMovie(type, title);
            userGeneratedMovie.watchMovie();
        }
    }
}

