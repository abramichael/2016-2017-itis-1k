/**
 * Created by ma on 21.02.2017.
 */
public class Game {
    public void startGame() {

        Player player = new Player();
        Sword sword = new Sword();
        player.setCurrentArmory(sword);
        OrcCreator oc = new OrcCreator();
        EvilGuy orc = oc.getNew();
        ZhnetsCreator zc = new ZhnetsCreator();
        EvilGuy zhnets = zc.getNew();
        WolfCreator wc = new WolfCreator();
        EvilGuy wolf = wc.getNew();
        /*
        EvilGuy orc = GeneratingEvilGuy.getNew("orc");
        EvilGuy zhnets = GeneratingEvilGuy.getNew("zhnets");
        EvilGuy wolf = GeneratingEvilGuy.getNew("wolf");
        */
        player.attack(orc);
        player.attack(zhnets);
        Book b = new Book();
        player.setCurrentArmory(new BookToArmoryAdapter(b));
        player.attack(wolf);

        SuperPlayer sp = new SuperPlayer(player);
        sp.attack(wolf);
        sp.healSelf();
    }

    public static void main(String[] args) {
        (new Game()).startGame();
    }
}
