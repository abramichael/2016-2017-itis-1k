/**
 * Created by ma on 21.02.2017.
 */
public abstract class GeneratingEvilGuy extends GameCharacter {
    public static EvilGuy getNew(String who) {
        switch (who) {
            case "orc":
                return new Orc();
            case "zhnets":
                return new Zhnets();
            case "wolf":
                return new Wolf();
        }
        return null;
    }
}