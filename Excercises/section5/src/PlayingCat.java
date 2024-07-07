public class PlayingCat {
    public static boolean isCatPlaying(boolean summer, int temperature){
        return (!summer && (temperature > 24 && temperature < 36) || (summer && (temperature > 24 && temperature < 46)));
    }
}
