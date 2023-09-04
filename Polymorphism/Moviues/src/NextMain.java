public class NextMain {
    public static void main(String[] args) {

        Movie userGeneratedMovie = Movie.getMovie("A", "Jaws");
        userGeneratedMovie.watchMovie();

        Object comedy = Movie.getMovie("C", "Airplane");
        Comedy comedyMovie = (Comedy) comedy;
        comedyMovie.watchComedy();

        var airplane = Movie.getMovie("C", "Airplane");
        airplane.watchMovie();

        var plane =new Comedy("Airplane");
        plane.watchComedy();

        Object unknownObject = Movie.getMovie("C", "Airplane");
        if(unknownObject.getClass().getSimpleName() == "Comedy"){
            Comedy c = (Comedy) unknownObject;
        } else if(unknownObject instanceof Adventure){
            ((Adventure) unknownObject).watchAdventure();
        }else if(unknownObject instanceof Sciencefiction syfy){
            syfy.watchScience();
        }

    }
}
