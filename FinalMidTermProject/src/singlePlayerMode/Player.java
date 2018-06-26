package singlePlayerMode;

/**
 * @author rezaTahmasbi, amirhosseinMaleki, mateenBagheri
 * @since 1396/02/26
 *
 * {@link Player} class simulates a player of the FasTyper game.
 * every {@link Player} has a name,power and the correct answers
 * that he has while he is playing the game.of we have used getters
 * to be able to access to all of the mentioned information.
 * for setting the information in this class we have constructed a
 * constructor and also setters for some of the methods that required
 * being set after instantiation of the class {@link Player}.
 */
public class Player {
    private String name;
    private Achievements achievements = new Achievements();



    /**
     * <i>Player</i> is a constructor of the {@link Player} class which
     * requires an string to set as the initial name of the {@link Player}.
     * this constructor also sets the initial value of the power and also
     * correct answers of the class {@link Player} to zero.
     * @param name the name of the player of the game
     */
    public Player(String name) {
        this.name = name;
    }

    /**
     * <i>getName</i> is a getter method which returns the name of the
     * player which is registered as "name" in class {@link Player}.
     * @return name of the player
     */
    public String getName() {
        return name;
    }

    /**
     * <code>getAchievements</code> method is a getter method which returns the achievement
     * attribute of the class <code>{@link Player}</code>
     * @return
     */
    public Achievements getAchievements() {
        return achievements;
    }
}
