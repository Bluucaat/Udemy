public class Player {

    public String fullName;
    public int health;
    public String weapon;


    public void loseHealth(int damage) {
        health = health - damage;
        if (health <= 0) System.out.println("Player knocked out of the game");

    }
    public int healthRemaining(){
        return health;
    }

    public void restoreHealth(int extraHealth){
        health += extraHealth;
        if(health > 100){
            health = 100;
        }
    }

}
