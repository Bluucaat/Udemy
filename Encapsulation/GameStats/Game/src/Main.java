import java.util.concurrent.atomic.AtomicReferenceArray;

public class Main {
    public static void main(String[] args) {

        Player p1 = new Player();
        p1.fullName = "Tim";
        p1.health = 20;
        p1.weapon = "Sword";

        EnchancedPlayer p2 = new EnchancedPlayer("Tim", 200, "Sword");
        System.out.println("Initial Health is " + p2.healthRemaining());
        int damage = 10;
        p1.loseHealth(damage);
        System.out.println(p1.fullName + "Remaining health = "+ p1.healthRemaining());

    }
}
