/**
 * Created by ma on 21.02.2017.
 */
public class SuperPlayer extends Player {
    private Player player;
    public SuperPlayer(Player p) { player = p; }
    public void healSelf() {

    }
    public void attack(GameCharacter enemy) {
        player.attack(enemy);
    }
}
